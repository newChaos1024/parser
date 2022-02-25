// Generated from D:/Users/Administrator/IdeaProjects/parser/src/main/resources\CreateTable.g4 by ANTLR 4.9.2
package com.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreateTableParser}.
 */
public interface CreateTableListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CreateTableParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CreateTableParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CreateTableParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CreateTableParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#use_db_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_db_statement(CreateTableParser.Use_db_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#use_db_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_db_statement(CreateTableParser.Use_db_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement(CreateTableParser.Create_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement(CreateTableParser.Create_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#create_table_items}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_items(CreateTableParser.Create_table_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#create_table_items}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_items(CreateTableParser.Create_table_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#create_table_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_item(CreateTableParser.Create_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#create_table_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_item(CreateTableParser.Create_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void enterField_definition(CreateTableParser.Field_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void exitField_definition(CreateTableParser.Field_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#primary_definition}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_definition(CreateTableParser.Primary_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#primary_definition}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_definition(CreateTableParser.Primary_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#unique_definition}.
	 * @param ctx the parse tree
	 */
	void enterUnique_definition(CreateTableParser.Unique_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#unique_definition}.
	 * @param ctx the parse tree
	 */
	void exitUnique_definition(CreateTableParser.Unique_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#index_definition}.
	 * @param ctx the parse tree
	 */
	void enterIndex_definition(CreateTableParser.Index_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#index_definition}.
	 * @param ctx the parse tree
	 */
	void exitIndex_definition(CreateTableParser.Index_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#not_null_attribute}.
	 * @param ctx the parse tree
	 */
	void enterNot_null_attribute(CreateTableParser.Not_null_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#not_null_attribute}.
	 * @param ctx the parse tree
	 */
	void exitNot_null_attribute(CreateTableParser.Not_null_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#auto_increment_attribute}.
	 * @param ctx the parse tree
	 */
	void enterAuto_increment_attribute(CreateTableParser.Auto_increment_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#auto_increment_attribute}.
	 * @param ctx the parse tree
	 */
	void exitAuto_increment_attribute(CreateTableParser.Auto_increment_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#default_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDefault_attribute(CreateTableParser.Default_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#default_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDefault_attribute(CreateTableParser.Default_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#onupdate_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOnupdate_attribute(CreateTableParser.Onupdate_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#onupdate_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOnupdate_attribute(CreateTableParser.Onupdate_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#comment_attribute}.
	 * @param ctx the parse tree
	 */
	void enterComment_attribute(CreateTableParser.Comment_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#comment_attribute}.
	 * @param ctx the parse tree
	 */
	void exitComment_attribute(CreateTableParser.Comment_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#field_attributes}.
	 * @param ctx the parse tree
	 */
	void enterField_attributes(CreateTableParser.Field_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#field_attributes}.
	 * @param ctx the parse tree
	 */
	void exitField_attributes(CreateTableParser.Field_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#table_default_charset}.
	 * @param ctx the parse tree
	 */
	void enterTable_default_charset(CreateTableParser.Table_default_charsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#table_default_charset}.
	 * @param ctx the parse tree
	 */
	void exitTable_default_charset(CreateTableParser.Table_default_charsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#table_engine}.
	 * @param ctx the parse tree
	 */
	void enterTable_engine(CreateTableParser.Table_engineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#table_engine}.
	 * @param ctx the parse tree
	 */
	void exitTable_engine(CreateTableParser.Table_engineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#table_comment}.
	 * @param ctx the parse tree
	 */
	void enterTable_comment(CreateTableParser.Table_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#table_comment}.
	 * @param ctx the parse tree
	 */
	void exitTable_comment(CreateTableParser.Table_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#table_attribute}.
	 * @param ctx the parse tree
	 */
	void enterTable_attribute(CreateTableParser.Table_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#table_attribute}.
	 * @param ctx the parse tree
	 */
	void exitTable_attribute(CreateTableParser.Table_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#table_attributes}.
	 * @param ctx the parse tree
	 */
	void enterTable_attributes(CreateTableParser.Table_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#table_attributes}.
	 * @param ctx the parse tree
	 */
	void exitTable_attributes(CreateTableParser.Table_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#integer_number_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_number_type(CreateTableParser.Integer_number_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#integer_number_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_number_type(CreateTableParser.Integer_number_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#decimal_number_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_number_type(CreateTableParser.Decimal_number_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#decimal_number_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_number_type(CreateTableParser.Decimal_number_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#text_type}.
	 * @param ctx the parse tree
	 */
	void enterText_type(CreateTableParser.Text_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#text_type}.
	 * @param ctx the parse tree
	 */
	void exitText_type(CreateTableParser.Text_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#bit_type}.
	 * @param ctx the parse tree
	 */
	void enterBit_type(CreateTableParser.Bit_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#bit_type}.
	 * @param ctx the parse tree
	 */
	void exitBit_type(CreateTableParser.Bit_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#timestamp_type}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_type(CreateTableParser.Timestamp_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#timestamp_type}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_type(CreateTableParser.Timestamp_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CreateTableParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CreateTableParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CreateTableParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CreateTableParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CreateTableParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CreateTableParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CreateTableParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CreateTableParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(CreateTableParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(CreateTableParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#comment_part}.
	 * @param ctx the parse tree
	 */
	void enterComment_part(CreateTableParser.Comment_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#comment_part}.
	 * @param ctx the parse tree
	 */
	void exitComment_part(CreateTableParser.Comment_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#single_length_part}.
	 * @param ctx the parse tree
	 */
	void enterSingle_length_part(CreateTableParser.Single_length_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#single_length_part}.
	 * @param ctx the parse tree
	 */
	void exitSingle_length_part(CreateTableParser.Single_length_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#double_length_part}.
	 * @param ctx the parse tree
	 */
	void enterDouble_length_part(CreateTableParser.Double_length_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#double_length_part}.
	 * @param ctx the parse tree
	 */
	void exitDouble_length_part(CreateTableParser.Double_length_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#current_timestamp_part}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_timestamp_part(CreateTableParser.Current_timestamp_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#current_timestamp_part}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_timestamp_part(CreateTableParser.Current_timestamp_partContext ctx);
}