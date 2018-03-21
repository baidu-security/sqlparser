// Generated from SQL.g4 by ANTLR 4.5
package com.baidu.openrasp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Identifier=1, Number=2, DOUBLE_QUOTE=3, SINGLE_QUOTE=4, StringLiteral=5, 
		EscapeSequence=6, BLOCK_COMMENT_START=7, BLOCK_COMMENT_END=8, BLOCK_COMMENT=9, 
		POUND_COMMENT=10, COMMA=11, DOT=12, OR=13, SYMBOL=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Identifier", "Number", "DOUBLE_QUOTE", "SINGLE_QUOTE", "StringLiteral", 
		"EscapeSequence", "BLOCK_COMMENT_START", "BLOCK_COMMENT_END", "BLOCK_COMMENT", 
		"POUND_COMMENT", "COMMA", "DOT", "OR", "SYMBOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\"'", "'''", null, null, null, "'*/'", null, null, 
		"','", "'.'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Identifier", "Number", "DOUBLE_QUOTE", "SINGLE_QUOTE", "StringLiteral", 
		"EscapeSequence", "BLOCK_COMMENT_START", "BLOCK_COMMENT_END", "BLOCK_COMMENT", 
		"POUND_COMMENT", "COMMA", "DOT", "OR", "SYMBOL", "WS"
	};
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


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3\6\3\64"+
		"\n\3\r\3\16\3\65\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\6\3?\n\3\r\3\16\3@\3\3"+
		"\3\3\5\3E\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\5\6_\n\6\3\7\3\7\5\7"+
		"c\n\7\3\b\3\b\3\b\3\b\3\b\6\bj\n\b\r\b\16\bk\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\5\n\u0081\n\n\3"+
		"\n\3\n\3\13\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\6\17\u0096\n\17\r\17\16\17\u0097\3\20"+
		"\6\20\u009b\n\20\r\20\16\20\u009c\3\20\3\20\3{\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\13\7\2\60"+
		"\60\62;C\\aac|\3\2\62;\4\2$$^^\4\2))^^\n\2$$))^^ddhhppttvv\3\2##\4\2\f"+
		"\f\17\17\t\2##&(*-//\61\61<B``\5\2\13\f\16\17\"\"\u00b3\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\60\3\2\2\2\5D\3\2\2\2\7F\3\2\2"+
		"\2\tH\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17d\3\2\2\2\21m\3\2\2\2\23\u0080"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3"+
		"\2\2\2\35\u0095\3\2\2\2\37\u009a\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\61\3\2\2\2&\'\7b\2\2\'(\5\3\2\2()\7b\2\2)\61"+
		"\3\2\2\2*+\7b\2\2+,\5\3\2\2,-\7b\2\2-.\7\60\2\2./\5\3\2\2/\61\3\2\2\2"+
		"\60\"\3\2\2\2\60&\3\2\2\2\60*\3\2\2\2\61\4\3\2\2\2\62\64\t\3\2\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66E\3\2\2\2\679\t\3"+
		"\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<>\7\60\2\2=?"+
		"\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AE\3\2\2\2BC\7/\2\2CE"+
		"\5\5\3\2D\63\3\2\2\2D8\3\2\2\2DB\3\2\2\2E\6\3\2\2\2FG\7$\2\2G\b\3\2\2"+
		"\2HI\7)\2\2I\n\3\2\2\2JO\5\7\4\2KN\n\4\2\2LN\5\r\7\2MK\3\2\2\2ML\3\2\2"+
		"\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\5\7\4\2S_\3\2\2"+
		"\2TY\5\t\5\2UX\n\5\2\2VX\5\r\7\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5\t\5\2]_\3\2\2\2^J\3\2\2\2^T\3\2"+
		"\2\2_\f\3\2\2\2`b\7^\2\2ac\t\6\2\2ba\3\2\2\2bc\3\2\2\2c\16\3\2\2\2de\7"+
		"\61\2\2ef\7,\2\2fg\7#\2\2gi\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\20\3\2\2\2mn\7,\2\2no\7\61\2\2o\22\3\2\2\2pq\7\61\2"+
		"\2qr\7,\2\2rs\7,\2\2s\u0081\7\61\2\2tu\7\61\2\2uv\7,\2\2vw\3\2\2\2w{\n"+
		"\7\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{"+
		"\3\2\2\2~\177\7,\2\2\177\u0081\7\61\2\2\u0080p\3\2\2\2\u0080t\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0083\b\n\2\2\u0083\24\3\2\2\2\u0084\u0088"+
		"\7%\2\2\u0085\u0087\n\b\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\b\13\2\2\u008c\26\3\2\2\2\u008d\u008e\7.\2\2\u008e\30"+
		"\3\2\2\2\u008f\u0090\7\60\2\2\u0090\32\3\2\2\2\u0091\u0092\7~\2\2\u0092"+
		"\u0093\7~\2\2\u0093\34\3\2\2\2\u0094\u0096\t\t\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\36"+
		"\3\2\2\2\u0099\u009b\t\n\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\20"+
		"\2\2\u009f \3\2\2\2\25\2$\60\65:@DMOWY^bk{\u0080\u0088\u0097\u009c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}