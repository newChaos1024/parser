// Generated from D:/Users/Administrator/IdeaProjects/parser/src/main/resources\CreateTable.g4 by ANTLR 4.9.2
package com.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CreateTableParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CreateTableVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(CreateTableParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CreateTableParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#use_db_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_db_statement(CreateTableParser.Use_db_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(CreateTableParser.Create_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#create_table_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_items(CreateTableParser.Create_table_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#create_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_item(CreateTableParser.Create_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#field_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_definition(CreateTableParser.Field_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#primary_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_definition(CreateTableParser.Primary_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#unique_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_definition(CreateTableParser.Unique_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#index_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_definition(CreateTableParser.Index_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#not_null_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_null_attribute(CreateTableParser.Not_null_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#auto_increment_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_increment_attribute(CreateTableParser.Auto_increment_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#default_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_attribute(CreateTableParser.Default_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#onupdate_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnupdate_attribute(CreateTableParser.Onupdate_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#comment_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_attribute(CreateTableParser.Comment_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#field_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_attributes(CreateTableParser.Field_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#table_default_charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_default_charset(CreateTableParser.Table_default_charsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#table_engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_engine(CreateTableParser.Table_engineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#table_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_comment(CreateTableParser.Table_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#table_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_attribute(CreateTableParser.Table_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#table_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_attributes(CreateTableParser.Table_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#integer_number_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_number_type(CreateTableParser.Integer_number_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#decimal_number_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_number_type(CreateTableParser.Decimal_number_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#text_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_type(CreateTableParser.Text_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#bit_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_type(CreateTableParser.Bit_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#timestamp_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_type(CreateTableParser.Timestamp_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CreateTableParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CreateTableParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CreateTableParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CreateTableParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(CreateTableParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#comment_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_part(CreateTableParser.Comment_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#single_length_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_length_part(CreateTableParser.Single_length_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#double_length_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_length_part(CreateTableParser.Double_length_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#current_timestamp_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_timestamp_part(CreateTableParser.Current_timestamp_partContext ctx);
}