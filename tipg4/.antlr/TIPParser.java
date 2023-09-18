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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, MUL=16, DIV=17, 
		ADD=18, SUB=19, MOD=20, GT=21, GTE=22, LT=23, LTE=24, EQ=25, NE=26, T=27, 
		F=28, NOT=29, AND=30, OR=31, NUMBER=32, KALLOC=33, KINPUT=34, KWHILE=35, 
		KFOR=36, KIF=37, KELSE=38, KVAR=39, KRETURN=40, KNULL=41, KOUTPUT=42, 
		KERROR=43, KPOLY=44, IDENTIFIER=45, WS=46, BLOCKCOMMENT=47, COMMENT=48;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_declaration = 2, RULE_nameDeclaration = 3, 
		RULE_expr = 4, RULE_recordExpr = 5, RULE_fieldExpr = 6, RULE_statement = 7, 
		RULE_assignStmt = 8, RULE_blockStmt = 9, RULE_whileStmt = 10, RULE_ifStmt = 11, 
		RULE_outputStmt = 12, RULE_errorStmt = 13, RULE_returnStmt = 14, RULE_incStmt = 15, 
		RULE_decStmt = 16, RULE_forItrStmt = 17, RULE_forRangeStmt = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "declaration", "nameDeclaration", "expr", "recordExpr", 
			"fieldExpr", "statement", "assignStmt", "blockStmt", "whileStmt", "ifStmt", 
			"outputStmt", "errorStmt", "returnStmt", "incStmt", "decStmt", "forItrStmt", 
			"forRangeStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "';'", "'.'", "'&'", "'?'", 
			"':'", "'='", "'++;'", "'--;'", "'..'", "'by'", "'*'", "'/'", "'+'", 
			"'-'", "'%'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'true'", 
			"'false'", "'not'", "'and'", "'or'", null, "'alloc'", "'input'", "'while'", 
			"'for'", "'if'", "'else'", "'var'", "'return'", "'null'", "'output'", 
			"'error'", "'poly'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "MOD", "GT", "GTE", 
			"LT", "LTE", "EQ", "NE", "T", "F", "NOT", "AND", "OR", "NUMBER", "KALLOC", 
			"KINPUT", "KWHILE", "KFOR", "KIF", "KELSE", "KVAR", "KRETURN", "KNULL", 
			"KOUTPUT", "KERROR", "KPOLY", "IDENTIFIER", "WS", "BLOCKCOMMENT", "COMMENT"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				function();
				}
				}
				setState(41); 
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
			setState(43);
			nameDeclaration();
			setState(44);
			match(T__0);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(45);
				nameDeclaration();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(46);
					match(T__1);
					setState(47);
					nameDeclaration();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(55);
			match(T__2);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KPOLY) {
				{
				setState(56);
				match(KPOLY);
				}
			}

			setState(59);
			match(T__3);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KVAR) {
				{
				{
				setState(60);
				declaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50849057931538L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(72);
			returnStmt();
			setState(73);
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
			setState(75);
			match(KVAR);
			setState(76);
			nameDeclaration();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(77);
				match(T__1);
				setState(78);
				nameDeclaration();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(86);
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
	public static class TrueExprContext extends ExprContext {
		public TerminalNode T() { return getToken(TIPParser.T, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitTrueExpr(this);
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
	public static class BinaryOpExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(TIPParser.AND, 0); }
		public TerminalNode OR() { return getToken(TIPParser.OR, 0); }
		public BinaryOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterBinaryOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitBinaryOpExpr(this);
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
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(TIPParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitNotExpr(this);
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
	public static class ArithmeticNegExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TIPParser.SUB, 0); }
		public ArithmeticNegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterArithmeticNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitArithmeticNegExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryCondExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryCondExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterTernaryCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitTernaryCondExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseExprContext extends ExprContext {
		public TerminalNode F() { return getToken(TIPParser.F, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitFalseExpr(this);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new DeRefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				match(MUL);
				setState(90);
				expr(20);
				}
				break;
			case 2:
				{
				_localctx = new NegNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(SUB);
				setState(92);
				expr(19);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticNegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				((ArithmeticNegExprContext)_localctx).op = match(SUB);
				setState(94);
				expr(18);
				}
				break;
			case 4:
				{
				_localctx = new RefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__7);
				setState(96);
				expr(17);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(NOT);
				setState(98);
				expr(16);
				}
				break;
			case 6:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(NUMBER);
				}
				break;
			case 8:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T);
				}
				break;
			case 9:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(F);
				}
				break;
			case 10:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(KINPUT);
				}
				break;
			case 11:
				{
				_localctx = new AllocExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(KALLOC);
				setState(105);
				expr(4);
				}
				break;
			case 12:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(KNULL);
				}
				break;
			case 13:
				{
				_localctx = new RecordRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				recordExpr();
				}
				break;
			case 14:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(T__0);
				setState(109);
				expr(0);
				setState(110);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(115);
						((MultiplicativeExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1245184L) != 0)) ) {
							((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(118);
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
						setState(119);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(121);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(124);
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
						setState(125);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(127);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new TernaryCondExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(130);
						match(T__8);
						setState(131);
						expr(0);
						setState(132);
						match(T__9);
						setState(133);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new FunAppExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(136);
						match(T__0);
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37414400229650L) != 0)) {
							{
							setState(137);
							expr(0);
							setState(142);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__1) {
								{
								{
								setState(138);
								match(T__1);
								setState(139);
								expr(0);
								}
								}
								setState(144);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(147);
						match(T__2);
						}
						break;
					case 8:
						{
						_localctx = new AccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(149);
						match(T__6);
						setState(150);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(155);
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
			setState(156);
			match(T__3);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(157);
				fieldExpr();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(158);
					match(T__1);
					setState(159);
					fieldExpr();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
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
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(T__9);
			setState(171);
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
		public ForItrStmtContext forItrStmt() {
			return getRuleContext(ForItrStmtContext.class,0);
		}
		public ForRangeStmtContext forRangeStmt() {
			return getRuleContext(ForRangeStmtContext.class,0);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				whileStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				outputStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				errorStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				incStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				decStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				forItrStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				forRangeStmt();
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
			setState(185);
			expr(0);
			setState(186);
			match(T__10);
			setState(187);
			expr(0);
			setState(188);
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
			setState(190);
			match(T__3);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50849057931538L) != 0)) {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(197);
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
			setState(199);
			match(KWHILE);
			setState(200);
			match(T__0);
			setState(201);
			expr(0);
			setState(202);
			match(T__2);
			setState(203);
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
			setState(205);
			match(KIF);
			setState(206);
			match(T__0);
			setState(207);
			expr(0);
			setState(208);
			match(T__2);
			setState(209);
			statement();
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(210);
				match(KELSE);
				setState(211);
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
			setState(214);
			match(KOUTPUT);
			setState(215);
			expr(0);
			setState(216);
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
			setState(218);
			match(KERROR);
			setState(219);
			expr(0);
			setState(220);
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
			setState(222);
			match(KRETURN);
			setState(223);
			expr(0);
			setState(224);
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
			setState(226);
			expr(0);
			setState(227);
			match(T__11);
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
			setState(229);
			expr(0);
			setState(230);
			match(T__12);
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
	public static class ForItrStmtContext extends ParserRuleContext {
		public TerminalNode KFOR() { return getToken(TIPParser.KFOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForItrStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forItrStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterForItrStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitForItrStmt(this);
		}
	}

	public final ForItrStmtContext forItrStmt() throws RecognitionException {
		ForItrStmtContext _localctx = new ForItrStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forItrStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(KFOR);
			setState(233);
			match(T__0);
			setState(234);
			expr(0);
			setState(235);
			match(T__9);
			setState(236);
			expr(0);
			setState(237);
			match(T__2);
			setState(238);
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
	public static class ForRangeStmtContext extends ParserRuleContext {
		public TerminalNode KFOR() { return getToken(TIPParser.KFOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForRangeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).enterForRangeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TIPListener ) ((TIPListener)listener).exitForRangeStmt(this);
		}
	}

	public final ForRangeStmtContext forRangeStmt() throws RecognitionException {
		ForRangeStmtContext _localctx = new ForRangeStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forRangeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(KFOR);
			setState(241);
			match(T__0);
			setState(242);
			expr(0);
			setState(243);
			match(T__9);
			setState(244);
			expr(0);
			setState(245);
			match(T__13);
			setState(246);
			expr(0);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(247);
				match(T__14);
				setState(248);
				expr(0);
				}
			}

			setState(251);
			match(T__2);
			setState(252);
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
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 22);
		case 7:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u00ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001"+
		"\f\u00014\t\u0001\u0003\u00016\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		":\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001\n\u0001\f\u0001"+
		"A\t\u0001\u0001\u0001\u0005\u0001D\b\u0001\n\u0001\f\u0001G\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002P\b\u0002\n\u0002\f\u0002S\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u008d\b\u0004\n\u0004\f\u0004\u0090\t\u0004\u0003\u0004"+
		"\u0092\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u0098\b\u0004\n\u0004\f\u0004\u009b\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00a1\b\u0005\n\u0005\f\u0005\u00a4\t\u0005"+
		"\u0003\u0005\u00a6\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b8\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\t\u00c1\b\t\n\t\f\t\u00c4\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d5"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00fa\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0001\b\u0013\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$\u0000\u0005\u0002\u0000\u0010\u0011\u0014\u0014\u0001\u0000\u0012\u0013"+
		"\u0001\u0000\u0015\u0018\u0001\u0000\u0019\u001a\u0001\u0000\u001e\u001f"+
		"\u0117\u0000\'\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000"+
		"\u0004K\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bp\u0001"+
		"\u0000\u0000\u0000\n\u009c\u0001\u0000\u0000\u0000\f\u00a9\u0001\u0000"+
		"\u0000\u0000\u000e\u00b7\u0001\u0000\u0000\u0000\u0010\u00b9\u0001\u0000"+
		"\u0000\u0000\u0012\u00be\u0001\u0000\u0000\u0000\u0014\u00c7\u0001\u0000"+
		"\u0000\u0000\u0016\u00cd\u0001\u0000\u0000\u0000\u0018\u00d6\u0001\u0000"+
		"\u0000\u0000\u001a\u00da\u0001\u0000\u0000\u0000\u001c\u00de\u0001\u0000"+
		"\u0000\u0000\u001e\u00e2\u0001\u0000\u0000\u0000 \u00e5\u0001\u0000\u0000"+
		"\u0000\"\u00e8\u0001\u0000\u0000\u0000$\u00f0\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001"+
		"\u0000\u0000\u0000+,\u0003\u0006\u0003\u0000,5\u0005\u0001\u0000\u0000"+
		"-2\u0003\u0006\u0003\u0000./\u0005\u0002\u0000\u0000/1\u0003\u0006\u0003"+
		"\u00000.\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u00005-\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000079\u0005\u0003\u0000\u00008:\u0005,\u0000\u0000"+
		"98\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;?\u0005\u0004\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@E\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BD\u0003\u000e\u0007\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0003\u001c\u000e\u0000IJ\u0005"+
		"\u0005\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005\'\u0000\u0000"+
		"LQ\u0003\u0006\u0003\u0000MN\u0005\u0002\u0000\u0000NP\u0003\u0006\u0003"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000U\u0005\u0001\u0000\u0000"+
		"\u0000VW\u0005-\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0006\u0004"+
		"\uffff\uffff\u0000YZ\u0005\u0010\u0000\u0000Zq\u0003\b\u0004\u0014[\\"+
		"\u0005\u0013\u0000\u0000\\q\u0003\b\u0004\u0013]^\u0005\u0013\u0000\u0000"+
		"^q\u0003\b\u0004\u0012_`\u0005\b\u0000\u0000`q\u0003\b\u0004\u0011ab\u0005"+
		"\u001d\u0000\u0000bq\u0003\b\u0004\u0010cq\u0005-\u0000\u0000dq\u0005"+
		" \u0000\u0000eq\u0005\u001b\u0000\u0000fq\u0005\u001c\u0000\u0000gq\u0005"+
		"\"\u0000\u0000hi\u0005!\u0000\u0000iq\u0003\b\u0004\u0004jq\u0005)\u0000"+
		"\u0000kq\u0003\n\u0005\u0000lm\u0005\u0001\u0000\u0000mn\u0003\b\u0004"+
		"\u0000no\u0005\u0003\u0000\u0000oq\u0001\u0000\u0000\u0000pX\u0001\u0000"+
		"\u0000\u0000p[\u0001\u0000\u0000\u0000p]\u0001\u0000\u0000\u0000p_\u0001"+
		"\u0000\u0000\u0000pa\u0001\u0000\u0000\u0000pc\u0001\u0000\u0000\u0000"+
		"pd\u0001\u0000\u0000\u0000pe\u0001\u0000\u0000\u0000pf\u0001\u0000\u0000"+
		"\u0000pg\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pj\u0001\u0000"+
		"\u0000\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000q\u0099"+
		"\u0001\u0000\u0000\u0000rs\n\u000f\u0000\u0000st\u0007\u0000\u0000\u0000"+
		"t\u0098\u0003\b\u0004\u0010uv\n\u000e\u0000\u0000vw\u0007\u0001\u0000"+
		"\u0000w\u0098\u0003\b\u0004\u000fxy\n\r\u0000\u0000yz\u0007\u0002\u0000"+
		"\u0000z\u0098\u0003\b\u0004\u000e{|\n\f\u0000\u0000|}\u0007\u0003\u0000"+
		"\u0000}\u0098\u0003\b\u0004\r~\u007f\n\u000b\u0000\u0000\u007f\u0080\u0007"+
		"\u0004\u0000\u0000\u0080\u0098\u0003\b\u0004\f\u0081\u0082\n\n\u0000\u0000"+
		"\u0082\u0083\u0005\t\u0000\u0000\u0083\u0084\u0003\b\u0004\u0000\u0084"+
		"\u0085\u0005\n\u0000\u0000\u0085\u0086\u0003\b\u0004\u000b\u0086\u0098"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\n\u0016\u0000\u0000\u0088\u0091\u0005"+
		"\u0001\u0000\u0000\u0089\u008e\u0003\b\u0004\u0000\u008a\u008b\u0005\u0002"+
		"\u0000\u0000\u008b\u008d\u0003\b\u0004\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0089\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0098\u0005\u0003\u0000\u0000\u0094\u0095\n\u0015\u0000\u0000"+
		"\u0095\u0096\u0005\u0007\u0000\u0000\u0096\u0098\u0005-\u0000\u0000\u0097"+
		"r\u0001\u0000\u0000\u0000\u0097u\u0001\u0000\u0000\u0000\u0097x\u0001"+
		"\u0000\u0000\u0000\u0097{\u0001\u0000\u0000\u0000\u0097~\u0001\u0000\u0000"+
		"\u0000\u0097\u0081\u0001\u0000\u0000\u0000\u0097\u0087\u0001\u0000\u0000"+
		"\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u00a5\u0005\u0004\u0000\u0000\u009d\u00a2\u0003\f\u0006\u0000\u009e"+
		"\u009f\u0005\u0002\u0000\u0000\u009f\u00a1\u0003\f\u0006\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u009d"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0005\u0000\u0000\u00a8\u000b"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005-\u0000\u0000\u00aa\u00ab\u0005"+
		"\n\u0000\u0000\u00ab\u00ac\u0003\b\u0004\u0000\u00ac\r\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b8\u0003\u0012\t\u0000\u00ae\u00b8\u0003\u0010\b\u0000"+
		"\u00af\u00b8\u0003\u0014\n\u0000\u00b0\u00b8\u0003\u0016\u000b\u0000\u00b1"+
		"\u00b8\u0003\u0018\f\u0000\u00b2\u00b8\u0003\u001a\r\u0000\u00b3\u00b8"+
		"\u0003\u001e\u000f\u0000\u00b4\u00b8\u0003 \u0010\u0000\u00b5\u00b8\u0003"+
		"\"\u0011\u0000\u00b6\u00b8\u0003$\u0012\u0000\u00b7\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u000f\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0003\b\u0004\u0000\u00ba\u00bb\u0005\u000b\u0000"+
		"\u0000\u00bb\u00bc\u0003\b\u0004\u0000\u00bc\u00bd\u0005\u0006\u0000\u0000"+
		"\u00bd\u0011\u0001\u0000\u0000\u0000\u00be\u00c2\u0005\u0004\u0000\u0000"+
		"\u00bf\u00c1\u0003\u000e\u0007\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000"+
		"\u00c6\u0013\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005#\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0001\u0000\u0000\u00c9\u00ca\u0003\b\u0004\u0000\u00ca\u00cb"+
		"\u0005\u0003\u0000\u0000\u00cb\u00cc\u0003\u000e\u0007\u0000\u00cc\u0015"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005%\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0001\u0000\u0000\u00cf\u00d0\u0003\b\u0004\u0000\u00d0\u00d1\u0005\u0003"+
		"\u0000\u0000\u00d1\u00d4\u0003\u000e\u0007\u0000\u00d2\u00d3\u0005&\u0000"+
		"\u0000\u00d3\u00d5\u0003\u000e\u0007\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u0017\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005*\u0000\u0000\u00d7\u00d8\u0003\b\u0004\u0000"+
		"\u00d8\u00d9\u0005\u0006\u0000\u0000\u00d9\u0019\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005+\u0000\u0000\u00db\u00dc\u0003\b\u0004\u0000\u00dc"+
		"\u00dd\u0005\u0006\u0000\u0000\u00dd\u001b\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005(\u0000\u0000\u00df\u00e0\u0003\b\u0004\u0000\u00e0\u00e1"+
		"\u0005\u0006\u0000\u0000\u00e1\u001d\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0003\b\u0004\u0000\u00e3\u00e4\u0005\f\u0000\u0000\u00e4\u001f\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0003\b\u0004\u0000\u00e6\u00e7\u0005\r"+
		"\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005$\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0001\u0000\u0000\u00ea\u00eb\u0003\b\u0004\u0000\u00eb"+
		"\u00ec\u0005\n\u0000\u0000\u00ec\u00ed\u0003\b\u0004\u0000\u00ed\u00ee"+
		"\u0005\u0003\u0000\u0000\u00ee\u00ef\u0003\u000e\u0007\u0000\u00ef#\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005$\u0000\u0000\u00f1\u00f2\u0005\u0001"+
		"\u0000\u0000\u00f2\u00f3\u0003\b\u0004\u0000\u00f3\u00f4\u0005\n\u0000"+
		"\u0000\u00f4\u00f5\u0003\b\u0004\u0000\u00f5\u00f6\u0005\u000e\u0000\u0000"+
		"\u00f6\u00f9\u0003\b\u0004\u0000\u00f7\u00f8\u0005\u000f\u0000\u0000\u00f8"+
		"\u00fa\u0003\b\u0004\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0005\u0003\u0000\u0000\u00fc\u00fd\u0003\u000e\u0007\u0000\u00fd%\u0001"+
		"\u0000\u0000\u0000\u0012)259?EQp\u008e\u0091\u0097\u0099\u00a2\u00a5\u00b7"+
		"\u00c2\u00d4\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}