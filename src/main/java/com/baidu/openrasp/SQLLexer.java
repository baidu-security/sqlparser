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
		Identifier=1, Number=2, DOUBLE_QUOTE=3, SINGLE_QUOTE=4, BLOCK_COMMENT=5, 
		POUND_COMMENT=6, L_BRACKET=7, R_BRACKET=8, StringLiteral=9, EscapeSequence=10, 
		BLOCK_COMMENT_START=11, BLOCK_COMMENT_END=12, COMMA=13, DOT=14, OR=15, 
		EQUAL=16, AT=17, COLON=18, SYMBOL=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Identifier", "Number", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BLOCK_COMMENT", 
		"POUND_COMMENT", "L_BRACKET", "R_BRACKET", "StringLiteral", "EscapeSequence", 
		"BLOCK_COMMENT_START", "BLOCK_COMMENT_END", "COMMA", "DOT", "OR", "EQUAL", 
		"AT", "COLON", "SYMBOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\"'", "'''", null, null, "'{'", "'}'", null, null, 
		"'/*!'", "'*/'", "','", "'.'", "'||'", "'='", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Identifier", "Number", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BLOCK_COMMENT", 
		"POUND_COMMENT", "L_BRACKET", "R_BRACKET", "StringLiteral", "EscapeSequence", 
		"BLOCK_COMMENT_START", "BLOCK_COMMENT_END", "COMMA", "DOT", "OR", "EQUAL", 
		"AT", "COLON", "SYMBOL", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\6\3>\n\3\r\3\16\3?\3\3\6\3C"+
		"\n\3\r\3\16\3D\3\3\3\3\6\3I\n\3\r\3\16\3J\3\3\3\3\5\3O\n\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3"+
		"\6\5\6e\n\6\3\6\3\6\3\7\3\7\3\7\5\7l\n\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\n\3\n\5\n\u008e\n\n"+
		"\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u00a9\n\24"+
		"\r\24\16\24\u00aa\3\25\6\25\u00ae\n\25\r\25\16\25\u00af\3\25\3\25\3_\2"+
		"\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26\3\2\13\7\2\60\60\62;C\\aac|\3\2\62;\3\2"+
		"##\4\2\f\f\17\17\4\2$$^^\4\2))^^\n\2$$))^^ddhhppttvv\13\2##&(*-//\61\61"+
		"<<>>@A``\5\2\13\f\16\17\"\"\u00c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\3:\3\2\2\2\5N\3\2\2\2\7P\3\2\2\2\tR\3\2\2\2\13d\3\2\2\2\rk\3\2\2\2"+
		"\17u\3\2\2\2\21w\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0093\3"+
		"\2\2\2\31\u0097\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2"+
		"\2\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a8\3\2\2\2)\u00ad"+
		"\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/;\3\2\2\2\60"+
		"\61\7b\2\2\61\62\5\3\2\2\62\63\7b\2\2\63;\3\2\2\2\64\65\7b\2\2\65\66\5"+
		"\3\2\2\66\67\7b\2\2\678\7\60\2\289\5\3\2\29;\3\2\2\2:,\3\2\2\2:\60\3\2"+
		"\2\2:\64\3\2\2\2;\4\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@"+
		"\3\2\2\2@O\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E"+
		"F\3\2\2\2FH\7\60\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"KO\3\2\2\2LM\7/\2\2MO\5\5\3\2N=\3\2\2\2NB\3\2\2\2NL\3\2\2\2O\6\3\2\2\2"+
		"PQ\7$\2\2Q\b\3\2\2\2RS\7)\2\2S\n\3\2\2\2TU\7\61\2\2UV\7,\2\2VW\7,\2\2"+
		"We\7\61\2\2XY\7\61\2\2YZ\7,\2\2Z[\3\2\2\2[_\n\4\2\2\\^\13\2\2\2]\\\3\2"+
		"\2\2^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7,\2\2ce\7\61"+
		"\2\2dT\3\2\2\2dX\3\2\2\2ef\3\2\2\2fg\b\6\2\2g\f\3\2\2\2hl\7%\2\2ij\7/"+
		"\2\2jl\7/\2\2kh\3\2\2\2ki\3\2\2\2lp\3\2\2\2mo\n\5\2\2nm\3\2\2\2or\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b\7\2\2t\16\3\2\2\2uv\7"+
		"}\2\2v\20\3\2\2\2wx\7\177\2\2x\22\3\2\2\2y~\5\7\4\2z}\n\6\2\2{}\5\25\13"+
		"\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\7\4\2\u0082\u008e\3\2\2\2\u0083"+
		"\u0088\5\t\5\2\u0084\u0087\n\7\2\2\u0085\u0087\5\25\13\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\t"+
		"\5\2\u008c\u008e\3\2\2\2\u008dy\3\2\2\2\u008d\u0083\3\2\2\2\u008e\24\3"+
		"\2\2\2\u008f\u0091\7^\2\2\u0090\u0092\t\b\2\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\26\3\2\2\2\u0093\u0094\7\61\2\2\u0094\u0095\7,\2"+
		"\2\u0095\u0096\7#\2\2\u0096\30\3\2\2\2\u0097\u0098\7,\2\2\u0098\u0099"+
		"\7\61\2\2\u0099\32\3\2\2\2\u009a\u009b\7.\2\2\u009b\34\3\2\2\2\u009c\u009d"+
		"\7\60\2\2\u009d\36\3\2\2\2\u009e\u009f\7~\2\2\u009f\u00a0\7~\2\2\u00a0"+
		" \3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4"+
		"$\3\2\2\2\u00a5\u00a6\7=\2\2\u00a6&\3\2\2\2\u00a7\u00a9\t\t\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab(\3\2\2\2\u00ac\u00ae\t\n\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\b\25\2\2\u00b2*\3\2\2\2\25\2.:?DJN_dkp|~\u0086\u0088\u008d\u0091"+
		"\u00aa\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}