// Generated from TIP.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TIPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, MUL=13, DIV=14, ADD=15, SUB=16, MOD=17, GT=18, 
		GTE=19, LT=20, LTE=21, EQ=22, NE=23, NUMBER=24, KALLOC=25, KINPUT=26, 
		KWHILE=27, KIF=28, KELSE=29, KVAR=30, KRETURN=31, KNULL=32, KOUTPUT=33, 
		KERROR=34, KPOLY=35, IDENTIFIER=36, WS=37, BLOCKCOMMENT=38, COMMENT=39;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_declaration = 2, RULE_nameDeclaration = 3, 
		RULE_expr = 4, RULE_recordExpr = 5, RULE_fieldExpr = 6, RULE_statement = 7, 
		RULE_assignStmt = 8, RULE_blockStmt = 9, RULE_whileStmt = 10, RULE_ifStmt = 11, 
		RULE_outputStmt = 12, RULE_errorStmt = 13, RULE_returnStmt = 14, RULE_incStmt = 15, 
		RULE_decStmt = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "declaration", "nameDeclaration", "expr", "recordExpr", 
			"fieldExpr", "statement", "assignStmt", "blockStmt", "whileStmt", "ifStmt", 
			"outputStmt", "errorStmt", "returnStmt", "incStmt", "decStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "';'", "'.'", "'&'", "':'", 
			"'='", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", null, "'alloc'", "'input'", "'while'", 
			"'if'", "'else'", "'var'", "'return'", "'null'", "'output'", "'error'", 
			"'poly'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "MUL", "DIV", "ADD", "SUB", "MOD", "GT", "GTE", "LT", "LTE", "EQ", 
			"NE", "NUMBER", "KALLOC", "KINPUT", "KWHILE", "KIF", "KELSE", "KVAR", 
			"KRETURN", "KNULL", "KOUTPUT", "KERROR", "KPOLY", "IDENTIFIER", "WS", 
			"BLOCKCOMMENT", "COMMENT"
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
	public String getGrammarFileName() { return "TIP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TIPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				function();
				}
				}
				setState(37); 
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
	public static class FunctionContext extends ParserRuleContext {
		public List<NameDeclarationContext> nameDeclaration() {
			return getRuleContexts(NameDeclarationContext.class);
		}
		public NameDeclarationContext nameDeclaration(int i) {
			return getRuleContext(NameDeclarationContext.class,i);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public TerminalNode KPOLY() { return getToken(TIPParser.KPOLY, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			nameDeclaration();
			setState(40);
			match(T__0);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(41);
				nameDeclaration();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(42);
					match(T__1);
					setState(43);
					nameDeclaration();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(51);
			match(T__2);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KPOLY) {
				{
				setState(52);
				match(KPOLY);
				}
			}

			setState(55);
			match(T__3);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KVAR) {
				{
				{
				setState(56);
				declaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99304415506L) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(68);
			returnStmt();
			setState(69);
			match(T__4);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode KVAR() { return getToken(TIPParser.KVAR, 0); }
		public List<NameDeclarationContext> nameDeclaration() {
			return getRuleContexts(NameDeclarationContext.class);
		}
		public NameDeclarationContext nameDeclaration(int i) {
			return getRuleContext(NameDeclarationContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(KVAR);
			setState(72);
			nameDeclaration();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(73);
				match(T__1);
				setState(74);
				nameDeclaration();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__5);
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
	public static class NameDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public NameDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterNameDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitNameDeclaration(this);
		}
	}

	public final NameDeclarationContext nameDeclaration() throws RecognitionException {
		NameDeclarationContext _localctx = new NameDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nameDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecordRuleContext extends ExprContext {
		public RecordExprContext recordExpr() {
			return getRuleContext(RecordExprContext.class,0);
		}
		public RecordRuleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterRecordRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitRecordRule(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullExprContext extends ExprContext {
		public TerminalNode KNULL() { return getToken(TIPParser.KNULL, 0); }
		public NullExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitNullExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllocExprContext extends ExprContext {
		public TerminalNode KALLOC() { return getToken(TIPParser.KALLOC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AllocExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterAllocExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitAllocExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegNumberContext extends ExprContext {
		public TerminalNode SUB() { return getToken(TIPParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterNegNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitNegNumber(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputExprContext extends ExprContext {
		public TerminalNode KINPUT() { return getToken(TIPParser.KINPUT, 0); }
		public InputExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterInputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitInputExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(TIPParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TIPParser.SUB, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitAdditiveExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(TIPParser.GT, 0); }
		public TerminalNode LT() { return getToken(TIPParser.LT, 0); }
		public TerminalNode LTE() { return getToken(TIPParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(TIPParser.GTE, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitRelationalExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeRefExprContext extends ExprContext {
		public TerminalNode MUL() { return getToken(TIPParser.MUL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeRefExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterDeRefExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitDeRefExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(TIPParser.NUMBER, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitNumExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitParenExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitVarExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RefExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterRefExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitRefExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TIPParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TIPParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TIPParser.MOD, 0); }
		public MultiplicativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitMultiplicativeExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunAppExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunAppExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterFunAppExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitFunAppExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(TIPParser.EQ, 0); }
		public TerminalNode NE() { return getToken(TIPParser.NE, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitEqualityExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public AccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitAccessExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				{
				_localctx = new DeRefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				match(MUL);
				setState(86);
				expr(14);
				}
				break;
			case SUB:
				{
				_localctx = new NegNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(SUB);
				setState(88);
				expr(13);
				}
				break;
			case T__7:
				{
				_localctx = new RefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(T__7);
				setState(90);
				expr(12);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(NUMBER);
				}
				break;
			case KINPUT:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(KINPUT);
				}
				break;
			case KALLOC:
				{
				_localctx = new AllocExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(KALLOC);
				setState(95);
				expr(4);
				}
				break;
			case KNULL:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(KNULL);
				}
				break;
			case T__3:
				{
				_localctx = new RecordRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				recordExpr();
				}
				break;
			case T__0:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(T__0);
				setState(99);
				expr(0);
				setState(100);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(105);
						((MultiplicativeExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 155648L) != 0)) ) {
							((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(108);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(111);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(114);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new FunAppExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(117);
						match(T__0);
						setState(126);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73131958546L) != 0)) {
							{
							setState(118);
							expr(0);
							setState(123);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__1) {
								{
								{
								setState(119);
								match(T__1);
								setState(120);
								expr(0);
								}
								}
								setState(125);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(128);
						match(T__2);
						}
						break;
					case 6:
						{
						_localctx = new AccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(130);
						match(T__6);
						setState(131);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordExprContext extends ParserRuleContext {
		public List<FieldExprContext> fieldExpr() {
			return getRuleContexts(FieldExprContext.class);
		}
		public FieldExprContext fieldExpr(int i) {
			return getRuleContext(FieldExprContext.class,i);
		}
		public RecordExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterRecordExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitRecordExpr(this);
		}
	}

	public final RecordExprContext recordExpr() throws RecognitionException {
		RecordExprContext _localctx = new RecordExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recordExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__3);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(138);
				fieldExpr();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(139);
					match(T__1);
					setState(140);
					fieldExpr();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(148);
			match(T__4);
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
	public static class FieldExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitFieldExpr(this);
		}
	}

	public final FieldExprContext fieldExpr() throws RecognitionException {
		FieldExprContext _localctx = new FieldExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IDENTIFIER);
			setState(151);
			match(T__8);
			setState(152);
			expr(0);
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
	public static class StatementContext extends ParserRuleContext {
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public OutputStmtContext outputStmt() {
			return getRuleContext(OutputStmtContext.class,0);
		}
		public ErrorStmtContext errorStmt() {
			return getRuleContext(ErrorStmtContext.class,0);
		}
		public IncStmtContext incStmt() {
			return getRuleContext(IncStmtContext.class,0);
		}
		public DecStmtContext decStmt() {
			return getRuleContext(DecStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				whileStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				outputStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				errorStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				incStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				decStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expr(0);
			setState(165);
			match(T__9);
			setState(166);
			expr(0);
			setState(167);
			match(T__5);
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
	public static class BlockStmtContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitBlockStmt(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__3);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99304415506L) != 0)) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(176);
			match(T__4);
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
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode KWHILE() { return getToken(TIPParser.KWHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(KWHILE);
			setState(179);
			match(T__0);
			setState(180);
			expr(0);
			setState(181);
			match(T__2);
			setState(182);
			statement();
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode KIF() { return getToken(TIPParser.KIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode KELSE() { return getToken(TIPParser.KELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(KIF);
			setState(185);
			match(T__0);
			setState(186);
			expr(0);
			setState(187);
			match(T__2);
			setState(188);
			statement();
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(189);
				match(KELSE);
				setState(190);
				statement();
				}
				break;
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
	public static class OutputStmtContext extends ParserRuleContext {
		public TerminalNode KOUTPUT() { return getToken(TIPParser.KOUTPUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterOutputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitOutputStmt(this);
		}
	}

	public final OutputStmtContext outputStmt() throws RecognitionException {
		OutputStmtContext _localctx = new OutputStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_outputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(KOUTPUT);
			setState(194);
			expr(0);
			setState(195);
			match(T__5);
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
	public static class ErrorStmtContext extends ParserRuleContext {
		public TerminalNode KERROR() { return getToken(TIPParser.KERROR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitErrorStmt(this);
		}
	}

	public final ErrorStmtContext errorStmt() throws RecognitionException {
		ErrorStmtContext _localctx = new ErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(KERROR);
			setState(198);
			expr(0);
			setState(199);
			match(T__5);
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode KRETURN() { return getToken(TIPParser.KRETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(KRETURN);
			setState(202);
			expr(0);
			setState(203);
			match(T__5);
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
	public static class IncStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterIncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitIncStmt(this);
		}
	}

	public final IncStmtContext incStmt() throws RecognitionException {
		IncStmtContext _localctx = new IncStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_incStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expr(0);
			setState(206);
			match(T__10);
			setState(207);
			match(T__5);
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
	public static class DecStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitDecStmt(this);
		}
	}

	public final DecStmtContext decStmt() throws RecognitionException {
		DecStmtContext _localctx = new DecStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			expr(0);
			setState(210);
			match(T__11);
			setState(211);
			match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000$\b\u0000\u000b\u0000"+
		"\f\u0000%\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0003\u00012\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0005\u0001@\b\u0001"+
		"\n\u0001\f\u0001C\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002L\b\u0002\n\u0002\f\u0002"+
		"O\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"g\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004z\b\u0004\n\u0004\f\u0004}\t\u0004\u0003\u0004\u007f\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0085\b\u0004"+
		"\n\u0004\f\u0004\u0088\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u008e\b\u0005\n\u0005\f\u0005\u0091\t\u0005\u0003\u0005"+
		"\u0093\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a3\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00ac\b\t\n\t"+
		"\f\t\u00af\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00c0\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0001\b\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0004\u0002\u0000\r\u000e\u0011\u0011\u0001\u0000\u000f"+
		"\u0010\u0001\u0000\u0012\u0015\u0001\u0000\u0016\u0017\u00e7\u0000#\u0001"+
		"\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004G\u0001\u0000"+
		"\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000\u0000"+
		"\n\u0089\u0001\u0000\u0000\u0000\f\u0096\u0001\u0000\u0000\u0000\u000e"+
		"\u00a2\u0001\u0000\u0000\u0000\u0010\u00a4\u0001\u0000\u0000\u0000\u0012"+
		"\u00a9\u0001\u0000\u0000\u0000\u0014\u00b2\u0001\u0000\u0000\u0000\u0016"+
		"\u00b8\u0001\u0000\u0000\u0000\u0018\u00c1\u0001\u0000\u0000\u0000\u001a"+
		"\u00c5\u0001\u0000\u0000\u0000\u001c\u00c9\u0001\u0000\u0000\u0000\u001e"+
		"\u00cd\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000"+
		"\u0000\u0000\'(\u0003\u0006\u0003\u0000(1\u0005\u0001\u0000\u0000).\u0003"+
		"\u0006\u0003\u0000*+\u0005\u0002\u0000\u0000+-\u0003\u0006\u0003\u0000"+
		",*\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u00001)\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000035\u0005\u0003\u0000\u000046\u0005#\u0000\u000054\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7;\u0005\u0004\u0000\u00008:\u0003\u0004\u0002\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<A\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>@\u0003"+
		"\u000e\u0007\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DE\u0003\u001c\u000e\u0000EF\u0005\u0005"+
		"\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GH\u0005\u001e\u0000\u0000"+
		"HM\u0003\u0006\u0003\u0000IJ\u0005\u0002\u0000\u0000JL\u0003\u0006\u0003"+
		"\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0006\u0000\u0000Q\u0005\u0001\u0000\u0000"+
		"\u0000RS\u0005$\u0000\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0006\u0004"+
		"\uffff\uffff\u0000UV\u0005\r\u0000\u0000Vg\u0003\b\u0004\u000eWX\u0005"+
		"\u0010\u0000\u0000Xg\u0003\b\u0004\rYZ\u0005\b\u0000\u0000Zg\u0003\b\u0004"+
		"\f[g\u0005$\u0000\u0000\\g\u0005\u0018\u0000\u0000]g\u0005\u001a\u0000"+
		"\u0000^_\u0005\u0019\u0000\u0000_g\u0003\b\u0004\u0004`g\u0005 \u0000"+
		"\u0000ag\u0003\n\u0005\u0000bc\u0005\u0001\u0000\u0000cd\u0003\b\u0004"+
		"\u0000de\u0005\u0003\u0000\u0000eg\u0001\u0000\u0000\u0000fT\u0001\u0000"+
		"\u0000\u0000fW\u0001\u0000\u0000\u0000fY\u0001\u0000\u0000\u0000f[\u0001"+
		"\u0000\u0000\u0000f\\\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000\u0000"+
		"f^\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000"+
		"\u0000fb\u0001\u0000\u0000\u0000g\u0086\u0001\u0000\u0000\u0000hi\n\u000b"+
		"\u0000\u0000ij\u0007\u0000\u0000\u0000j\u0085\u0003\b\u0004\fkl\n\n\u0000"+
		"\u0000lm\u0007\u0001\u0000\u0000m\u0085\u0003\b\u0004\u000bno\n\t\u0000"+
		"\u0000op\u0007\u0002\u0000\u0000p\u0085\u0003\b\u0004\nqr\n\b\u0000\u0000"+
		"rs\u0007\u0003\u0000\u0000s\u0085\u0003\b\u0004\ttu\n\u0010\u0000\u0000"+
		"u~\u0005\u0001\u0000\u0000v{\u0003\b\u0004\u0000wx\u0005\u0002\u0000\u0000"+
		"xz\u0003\b\u0004\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~v\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0085"+
		"\u0005\u0003\u0000\u0000\u0081\u0082\n\u000f\u0000\u0000\u0082\u0083\u0005"+
		"\u0007\u0000\u0000\u0083\u0085\u0005$\u0000\u0000\u0084h\u0001\u0000\u0000"+
		"\u0000\u0084k\u0001\u0000\u0000\u0000\u0084n\u0001\u0000\u0000\u0000\u0084"+
		"q\u0001\u0000\u0000\u0000\u0084t\u0001\u0000\u0000\u0000\u0084\u0081\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\t\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u0092\u0005\u0004"+
		"\u0000\u0000\u008a\u008f\u0003\f\u0006\u0000\u008b\u008c\u0005\u0002\u0000"+
		"\u0000\u008c\u008e\u0003\f\u0006\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005$\u0000\u0000\u0097\u0098\u0005\t\u0000\u0000\u0098"+
		"\u0099\u0003\b\u0004\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u00a3"+
		"\u0003\u0012\t\u0000\u009b\u00a3\u0003\u0010\b\u0000\u009c\u00a3\u0003"+
		"\u0014\n\u0000\u009d\u00a3\u0003\u0016\u000b\u0000\u009e\u00a3\u0003\u0018"+
		"\f\u0000\u009f\u00a3\u0003\u001a\r\u0000\u00a0\u00a3\u0003\u001e\u000f"+
		"\u0000\u00a1\u00a3\u0003 \u0010\u0000\u00a2\u009a\u0001\u0000\u0000\u0000"+
		"\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000"+
		"\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000"+
		"\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u000f\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0003\b\u0004\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6"+
		"\u00a7\u0003\b\u0004\u0000\u00a7\u00a8\u0005\u0006\u0000\u0000\u00a8\u0011"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ad\u0005\u0004\u0000\u0000\u00aa\u00ac"+
		"\u0003\u000e\u0007\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0005\u0000\u0000\u00b1\u0013"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u001b\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0001\u0000\u0000\u00b4\u00b5\u0003\b\u0004\u0000\u00b5\u00b6\u0005"+
		"\u0003\u0000\u0000\u00b6\u00b7\u0003\u000e\u0007\u0000\u00b7\u0015\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005\u001c\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0001\u0000\u0000\u00ba\u00bb\u0003\b\u0004\u0000\u00bb\u00bc\u0005\u0003"+
		"\u0000\u0000\u00bc\u00bf\u0003\u000e\u0007\u0000\u00bd\u00be\u0005\u001d"+
		"\u0000\u0000\u00be\u00c0\u0003\u000e\u0007\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u0017\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c3\u0003\b\u0004"+
		"\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u0019\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\"\u0000\u0000\u00c6\u00c7\u0003\b\u0004\u0000"+
		"\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8\u001b\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u001f\u0000\u0000\u00ca\u00cb\u0003\b\u0004\u0000\u00cb"+
		"\u00cc\u0005\u0006\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0003\b\u0004\u0000\u00ce\u00cf\u0005\u000b\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0006\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0003\b\u0004\u0000\u00d2\u00d3\u0005\f\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0006\u0000\u0000\u00d4!\u0001\u0000\u0000\u0000\u0011%.15;AMf{~\u0084"+
		"\u0086\u008f\u0092\u00a2\u00ad\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}