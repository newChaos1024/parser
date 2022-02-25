// Generated from D:/Users/Administrator/IdeaProjects/parser/src/main/resources\CreateTable.g4 by ANTLR 4.9.2
package com.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, KEYWORD_NOT=2, KEYWORD_NULL=3, KEYWORD_CREATE=4, KEYWORD_TABLE=5, 
		KEYWORD_COMMENT=6, KEYWORD_USE=7, KEYWORD_DEFAULT=8, KEYWORD_ON=9, KEYWORD_UPDATE=10, 
		KEYWORD_CURRENT_TIMESTAMP=11, KEYWORD_UNSIGNED=12, KEYWORD_PRIMARY=13, 
		KEYWORD_KEY=14, KEYWORD_UNIQUE=15, KEYWORD_ENGINE=16, KEYWORD_CHARSET=17, 
		KEYWORD_AUTO_INCREMENT=18, TYPE_TIMESTAMP=19, TYPE_BIT=20, TYPE_CHAR=21, 
		TYPE_INT=22, TYPE_VARCHAR=23, TYPE_TINYINT=24, TYPE_SMALLINT=25, TYPE_MEDIUMINT=26, 
		TYPE_BIGINT=27, TYPE_DECIMAL=28, LEFT_BRACE=29, RIGHT_BRACE=30, LEFT_BREAK=31, 
		RIGHT_BREAK=32, COMMA=33, EQUAL=34, DIGITS=35, IDENTIFIER=36, BACKQUOTED_IDENTIFIER=37, 
		TEXT_LITERAL=38, SEMICOLON=39, WS=40, KEYWORD_INDEX=41;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_use_db_statement = 2, RULE_create_table_statement = 3, 
		RULE_create_table_items = 4, RULE_create_table_item = 5, RULE_field_definition = 6, 
		RULE_primary_definition = 7, RULE_unique_definition = 8, RULE_index_definition = 9, 
		RULE_not_null_attribute = 10, RULE_auto_increment_attribute = 11, RULE_default_attribute = 12, 
		RULE_onupdate_attribute = 13, RULE_comment_attribute = 14, RULE_field_attributes = 15, 
		RULE_table_default_charset = 16, RULE_table_engine = 17, RULE_table_comment = 18, 
		RULE_table_attribute = 19, RULE_table_attributes = 20, RULE_integer_number_type = 21, 
		RULE_decimal_number_type = 22, RULE_text_type = 23, RULE_bit_type = 24, 
		RULE_timestamp_type = 25, RULE_type = 26, RULE_value = 27, RULE_literal = 28, 
		RULE_identifier = 29, RULE_identifiers = 30, RULE_comment_part = 31, RULE_single_length_part = 32, 
		RULE_double_length_part = 33, RULE_current_timestamp_part = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "use_db_statement", "create_table_statement", 
			"create_table_items", "create_table_item", "field_definition", "primary_definition", 
			"unique_definition", "index_definition", "not_null_attribute", "auto_increment_attribute", 
			"default_attribute", "onupdate_attribute", "comment_attribute", "field_attributes", 
			"table_default_charset", "table_engine", "table_comment", "table_attribute", 
			"table_attributes", "integer_number_type", "decimal_number_type", "text_type", 
			"bit_type", "timestamp_type", "type", "value", "literal", "identifier", 
			"identifiers", "comment_part", "single_length_part", "double_length_part", 
			"current_timestamp_part"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'b'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'{'", "'}'", "'('", "')'", "','", "'='", 
			null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "KEYWORD_NOT", "KEYWORD_NULL", "KEYWORD_CREATE", "KEYWORD_TABLE", 
			"KEYWORD_COMMENT", "KEYWORD_USE", "KEYWORD_DEFAULT", "KEYWORD_ON", "KEYWORD_UPDATE", 
			"KEYWORD_CURRENT_TIMESTAMP", "KEYWORD_UNSIGNED", "KEYWORD_PRIMARY", "KEYWORD_KEY", 
			"KEYWORD_UNIQUE", "KEYWORD_ENGINE", "KEYWORD_CHARSET", "KEYWORD_AUTO_INCREMENT", 
			"TYPE_TIMESTAMP", "TYPE_BIT", "TYPE_CHAR", "TYPE_INT", "TYPE_VARCHAR", 
			"TYPE_TINYINT", "TYPE_SMALLINT", "TYPE_MEDIUMINT", "TYPE_BIGINT", "TYPE_DECIMAL", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BREAK", "RIGHT_BREAK", "COMMA", "EQUAL", 
			"DIGITS", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "TEXT_LITERAL", "SEMICOLON", 
			"WS", "KEYWORD_INDEX"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CreateTable.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CreateTableParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD_CREATE || _la==KEYWORD_USE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Use_db_statementContext use_db_statement() {
			return getRuleContext(Use_db_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				use_db_statement();
				}
				break;
			case KEYWORD_CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				create_table_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_db_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_USE() { return getToken(CreateTableParser.KEYWORD_USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CreateTableParser.SEMICOLON, 0); }
		public Use_db_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_db_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterUse_db_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitUse_db_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitUse_db_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_db_statementContext use_db_statement() throws RecognitionException {
		Use_db_statementContext _localctx = new Use_db_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_use_db_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(KEYWORD_USE);
			setState(80);
			identifier();
			setState(81);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_CREATE() { return getToken(CreateTableParser.KEYWORD_CREATE, 0); }
		public TerminalNode KEYWORD_TABLE() { return getToken(CreateTableParser.KEYWORD_TABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BREAK() { return getToken(CreateTableParser.LEFT_BREAK, 0); }
		public Create_table_itemsContext create_table_items() {
			return getRuleContext(Create_table_itemsContext.class,0);
		}
		public TerminalNode RIGHT_BREAK() { return getToken(CreateTableParser.RIGHT_BREAK, 0); }
		public Table_attributesContext table_attributes() {
			return getRuleContext(Table_attributesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CreateTableParser.SEMICOLON, 0); }
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterCreate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitCreate_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitCreate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create_table_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(KEYWORD_CREATE);
			setState(84);
			match(KEYWORD_TABLE);
			setState(85);
			identifier();
			setState(86);
			match(LEFT_BREAK);
			setState(87);
			create_table_items();
			setState(88);
			match(RIGHT_BREAK);
			setState(89);
			table_attributes();
			setState(90);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_itemsContext extends ParserRuleContext {
		public List<Create_table_itemContext> create_table_item() {
			return getRuleContexts(Create_table_itemContext.class);
		}
		public Create_table_itemContext create_table_item(int i) {
			return getRuleContext(Create_table_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CreateTableParser.COMMA, i);
		}
		public Create_table_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterCreate_table_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitCreate_table_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitCreate_table_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_itemsContext create_table_items() throws RecognitionException {
		Create_table_itemsContext _localctx = new Create_table_itemsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_table_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			create_table_item();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				create_table_item();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_itemContext extends ParserRuleContext {
		public Field_definitionContext field_definition() {
			return getRuleContext(Field_definitionContext.class,0);
		}
		public Primary_definitionContext primary_definition() {
			return getRuleContext(Primary_definitionContext.class,0);
		}
		public Unique_definitionContext unique_definition() {
			return getRuleContext(Unique_definitionContext.class,0);
		}
		public Index_definitionContext index_definition() {
			return getRuleContext(Index_definitionContext.class,0);
		}
		public Create_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterCreate_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitCreate_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitCreate_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_itemContext create_table_item() throws RecognitionException {
		Create_table_itemContext _localctx = new Create_table_itemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_table_item);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				field_definition();
				}
				break;
			case KEYWORD_PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				primary_definition();
				}
				break;
			case KEYWORD_UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				unique_definition();
				}
				break;
			case KEYWORD_KEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				index_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_definitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Field_attributesContext field_attributes() {
			return getRuleContext(Field_attributesContext.class,0);
		}
		public Field_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterField_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitField_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitField_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_definitionContext field_definition() throws RecognitionException {
		Field_definitionContext _localctx = new Field_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			identifier();
			setState(107);
			type();
			setState(108);
			field_attributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_definitionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_PRIMARY() { return getToken(CreateTableParser.KEYWORD_PRIMARY, 0); }
		public TerminalNode KEYWORD_KEY() { return getToken(CreateTableParser.KEYWORD_KEY, 0); }
		public TerminalNode LEFT_BREAK() { return getToken(CreateTableParser.LEFT_BREAK, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode RIGHT_BREAK() { return getToken(CreateTableParser.RIGHT_BREAK, 0); }
		public Primary_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterPrimary_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitPrimary_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitPrimary_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_definitionContext primary_definition() throws RecognitionException {
		Primary_definitionContext _localctx = new Primary_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primary_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(KEYWORD_PRIMARY);
			setState(111);
			match(KEYWORD_KEY);
			setState(112);
			match(LEFT_BREAK);
			setState(113);
			identifiers();
			setState(114);
			match(RIGHT_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unique_definitionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_UNIQUE() { return getToken(CreateTableParser.KEYWORD_UNIQUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BREAK() { return getToken(CreateTableParser.LEFT_BREAK, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode RIGHT_BREAK() { return getToken(CreateTableParser.RIGHT_BREAK, 0); }
		public TerminalNode KEYWORD_INDEX() { return getToken(CreateTableParser.KEYWORD_INDEX, 0); }
		public TerminalNode KEYWORD_KEY() { return getToken(CreateTableParser.KEYWORD_KEY, 0); }
		public Unique_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unique_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterUnique_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitUnique_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitUnique_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unique_definitionContext unique_definition() throws RecognitionException {
		Unique_definitionContext _localctx = new Unique_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unique_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(KEYWORD_UNIQUE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_KEY || _la==KEYWORD_INDEX) {
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_KEY || _la==KEYWORD_INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(120);
			identifier();
			setState(121);
			match(LEFT_BREAK);
			setState(122);
			identifiers();
			setState(123);
			match(RIGHT_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_definitionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_KEY() { return getToken(CreateTableParser.KEYWORD_KEY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BREAK() { return getToken(CreateTableParser.LEFT_BREAK, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode RIGHT_BREAK() { return getToken(CreateTableParser.RIGHT_BREAK, 0); }
		public Index_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterIndex_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitIndex_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitIndex_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_definitionContext index_definition() throws RecognitionException {
		Index_definitionContext _localctx = new Index_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_index_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(KEYWORD_KEY);
			setState(126);
			identifier();
			setState(127);
			match(LEFT_BREAK);
			setState(128);
			identifiers();
			setState(129);
			match(RIGHT_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_null_attributeContext extends ParserRuleContext {
		public TerminalNode KEYWORD_NOT() { return getToken(CreateTableParser.KEYWORD_NOT, 0); }
		public TerminalNode KEYWORD_NULL() { return getToken(CreateTableParser.KEYWORD_NULL, 0); }
		public Not_null_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_null_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterNot_null_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitNot_null_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitNot_null_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_null_attributeContext not_null_attribute() throws RecognitionException {
		Not_null_attributeContext _localctx = new Not_null_attributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_not_null_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(KEYWORD_NOT);
			setState(132);
			match(KEYWORD_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Auto_increment_attributeContext extends ParserRuleContext {
		public TerminalNode KEYWORD_AUTO_INCREMENT() { return getToken(CreateTableParser.KEYWORD_AUTO_INCREMENT, 0); }
		public Auto_increment_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_increment_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterAuto_increment_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitAuto_increment_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitAuto_increment_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Auto_increment_attributeContext auto_increment_attribute() throws RecognitionException {
		Auto_increment_attributeContext _localctx = new Auto_increment_attributeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_auto_increment_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(KEYWORD_AUTO_INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_attributeContext extends ParserRuleContext {
		public TerminalNode KEYWORD_DEFAULT() { return getToken(CreateTableParser.KEYWORD_DEFAULT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Onupdate_attributeContext onupdate_attribute() {
			return getRuleContext(Onupdate_attributeContext.class,0);
		}
		public Default_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDefault_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDefault_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitDefault_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_attributeContext default_attribute() throws RecognitionException {
		Default_attributeContext _localctx = new Default_attributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_default_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(KEYWORD_DEFAULT);
			setState(137);
			value();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ON) {
				{
				setState(138);
				onupdate_attribute();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Onupdate_attributeContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ON() { return getToken(CreateTableParser.KEYWORD_ON, 0); }
		public TerminalNode KEYWORD_UPDATE() { return getToken(CreateTableParser.KEYWORD_UPDATE, 0); }
		public Current_timestamp_partContext current_timestamp_part() {
			return getRuleContext(Current_timestamp_partContext.class,0);
		}
		public Onupdate_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onupdate_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterOnupdate_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitOnupdate_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitOnupdate_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Onupdate_attributeContext onupdate_attribute() throws RecognitionException {
		Onupdate_attributeContext _localctx = new Onupdate_attributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_onupdate_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(KEYWORD_ON);
			setState(142);
			match(KEYWORD_UPDATE);
			setState(143);
			current_timestamp_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_attributeContext extends ParserRuleContext {
		public Comment_partContext comment_part() {
			return getRuleContext(Comment_partContext.class,0);
		}
		public Comment_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterComment_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitComment_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitComment_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_attributeContext comment_attribute() throws RecognitionException {
		Comment_attributeContext _localctx = new Comment_attributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comment_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			comment_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_attributesContext extends ParserRuleContext {
		public List<Not_null_attributeContext> not_null_attribute() {
			return getRuleContexts(Not_null_attributeContext.class);
		}
		public Not_null_attributeContext not_null_attribute(int i) {
			return getRuleContext(Not_null_attributeContext.class,i);
		}
		public List<Default_attributeContext> default_attribute() {
			return getRuleContexts(Default_attributeContext.class);
		}
		public Default_attributeContext default_attribute(int i) {
			return getRuleContext(Default_attributeContext.class,i);
		}
		public List<Comment_attributeContext> comment_attribute() {
			return getRuleContexts(Comment_attributeContext.class);
		}
		public Comment_attributeContext comment_attribute(int i) {
			return getRuleContext(Comment_attributeContext.class,i);
		}
		public List<Auto_increment_attributeContext> auto_increment_attribute() {
			return getRuleContexts(Auto_increment_attributeContext.class);
		}
		public Auto_increment_attributeContext auto_increment_attribute(int i) {
			return getRuleContext(Auto_increment_attributeContext.class,i);
		}
		public Field_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterField_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitField_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitField_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_attributesContext field_attributes() throws RecognitionException {
		Field_attributesContext _localctx = new Field_attributesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_field_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_NOT) | (1L << KEYWORD_COMMENT) | (1L << KEYWORD_DEFAULT) | (1L << KEYWORD_AUTO_INCREMENT))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_NOT:
					{
					setState(147);
					not_null_attribute();
					}
					break;
				case KEYWORD_DEFAULT:
					{
					setState(148);
					default_attribute();
					}
					break;
				case KEYWORD_COMMENT:
					{
					setState(149);
					comment_attribute();
					}
					break;
				case KEYWORD_AUTO_INCREMENT:
					{
					setState(150);
					auto_increment_attribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_default_charsetContext extends ParserRuleContext {
		public TerminalNode KEYWORD_DEFAULT() { return getToken(CreateTableParser.KEYWORD_DEFAULT, 0); }
		public TerminalNode KEYWORD_CHARSET() { return getToken(CreateTableParser.KEYWORD_CHARSET, 0); }
		public TerminalNode EQUAL() { return getToken(CreateTableParser.EQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_default_charsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_default_charset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable_default_charset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable_default_charset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitTable_default_charset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_default_charsetContext table_default_charset() throws RecognitionException {
		Table_default_charsetContext _localctx = new Table_default_charsetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_table_default_charset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(KEYWORD_DEFAULT);
			setState(157);
			match(KEYWORD_CHARSET);
			setState(158);
			match(EQUAL);
			setState(159);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_engineContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ENGINE() { return getToken(CreateTableParser.KEYWORD_ENGINE, 0); }
		public TerminalNode EQUAL() { return getToken(CreateTableParser.EQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_engineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable_engine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable_engine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitTable_engine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_engineContext table_engine() throws RecognitionException {
		Table_engineContext _localctx = new Table_engineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_table_engine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(KEYWORD_ENGINE);
			setState(162);
			match(EQUAL);
			setState(163);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_commentContext extends ParserRuleContext {
		public TerminalNode KEYWORD_COMMENT() { return getToken(CreateTableParser.KEYWORD_COMMENT, 0); }
		public TerminalNode EQUAL() { return getToken(CreateTableParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Table_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitTable_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_commentContext table_comment() throws RecognitionException {
		Table_commentContext _localctx = new Table_commentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(KEYWORD_COMMENT);
			setState(166);
			match(EQUAL);
			setState(167);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_attributeContext extends ParserRuleContext {
		public Table_default_charsetContext table_default_charset() {
			return getRuleContext(Table_default_charsetContext.class,0);
		}
		public Table_engineContext table_engine() {
			return getRuleContext(Table_engineContext.class,0);
		}
		public Table_commentContext table_comment() {
			return getRuleContext(Table_commentContext.class,0);
		}
		public Table_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitTable_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_attributeContext table_attribute() throws RecognitionException {
		Table_attributeContext _localctx = new Table_attributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_table_attribute);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				table_default_charset();
				}
				break;
			case KEYWORD_ENGINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				table_engine();
				}
				break;
			case KEYWORD_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				table_comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_attributesContext extends ParserRuleContext {
		public List<Table_attributeContext> table_attribute() {
			return getRuleContexts(Table_attributeContext.class);
		}
		public Table_attributeContext table_attribute(int i) {
			return getRuleContext(Table_attributeContext.class,i);
		}
		public Table_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitTable_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_attributesContext table_attributes() throws RecognitionException {
		Table_attributesContext _localctx = new Table_attributesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_COMMENT) | (1L << KEYWORD_DEFAULT) | (1L << KEYWORD_ENGINE))) != 0)) {
				{
				{
				setState(174);
				table_attribute();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_number_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(CreateTableParser.TYPE_INT, 0); }
		public TerminalNode TYPE_TINYINT() { return getToken(CreateTableParser.TYPE_TINYINT, 0); }
		public TerminalNode TYPE_SMALLINT() { return getToken(CreateTableParser.TYPE_SMALLINT, 0); }
		public TerminalNode TYPE_MEDIUMINT() { return getToken(CreateTableParser.TYPE_MEDIUMINT, 0); }
		public TerminalNode TYPE_BIGINT() { return getToken(CreateTableParser.TYPE_BIGINT, 0); }
		public Single_length_partContext single_length_part() {
			return getRuleContext(Single_length_partContext.class,0);
		}
		public TerminalNode KEYWORD_UNSIGNED() { return getToken(CreateTableParser.KEYWORD_UNSIGNED, 0); }
		public Integer_number_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_number_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterInteger_number_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitInteger_number_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitInteger_number_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_number_typeContext integer_number_type() throws RecognitionException {
		Integer_number_typeContext _localctx = new Integer_number_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_integer_number_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_TINYINT) | (1L << TYPE_SMALLINT) | (1L << TYPE_MEDIUMINT) | (1L << TYPE_BIGINT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BREAK) {
				{
				setState(181);
				single_length_part();
				}
			}

			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_UNSIGNED) {
				{
				setState(184);
				match(KEYWORD_UNSIGNED);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_number_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_DECIMAL() { return getToken(CreateTableParser.TYPE_DECIMAL, 0); }
		public Single_length_partContext single_length_part() {
			return getRuleContext(Single_length_partContext.class,0);
		}
		public Double_length_partContext double_length_part() {
			return getRuleContext(Double_length_partContext.class,0);
		}
		public TerminalNode KEYWORD_UNSIGNED() { return getToken(CreateTableParser.KEYWORD_UNSIGNED, 0); }
		public Decimal_number_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_number_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDecimal_number_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDecimal_number_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitDecimal_number_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_number_typeContext decimal_number_type() throws RecognitionException {
		Decimal_number_typeContext _localctx = new Decimal_number_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decimal_number_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(TYPE_DECIMAL);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(188);
				single_length_part();
				}
				break;
			case 2:
				{
				setState(189);
				double_length_part();
				}
				break;
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_UNSIGNED) {
				{
				setState(192);
				match(KEYWORD_UNSIGNED);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Text_typeContext extends ParserRuleContext {
		public Single_length_partContext single_length_part() {
			return getRuleContext(Single_length_partContext.class,0);
		}
		public TerminalNode TYPE_VARCHAR() { return getToken(CreateTableParser.TYPE_VARCHAR, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(CreateTableParser.TYPE_CHAR, 0); }
		public Text_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterText_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitText_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitText_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_typeContext text_type() throws RecognitionException {
		Text_typeContext _localctx = new Text_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_text_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==TYPE_CHAR || _la==TYPE_VARCHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
			single_length_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_BIT() { return getToken(CreateTableParser.TYPE_BIT, 0); }
		public Single_length_partContext single_length_part() {
			return getRuleContext(Single_length_partContext.class,0);
		}
		public Bit_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterBit_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitBit_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitBit_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_typeContext bit_type() throws RecognitionException {
		Bit_typeContext _localctx = new Bit_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bit_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(TYPE_BIT);
			setState(199);
			single_length_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_TIMESTAMP() { return getToken(CreateTableParser.TYPE_TIMESTAMP, 0); }
		public Single_length_partContext single_length_part() {
			return getRuleContext(Single_length_partContext.class,0);
		}
		public Timestamp_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTimestamp_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTimestamp_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitTimestamp_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_typeContext timestamp_type() throws RecognitionException {
		Timestamp_typeContext _localctx = new Timestamp_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_timestamp_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(TYPE_TIMESTAMP);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BREAK) {
				{
				setState(202);
				single_length_part();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Integer_number_typeContext integer_number_type() {
			return getRuleContext(Integer_number_typeContext.class,0);
		}
		public Decimal_number_typeContext decimal_number_type() {
			return getRuleContext(Decimal_number_typeContext.class,0);
		}
		public Text_typeContext text_type() {
			return getRuleContext(Text_typeContext.class,0);
		}
		public Timestamp_typeContext timestamp_type() {
			return getRuleContext(Timestamp_typeContext.class,0);
		}
		public Bit_typeContext bit_type() {
			return getRuleContext(Bit_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_TINYINT:
			case TYPE_SMALLINT:
			case TYPE_MEDIUMINT:
			case TYPE_BIGINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				integer_number_type();
				}
				break;
			case TYPE_DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				decimal_number_type();
				}
				break;
			case TYPE_CHAR:
			case TYPE_VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				text_type();
				}
				break;
			case TYPE_TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				timestamp_type();
				}
				break;
			case TYPE_BIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				bit_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TEXT_LITERAL() { return getToken(CreateTableParser.TEXT_LITERAL, 0); }
		public Current_timestamp_partContext current_timestamp_part() {
			return getRuleContext(Current_timestamp_partContext.class,0);
		}
		public TerminalNode DIGITS() { return getToken(CreateTableParser.DIGITS, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__0);
				setState(213);
				match(TEXT_LITERAL);
				}
				break;
			case KEYWORD_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				current_timestamp_part();
				}
				break;
			case TEXT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(TEXT_LITERAL);
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(DIGITS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TEXT_LITERAL() { return getToken(CreateTableParser.TEXT_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(TEXT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CreateTableParser.IDENTIFIER, 0); }
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(CreateTableParser.BACKQUOTED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==BACKQUOTED_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CreateTableParser.COMMA, i);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			identifier();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(224);
				match(COMMA);
				setState(225);
				identifier();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_partContext extends ParserRuleContext {
		public TerminalNode KEYWORD_COMMENT() { return getToken(CreateTableParser.KEYWORD_COMMENT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Comment_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterComment_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitComment_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitComment_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_partContext comment_part() throws RecognitionException {
		Comment_partContext _localctx = new Comment_partContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comment_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(KEYWORD_COMMENT);
			setState(232);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_length_partContext extends ParserRuleContext {
		public TerminalNode LEFT_BREAK() { return getToken(CreateTableParser.LEFT_BREAK, 0); }
		public TerminalNode DIGITS() { return getToken(CreateTableParser.DIGITS, 0); }
		public TerminalNode RIGHT_BREAK() { return getToken(CreateTableParser.RIGHT_BREAK, 0); }
		public Single_length_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_length_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterSingle_length_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitSingle_length_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitSingle_length_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_length_partContext single_length_part() throws RecognitionException {
		Single_length_partContext _localctx = new Single_length_partContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_single_length_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(LEFT_BREAK);
			setState(235);
			match(DIGITS);
			setState(236);
			match(RIGHT_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_length_partContext extends ParserRuleContext {
		public TerminalNode LEFT_BREAK() { return getToken(CreateTableParser.LEFT_BREAK, 0); }
		public List<TerminalNode> DIGITS() { return getTokens(CreateTableParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(CreateTableParser.DIGITS, i);
		}
		public TerminalNode COMMA() { return getToken(CreateTableParser.COMMA, 0); }
		public TerminalNode RIGHT_BREAK() { return getToken(CreateTableParser.RIGHT_BREAK, 0); }
		public Double_length_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_length_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDouble_length_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDouble_length_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitDouble_length_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_length_partContext double_length_part() throws RecognitionException {
		Double_length_partContext _localctx = new Double_length_partContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_double_length_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LEFT_BREAK);
			setState(239);
			match(DIGITS);
			setState(240);
			match(COMMA);
			setState(241);
			match(DIGITS);
			setState(242);
			match(RIGHT_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Current_timestamp_partContext extends ParserRuleContext {
		public TerminalNode KEYWORD_CURRENT_TIMESTAMP() { return getToken(CreateTableParser.KEYWORD_CURRENT_TIMESTAMP, 0); }
		public Single_length_partContext single_length_part() {
			return getRuleContext(Single_length_partContext.class,0);
		}
		public Current_timestamp_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current_timestamp_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterCurrent_timestamp_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitCurrent_timestamp_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableVisitor ) return ((CreateTableVisitor<? extends T>)visitor).visitCurrent_timestamp_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Current_timestamp_partContext current_timestamp_part() throws RecognitionException {
		Current_timestamp_partContext _localctx = new Current_timestamp_partContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_current_timestamp_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(KEYWORD_CURRENT_TIMESTAMP);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BREAK) {
				{
				setState(245);
				single_length_part();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2J\n\2\r\2\16\2K\3\3\3\3\5\3P\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6b\n\6\f"+
		"\6\16\6e\13\6\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\5\ny\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u008e\n\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u009a\n\21\f\21\16\21\u009d\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\5\25\u00af\n\25\3\26\7\26\u00b2\n\26\f\26\16\26\u00b5\13"+
		"\26\3\27\3\27\5\27\u00b9\n\27\3\27\5\27\u00bc\n\27\3\30\3\30\3\30\5\30"+
		"\u00c1\n\30\3\30\5\30\u00c4\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\5\33\u00ce\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u00d5\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00dc\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u00e5"+
		"\n \f \16 \u00e8\13 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$"+
		"\5$\u00f9\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDF\2\6\4\2\20\20++\4\2\30\30\32\35\4\2\27\27\31\31\3\2"+
		"&\'\2\u00f5\2I\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\bU\3\2\2\2\n^\3\2\2\2\fj"+
		"\3\2\2\2\16l\3\2\2\2\20p\3\2\2\2\22v\3\2\2\2\24\177\3\2\2\2\26\u0085\3"+
		"\2\2\2\30\u0088\3\2\2\2\32\u008a\3\2\2\2\34\u008f\3\2\2\2\36\u0093\3\2"+
		"\2\2 \u009b\3\2\2\2\"\u009e\3\2\2\2$\u00a3\3\2\2\2&\u00a7\3\2\2\2(\u00ae"+
		"\3\2\2\2*\u00b3\3\2\2\2,\u00b6\3\2\2\2.\u00bd\3\2\2\2\60\u00c5\3\2\2\2"+
		"\62\u00c8\3\2\2\2\64\u00cb\3\2\2\2\66\u00d4\3\2\2\28\u00db\3\2\2\2:\u00dd"+
		"\3\2\2\2<\u00df\3\2\2\2>\u00e1\3\2\2\2@\u00e9\3\2\2\2B\u00ec\3\2\2\2D"+
		"\u00f0\3\2\2\2F\u00f6\3\2\2\2HJ\5\4\3\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2L\3\3\2\2\2MP\5\6\4\2NP\5\b\5\2OM\3\2\2\2ON\3\2\2\2P\5\3\2\2"+
		"\2QR\7\t\2\2RS\5<\37\2ST\7)\2\2T\7\3\2\2\2UV\7\6\2\2VW\7\7\2\2WX\5<\37"+
		"\2XY\7!\2\2YZ\5\n\6\2Z[\7\"\2\2[\\\5*\26\2\\]\7)\2\2]\t\3\2\2\2^c\5\f"+
		"\7\2_`\7#\2\2`b\5\f\7\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3"+
		"\2\2\2ec\3\2\2\2fk\5\16\b\2gk\5\20\t\2hk\5\22\n\2ik\5\24\13\2jf\3\2\2"+
		"\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lm\5<\37\2mn\5\66\34\2no\5"+
		" \21\2o\17\3\2\2\2pq\7\17\2\2qr\7\20\2\2rs\7!\2\2st\5> \2tu\7\"\2\2u\21"+
		"\3\2\2\2vx\7\21\2\2wy\t\2\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\5<\37\2"+
		"{|\7!\2\2|}\5> \2}~\7\"\2\2~\23\3\2\2\2\177\u0080\7\20\2\2\u0080\u0081"+
		"\5<\37\2\u0081\u0082\7!\2\2\u0082\u0083\5> \2\u0083\u0084\7\"\2\2\u0084"+
		"\25\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\7\5\2\2\u0087\27\3\2\2\2\u0088"+
		"\u0089\7\24\2\2\u0089\31\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008d\58\35"+
		"\2\u008c\u008e\5\34\17\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\33\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0091\7\f\2\2\u0091\u0092\5F$\2"+
		"\u0092\35\3\2\2\2\u0093\u0094\5@!\2\u0094\37\3\2\2\2\u0095\u009a\5\26"+
		"\f\2\u0096\u009a\5\32\16\2\u0097\u009a\5\36\20\2\u0098\u009a\5\30\r\2"+
		"\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"!\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\n\2\2\u009f\u00a0\7\23\2\2"+
		"\u00a0\u00a1\7$\2\2\u00a1\u00a2\5<\37\2\u00a2#\3\2\2\2\u00a3\u00a4\7\22"+
		"\2\2\u00a4\u00a5\7$\2\2\u00a5\u00a6\5<\37\2\u00a6%\3\2\2\2\u00a7\u00a8"+
		"\7\b\2\2\u00a8\u00a9\7$\2\2\u00a9\u00aa\5:\36\2\u00aa\'\3\2\2\2\u00ab"+
		"\u00af\5\"\22\2\u00ac\u00af\5$\23\2\u00ad\u00af\5&\24\2\u00ae\u00ab\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af)\3\2\2\2\u00b0\u00b2"+
		"\5(\25\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4+\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\t\3\2\2"+
		"\u00b7\u00b9\5B\"\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00bc\7\16\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc-\3\2\2\2\u00bd\u00c0\7\36\2\2\u00be\u00c1\5B\"\2\u00bf\u00c1\5"+
		"D#\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c4\7\16\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4/\3\2\2\2\u00c5\u00c6\t\4\2\2\u00c6\u00c7\5B\"\2\u00c7\61"+
		"\3\2\2\2\u00c8\u00c9\7\26\2\2\u00c9\u00ca\5B\"\2\u00ca\63\3\2\2\2\u00cb"+
		"\u00cd\7\25\2\2\u00cc\u00ce\5B\"\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\65\3\2\2\2\u00cf\u00d5\5,\27\2\u00d0\u00d5\5.\30\2\u00d1\u00d5"+
		"\5\60\31\2\u00d2\u00d5\5\64\33\2\u00d3\u00d5\5\62\32\2\u00d4\u00cf\3\2"+
		"\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\67\3\2\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00dc\7(\2\2"+
		"\u00d8\u00dc\5F$\2\u00d9\u00dc\7(\2\2\u00da\u00dc\7%\2\2\u00db\u00d6\3"+
		"\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"9\3\2\2\2\u00dd\u00de\7(\2\2\u00de;\3\2\2\2\u00df\u00e0\t\5\2\2\u00e0"+
		"=\3\2\2\2\u00e1\u00e6\5<\37\2\u00e2\u00e3\7#\2\2\u00e3\u00e5\5<\37\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7?\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb"+
		"\5:\36\2\u00ebA\3\2\2\2\u00ec\u00ed\7!\2\2\u00ed\u00ee\7%\2\2\u00ee\u00ef"+
		"\7\"\2\2\u00efC\3\2\2\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\7%\2\2\u00f2\u00f3"+
		"\7#\2\2\u00f3\u00f4\7%\2\2\u00f4\u00f5\7\"\2\2\u00f5E\3\2\2\2\u00f6\u00f8"+
		"\7\r\2\2\u00f7\u00f9\5B\"\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"G\3\2\2\2\25KOcjx\u008d\u0099\u009b\u00ae\u00b3\u00b8\u00bb\u00c0\u00c3"+
		"\u00cd\u00d4\u00db\u00e6\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}