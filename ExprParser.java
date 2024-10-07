// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHITESPACE=3, TYPES=4, IDENTIFIER=5, NUMBER=6, AND=7, 
		OR=8, NOT=9, EQUALS=10, COLON=11, COMMENT=12;
	public static final int
		RULE_start = 0, RULE_updates = 1, RULE_siminputs = 2, RULE_assignment = 3, 
		RULE_siminputExp = 4, RULE_updatesExp = 5, RULE_logicalOrExp = 6, RULE_logicalAndExp = 7, 
		RULE_unaryExp = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "updates", "siminputs", "assignment", "siminputExp", "updatesExp", 
			"logicalOrExp", "logicalAndExp", "unaryExp"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
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
		public List<TerminalNode> COMMENT() { return getTokens(ExprParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ExprParser.COMMENT, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4118L) != 0)) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPES:
					{
					setState(18);
					assignment();
					}
					break;
				case T__0:
					{
					setState(19);
					updates();
					}
					break;
				case T__1:
					{
					setState(20);
					siminputs();
					}
					break;
				case COMMENT:
					{
					setState(21);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
	public static class UpdatesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUpdates(this);
		}
	}

	public final UpdatesContext updates() throws RecognitionException {
		UpdatesContext _localctx = new UpdatesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_updates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(COLON);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==NOT) {
				{
				{
				setState(31);
				updatesExp();
				}
				}
				setState(36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SiminputsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSiminputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSiminputs(this);
		}
	}

	public final SiminputsContext siminputs() throws RecognitionException {
		SiminputsContext _localctx = new SiminputsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_siminputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__1);
			setState(38);
			match(COLON);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(39);
				siminputExp();
				}
				}
				setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(ExprParser.TYPES, 0); }
		public TerminalNode COLON() { return getToken(ExprParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(TYPES);
			setState(46);
			match(COLON);
			setState(47);
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
	public static class SiminputExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ExprParser.NUMBER, 0); }
		public SiminputExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siminputExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSiminputExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSiminputExp(this);
		}
	}

	public final SiminputExpContext siminputExp() throws RecognitionException {
		SiminputExpContext _localctx = new SiminputExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_siminputExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IDENTIFIER);
			setState(50);
			match(EQUALS);
			setState(51);
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
		public LogicalOrExpContext logicalOrExp() {
			return getRuleContext(LogicalOrExpContext.class,0);
		}
		public UpdatesExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatesExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUpdatesExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUpdatesExp(this);
		}
	}

	public final UpdatesExpContext updatesExp() throws RecognitionException {
		UpdatesExpContext _localctx = new UpdatesExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_updatesExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			logicalOrExp();
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
	public static class LogicalOrExpContext extends ParserRuleContext {
		public List<LogicalAndExpContext> logicalAndExp() {
			return getRuleContexts(LogicalAndExpContext.class);
		}
		public LogicalAndExpContext logicalAndExp(int i) {
			return getRuleContext(LogicalAndExpContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ExprParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprParser.OR, i);
		}
		public LogicalOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLogicalOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLogicalOrExp(this);
		}
	}

	public final LogicalOrExpContext logicalOrExp() throws RecognitionException {
		LogicalOrExpContext _localctx = new LogicalOrExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logicalOrExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			logicalAndExp();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(56);
				match(OR);
				setState(57);
				logicalAndExp();
				}
				}
				setState(62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpContext extends ParserRuleContext {
		public List<UnaryExpContext> unaryExp() {
			return getRuleContexts(UnaryExpContext.class);
		}
		public UnaryExpContext unaryExp(int i) {
			return getRuleContext(UnaryExpContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ExprParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ExprParser.AND, i);
		}
		public LogicalAndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLogicalAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLogicalAndExp(this);
		}
	}

	public final LogicalAndExpContext logicalAndExp() throws RecognitionException {
		LogicalAndExpContext _localctx = new LogicalAndExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalAndExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			unaryExp();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(64);
				match(AND);
				setState(65);
				unaryExp();
				}
				}
				setState(70);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ExprParser.NUMBER, 0); }
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUnaryExp(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExp);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(NOT);
				setState(72);
				unaryExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(IDENTIFIER);
				setState(75);
				match(EQUALS);
				setState(76);
				match(NUMBER);
				}
				break;
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
		"\u0004\u0001\fP\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002"+
		"\f\u0002,\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006;\b\u0006\n\u0006\f\u0006>\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007C\b\u0007\n\u0007"+
		"\f\u0007F\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bN\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0000P\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000"+
		"\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000"+
		"\b1\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000\f7\u0001\u0000"+
		"\u0000\u0000\u000e?\u0001\u0000\u0000\u0000\u0010M\u0001\u0000\u0000\u0000"+
		"\u0012\u0017\u0003\u0006\u0003\u0000\u0013\u0017\u0003\u0002\u0001\u0000"+
		"\u0014\u0017\u0003\u0004\u0002\u0000\u0015\u0017\u0005\f\u0000\u0000\u0016"+
		"\u0012\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a"+
		"\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c"+
		"\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e"+
		"\"\u0005\u000b\u0000\u0000\u001f!\u0003\n\u0005\u0000 \u001f\u0001\u0000"+
		"\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000%&\u0005\u0002\u0000\u0000&*\u0005\u000b\u0000\u0000\')\u0003\b"+
		"\u0004\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0005\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0005\u000b"+
		"\u0000\u0000/0\u0005\u0005\u0000\u00000\u0007\u0001\u0000\u0000\u0000"+
		"12\u0005\u0005\u0000\u000023\u0005\n\u0000\u000034\u0005\u0006\u0000\u0000"+
		"4\t\u0001\u0000\u0000\u000056\u0003\f\u0006\u00006\u000b\u0001\u0000\u0000"+
		"\u00007<\u0003\u000e\u0007\u000089\u0005\b\u0000\u00009;\u0003\u000e\u0007"+
		"\u0000:8\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=\r\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?D\u0003\u0010\b\u0000@A\u0005\u0007\u0000\u0000AC\u0003"+
		"\u0010\b\u0000B@\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u000f\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GH\u0005\t\u0000\u0000HN\u0003\u0010\b"+
		"\u0000IN\u0005\u0005\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005\n\u0000"+
		"\u0000LN\u0005\u0006\u0000\u0000MG\u0001\u0000\u0000\u0000MI\u0001\u0000"+
		"\u0000\u0000MJ\u0001\u0000\u0000\u0000N\u0011\u0001\u0000\u0000\u0000"+
		"\u0007\u0016\u0018\"*<DM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}