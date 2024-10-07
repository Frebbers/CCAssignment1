// Generated from /Users/madshartwich/Desktop/CCAssignment1/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IDENTIFIER=10, NUMBER=11, PLUS=12, STAR=13, SLASH=14, EQUAL=15, COMMENT=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"IDENTIFIER", "NUMBER", "PLUS", "STAR", "SLASH", "EQUAL", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'hardware:'", "'inputs:'", "'outputs:'", "'latches:'", 
			"'updates:'", "'siminputs:'", "'def:'", null, null, "'+'", "'*'", "'/'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "IDENTIFIER", 
			"NUMBER", "PLUS", "STAR", "SLASH", "EQUAL", "COMMENT", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\u0011\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0004\tf\b\t\u000b\t\f\tg\u0001\n\u0004\nk"+
		"\b\n\u000b\n\f\nl\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f{\b\u000f\n\u000f\f\u000f~\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0004\u0010\u0083\b\u0010\u000b\u0010\f\u0010\u0084\u0001"+
		"\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001"+
		"\u0000\u0004\u0002\u0000AZaz\u0001\u000001\u0002\u0000\n\n\r\r\u0003\u0000"+
		"\t\n\r\r  \u008b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003"+
		"%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u00071\u0001"+
		"\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000bB\u0001\u0000\u0000"+
		"\u0000\rK\u0001\u0000\u0000\u0000\u000fT\u0001\u0000\u0000\u0000\u0011"+
		"_\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000\u0015j\u0001"+
		"\u0000\u0000\u0000\u0017n\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000"+
		"\u0000\u001br\u0001\u0000\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001f"+
		"v\u0001\u0000\u0000\u0000!\u0082\u0001\u0000\u0000\u0000#$\u0005(\u0000"+
		"\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005)\u0000\u0000&\u0004\u0001"+
		"\u0000\u0000\u0000\'(\u0005h\u0000\u0000()\u0005a\u0000\u0000)*\u0005"+
		"r\u0000\u0000*+\u0005d\u0000\u0000+,\u0005w\u0000\u0000,-\u0005a\u0000"+
		"\u0000-.\u0005r\u0000\u0000./\u0005e\u0000\u0000/0\u0005:\u0000\u0000"+
		"0\u0006\u0001\u0000\u0000\u000012\u0005i\u0000\u000023\u0005n\u0000\u0000"+
		"34\u0005p\u0000\u000045\u0005u\u0000\u000056\u0005t\u0000\u000067\u0005"+
		"s\u0000\u000078\u0005:\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005"+
		"o\u0000\u0000:;\u0005u\u0000\u0000;<\u0005t\u0000\u0000<=\u0005p\u0000"+
		"\u0000=>\u0005u\u0000\u0000>?\u0005t\u0000\u0000?@\u0005s\u0000\u0000"+
		"@A\u0005:\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005l\u0000\u0000"+
		"CD\u0005a\u0000\u0000DE\u0005t\u0000\u0000EF\u0005c\u0000\u0000FG\u0005"+
		"h\u0000\u0000GH\u0005e\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005:\u0000"+
		"\u0000J\f\u0001\u0000\u0000\u0000KL\u0005u\u0000\u0000LM\u0005p\u0000"+
		"\u0000MN\u0005d\u0000\u0000NO\u0005a\u0000\u0000OP\u0005t\u0000\u0000"+
		"PQ\u0005e\u0000\u0000QR\u0005s\u0000\u0000RS\u0005:\u0000\u0000S\u000e"+
		"\u0001\u0000\u0000\u0000TU\u0005s\u0000\u0000UV\u0005i\u0000\u0000VW\u0005"+
		"m\u0000\u0000WX\u0005i\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005p\u0000"+
		"\u0000Z[\u0005u\u0000\u0000[\\\u0005t\u0000\u0000\\]\u0005s\u0000\u0000"+
		"]^\u0005:\u0000\u0000^\u0010\u0001\u0000\u0000\u0000_`\u0005d\u0000\u0000"+
		"`a\u0005e\u0000\u0000ab\u0005f\u0000\u0000bc\u0005:\u0000\u0000c\u0012"+
		"\u0001\u0000\u0000\u0000df\u0007\u0000\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000h\u0014\u0001\u0000\u0000\u0000ik\u0007\u0001\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u0016\u0001\u0000\u0000\u0000no\u0005"+
		"+\u0000\u0000o\u0018\u0001\u0000\u0000\u0000pq\u0005*\u0000\u0000q\u001a"+
		"\u0001\u0000\u0000\u0000rs\u0005/\u0000\u0000s\u001c\u0001\u0000\u0000"+
		"\u0000tu\u0005=\u0000\u0000u\u001e\u0001\u0000\u0000\u0000vw\u0005/\u0000"+
		"\u0000wx\u0005/\u0000\u0000x|\u0001\u0000\u0000\u0000y{\b\u0002\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u000f\u0000\u0000\u0080 "+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0003\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0006\u0010\u0000\u0000\u0087\"\u0001"+
		"\u0000\u0000\u0000\u0005\u0000gl|\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}