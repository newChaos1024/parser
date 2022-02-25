package com.definition;

import com.definition.AbstractSecondaryIndex;
import com.definition.Field;
import com.definition.NormalSecondaryIndex;
import com.definition.PrimaryIndex;
import com.definition.TableDefinition;
import com.definition.UniqueSecondaryIndex;
import com.google.common.base.Splitter;
import com.gen.CreateTableBaseVisitor;
import com.gen.CreateTableLexer;
import com.gen.CreateTableParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xinqian.zhu
 * @date 2022/2/21
 */
public class TableDefinitionParser {

    private static final Splitter COMMA_SPLITTER = Splitter.on(",");

    public List<TableDefinition> parse(InputStream sqlTextStream) throws Exception {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(sqlTextStream);
        CreateTableLexer createTableLexer = new CreateTableLexer(antlrInputStream);

        CommonTokenStream tokens = new CommonTokenStream(createTableLexer);
        CreateTableParser createTableParser = new CreateTableParser(tokens);
        CreateTableParser.StatementsContext statements = createTableParser.statements();
        Visitor visitor = new Visitor();
        visitor.visit(statements);
        return visitor.getTableDefinitions();
    }

    public static class Visitor extends CreateTableBaseVisitor {

        private String currentDb;

        private List<Field> fields;

        private PrimaryIndex primaryIndex;

        private List<AbstractSecondaryIndex> secondaryIndices;

        private String engine;

        private String defaultCharset;

        private String tableComment;

        private boolean nullable;

        private boolean isAutoIncrement;

        private String defaultValue;

        private String fieldComment;


        private List<TableDefinition> tableDefinitions = new ArrayList<>();

        @Override
        public Object visitUse_db_statement(CreateTableParser.Use_db_statementContext ctx) {
            currentDb = filterEnclosedBackquote(ctx.identifier().getText());
            return super.visitUse_db_statement(ctx);
        }

        @Override
        public Object visitCreate_table_statement(CreateTableParser.Create_table_statementContext ctx) {
            String tableName = filterEnclosedBackquote(ctx.identifier().getText());
            fields = new ArrayList<>();
            secondaryIndices = new ArrayList<>();
            primaryIndex = null;
            engine = null;
            tableComment = null;
            defaultCharset = null;
            Object ret = super.visitCreate_table_statement(ctx);
            if (primaryIndex == null) {
                throw new IllegalStateException("primary index not defined!");
            }
            TableDefinition tableDefinition = new TableDefinition();
            tableDefinition.setDbName(this.currentDb);
            tableDefinition.setTableName(tableName);
            tableDefinition.setFields(fields);
            tableDefinition.setPrimaryIndex(primaryIndex);
            tableDefinition.setSecondaryIndices(secondaryIndices);
            tableDefinition.setComment(tableComment);
            tableDefinition.setDefaultCharset(defaultCharset);
            tableDefinition.setEngine(engine);
            tableDefinitions.add(tableDefinition);
            return ret;
        }

        @Override
        public Object visitField_definition(CreateTableParser.Field_definitionContext ctx) {
            Field field = new Field();
            field.setName(filterEnclosedBackquote(ctx.identifier().getText()));
            field.setType(getFullText(ctx.type()));

            nullable = true;
            isAutoIncrement = false;
            defaultValue = null;
            fieldComment = "";
            Object ret = super.visitField_definition(ctx);
            field.setNullable(nullable);
            field.setAutoIncrement(isAutoIncrement);
            field.setDefaultValue(defaultValue);
            field.setComment(fieldComment);
            this.fields.add(field);
            return ret;
        }

        @Override
        public Object visitNot_null_attribute(CreateTableParser.Not_null_attributeContext ctx) {
            nullable = false;
            return super.visitNot_null_attribute(ctx);
        }

        @Override
        public Object visitAuto_increment_attribute(CreateTableParser.Auto_increment_attributeContext ctx) {
            isAutoIncrement = true;
            return super.visitAuto_increment_attribute(ctx);
        }

        @Override
        public Object visitDefault_attribute(CreateTableParser.Default_attributeContext ctx) {
            defaultValue = getFullText(ctx);
            return super.visitDefault_attribute(ctx);
        }

        @Override
        public Object visitComment_attribute(CreateTableParser.Comment_attributeContext ctx) {
            fieldComment = filterEnclosedQuote(getFullText(ctx.comment_part().literal()));
            return super.visitComment_attribute(ctx);
        }

        @Override
        public Object visitTable_default_charset(CreateTableParser.Table_default_charsetContext ctx) {
            defaultCharset = ctx.identifier().getText();
            return super.visitTable_default_charset(ctx);
        }

        @Override
        public Object visitTable_engine(CreateTableParser.Table_engineContext ctx) {
            engine = ctx.identifier().getText();
            return super.visitTable_engine(ctx);
        }

        @Override
        public Object visitTable_comment(CreateTableParser.Table_commentContext ctx) {
            tableComment = filterEnclosedQuote(getFullText(ctx.literal()));
            return super.visitTable_comment(ctx);
        }

        @Override
        public Object visitPrimary_definition(CreateTableParser.Primary_definitionContext ctx) {
            List<String> fields = COMMA_SPLITTER.splitToList(ctx.identifiers().getText()).stream()
                    .map(TableDefinitionParser::filterEnclosedBackquote).collect(Collectors.toList());
            primaryIndex = new PrimaryIndex(fields);
            return super.visitPrimary_definition(ctx);
        }

        @Override
        public Object visitUnique_definition(CreateTableParser.Unique_definitionContext ctx) {
            List<String> fields = COMMA_SPLITTER.splitToList(ctx.identifiers().getText()).stream()
                    .map(TableDefinitionParser::filterEnclosedBackquote).collect(Collectors.toList());
            UniqueSecondaryIndex uniqueSecondaryIndex = new UniqueSecondaryIndex(filterEnclosedBackquote(ctx.identifier().getText()), fields);
            secondaryIndices.add(uniqueSecondaryIndex);
            return super.visitUnique_definition(ctx);
        }

        @Override
        public Object visitIndex_definition(CreateTableParser.Index_definitionContext ctx) {
            List<String> fields = COMMA_SPLITTER.splitToList(ctx.identifiers().getText()).stream()
                    .map(TableDefinitionParser::filterEnclosedBackquote).collect(Collectors.toList());
            NormalSecondaryIndex normalSecondaryIndex = new NormalSecondaryIndex(filterEnclosedBackquote(ctx.identifier().getText()), fields);
            secondaryIndices.add(normalSecondaryIndex);
            return super.visitIndex_definition(ctx);
        }

        public String getFullText(ParseTree tree) {
            ParserRuleContext context = (ParserRuleContext) tree;
            if (context.children == null) {
                return "";
            }
            Token startToken = context.start;
            Token stopToken = context.stop;
            Interval interval = new Interval(startToken.getStartIndex(), stopToken.getStopIndex());
            String result = context.start.getInputStream().getText(interval);
            return result;
        }

        public List<TableDefinition> getTableDefinitions() {
            return tableDefinitions;
        }

    }

    public static final String filterEnclosedBackquote(String input) {
        if (input.startsWith("`") && input.endsWith("`")) {
            return input.substring(1, input.length() - 1);
        }
        return input;
    }

    public static final String filterEnclosedQuote(String input) {
        if (input.startsWith("'") && input.endsWith("'")) {
            return input.substring(1, input.length() - 1);
        }
        if (input.startsWith("\"") && input.endsWith("\"")) {
            return input.substring(1, input.length() - 1);
        }
        return input;
    }


}
