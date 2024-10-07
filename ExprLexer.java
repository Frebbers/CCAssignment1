// Generated from Expr.g4 by ANTLR 4.13.2
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
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHITESPACE=3, TYPES=4, IDENTIFIER=5, NUMBER=6, AND=7, 
		OR=8, NOT=9, EQUALS=10, COLON=11, COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WHITESPACE", "TYPES", "IDENTIFIER", "NUMBER", "AND", 
			"OR", "NOT", "EQUALS", "COLON", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'updates'", "'siminputs'", null, null, null, null, "'*'", "'+'", 
			"'/'", "'='", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHITESPACE", "TYPES", "IDENTIFIER", "NUMBER", "AND", 
			"OR", "NOT", "EQUALS", "COLON", "COMMENT"
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
		"\u0004\u0000\f\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002.\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003_\b\u0003\u0001"+
		"\u0004\u0004\u0004b\b\u0004\u000b\u0004\f\u0004c\u0001\u0004\u0005\u0004"+
		"g\b\u0004\n\u0004\f\u0004j\t\u0004\u0001\u0005\u0004\u0005m\b\u0005\u000b"+
		"\u0005\f\u0005n\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n\u000b\f\u000b\u0082\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0088\b\u000b"+
		"\n\u000b\f\u000b\u008b\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008f"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u0089\u0000\f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0005\u0003\u0000\t\n\r\r "+
		" \u0003\u0000AZ__az\u0005\u000009AZ__az\u2019\u2019\u0001\u000009\u0001"+
		"\u0000\n\n\u009d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000"+
		"\u0005,\u0001\u0000\u0000\u0000\u0007^\u0001\u0000\u0000\u0000\ta\u0001"+
		"\u0000\u0000\u0000\u000bl\u0001\u0000\u0000\u0000\rp\u0001\u0000\u0000"+
		"\u0000\u000fr\u0001\u0000\u0000\u0000\u0011t\u0001\u0000\u0000\u0000\u0013"+
		"v\u0001\u0000\u0000\u0000\u0015x\u0001\u0000\u0000\u0000\u0017\u008e\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005u\u0000\u0000\u001a\u001b\u0005p\u0000"+
		"\u0000\u001b\u001c\u0005d\u0000\u0000\u001c\u001d\u0005a\u0000\u0000\u001d"+
		"\u001e\u0005t\u0000\u0000\u001e\u001f\u0005e\u0000\u0000\u001f \u0005"+
		"s\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005s\u0000\u0000\"#"+
		"\u0005i\u0000\u0000#$\u0005m\u0000\u0000$%\u0005i\u0000\u0000%&\u0005"+
		"n\u0000\u0000&\'\u0005p\u0000\u0000\'(\u0005u\u0000\u0000()\u0005t\u0000"+
		"\u0000)*\u0005s\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+-\u0007\u0000"+
		"\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0006\u0002\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005h\u0000"+
		"\u000034\u0005a\u0000\u000045\u0005r\u0000\u000056\u0005d\u0000\u0000"+
		"67\u0005w\u0000\u000078\u0005a\u0000\u000089\u0005r\u0000\u00009_\u0005"+
		"e\u0000\u0000:;\u0005i\u0000\u0000;<\u0005n\u0000\u0000<=\u0005p\u0000"+
		"\u0000=>\u0005u\u0000\u0000>?\u0005t\u0000\u0000?_\u0005s\u0000\u0000"+
		"@A\u0005o\u0000\u0000AB\u0005u\u0000\u0000BC\u0005t\u0000\u0000CD\u0005"+
		"p\u0000\u0000DE\u0005u\u0000\u0000EF\u0005t\u0000\u0000F_\u0005s\u0000"+
		"\u0000GH\u0005l\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005t\u0000\u0000"+
		"JK\u0005c\u0000\u0000KL\u0005h\u0000\u0000LM\u0005e\u0000\u0000M_\u0005"+
		"s\u0000\u0000NO\u0005u\u0000\u0000OP\u0005p\u0000\u0000PQ\u0005d\u0000"+
		"\u0000QR\u0005a\u0000\u0000RS\u0005t\u0000\u0000ST\u0005e\u0000\u0000"+
		"T_\u0005s\u0000\u0000UV\u0005s\u0000\u0000VW\u0005i\u0000\u0000WX\u0005"+
		"m\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005p\u0000"+
		"\u0000[\\\u0005u\u0000\u0000\\]\u0005t\u0000\u0000]_\u0005s\u0000\u0000"+
		"^2\u0001\u0000\u0000\u0000^:\u0001\u0000\u0000\u0000^@\u0001\u0000\u0000"+
		"\u0000^G\u0001\u0000\u0000\u0000^N\u0001\u0000\u0000\u0000^U\u0001\u0000"+
		"\u0000\u0000_\b\u0001\u0000\u0000\u0000`b\u0007\u0001\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000dh\u0001\u0000\u0000\u0000eg\u0007\u0002\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\n\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000km\u0007\u0003\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000o\f\u0001\u0000\u0000\u0000pq\u0005*\u0000\u0000q\u000e\u0001\u0000"+
		"\u0000\u0000rs\u0005+\u0000\u0000s\u0010\u0001\u0000\u0000\u0000tu\u0005"+
		"/\u0000\u0000u\u0012\u0001\u0000\u0000\u0000vw\u0005=\u0000\u0000w\u0014"+
		"\u0001\u0000\u0000\u0000xy\u0005:\u0000\u0000y\u0016\u0001\u0000\u0000"+
		"\u0000z{\u0005/\u0000\u0000{|\u0005/\u0000\u0000|\u0080\u0001\u0000\u0000"+
		"\u0000}\u007f\b\u0004\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u008f\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005/\u0000\u0000\u0084\u0085\u0005*\u0000"+
		"\u0000\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0088\t\u0000\u0000\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005*\u0000\u0000\u008d\u008f\u0005/\u0000\u0000\u008ez"+
		"\u0001\u0000\u0000\u0000\u008e\u0083\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u000b\u0000\u0000\u0091\u0018"+
		"\u0001\u0000\u0000\u0000\t\u0000.^chn\u0080\u0089\u008e\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}