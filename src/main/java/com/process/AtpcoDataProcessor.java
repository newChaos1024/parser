package com.process;

import com.definition.Attribute;
import com.definition.TableDefinition;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author xinqian.zhu
 * @date 2022/2/23
 */
public class AtpcoDataProcessor implements Function<List<TableDefinition>, List<TableDefinition>> {

    @Override
    public List<TableDefinition> apply(List<TableDefinition> tableDefinitions) {
        return tableDefinitions.stream()
                .filter(tableDefinition -> !tableDefinition.getTableName().endsWith("_second"))
                .peek(tableDefinition -> {
                            if (tableDefinition.getTableName().endsWith("_first")) {
                                tableDefinition.setTableName(tableDefinition.getTableName().substring(0, tableDefinition.getTableName().length() - "_first".length()));
                            }
                            tableDefinition.getFields().stream().filter(field -> "id".equals(field.getName())).forEach(field -> field.setComment("批次号+文件类型+行号，唯一标识一条记录"));
                        }
                )
                .collect(Collectors.toList());
    }

    public interface TableAttributeDecorator {

        List<Pattern> patterns();

        String attributeKey();

        String attributeValue();

    }

    public enum OperationAttributeDecorator implements TableAttributeDecorator {

        TABLE(Lists.newArrayList(".*?table1.*"), "如果记录中的delete字段为true，则删除表中对应tblNo的数据，否则新增数据"),

        ALL(Lists.newArrayList(".*?category.*"
                , ".*?g17.*"
                , ".*?g20.*"
                , ".*?p1.*"
                , ".*?p2.*"
                , ".*?carrier_absorption.*"
                , ".*?collection_method.*"
                , ".*?coterminal.*"
                , ".*?essential.*"
                , ".*?pfc_record.*"
                , ".*?recorda02.*"
                , ".*?table9.*"
        ), "全部新增"),

        ACTION_ONE(
                Lists.newArrayList(
                        ".*?record0.*"
                        , ".*?record1.*"
                        , ".*?record2_category10.*"
                        , ".*?record2_category25.*"
                        , ".*?record2_footnotes.*"
                        , ".*?record2_rules.*"
                        , ".*?record6.*"
                        , ".*?record8.*"
                        , ".*?usca_fare.*"
                ), "根据ACTION标志位，如果ACTION为2，则要先尝试更新已有数据的discDate（逻辑删除+新增），然后如果delete为false，则新增"
        ),

        ONE(
                Lists.newArrayList(
                        ".*?recorda01.*"
                        , ".*?recorda03.*"
                        , ".*?records.*"
                        , ".*?recordx.*"
                ), "先尝试更新已有数据的discDate（逻辑删除+新增），然后如果delete为false，则新增"
        ),

        LAST(
                Lists.newArrayList(
                        ".*?addon_fare.*"
                        , ".*?cdt_p0.*"
                        , ".*?records.*"
                        , ".*?recordx.*"
                ), "先删除文件中要求删除的数据，再新增文件中要求增加的数据。"
        ),

        ROUTING(
                Lists.newArrayList(
                        ".*?routings.*"
                ), "对整个routing文件按照linkNo，进行排序，从小到大依次处理每批linkNo。" +
                "按照linkNo进行分库，但是不分表。对于header数据，写入"
        );

        private List<Pattern> patterns;

        private String attributeValue;

        OperationAttributeDecorator(List<String> tableNameMatchRegex, String attributeValue) {
            this.patterns = tableNameMatchRegex.stream().map(Pattern::compile).collect(Collectors.toList());
            this.attributeValue = attributeValue;
        }

        @Override
        public List<Pattern> patterns() {
            return patterns;
        }

        @Override
        public String attributeKey() {
            return "更新逻辑";
        }

        @Override
        public String attributeValue() {
            return attributeValue;
        }

    }

    public static void matchesAndAddAttributes(TableDefinition tableDefinition
            , TableAttributeDecorator[] tableAttributeDecorators
            , boolean must
            , boolean exactlyOnce) {
        List<Attribute> matches = matches(tableDefinition, tableAttributeDecorators);
        if (must && matches.isEmpty()) {
            throw new IllegalStateException("no match for " + tableDefinition.getTableName());
        }
        if (exactlyOnce && matches.size() >= 1) {
            throw new IllegalStateException("non unique match for " + tableDefinition.getTableName());
        }
        List<Attribute> attributes = tableDefinition.getAttributes();
        if (attributes != null) {
            attributes.addAll(matches);
        } else {
            tableDefinition.setAttributes(matches);
        }
    }

    protected static List<Attribute> matches(TableDefinition tableDefinition, TableAttributeDecorator[] tableAttributeDecorators) {
        List<Attribute> attributes = Lists.newArrayList();
        for (TableAttributeDecorator tableAttributeDecorator : tableAttributeDecorators) {
            if (tableAttributeDecorator.patterns().stream().anyMatch(pattern -> pattern.matcher(tableDefinition.getTableName()).matches())) {
                Attribute attribute = Attribute.of(tableAttributeDecorator.attributeKey()
                        , tableAttributeDecorator.attributeValue());
                attributes.add(attribute);
            }
        }
        return attributes;
    }


}
