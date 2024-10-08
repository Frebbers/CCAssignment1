// Generated from /Users/madshartwich/Desktop/CCAssignment1/cc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IDENTIFIER=3, NUMBER=4, AND=5, OR=6, NOT=7, EQUALS=8, 
		COLON=9, TYPES=10, COMMENT=11, WHITESPACE=12;
	public static final int
		RULE_start = 0, RULE_assignment = 1, RULE_updates = 2, RULE_siminputs = 3, 
		RULE_siminputExp = 4, RULE_updatesExp = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "assignment", "updates", "siminputs", "siminputExp", "updatesExp"
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

	@Override
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ccParser.EOF, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<UpdatesContext> updates() {
			return getRuleContexts(UpdatesContext.class);
		}
		public UpdatesContext updates(int i) {
			return getRuleContext(UpdatesContext.class,i);
		}
		public List<SiminputsContext> siminputs() {
			return getRuleContexts(SiminputsContext.class);
		}
		public SiminputsContext siminputs(int i) {
			return getRuleContext(SiminputsContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ccParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ccParser.COMMENT, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3078L) != 0)) {
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPES:
					{
					setState(12);
					assignment();
					}
					break;
				case T__0:
					{
					setState(13);
					updates();
					}
					break;
				case T__1:
					{
					setState(14);
					siminputs();
					}
					break;
				case COMMENT:
					{
					setState(15);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(ccParser.TYPES, 0); }
		public TerminalNode COLON() { return getToken(ccParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(TYPES);
			setState(24);
			match(COLON);
			setState(25);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ccParser.COLON, 0); }
		public List<UpdatesExpContext> updatesExp() {
			return getRuleContexts(UpdatesExpContext.class);
		}
		public UpdatesExpContext updatesExp(int i) {
			return getRuleContext(UpdatesExpContext.class,i);
		}
		public UpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updates; }
	}

	public final UpdatesContext updates() throws RecognitionException {
		UpdatesContext _localctx = new UpdatesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_updates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			match(COLON);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				updatesExp(0);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==NOT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SiminputsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ccParser.COLON, 0); }
		public List<SiminputExpContext> siminputExp() {
			return getRuleContexts(SiminputExpContext.class);
		}
		public SiminputExpContext siminputExp(int i) {
			return getRuleContext(SiminputExpContext.class,i);
		}
		public SiminputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siminputs; }
	}

	public final SiminputsContext siminputs() throws RecognitionException {
		SiminputsContext _localctx = new SiminputsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_siminputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__1);
			setState(35);
			match(COLON);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				siminputExp();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SiminputExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ccParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ccParser.NUMBER, 0); }
		public SiminputExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siminputExp; }
	}

	public final SiminputExpContext siminputExp() throws RecognitionException {
		SiminputExpContext _localctx = new SiminputExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_siminputExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IDENTIFIER);
			setState(42);
			match(EQUALS);
			setState(43);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatesExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ccParser.EQUALS, 0); }
		public List<UpdatesExpContext> updatesExp() {
			return getRuleContexts(UpdatesExpContext.class);
		}
		public UpdatesExpContext updatesExp(int i) {
			return getRuleContext(UpdatesExpContext.class,i);
		}
		public TerminalNode NOT() { return getToken(ccParser.NOT, 0); }
		public TerminalNode AND() { return getToken(ccParser.AND, 0); }
		public TerminalNode OR() { return getToken(ccParser.OR, 0); }
		public UpdatesExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatesExp; }
	}

	public final UpdatesExpContext updatesExp() throws RecognitionException {
		return updatesExp(0);
	}

	private UpdatesExpContext updatesExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UpdatesExpContext _localctx = new UpdatesExpContext(_ctx, _parentState);
		UpdatesExpContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_updatesExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(46);
				match(IDENTIFIER);
				setState(47);
				match(EQUALS);
				setState(48);
				updatesExp(5);
				}
				break;
			case 2:
				{
				setState(49);
				match(NOT);
				setState(50);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(51);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new UpdatesExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_updatesExp);
						setState(54);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(55);
						match(AND);
						setState(56);
						updatesExp(4);
						}
						break;
					case 2:
						{
						_localctx = new UpdatesExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_updatesExp);
						setState(57);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(58);
						match(OR);
						setState(59);
						updatesExp(3);
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return updatesExp_sempred((UpdatesExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean updatesExp_sempred(UpdatesExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\fB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002 \u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003&\b\u0003\u000b\u0003\f\u0003\'\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00055\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005=\b\u0005\n\u0005\f\u0005@\t\u0005\u0001\u0005\u0000"+
		"\u0001\n\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000E\u0000\u0012\u0001"+
		"\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u001b\u0001"+
		"\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b)\u0001\u0000\u0000"+
		"\u0000\n4\u0001\u0000\u0000\u0000\f\u0011\u0003\u0002\u0001\u0000\r\u0011"+
		"\u0003\u0004\u0002\u0000\u000e\u0011\u0003\u0006\u0003\u0000\u000f\u0011"+
		"\u0005\u000b\u0000\u0000\u0010\f\u0001\u0000\u0000\u0000\u0010\r\u0001"+
		"\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0014\u0001\u0000\u0000\u0000\u0012\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0015\u0001"+
		"\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		"\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\n\u0000\u0000\u0018\u0019\u0005\t\u0000\u0000\u0019\u001a\u0005\u0003"+
		"\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0001"+
		"\u0000\u0000\u001c\u001e\u0005\t\u0000\u0000\u001d\u001f\u0003\n\u0005"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0005\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#%\u0005\t\u0000\u0000$&"+
		"\u0003\b\u0004\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0007\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0003\u0000\u0000*+\u0005\b\u0000\u0000+,\u0005\u0004"+
		"\u0000\u0000,\t\u0001\u0000\u0000\u0000-.\u0006\u0005\uffff\uffff\u0000"+
		"./\u0005\u0003\u0000\u0000/0\u0005\b\u0000\u000005\u0003\n\u0005\u0005"+
		"12\u0005\u0007\u0000\u000025\u0005\u0003\u0000\u000035\u0005\u0003\u0000"+
		"\u00004-\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u00005>\u0001\u0000\u0000\u000067\n\u0003\u0000\u000078\u0005\u0005"+
		"\u0000\u00008=\u0003\n\u0005\u00049:\n\u0002\u0000\u0000:;\u0005\u0006"+
		"\u0000\u0000;=\u0003\n\u0005\u0003<6\u0001\u0000\u0000\u0000<9\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000\u0007\u0010\u0012 \'4<>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}