// Generated from D:/Users/Administrator/IdeaProjects/parser/src/main/resources\CreateTable.g4 by ANTLR 4.9.2
package com.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableLexer extends Lexer {
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
		TEXT_LITERAL=38, SEMICOLON=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "KEYWORD_NOT", "KEYWORD_NULL", "KEYWORD_CREATE", "KEYWORD_TABLE", 
			"KEYWORD_COMMENT", "KEYWORD_USE", "KEYWORD_DEFAULT", "KEYWORD_ON", "KEYWORD_UPDATE", 
			"KEYWORD_CURRENT_TIMESTAMP", "KEYWORD_UNSIGNED", "KEYWORD_PRIMARY", "KEYWORD_KEY", 
			"KEYWORD_UNIQUE", "KEYWORD_ENGINE", "KEYWORD_CHARSET", "KEYWORD_AUTO_INCREMENT", 
			"TYPE_TIMESTAMP", "TYPE_BIT", "TYPE_CHAR", "TYPE_INT", "TYPE_VARCHAR", 
			"TYPE_TINYINT", "TYPE_SMALLINT", "TYPE_MEDIUMINT", "TYPE_BIGINT", "TYPE_DECIMAL", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BREAK", "RIGHT_BREAK", "COMMA", "EQUAL", 
			"DIGITS", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "TEXT_LITERAL", "SEMICOLON", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "UNDERLINE", 
			"DIGIT", "LETTER", "WS"
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
			"WS"
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


	public CreateTableLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CreateTable.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u01d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\6$\u0166"+
		"\n$\r$\16$\u0167\3%\3%\3%\3%\7%\u016e\n%\f%\16%\u0171\13%\3&\3&\3&\3&"+
		"\7&\u0177\n&\f&\16&\u017a\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0182\n\'\f\'"+
		"\16\'\u0185\13\'\3\'\3\'\3\'\3\'\3\'\7\'\u018c\n\'\f\'\16\'\u018f\13\'"+
		"\3\'\5\'\u0192\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\6F\u01d1\nF\rF\16F\u01d2\3F\3F\2\2G\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2"+
		"y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b*\3\2!\3"+
		"\2bb\4\2))^^\4\2$$^^\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\5\2\13\f\17\17\"\"\2\u01c4\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f"+
		"\3\2\2\2\7\u0093\3\2\2\2\t\u0098\3\2\2\2\13\u009f\3\2\2\2\r\u00a5\3\2"+
		"\2\2\17\u00ad\3\2\2\2\21\u00b1\3\2\2\2\23\u00b9\3\2\2\2\25\u00bc\3\2\2"+
		"\2\27\u00c3\3\2\2\2\31\u00d5\3\2\2\2\33\u00de\3\2\2\2\35\u00e6\3\2\2\2"+
		"\37\u00ea\3\2\2\2!\u00f1\3\2\2\2#\u00f8\3\2\2\2%\u0100\3\2\2\2\'\u010f"+
		"\3\2\2\2)\u0119\3\2\2\2+\u011d\3\2\2\2-\u0122\3\2\2\2/\u0126\3\2\2\2\61"+
		"\u012e\3\2\2\2\63\u0136\3\2\2\2\65\u013f\3\2\2\2\67\u0149\3\2\2\29\u0150"+
		"\3\2\2\2;\u0158\3\2\2\2=\u015a\3\2\2\2?\u015c\3\2\2\2A\u015e\3\2\2\2C"+
		"\u0160\3\2\2\2E\u0162\3\2\2\2G\u0165\3\2\2\2I\u0169\3\2\2\2K\u0172\3\2"+
		"\2\2M\u0191\3\2\2\2O\u0193\3\2\2\2Q\u0195\3\2\2\2S\u0197\3\2\2\2U\u0199"+
		"\3\2\2\2W\u019b\3\2\2\2Y\u019d\3\2\2\2[\u019f\3\2\2\2]\u01a1\3\2\2\2_"+
		"\u01a3\3\2\2\2a\u01a5\3\2\2\2c\u01a7\3\2\2\2e\u01a9\3\2\2\2g\u01ab\3\2"+
		"\2\2i\u01ad\3\2\2\2k\u01af\3\2\2\2m\u01b1\3\2\2\2o\u01b3\3\2\2\2q\u01b5"+
		"\3\2\2\2s\u01b7\3\2\2\2u\u01b9\3\2\2\2w\u01bb\3\2\2\2y\u01bd\3\2\2\2{"+
		"\u01bf\3\2\2\2}\u01c1\3\2\2\2\177\u01c3\3\2\2\2\u0081\u01c5\3\2\2\2\u0083"+
		"\u01c7\3\2\2\2\u0085\u01c9\3\2\2\2\u0087\u01cb\3\2\2\2\u0089\u01cd\3\2"+
		"\2\2\u008b\u01d0\3\2\2\2\u008d\u008e\7d\2\2\u008e\4\3\2\2\2\u008f\u0090"+
		"\5k\66\2\u0090\u0091\5m\67\2\u0091\u0092\5w<\2\u0092\6\3\2\2\2\u0093\u0094"+
		"\5k\66\2\u0094\u0095\5y=\2\u0095\u0096\5g\64\2\u0096\u0097\5g\64\2\u0097"+
		"\b\3\2\2\2\u0098\u0099\5U+\2\u0099\u009a\5s:\2\u009a\u009b\5Y-\2\u009b"+
		"\u009c\5Q)\2\u009c\u009d\5w<\2\u009d\u009e\5Y-\2\u009e\n\3\2\2\2\u009f"+
		"\u00a0\5w<\2\u00a0\u00a1\5Q)\2\u00a1\u00a2\5S*\2\u00a2\u00a3\5g\64\2\u00a3"+
		"\u00a4\5Y-\2\u00a4\f\3\2\2\2\u00a5\u00a6\5U+\2\u00a6\u00a7\5m\67\2\u00a7"+
		"\u00a8\5i\65\2\u00a8\u00a9\5i\65\2\u00a9\u00aa\5Y-\2\u00aa\u00ab\5k\66"+
		"\2\u00ab\u00ac\5w<\2\u00ac\16\3\2\2\2\u00ad\u00ae\5y=\2\u00ae\u00af\5"+
		"u;\2\u00af\u00b0\5Y-\2\u00b0\20\3\2\2\2\u00b1\u00b2\5W,\2\u00b2\u00b3"+
		"\5Y-\2\u00b3\u00b4\5[.\2\u00b4\u00b5\5Q)\2\u00b5\u00b6\5y=\2\u00b6\u00b7"+
		"\5g\64\2\u00b7\u00b8\5w<\2\u00b8\22\3\2\2\2\u00b9\u00ba\5m\67\2\u00ba"+
		"\u00bb\5k\66\2\u00bb\24\3\2\2\2\u00bc\u00bd\5y=\2\u00bd\u00be\5o8\2\u00be"+
		"\u00bf\5W,\2\u00bf\u00c0\5Q)\2\u00c0\u00c1\5w<\2\u00c1\u00c2\5Y-\2\u00c2"+
		"\26\3\2\2\2\u00c3\u00c4\5U+\2\u00c4\u00c5\5y=\2\u00c5\u00c6\5s:\2\u00c6"+
		"\u00c7\5s:\2\u00c7\u00c8\5Y-\2\u00c8\u00c9\5k\66\2\u00c9\u00ca\5w<\2\u00ca"+
		"\u00cb\5\u0085C\2\u00cb\u00cc\5w<\2\u00cc\u00cd\5a\61\2\u00cd\u00ce\5"+
		"i\65\2\u00ce\u00cf\5Y-\2\u00cf\u00d0\5u;\2\u00d0\u00d1\5w<\2\u00d1\u00d2"+
		"\5Q)\2\u00d2\u00d3\5i\65\2\u00d3\u00d4\5o8\2\u00d4\30\3\2\2\2\u00d5\u00d6"+
		"\5y=\2\u00d6\u00d7\5k\66\2\u00d7\u00d8\5u;\2\u00d8\u00d9\5a\61\2\u00d9"+
		"\u00da\5]/\2\u00da\u00db\5k\66\2\u00db\u00dc\5Y-\2\u00dc\u00dd\5W,\2\u00dd"+
		"\32\3\2\2\2\u00de\u00df\5o8\2\u00df\u00e0\5s:\2\u00e0\u00e1\5a\61\2\u00e1"+
		"\u00e2\5i\65\2\u00e2\u00e3\5Q)\2\u00e3\u00e4\5s:\2\u00e4\u00e5\5\u0081"+
		"A\2\u00e5\34\3\2\2\2\u00e6\u00e7\5e\63\2\u00e7\u00e8\5Y-\2\u00e8\u00e9"+
		"\5\u0081A\2\u00e9\36\3\2\2\2\u00ea\u00eb\5y=\2\u00eb\u00ec\5k\66\2\u00ec"+
		"\u00ed\5a\61\2\u00ed\u00ee\5q9\2\u00ee\u00ef\5y=\2\u00ef\u00f0\5Y-\2\u00f0"+
		" \3\2\2\2\u00f1\u00f2\5Y-\2\u00f2\u00f3\5k\66\2\u00f3\u00f4\5]/\2\u00f4"+
		"\u00f5\5a\61\2\u00f5\u00f6\5k\66\2\u00f6\u00f7\5Y-\2\u00f7\"\3\2\2\2\u00f8"+
		"\u00f9\5U+\2\u00f9\u00fa\5_\60\2\u00fa\u00fb\5Q)\2\u00fb\u00fc\5s:\2\u00fc"+
		"\u00fd\5u;\2\u00fd\u00fe\5Y-\2\u00fe\u00ff\5w<\2\u00ff$\3\2\2\2\u0100"+
		"\u0101\5Q)\2\u0101\u0102\5y=\2\u0102\u0103\5w<\2\u0103\u0104\5m\67\2\u0104"+
		"\u0105\5\u0085C\2\u0105\u0106\5a\61\2\u0106\u0107\5k\66\2\u0107\u0108"+
		"\5U+\2\u0108\u0109\5s:\2\u0109\u010a\5Y-\2\u010a\u010b\5i\65\2\u010b\u010c"+
		"\5Y-\2\u010c\u010d\5k\66\2\u010d\u010e\5w<\2\u010e&\3\2\2\2\u010f\u0110"+
		"\5w<\2\u0110\u0111\5a\61\2\u0111\u0112\5i\65\2\u0112\u0113\5Y-\2\u0113"+
		"\u0114\5u;\2\u0114\u0115\5w<\2\u0115\u0116\5Q)\2\u0116\u0117\5i\65\2\u0117"+
		"\u0118\5o8\2\u0118(\3\2\2\2\u0119\u011a\5S*\2\u011a\u011b\5a\61\2\u011b"+
		"\u011c\5w<\2\u011c*\3\2\2\2\u011d\u011e\5U+\2\u011e\u011f\5_\60\2\u011f"+
		"\u0120\5Q)\2\u0120\u0121\5s:\2\u0121,\3\2\2\2\u0122\u0123\5a\61\2\u0123"+
		"\u0124\5k\66\2\u0124\u0125\5w<\2\u0125.\3\2\2\2\u0126\u0127\5{>\2\u0127"+
		"\u0128\5Q)\2\u0128\u0129\5s:\2\u0129\u012a\5U+\2\u012a\u012b\5_\60\2\u012b"+
		"\u012c\5Q)\2\u012c\u012d\5s:\2\u012d\60\3\2\2\2\u012e\u012f\5w<\2\u012f"+
		"\u0130\5a\61\2\u0130\u0131\5k\66\2\u0131\u0132\5\u0081A\2\u0132\u0133"+
		"\5a\61\2\u0133\u0134\5k\66\2\u0134\u0135\5w<\2\u0135\62\3\2\2\2\u0136"+
		"\u0137\5u;\2\u0137\u0138\5i\65\2\u0138\u0139\5Q)\2\u0139\u013a\5g\64\2"+
		"\u013a\u013b\5g\64\2\u013b\u013c\5a\61\2\u013c\u013d\5k\66\2\u013d\u013e"+
		"\5w<\2\u013e\64\3\2\2\2\u013f\u0140\5i\65\2\u0140\u0141\5Y-\2\u0141\u0142"+
		"\5W,\2\u0142\u0143\5a\61\2\u0143\u0144\5y=\2\u0144\u0145\5i\65\2\u0145"+
		"\u0146\5a\61\2\u0146\u0147\5k\66\2\u0147\u0148\5w<\2\u0148\66\3\2\2\2"+
		"\u0149\u014a\5S*\2\u014a\u014b\5a\61\2\u014b\u014c\5]/\2\u014c\u014d\5"+
		"a\61\2\u014d\u014e\5k\66\2\u014e\u014f\5w<\2\u014f8\3\2\2\2\u0150\u0151"+
		"\5W,\2\u0151\u0152\5Y-\2\u0152\u0153\5U+\2\u0153\u0154\5a\61\2\u0154\u0155"+
		"\5i\65\2\u0155\u0156\5Q)\2\u0156\u0157\5g\64\2\u0157:\3\2\2\2\u0158\u0159"+
		"\7}\2\2\u0159<\3\2\2\2\u015a\u015b\7\177\2\2\u015b>\3\2\2\2\u015c\u015d"+
		"\7*\2\2\u015d@\3\2\2\2\u015e\u015f\7+\2\2\u015fB\3\2\2\2\u0160\u0161\7"+
		".\2\2\u0161D\3\2\2\2\u0162\u0163\7?\2\2\u0163F\3\2\2\2\u0164\u0166\5\u0087"+
		"D\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168H\3\2\2\2\u0169\u016f\5\u0089E\2\u016a\u016e\5\u0089"+
		"E\2\u016b\u016e\5\u0087D\2\u016c\u016e\7a\2\2\u016d\u016a\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170J\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0178"+
		"\7b\2\2\u0173\u0177\n\2\2\2\u0174\u0175\7b\2\2\u0175\u0177\7b\2\2\u0176"+
		"\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\7b\2\2\u017cL\3\2\2\2\u017d\u0183\7)\2\2\u017e\u0182\n\3\2\2\u017f"+
		"\u0180\7^\2\2\u0180\u0182\13\2\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0192\7)\2\2\u0187\u018d\7$\2"+
		"\2\u0188\u018c\n\4\2\2\u0189\u018a\7^\2\2\u018a\u018c\13\2\2\2\u018b\u0188"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\7$"+
		"\2\2\u0191\u017d\3\2\2\2\u0191\u0187\3\2\2\2\u0192N\3\2\2\2\u0193\u0194"+
		"\7=\2\2\u0194P\3\2\2\2\u0195\u0196\t\5\2\2\u0196R\3\2\2\2\u0197\u0198"+
		"\t\6\2\2\u0198T\3\2\2\2\u0199\u019a\t\7\2\2\u019aV\3\2\2\2\u019b\u019c"+
		"\t\b\2\2\u019cX\3\2\2\2\u019d\u019e\t\t\2\2\u019eZ\3\2\2\2\u019f\u01a0"+
		"\t\n\2\2\u01a0\\\3\2\2\2\u01a1\u01a2\t\13\2\2\u01a2^\3\2\2\2\u01a3\u01a4"+
		"\t\f\2\2\u01a4`\3\2\2\2\u01a5\u01a6\t\r\2\2\u01a6b\3\2\2\2\u01a7\u01a8"+
		"\t\16\2\2\u01a8d\3\2\2\2\u01a9\u01aa\t\17\2\2\u01aaf\3\2\2\2\u01ab\u01ac"+
		"\t\20\2\2\u01ach\3\2\2\2\u01ad\u01ae\t\21\2\2\u01aej\3\2\2\2\u01af\u01b0"+
		"\t\22\2\2\u01b0l\3\2\2\2\u01b1\u01b2\t\23\2\2\u01b2n\3\2\2\2\u01b3\u01b4"+
		"\t\24\2\2\u01b4p\3\2\2\2\u01b5\u01b6\t\25\2\2\u01b6r\3\2\2\2\u01b7\u01b8"+
		"\t\26\2\2\u01b8t\3\2\2\2\u01b9\u01ba\t\27\2\2\u01bav\3\2\2\2\u01bb\u01bc"+
		"\t\30\2\2\u01bcx\3\2\2\2\u01bd\u01be\t\31\2\2\u01bez\3\2\2\2\u01bf\u01c0"+
		"\t\32\2\2\u01c0|\3\2\2\2\u01c1\u01c2\t\33\2\2\u01c2~\3\2\2\2\u01c3\u01c4"+
		"\t\34\2\2\u01c4\u0080\3\2\2\2\u01c5\u01c6\t\35\2\2\u01c6\u0082\3\2\2\2"+
		"\u01c7\u01c8\t\36\2\2\u01c8\u0084\3\2\2\2\u01c9\u01ca\7a\2\2\u01ca\u0086"+
		"\3\2\2\2\u01cb\u01cc\4\62;\2\u01cc\u0088\3\2\2\2\u01cd\u01ce\t\37\2\2"+
		"\u01ce\u008a\3\2\2\2\u01cf\u01d1\t \2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\bF\2\2\u01d5\u008c\3\2\2\2\16\2\u0167\u016d\u016f\u0176\u0178\u0181"+
		"\u0183\u018b\u018d\u0191\u01d2\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}