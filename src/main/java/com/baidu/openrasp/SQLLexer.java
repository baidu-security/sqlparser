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
		Identifier=1, Number=2, DOUBLE_QUOTE=3, SINGLE_QUOTE=4, L_BRACKET=5, R_BRACKET=6, 
		StringLiteral=7, EscapeSequence=8, BLOCK_COMMENT_START=9, BLOCK_COMMENT_END=10, 
		BLOCK_COMMENT=11, POUND_COMMENT=12, COMMA=13, DOT=14, OR=15, SYMBOL=16, 
		WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Identifier", "Number", "DOUBLE_QUOTE", "SINGLE_QUOTE", "L_BRACKET", "R_BRACKET", 
		"StringLiteral", "EscapeSequence", "BLOCK_COMMENT_START", "BLOCK_COMMENT_END", 
		"BLOCK_COMMENT", "POUND_COMMENT", "COMMA", "DOT", "OR", "SYMBOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\"'", "'''", "'{'", "'}'", null, null, null, "'*/'", 
		null, null, "','", "'.'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Identifier", "Number", "DOUBLE_QUOTE", "SINGLE_QUOTE", "L_BRACKET", 
		"R_BRACKET", "StringLiteral", "EscapeSequence", "BLOCK_COMMENT_START", 
		"BLOCK_COMMENT_END", "BLOCK_COMMENT", "POUND_COMMENT", "COMMA", "DOT", 
		"OR", "SYMBOL", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\6\2\'\n\2\r\2\16\2(\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\65\n\2\3\3\6\38\n\3\r\3\16\39\3\3\6\3=\n\3\r\3\16\3>\3\3\3\3\6\3"+
		"C\n\3\r\3\16\3D\3\3\3\3\5\3I\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc"+
		"\13\b\3\b\3\b\5\bg\n\b\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\n\6\nr\n\n\r"+
		"\n\16\ns\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0082"+
		"\n\f\f\f\16\f\u0085\13\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\r\3\r\3\r\5\r"+
		"\u0090\n\r\3\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\6\21\u00a2\n\21\r\21\16\21\u00a3\3\22\6\22\u00a7"+
		"\n\22\r\22\16\22\u00a8\3\22\3\22\3\u0083\2\23\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\13\7\2"+
		"\60\60\62;C\\aac|\3\2\62;\4\2$$^^\4\2))^^\n\2$$))^^ddhhppttvv\3\2##\4"+
		"\2\f\f\17\17\t\2##&(*-//\61\61<B``\5\2\13\f\16\17\"\"\u00c0\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3\64\3"+
		"\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17f\3\2"+
		"\2\2\21h\3\2\2\2\23l\3\2\2\2\25u\3\2\2\2\27\u0088\3\2\2\2\31\u008f\3\2"+
		"\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u00a1\3\2\2\2"+
		"#\u00a6\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\65"+
		"\3\2\2\2*+\7b\2\2+,\5\3\2\2,-\7b\2\2-\65\3\2\2\2./\7b\2\2/\60\5\3\2\2"+
		"\60\61\7b\2\2\61\62\7\60\2\2\62\63\5\3\2\2\63\65\3\2\2\2\64&\3\2\2\2\64"+
		"*\3\2\2\2\64.\3\2\2\2\65\4\3\2\2\2\668\t\3\2\2\67\66\3\2\2\289\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:I\3\2\2\2;=\t\3\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?@\3\2\2\2@B\7\60\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2EI\3\2\2\2FG\7/\2\2GI\5\5\3\2H\67\3\2\2\2H<\3\2\2\2HF\3"+
		"\2\2\2I\6\3\2\2\2JK\7$\2\2K\b\3\2\2\2LM\7)\2\2M\n\3\2\2\2NO\7}\2\2O\f"+
		"\3\2\2\2PQ\7\177\2\2Q\16\3\2\2\2RW\5\7\4\2SV\n\4\2\2TV\5\21\t\2US\3\2"+
		"\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5\7"+
		"\4\2[g\3\2\2\2\\a\5\t\5\2]`\n\5\2\2^`\5\21\t\2_]\3\2\2\2_^\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\5\t\5\2eg\3\2\2\2fR\3"+
		"\2\2\2f\\\3\2\2\2g\20\3\2\2\2hj\7^\2\2ik\t\6\2\2ji\3\2\2\2jk\3\2\2\2k"+
		"\22\3\2\2\2lm\7\61\2\2mn\7,\2\2no\7#\2\2oq\3\2\2\2pr\t\3\2\2qp\3\2\2\2"+
		"rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\24\3\2\2\2uv\7,\2\2vw\7\61\2\2w\26\3\2"+
		"\2\2xy\7\61\2\2yz\7,\2\2z{\7,\2\2{\u0089\7\61\2\2|}\7\61\2\2}~\7,\2\2"+
		"~\177\3\2\2\2\177\u0083\n\7\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7,\2\2\u0087\u0089\7\61\2\2\u0088"+
		"x\3\2\2\2\u0088|\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\f\2\2\u008b"+
		"\30\3\2\2\2\u008c\u0090\7%\2\2\u008d\u008e\7/\2\2\u008e\u0090\7/\2\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\3\2\2\2\u0091\u0093\n\b"+
		"\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\r"+
		"\2\2\u0098\32\3\2\2\2\u0099\u009a\7.\2\2\u009a\34\3\2\2\2\u009b\u009c"+
		"\7\60\2\2\u009c\36\3\2\2\2\u009d\u009e\7~\2\2\u009e\u009f\7~\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a2\t\t\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\"\3\2\2\2\u00a5\u00a7\t"+
		"\n\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\22\2\2\u00ab$\3\2\2\2"+
		"\26\2(\649>DHUW_afjs\u0083\u0088\u008f\u0094\u00a3\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}