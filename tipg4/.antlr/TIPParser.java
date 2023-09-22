// Generated from /u/bhl9bcu/sipc-lai_strobel/tipg4/TIP.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TIPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, MUL=20, DIV=21, ADD=22, SUB=23, MOD=24, GT=25, GTE=26, 
		LT=27, LTE=28, EQ=29, NE=30, T=31, F=32, NOT=33, AND=34, OR=35, NUMBER=36, 
		KALLOC=37, KINPUT=38, KWHILE=39, KFOR=40, KIF=41, KELSE=42, KVAR=43, KRETURN=44, 
		KNULL=45, KOUTPUT=46, KERROR=47, KPOLY=48, IDENTIFIER=49, WS=50, BLOCKCOMMENT=51, 
		COMMENT=52;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_declaration = 2, RULE_nameDeclaration = 3, 
		RULE_expr = 4, RULE_arrayConstructorExpr = 5, RULE_recordExpr = 6, RULE_fieldExpr = 7, 
		RULE_statement = 8, RULE_assignStmt = 9, RULE_blockStmt = 10, RULE_whileStmt = 11, 
		RULE_ifStmt = 12, RULE_outputStmt = 13, RULE_errorStmt = 14, RULE_returnStmt = 15, 
		RULE_incStmt = 16, RULE_decStmt = 17, RULE_forItrStmt = 18, RULE_forRangeStmt = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "declaration", "nameDeclaration", "expr", "arrayConstructorExpr", 
			"recordExpr", "fieldExpr", "statement", "assignStmt", "blockStmt", "whileStmt", 
			"ifStmt", "outputStmt", "errorStmt", "returnStmt", "incStmt", "decStmt", 
			"forItrStmt", "forRangeStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "';'", "'.'", "'&'", "'?'", 
			"':'", "'#'", "'['", "']'", "' of '", "'='", "'++;'", "'--;'", "'..'", 
			"'by'", "'*'", "'/'", "'+'", "'-'", "'%'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'!='", "'true'", "'false'", "'not'", "'and'", "'or'", null, 
			"'alloc'", "'input'", "'while'", "'for'", "'if'", "'else'", "'var'", 
			"'return'", "'null'", "'output'", "'error'", "'poly'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "MUL", "DIV", "ADD", 
			"SUB", "MOD", "GT", "GTE", "LT", "LTE", "EQ", "NE", "T", "F", "NOT", 
			"AND", "OR", "NUMBER", "KALLOC", "KINPUT", "KWHILE", "KFOR", "KIF", "KELSE", 
			"KVAR", "KRETURN", "KNULL", "KOUTPUT", "KERROR", "KPOLY", "IDENTIFIER", 
			"WS", "BLOCKCOMMENT", "COMMENT"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				function();
				}
				}
				setState(43); 
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			nameDeclaration();
			setState(46);
			match(T__0);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(47);
				nameDeclaration();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(48);
					match(T__1);
					setState(49);
					nameDeclaration();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(57);
			match(T__2);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KPOLY) {
				{
				setState(58);
				match(KPOLY);
				}
			}

			setState(61);
			match(T__3);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KVAR) {
				{
				{
				setState(62);
				declaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << MUL) | (1L << SUB) | (1L << T) | (1L << F) | (1L << NOT) | (1L << NUMBER) | (1L << KALLOC) | (1L << KINPUT) | (1L << KWHILE) | (1L << KFOR) | (1L << KIF) | (1L << KNULL) | (1L << KOUTPUT) | (1L << KERROR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(74);
			returnStmt();
			setState(75);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(KVAR);
			setState(78);
			nameDeclaration();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(79);
				match(T__1);
				setState(80);
				nameDeclaration();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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

	public static class NameDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public NameDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameDeclaration; }
	}

	public final NameDeclarationContext nameDeclaration() throws RecognitionException {
		NameDeclarationContext _localctx = new NameDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nameDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
	public static class ArrLenOpExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrLenOpExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NullExprContext extends ExprContext {
		public TerminalNode KNULL() { return getToken(TIPParser.KNULL, 0); }
		public NullExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode T() { return getToken(TIPParser.T, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AllocExprContext extends ExprContext {
		public TerminalNode KALLOC() { return getToken(TIPParser.KALLOC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AllocExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArrConstructorExprContext extends ExprContext {
		public ArrayConstructorExprContext arrayConstructorExpr() {
			return getRuleContext(ArrayConstructorExprContext.class,0);
		}
		public ArrConstructorExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class DeRefExprContext extends ExprContext {
		public TerminalNode MUL() { return getToken(TIPParser.MUL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeRefExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TernaryCondExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryCondExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode F() { return getToken(TIPParser.F, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FunAppExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunAppExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AccessExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public AccessExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RecordRuleContext extends ExprContext {
		public RecordExprContext recordExpr() {
			return getRuleContext(RecordExprContext.class,0);
		}
		public RecordRuleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArrBinRefOpExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrBinRefOpExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegNumberContext extends ExprContext {
		public TerminalNode SUB() { return getToken(TIPParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegNumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class InputExprContext extends ExprContext {
		public TerminalNode KINPUT() { return getToken(TIPParser.KINPUT, 0); }
		public InputExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
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
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(TIPParser.NUMBER, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(TIPParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RefExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RefExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticNegExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TIPParser.SUB, 0); }
		public ArithmeticNegExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new DeRefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				match(MUL);
				setState(92);
				expr(23);
				}
				break;
			case 2:
				{
				_localctx = new NegNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(SUB);
				setState(94);
				expr(22);
				}
				break;
			case 3:
				{
				_localctx = new ArithmeticNegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				((ArithmeticNegExprContext)_localctx).op = match(SUB);
				setState(96);
				expr(21);
				}
				break;
			case 4:
				{
				_localctx = new RefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(T__7);
				setState(98);
				expr(20);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(NOT);
				setState(100);
				expr(19);
				}
				break;
			case 6:
				{
				_localctx = new ArrConstructorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				arrayConstructorExpr();
				}
				break;
			case 7:
				{
				_localctx = new ArrLenOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__10);
				setState(103);
				expr(11);
				}
				break;
			case 8:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(NUMBER);
				}
				break;
			case 10:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T);
				}
				break;
			case 11:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(F);
				}
				break;
			case 12:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(KINPUT);
				}
				break;
			case 13:
				{
				_localctx = new AllocExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(KALLOC);
				setState(110);
				expr(4);
				}
				break;
			case 14:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(KNULL);
				}
				break;
			case 15:
				{
				_localctx = new RecordRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				recordExpr();
				}
				break;
			case 16:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(T__0);
				setState(114);
				expr(0);
				setState(115);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(120);
						((MultiplicativeExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(123);
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
						setState(124);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(126);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(129);
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
						setState(130);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(132);
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
						setState(133);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new TernaryCondExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(135);
						match(T__8);
						setState(136);
						expr(0);
						setState(137);
						match(T__9);
						setState(138);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new FunAppExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(141);
						match(T__0);
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << MUL) | (1L << SUB) | (1L << T) | (1L << F) | (1L << NOT) | (1L << NUMBER) | (1L << KALLOC) | (1L << KINPUT) | (1L << KNULL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(142);
							expr(0);
							setState(147);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__1) {
								{
								{
								setState(143);
								match(T__1);
								setState(144);
								expr(0);
								}
								}
								setState(149);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(152);
						match(T__2);
						}
						break;
					case 8:
						{
						_localctx = new AccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(154);
						match(T__6);
						setState(155);
						match(IDENTIFIER);
						}
						break;
					case 9:
						{
						_localctx = new ArrBinRefOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(157);
						match(T__11);
						setState(158);
						expr(0);
						setState(159);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(165);
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

	public static class ArrayConstructorExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructorExpr; }
	}

	public final ArrayConstructorExprContext arrayConstructorExpr() throws RecognitionException {
		ArrayConstructorExprContext _localctx = new ArrayConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayConstructorExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__11);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << MUL) | (1L << SUB) | (1L << T) | (1L << F) | (1L << NOT) | (1L << NUMBER) | (1L << KALLOC) | (1L << KINPUT) | (1L << KNULL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(167);
					expr(0);
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(168);
						match(T__1);
						setState(169);
						expr(0);
						}
						}
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				{
				setState(177);
				expr(0);
				setState(178);
				match(T__13);
				setState(179);
				expr(0);
				}
				break;
			}
			setState(183);
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
	}

	public final RecordExprContext recordExpr() throws RecognitionException {
		RecordExprContext _localctx = new RecordExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recordExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__3);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(186);
				fieldExpr();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(187);
					match(T__1);
					setState(188);
					fieldExpr();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196);
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

	public static class FieldExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TIPParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldExpr; }
	}

	public final FieldExprContext fieldExpr() throws RecognitionException {
		FieldExprContext _localctx = new FieldExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IDENTIFIER);
			setState(199);
			match(T__9);
			setState(200);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				whileStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				outputStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				errorStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				incStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				decStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				forItrStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
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
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expr(0);
			setState(215);
			match(T__14);
			setState(216);
			expr(0);
			setState(217);
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
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__3);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << MUL) | (1L << SUB) | (1L << T) | (1L << F) | (1L << NOT) | (1L << NUMBER) | (1L << KALLOC) | (1L << KINPUT) | (1L << KWHILE) | (1L << KFOR) | (1L << KIF) | (1L << KNULL) | (1L << KOUTPUT) | (1L << KERROR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(220);
				statement();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(226);
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
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(KWHILE);
			setState(229);
			match(T__0);
			setState(230);
			expr(0);
			setState(231);
			match(T__2);
			setState(232);
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
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(KIF);
			setState(235);
			match(T__0);
			setState(236);
			expr(0);
			setState(237);
			match(T__2);
			setState(238);
			statement();
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(239);
				match(KELSE);
				setState(240);
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

	public static class OutputStmtContext extends ParserRuleContext {
		public TerminalNode KOUTPUT() { return getToken(TIPParser.KOUTPUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStmt; }
	}

	public final OutputStmtContext outputStmt() throws RecognitionException {
		OutputStmtContext _localctx = new OutputStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_outputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(KOUTPUT);
			setState(244);
			expr(0);
			setState(245);
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

	public static class ErrorStmtContext extends ParserRuleContext {
		public TerminalNode KERROR() { return getToken(TIPParser.KERROR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStmt; }
	}

	public final ErrorStmtContext errorStmt() throws RecognitionException {
		ErrorStmtContext _localctx = new ErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(KERROR);
			setState(248);
			expr(0);
			setState(249);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode KRETURN() { return getToken(TIPParser.KRETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(KRETURN);
			setState(252);
			expr(0);
			setState(253);
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

	public static class IncStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incStmt; }
	}

	public final IncStmtContext incStmt() throws RecognitionException {
		IncStmtContext _localctx = new IncStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_incStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expr(0);
			setState(256);
			match(T__15);
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

	public static class DecStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decStmt; }
	}

	public final DecStmtContext decStmt() throws RecognitionException {
		DecStmtContext _localctx = new DecStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			expr(0);
			setState(259);
			match(T__16);
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
	}

	public final ForItrStmtContext forItrStmt() throws RecognitionException {
		ForItrStmtContext _localctx = new ForItrStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forItrStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(KFOR);
			setState(262);
			match(T__0);
			setState(263);
			expr(0);
			setState(264);
			match(T__9);
			setState(265);
			expr(0);
			setState(266);
			match(T__2);
			setState(267);
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
	}

	public final ForRangeStmtContext forRangeStmt() throws RecognitionException {
		ForRangeStmtContext _localctx = new ForRangeStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forRangeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(KFOR);
			setState(270);
			match(T__0);
			setState(271);
			expr(0);
			setState(272);
			match(T__9);
			setState(273);
			expr(0);
			setState(274);
			match(T__17);
			setState(275);
			expr(0);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(276);
				match(T__18);
				setState(277);
				expr(0);
				}
			}

			setState(280);
			match(T__2);
			setState(281);
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
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 25);
		case 7:
			return precpred(_ctx, 24);
		case 8:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u011e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\5\3:\n\3\3\3\3\3\5\3>\n\3\3\3\3\3\7\3B"+
		"\n\3\f\3\16\3E\13\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0094\n"+
		"\6\f\6\16\6\u0097\13\6\5\6\u0099\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u00a4\n\6\f\6\16\6\u00a7\13\6\3\7\3\7\3\7\3\7\7\7\u00ad\n\7\f\7"+
		"\16\7\u00b0\13\7\5\7\u00b2\n\7\3\7\3\7\3\7\3\7\5\7\u00b8\n\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\7\b\u00c0\n\b\f\b\16\b\u00c3\13\b\5\b\u00c5\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d7\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u00e0\n\f\f\f\16\f\u00e3\13\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00f4\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0119\n\25\3\25\3\25"+
		"\3\25\3\25\2\3\n\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\4"+
		"\2\26\27\32\32\3\2\30\31\3\2\33\36\3\2\37 \3\2$%\2\u013b\2+\3\2\2\2\4"+
		"/\3\2\2\2\6O\3\2\2\2\bZ\3\2\2\2\nw\3\2\2\2\f\u00a8\3\2\2\2\16\u00bb\3"+
		"\2\2\2\20\u00c8\3\2\2\2\22\u00d6\3\2\2\2\24\u00d8\3\2\2\2\26\u00dd\3\2"+
		"\2\2\30\u00e6\3\2\2\2\32\u00ec\3\2\2\2\34\u00f5\3\2\2\2\36\u00f9\3\2\2"+
		"\2 \u00fd\3\2\2\2\"\u0101\3\2\2\2$\u0104\3\2\2\2&\u0107\3\2\2\2(\u010f"+
		"\3\2\2\2*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2"+
		"/\60\5\b\5\2\609\7\3\2\2\61\66\5\b\5\2\62\63\7\4\2\2\63\65\5\b\5\2\64"+
		"\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\29\61\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\5\2\2<>\7\62\2\2=<\3\2\2\2"+
		"=>\3\2\2\2>?\3\2\2\2?C\7\6\2\2@B\5\6\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2DI\3\2\2\2EC\3\2\2\2FH\5\22\n\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5 \21\2MN\7\7\2\2N\5\3\2\2\2OP\7-\2"+
		"\2PU\5\b\5\2QR\7\4\2\2RT\5\b\5\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2VX\3\2\2\2WU\3\2\2\2XY\7\b\2\2Y\7\3\2\2\2Z[\7\63\2\2[\t\3\2\2\2\\]\b"+
		"\6\1\2]^\7\26\2\2^x\5\n\6\31_`\7\31\2\2`x\5\n\6\30ab\7\31\2\2bx\5\n\6"+
		"\27cd\7\n\2\2dx\5\n\6\26ef\7#\2\2fx\5\n\6\25gx\5\f\7\2hi\7\r\2\2ix\5\n"+
		"\6\rjx\7\63\2\2kx\7&\2\2lx\7!\2\2mx\7\"\2\2nx\7(\2\2op\7\'\2\2px\5\n\6"+
		"\6qx\7/\2\2rx\5\16\b\2st\7\3\2\2tu\5\n\6\2uv\7\5\2\2vx\3\2\2\2w\\\3\2"+
		"\2\2w_\3\2\2\2wa\3\2\2\2wc\3\2\2\2we\3\2\2\2wg\3\2\2\2wh\3\2\2\2wj\3\2"+
		"\2\2wk\3\2\2\2wl\3\2\2\2wm\3\2\2\2wn\3\2\2\2wo\3\2\2\2wq\3\2\2\2wr\3\2"+
		"\2\2ws\3\2\2\2x\u00a5\3\2\2\2yz\f\24\2\2z{\t\2\2\2{\u00a4\5\n\6\25|}\f"+
		"\23\2\2}~\t\3\2\2~\u00a4\5\n\6\24\177\u0080\f\22\2\2\u0080\u0081\t\4\2"+
		"\2\u0081\u00a4\5\n\6\23\u0082\u0083\f\21\2\2\u0083\u0084\t\5\2\2\u0084"+
		"\u00a4\5\n\6\22\u0085\u0086\f\20\2\2\u0086\u0087\t\6\2\2\u0087\u00a4\5"+
		"\n\6\21\u0088\u0089\f\17\2\2\u0089\u008a\7\13\2\2\u008a\u008b\5\n\6\2"+
		"\u008b\u008c\7\f\2\2\u008c\u008d\5\n\6\20\u008d\u00a4\3\2\2\2\u008e\u008f"+
		"\f\33\2\2\u008f\u0098\7\3\2\2\u0090\u0095\5\n\6\2\u0091\u0092\7\4\2\2"+
		"\u0092\u0094\5\n\6\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a4\7\5"+
		"\2\2\u009b\u009c\f\32\2\2\u009c\u009d\7\t\2\2\u009d\u00a4\7\63\2\2\u009e"+
		"\u009f\f\f\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\7"+
		"\17\2\2\u00a2\u00a4\3\2\2\2\u00a3y\3\2\2\2\u00a3|\3\2\2\2\u00a3\177\3"+
		"\2\2\2\u00a3\u0082\3\2\2\2\u00a3\u0085\3\2\2\2\u00a3\u0088\3\2\2\2\u00a3"+
		"\u008e\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009e\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00b7\7\16\2\2\u00a9\u00ae\5\n\6\2\u00aa\u00ab\7\4\2\2"+
		"\u00ab\u00ad\5\n\6\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4\5\n"+
		"\6\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5\n\6\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\17"+
		"\2\2\u00ba\r\3\2\2\2\u00bb\u00c4\7\6\2\2\u00bc\u00c1\5\20\t\2\u00bd\u00be"+
		"\7\4\2\2\u00be\u00c0\5\20\t\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\7\7\2\2\u00c7\17\3\2\2\2\u00c8\u00c9\7\63\2\2\u00c9\u00ca\7\f\2"+
		"\2\u00ca\u00cb\5\n\6\2\u00cb\21\3\2\2\2\u00cc\u00d7\5\26\f\2\u00cd\u00d7"+
		"\5\24\13\2\u00ce\u00d7\5\30\r\2\u00cf\u00d7\5\32\16\2\u00d0\u00d7\5\34"+
		"\17\2\u00d1\u00d7\5\36\20\2\u00d2\u00d7\5\"\22\2\u00d3\u00d7\5$\23\2\u00d4"+
		"\u00d7\5&\24\2\u00d5\u00d7\5(\25\2\u00d6\u00cc\3\2\2\2\u00d6\u00cd\3\2"+
		"\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7\23\3\2\2\2\u00d8\u00d9\5\n\6\2\u00d9\u00da"+
		"\7\21\2\2\u00da\u00db\5\n\6\2\u00db\u00dc\7\b\2\2\u00dc\25\3\2\2\2\u00dd"+
		"\u00e1\7\6\2\2\u00de\u00e0\5\22\n\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7\7\2\2\u00e5\27\3\2\2\2\u00e6\u00e7\7)\2\2"+
		"\u00e7\u00e8\7\3\2\2\u00e8\u00e9\5\n\6\2\u00e9\u00ea\7\5\2\2\u00ea\u00eb"+
		"\5\22\n\2\u00eb\31\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\7\3\2\2\u00ee"+
		"\u00ef\5\n\6\2\u00ef\u00f0\7\5\2\2\u00f0\u00f3\5\22\n\2\u00f1\u00f2\7"+
		",\2\2\u00f2\u00f4\5\22\n\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\33\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6\u00f7\5\n\6\2\u00f7\u00f8\7\b\2"+
		"\2\u00f8\35\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\5\n\6\2\u00fb\u00fc"+
		"\7\b\2\2\u00fc\37\3\2\2\2\u00fd\u00fe\7.\2\2\u00fe\u00ff\5\n\6\2\u00ff"+
		"\u0100\7\b\2\2\u0100!\3\2\2\2\u0101\u0102\5\n\6\2\u0102\u0103\7\22\2\2"+
		"\u0103#\3\2\2\2\u0104\u0105\5\n\6\2\u0105\u0106\7\23\2\2\u0106%\3\2\2"+
		"\2\u0107\u0108\7*\2\2\u0108\u0109\7\3\2\2\u0109\u010a\5\n\6\2\u010a\u010b"+
		"\7\f\2\2\u010b\u010c\5\n\6\2\u010c\u010d\7\5\2\2\u010d\u010e\5\22\n\2"+
		"\u010e\'\3\2\2\2\u010f\u0110\7*\2\2\u0110\u0111\7\3\2\2\u0111\u0112\5"+
		"\n\6\2\u0112\u0113\7\f\2\2\u0113\u0114\5\n\6\2\u0114\u0115\7\24\2\2\u0115"+
		"\u0118\5\n\6\2\u0116\u0117\7\25\2\2\u0117\u0119\5\n\6\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\5\2\2\u011b"+
		"\u011c\5\22\n\2\u011c)\3\2\2\2\27-\669=CIUw\u0095\u0098\u00a3\u00a5\u00ae"+
		"\u00b1\u00b7\u00c1\u00c4\u00d6\u00e1\u00f3\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}