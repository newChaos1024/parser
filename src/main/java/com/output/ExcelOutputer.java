package com.output;

import com.definition.Attribute;
import com.google.common.base.Joiner;
import com.definition.AbstractSecondaryIndex;
import com.definition.Field;
import com.definition.TableDefinition;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.OutputStream;
import java.util.List;
import java.util.function.Function;

/**
 * @author xinqian.zhu
 * @date 2022/2/22
 */
public class ExcelOutputer implements Outputer {

    private static final Joiner COMMA_JOINER = Joiner.on(",");

    @Override
    public void output(Iterable<TableDefinition> tableDefinitions, OutputStream outputStream) throws Exception {
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        for (TableDefinition tableDefinition : tableDefinitions) {
            String dbAndTableName = tableDefinition.getTableName();
            XSSFSheet sheet = xssfWorkbook.createSheet(dbAndTableName);
            int index = buildTableAttributePart(tableDefinition, sheet);
            index = buildFieldsPart(tableDefinition, sheet, index);
            index = buildPrimaryIndexPart(tableDefinition, sheet, index);
            if (CollectionUtils.isNotEmpty(tableDefinition.getSecondaryIndices())) {
                index = buildSecondaryIndexPart(tableDefinition, sheet, index);
            }
        }
        xssfWorkbook.write(outputStream);
    }

    public enum TableAttributes {

        DB_NAME("库名", TableDefinition::getDbName),
        TABLE_NAME("表名", TableDefinition::getTableName),
        ENGINE("引擎", TableDefinition::getEngine),
        DEFAULT_CHARSET("默认字符集", TableDefinition::getDefaultCharset),
        COMMENT("注释", TableDefinition::getComment);

        TableAttributes(String key, Function<TableDefinition, String> valueGetter) {
            this.key = key;
            this.valueGetter = valueGetter.andThen((string) -> string == null ? "" : string);
        }

        private String key;

        private Function<TableDefinition, String> valueGetter;

        public String getKey() {
            return key;
        }

        public String getValue(TableDefinition tableDefinition) {
            return valueGetter.apply(tableDefinition);
        }

    }

    public enum Fields {

        COLUMN_NAME("列名", Field::getName),
        COLUMN_TYPE("类型", Field::getType),
        COLUMN_NULLABLE("能否为空", field -> Boolean.toString(field.isNullable())),
        COLUMN_AUTO_INCREMENT("是否自增", field -> Boolean.toString(field.isAutoIncrement())),
        COLUMN_DEFAULT_VALUE("默认值", Field::getDefaultValue),
        COLUMN_COMMENT("注释", Field::getComment);

        Fields(String head, Function<Field, String> valueGetter) {
            this.head = head;
            this.valueGetter = valueGetter.andThen((string) -> string == null ? "" : string);
        }

        private String head;

        private Function<Field, String> valueGetter;

        public String getHead() {
            return head;
        }

        public String getValue(Field field) {
            return valueGetter.apply(field);
        }
    }

    private int buildPrimaryIndexPart(TableDefinition tableDefinition, XSSFSheet sheet, int index) {
        XSSFRow row = sheet.createRow(index);
        row.createCell(0).setCellValue("主键");
        row.createCell(1).setCellValue(COMMA_JOINER.join(tableDefinition.getPrimaryIndex().fields()));
        CellRangeAddress region = new CellRangeAddress(index, index, 1, Fields.values().length);
        sheet.addMergedRegion(region);
        return index + 1;
    }

    private int buildSecondaryIndexPart(TableDefinition tableDefinition, XSSFSheet sheet, int index) {
        List<AbstractSecondaryIndex> secondaryIndices = tableDefinition.getSecondaryIndices();

        buildSecondaryRow(sheet, index, "索引名", "是否唯一", "字段");
        for (int rowIndex = 0; rowIndex < secondaryIndices.size(); rowIndex++) {
            AbstractSecondaryIndex abstractSecondaryIndex = secondaryIndices.get(rowIndex);
            buildSecondaryRow(sheet, index + 1 + rowIndex, abstractSecondaryIndex.indexName()
                    , Boolean.toString(abstractSecondaryIndex.isUnique()), COMMA_JOINER.join(abstractSecondaryIndex.fields()));
        }
        sheet.getRow(index).createCell(0).setCellValue("二级索引");
        CellRangeAddress region = new CellRangeAddress(index
                , index + secondaryIndices.size(), 0, 0);
        sheet.addMergedRegion(region);
        return index + 1;
    }

    private void buildSecondaryRow(XSSFSheet xssfSheet, int rowIndex, String first, String second, String third) {
        XSSFRow row = xssfSheet.createRow(rowIndex);
        row.createCell(1).setCellValue(first);
        row.createCell(3).setCellValue(second);
        row.createCell(5).setCellValue(third);
        CellRangeAddress region = new CellRangeAddress(rowIndex, rowIndex, 1, 2);
        xssfSheet.addMergedRegion(region);
        region = new CellRangeAddress(rowIndex, rowIndex, 3, 4);
        xssfSheet.addMergedRegion(region);
        region = new CellRangeAddress(rowIndex, rowIndex, 5, 6);
        xssfSheet.addMergedRegion(region);
    }

    private int buildFieldsPart(TableDefinition tableDefinition, XSSFSheet sheet, int index) {
        sheet.setColumnWidth(1, 5000);
        sheet.setColumnWidth(2, 5000);
        sheet.setColumnWidth(5, 5000);
        List<Field> fields = tableDefinition.getFields();
        XSSFRow xssfRow = sheet.createRow(index);
        xssfRow.createCell(0).setCellValue("列信息");
        for (int columnIndex = 0; columnIndex < Fields.values().length; columnIndex++) {
            xssfRow.createCell(columnIndex + 1).setCellValue(Fields.values()[columnIndex].getHead());
        }
        for (int rowIndex = 0; rowIndex < fields.size(); rowIndex++) {
            xssfRow = sheet.createRow(index + rowIndex + 1);
            Field field = fields.get(rowIndex);
            for (int columnIndex = 0; columnIndex < Fields.values().length; columnIndex++) {
                xssfRow.createCell(columnIndex + 1).setCellValue(Fields.values()[columnIndex].getValue(field));
            }
        }
        CellRangeAddress region = new CellRangeAddress(index, index + fields.size(), 0, 0);
        sheet.addMergedRegion(region);
        return index + fields.size() + 1;
    }

    private int buildTableAttributePart(TableDefinition tableDefinition, XSSFSheet sheet) {
        int index = 0;
        for (index = 0; index < TableAttributes.values().length; index++) {
            TableAttributes tableAttribute = TableAttributes.values()[index];
            XSSFRow row = sheet.createRow(index);
            row.createCell(0).setCellValue(tableAttribute.getKey());
            XSSFCell cell = row.createCell(1);
            cell.setCellValue(tableAttribute.getValue(tableDefinition));
            CellRangeAddress region = new CellRangeAddress(index, index, 1, 1 + Fields.values().length);
            sheet.addMergedRegion(region);
        }
        if (CollectionUtils.isNotEmpty(tableDefinition.getAttributes())) {
            for (Attribute attribute : tableDefinition.getAttributes()) {
                XSSFRow row = sheet.createRow(index);
                row.createCell(0).setCellValue(attribute.getKey());
                XSSFCell cell = row.createCell(1);
                cell.setCellValue(attribute.getValue());
                CellRangeAddress region = new CellRangeAddress(index, index, 1, 1 + Fields.values().length);
                sheet.addMergedRegion(region);
                index++;
            }
        }
        return index;
    }


}
