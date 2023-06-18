// Generated from C:/Users/q2437/Desktop/idea项目/antlr-molang\Molang.g4 by ANTLR 4.12.0
 package io.github.tt432.molang; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MolangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMPARISON_OPERATOR=2, EQUALS_OPERATOR=3, AND_OPERATOR=4, OR_OPERATOR=5, 
		BCO=6, TCO0=7, S_OPERATOR=8, RETURN=9, CONSTANT=10, SCIENTIFIC_NUMBER=11, 
		STRING=12, LPAREN=13, RPAREN=14, DQUOT=15, QUOT=16, E1=17, E2=18, ID=19, 
		WS=20, ADD=21, SUB=22, MUL=23, DIV=24, COMMA=25, SIEM=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUMBER", "COMPARISON_OPERATOR", "EQUALS_OPERATOR", "AND_OPERATOR", 
			"OR_OPERATOR", "BCO", "TCO0", "S_OPERATOR", "RETURN", "CONSTANT", "SCIENTIFIC_NUMBER", 
			"STRING", "LPAREN", "RPAREN", "DQUOT", "QUOT", "E1", "E2", "ID", "WS", 
			"ADD", "SUB", "MUL", "DIV", "COMMA", "SIEM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, "'&&'", "'||'", "'?'", "':'", "'!'", "'return'", 
			null, null, null, "'('", "')'", "'\"'", "'''", null, "'e'", null, null, 
			"'+'", "'-'", "'*'", "'/'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COMPARISON_OPERATOR", "EQUALS_OPERATOR", "AND_OPERATOR", 
			"OR_OPERATOR", "BCO", "TCO0", "S_OPERATOR", "RETURN", "CONSTANT", "SCIENTIFIC_NUMBER", 
			"STRING", "LPAREN", "RPAREN", "DQUOT", "QUOT", "E1", "E2", "ID", "WS", 
			"ADD", "SUB", "MUL", "DIV", "COMMA", "SIEM"
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


	public MolangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Molang.g4"; }

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
		"\u0004\u0000\u001a\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001"+
		"\f\u0001<\u0001\u0001\u0001\u0001\u0004\u0001A\b\u0001\u000b\u0001\f\u0001"+
		"B\u0003\u0001E\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003S\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bm\b\u000b\u0001\u000b\u0001\u000b\u0003\u000bq\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bu\b\u000b\u0001\f\u0001\f\u0005\f"+
		"y\b\f\n\f\f\f|\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0082\b\f\n"+
		"\f\f\f\u0085\t\f\u0001\f\u0001\f\u0003\f\u0089\b\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0098"+
		"\b\u0013\u000b\u0013\f\u0013\u0099\u0001\u0014\u0004\u0014\u009d\b\u0014"+
		"\u000b\u0014\f\u0014\u009e\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0002z\u0083\u0000\u001b"+
		"\u0001\u0001\u0003\u0000\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r"+
		"\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f\u001b\r"+
		"\u001d\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013)\u0014+\u0015-\u0016"+
		"/\u00171\u00183\u00195\u001a\u0001\u0000\u0002\u0004\u0000--AZ__az\u0003"+
		"\u0000\t\n\r\r  \u00bc\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003:\u0001"+
		"\u0000\u0000\u0000\u0005L\u0001\u0000\u0000\u0000\u0007R\u0001\u0000\u0000"+
		"\u0000\tT\u0001\u0000\u0000\u0000\u000bW\u0001\u0000\u0000\u0000\rZ\u0001"+
		"\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011^\u0001\u0000"+
		"\u0000\u0000\u0013`\u0001\u0000\u0000\u0000\u0015g\u0001\u0000\u0000\u0000"+
		"\u0017i\u0001\u0000\u0000\u0000\u0019\u0088\u0001\u0000\u0000\u0000\u001b"+
		"\u008a\u0001\u0000\u0000\u0000\u001d\u008c\u0001\u0000\u0000\u0000\u001f"+
		"\u008e\u0001\u0000\u0000\u0000!\u0090\u0001\u0000\u0000\u0000#\u0092\u0001"+
		"\u0000\u0000\u0000%\u0094\u0001\u0000\u0000\u0000\'\u0097\u0001\u0000"+
		"\u0000\u0000)\u009c\u0001\u0000\u0000\u0000+\u00a2\u0001\u0000\u0000\u0000"+
		"-\u00a4\u0001\u0000\u0000\u0000/\u00a6\u0001\u0000\u0000\u00001\u00a8"+
		"\u0001\u0000\u0000\u00003\u00aa\u0001\u0000\u0000\u00005\u00ac\u0001\u0000"+
		"\u0000\u000078\u0005.\u0000\u00008\u0002\u0001\u0000\u0000\u00009;\u0002"+
		"09\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=D\u0001\u0000\u0000\u0000>@\u0005"+
		".\u0000\u0000?A\u000209\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001"+
		"\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"E\u0004\u0001\u0000\u0000\u0000FM\u0005<\u0000\u0000GH\u0005<\u0000\u0000"+
		"HM\u0005=\u0000\u0000IJ\u0005>\u0000\u0000JM\u0005=\u0000\u0000KM\u0005"+
		">\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LI\u0001"+
		"\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0006\u0001\u0000\u0000"+
		"\u0000NO\u0005=\u0000\u0000OS\u0005=\u0000\u0000PQ\u0005!\u0000\u0000"+
		"QS\u0005=\u0000\u0000RN\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"S\b\u0001\u0000\u0000\u0000TU\u0005&\u0000\u0000UV\u0005&\u0000\u0000"+
		"V\n\u0001\u0000\u0000\u0000WX\u0005|\u0000\u0000XY\u0005|\u0000\u0000"+
		"Y\f\u0001\u0000\u0000\u0000Z[\u0005?\u0000\u0000[\u000e\u0001\u0000\u0000"+
		"\u0000\\]\u0005:\u0000\u0000]\u0010\u0001\u0000\u0000\u0000^_\u0005!\u0000"+
		"\u0000_\u0012\u0001\u0000\u0000\u0000`a\u0005r\u0000\u0000ab\u0005e\u0000"+
		"\u0000bc\u0005t\u0000\u0000cd\u0005u\u0000\u0000de\u0005r\u0000\u0000"+
		"ef\u0005n\u0000\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005E\u0000\u0000"+
		"h\u0016\u0001\u0000\u0000\u0000it\u0003\u0003\u0001\u0000jm\u0003#\u0011"+
		"\u0000km\u0003%\u0012\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nq\u0003+\u0015\u0000oq\u0003-\u0016\u0000"+
		"pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0003\u0003\u0001\u0000su\u0001\u0000"+
		"\u0000\u0000tl\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0018"+
		"\u0001\u0000\u0000\u0000vz\u0003\u001f\u000f\u0000wy\t\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}~\u0003\u001f\u000f\u0000~\u0089\u0001\u0000\u0000\u0000"+
		"\u007f\u0083\u0003!\u0010\u0000\u0080\u0082\t\u0000\u0000\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0003!\u0010\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088v\u0001"+
		"\u0000\u0000\u0000\u0088\u007f\u0001\u0000\u0000\u0000\u0089\u001a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005(\u0000\u0000\u008b\u001c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005)\u0000\u0000\u008d\u001e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\"\u0000\u0000\u008f \u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005\'\u0000\u0000\u0091\"\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005E\u0000\u0000\u0093$\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"e\u0000\u0000\u0095&\u0001\u0000\u0000\u0000\u0096\u0098\u0007\u0000\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a(\u0001\u0000\u0000\u0000\u009b\u009d\u0007\u0001\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\u0014\u0000\u0000"+
		"\u00a1*\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005+\u0000\u0000\u00a3,"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005-\u0000\u0000\u00a5.\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005*\u0000\u0000\u00a70\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005/\u0000\u0000\u00a92\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005,\u0000\u0000\u00ab4\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005;"+
		"\u0000\u0000\u00ad6\u0001\u0000\u0000\u0000\u000e\u0000<BDLRlptz\u0083"+
		"\u0088\u0099\u009e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}