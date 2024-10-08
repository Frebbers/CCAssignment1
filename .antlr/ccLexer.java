// Generated from /Users/madshartwich/Desktop/CCAssignment1/cc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IDENTIFIER=3, NUMBER=4, AND=5, OR=6, NOT=7, EQUALS=8, 
		COLON=9, TYPES=10, COMMENT=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IDENTIFIER", "NUMBER", "AND", "OR", "NOT", "EQUALS", 
			"COLON", "TYPES", "COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'updates'", "'siminputs'", null, null, "'*'", "'+'", "'/'", "'='", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IDENTIFIER", "NUMBER", "AND", "OR", "NOT", "EQUALS", 
			"COLON", "TYPES", "COMMENT", "WHITESPACE"
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


	public ccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cc.g4"; }

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
		"\u0004\u0000\f\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002.\u0001"+
		"\u0002\u0005\u00022\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0003\u0004"+
		"\u00038\b\u0003\u000b\u0003\f\u00039\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tr\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nx\b\n\n\n\f\n{\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0081\b\n\n\n\f\n\u0084\t\n\u0001\n"+
		"\u0001\n\u0003\n\u0088\b\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u008d"+
		"\b\u000b\u000b\u000b\f\u000b\u008e\u0001\u000b\u0001\u000b\u0001\u0082"+
		"\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000"+
		"\u0005\u0003\u0000AZ__az\u0005\u000009AZ__az\u2019\u2019\u0001\u00000"+
		"9\u0001\u0000\n\n\u0003\u0000\t\n\r\r  \u009d\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000"+
		"\u0003!\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00077"+
		"\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b=\u0001\u0000"+
		"\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000"+
		"\u0011C\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000\u0000\u0015\u0087"+
		"\u0001\u0000\u0000\u0000\u0017\u008c\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005u\u0000\u0000\u001a\u001b\u0005p\u0000\u0000\u001b\u001c\u0005d"+
		"\u0000\u0000\u001c\u001d\u0005a\u0000\u0000\u001d\u001e\u0005t\u0000\u0000"+
		"\u001e\u001f\u0005e\u0000\u0000\u001f \u0005s\u0000\u0000 \u0002\u0001"+
		"\u0000\u0000\u0000!\"\u0005s\u0000\u0000\"#\u0005i\u0000\u0000#$\u0005"+
		"m\u0000\u0000$%\u0005i\u0000\u0000%&\u0005n\u0000\u0000&\'\u0005p\u0000"+
		"\u0000\'(\u0005u\u0000\u0000()\u0005t\u0000\u0000)*\u0005s\u0000\u0000"+
		"*\u0004\u0001\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000,+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/3\u0001\u0000\u0000\u000002\u0007\u0001\u0000\u0000"+
		"10\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0006\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000068\u0007\u0002\u0000\u000076\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:\b\u0001\u0000\u0000\u0000;<\u0005*\u0000\u0000<\n\u0001\u0000"+
		"\u0000\u0000=>\u0005+\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005/"+
		"\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005=\u0000\u0000B\u0010"+
		"\u0001\u0000\u0000\u0000CD\u0005:\u0000\u0000D\u0012\u0001\u0000\u0000"+
		"\u0000EF\u0005h\u0000\u0000FG\u0005a\u0000\u0000GH\u0005r\u0000\u0000"+
		"HI\u0005d\u0000\u0000IJ\u0005w\u0000\u0000JK\u0005a\u0000\u0000KL\u0005"+
		"r\u0000\u0000Lr\u0005e\u0000\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000"+
		"\u0000OP\u0005p\u0000\u0000PQ\u0005u\u0000\u0000QR\u0005t\u0000\u0000"+
		"Rr\u0005s\u0000\u0000ST\u0005o\u0000\u0000TU\u0005u\u0000\u0000UV\u0005"+
		"t\u0000\u0000VW\u0005p\u0000\u0000WX\u0005u\u0000\u0000XY\u0005t\u0000"+
		"\u0000Yr\u0005s\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005a\u0000\u0000"+
		"\\]\u0005t\u0000\u0000]^\u0005c\u0000\u0000^_\u0005h\u0000\u0000_`\u0005"+
		"e\u0000\u0000`r\u0005s\u0000\u0000ab\u0005u\u0000\u0000bc\u0005p\u0000"+
		"\u0000cd\u0005d\u0000\u0000de\u0005a\u0000\u0000ef\u0005t\u0000\u0000"+
		"fg\u0005e\u0000\u0000gr\u0005s\u0000\u0000hi\u0005s\u0000\u0000ij\u0005"+
		"i\u0000\u0000jk\u0005m\u0000\u0000kl\u0005i\u0000\u0000lm\u0005n\u0000"+
		"\u0000mn\u0005p\u0000\u0000no\u0005u\u0000\u0000op\u0005t\u0000\u0000"+
		"pr\u0005s\u0000\u0000qE\u0001\u0000\u0000\u0000qM\u0001\u0000\u0000\u0000"+
		"qS\u0001\u0000\u0000\u0000qZ\u0001\u0000\u0000\u0000qa\u0001\u0000\u0000"+
		"\u0000qh\u0001\u0000\u0000\u0000r\u0014\u0001\u0000\u0000\u0000st\u0005"+
		"/\u0000\u0000tu\u0005/\u0000\u0000uy\u0001\u0000\u0000\u0000vx\b\u0003"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0088\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|}\u0005/\u0000\u0000}~\u0005*\u0000\u0000"+
		"~\u0082\u0001\u0000\u0000\u0000\u007f\u0081\t\u0000\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005*\u0000\u0000\u0086\u0088\u0005/\u0000\u0000\u0087s\u0001"+
		"\u0000\u0000\u0000\u0087|\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0006\n\u0000\u0000\u008a\u0016\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0007\u0004\u0000\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0006\u000b\u0000\u0000\u0091\u0018\u0001\u0000\u0000"+
		"\u0000\t\u0000.39qy\u0082\u0087\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}