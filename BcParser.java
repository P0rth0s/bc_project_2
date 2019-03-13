// Generated from Bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, FLOAT=37, ID=38, OP=39, 
		END_EXPR=40, WS=41, COMMENT=42, COMMENT2=43, OR=44, AND=45, NOT=46, EQ=47, 
		LT=48, GT=49, NE=50;
	public static final int
		RULE_s = 0, RULE_exprList = 1, RULE_topExpr = 2, RULE_adv_expr = 3, RULE_boolean_expr = 4, 
		RULE_expr = 5, RULE_assignment_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "exprList", "topExpr", "adv_expr", "boolean_expr", "expr", "assignment_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if['", "'] then '", "'elif['", "'else'", "'while['", "'] do'", 
			"'done'", "'for['", "';'", "']'", "'('", "')'", "'++'", "'--'", "'-'", 
			"'^'", "'*'", "'/'", "'%'", "'+'", "'^='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'read()'", "'sqrt('", "'s('", "'c('", "'l('", "'e('", "','", 
			"'='", "'define'", "'return'", null, null, null, null, null, null, null, 
			"'||'", "'&&'", "'!'", "'=='", "'<'", "'>'", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "FLOAT", "ID", "OP", "END_EXPR", "WS", "COMMENT", "COMMENT2", "OR", 
			"AND", "NOT", "EQ", "LT", "GT", "NE"
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
	public String getGrammarFileName() { return "Bc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			exprList();
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

	public static class ExprListContext extends ParserRuleContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public List<TerminalNode> END_EXPR() { return getTokens(BcParser.END_EXPR); }
		public TerminalNode END_EXPR(int i) {
			return getToken(BcParser.END_EXPR, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			topExpr();
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(17);
					match(END_EXPR);
					setState(18);
					topExpr();
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_EXPR) {
				{
				setState(24);
				match(END_EXPR);
				}
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

	public static class TopExprContext extends ParserRuleContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Adv_exprContext adv_expr() {
			return getRuleContext(Adv_exprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitTopExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitTopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				boolean_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				adv_expr();
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

	public static class Adv_exprContext extends ParserRuleContext {
		public Adv_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adv_expr; }
	 
		public Adv_exprContext() { }
		public void copyFrom(Adv_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileLoopContext extends Adv_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public List<Adv_exprContext> adv_expr() {
			return getRuleContexts(Adv_exprContext.class);
		}
		public Adv_exprContext adv_expr(int i) {
			return getRuleContext(Adv_exprContext.class,i);
		}
		public WhileLoopContext(Adv_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetexprContext extends Adv_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetexprContext(Adv_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterRetexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitRetexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitRetexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends Adv_exprContext {
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public AssignmentContext(Adv_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends Adv_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public List<Adv_exprContext> adv_expr() {
			return getRuleContexts(Adv_exprContext.class);
		}
		public Adv_exprContext adv_expr(int i) {
			return getRuleContext(Adv_exprContext.class,i);
		}
		public ForLoopContext(Adv_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfLoopContext extends Adv_exprContext {
		public List<Boolean_exprContext> boolean_expr() {
			return getRuleContexts(Boolean_exprContext.class);
		}
		public Boolean_exprContext boolean_expr(int i) {
			return getRuleContext(Boolean_exprContext.class,i);
		}
		public List<Adv_exprContext> adv_expr() {
			return getRuleContexts(Adv_exprContext.class);
		}
		public Adv_exprContext adv_expr(int i) {
			return getRuleContext(Adv_exprContext.class,i);
		}
		public IfLoopContext(Adv_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterIfLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitIfLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitIfLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adv_exprContext adv_expr() throws RecognitionException {
		Adv_exprContext _localctx = new Adv_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_adv_expr);
		int _la;
		try {
			int _alt;
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new RetexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				assignment_expr();
				}
				break;
			case 3:
				_localctx = new IfLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__0);
				setState(34);
				boolean_expr();
				setState(35);
				match(T__1);
				setState(36);
				adv_expr();
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(37);
						match(T__2);
						setState(38);
						boolean_expr();
						setState(39);
						match(T__1);
						setState(40);
						adv_expr();
						}
						} 
					}
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(47);
					match(T__3);
					setState(48);
					adv_expr();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(T__4);
				setState(52);
				boolean_expr();
				setState(53);
				match(T__5);
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					adv_expr();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__34) | (1L << FLOAT) | (1L << ID))) != 0) );
				setState(59);
				match(T__6);
				}
				break;
			case 5:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(T__7);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(62);
					assignment_expr();
					setState(63);
					match(T__8);
					}
					break;
				}
				setState(67);
				boolean_expr();
				setState(68);
				match(T__8);
				setState(69);
				expr(0);
				setState(70);
				match(T__9);
				setState(72); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(71);
						adv_expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Boolean_exprContext extends ParserRuleContext {
		public int b;
		public Boolean_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expr; }
	 
		public Boolean_exprContext() { }
		public void copyFrom(Boolean_exprContext ctx) {
			super.copyFrom(ctx);
			this.b = ctx.b;
		}
	}
	public static class BooleanContext extends Boolean_exprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(BcParser.OR, 0); }
		public TerminalNode AND() { return getToken(BcParser.AND, 0); }
		public TerminalNode NOT() { return getToken(BcParser.NOT, 0); }
		public TerminalNode LT() { return getToken(BcParser.LT, 0); }
		public TerminalNode GT() { return getToken(BcParser.GT, 0); }
		public TerminalNode EQ() { return getToken(BcParser.EQ, 0); }
		public TerminalNode NE() { return getToken(BcParser.NE, 0); }
		public BooleanContext(Boolean_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolean_expr);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((BooleanContext)_localctx).el = expr(0);
				setState(79);
				((BooleanContext)_localctx).op = match(OR);
				setState(80);
				((BooleanContext)_localctx).er = expr(0);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((BooleanContext)_localctx).el = expr(0);
				setState(83);
				((BooleanContext)_localctx).op = match(AND);
				setState(84);
				((BooleanContext)_localctx).er = expr(0);
				}
				break;
			case 3:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				((BooleanContext)_localctx).op = match(NOT);
				setState(87);
				((BooleanContext)_localctx).el = expr(0);
				}
				break;
			case 4:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				expr(0);
				setState(89);
				((BooleanContext)_localctx).op = match(LT);
				setState(90);
				expr(0);
				}
				break;
			case 5:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				expr(0);
				setState(93);
				((BooleanContext)_localctx).op = match(GT);
				setState(94);
				expr(0);
				}
				break;
			case 6:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				expr(0);
				setState(97);
				((BooleanContext)_localctx).op = match(EQ);
				setState(98);
				expr(0);
				}
				break;
			case 7:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				expr(0);
				setState(101);
				((BooleanContext)_localctx).op = match(NE);
				setState(102);
				expr(0);
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
	public static class SubContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultSetContext extends ExprContext {
		public Token id;
		public Token op;
		public ExprContext er;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MultSetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterMultSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitMultSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitMultSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogContext extends ExprContext {
		public Token op;
		public ExprContext el;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends ExprContext {
		public Token op;
		public ExprContext el;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementContext extends ExprContext {
		public Token id;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public IncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModSetContext extends ExprContext {
		public Token id;
		public Token op;
		public ExprContext er;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ModSetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterModSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitModSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitModSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdvalContext extends ExprContext {
		public Token id;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public IdvalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterIdval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitIdval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitIdval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtContext extends ExprContext {
		public ExprContext el;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends ExprContext {
		public Token id;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(BcParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(BcParser.FLOAT, i);
		}
		public FunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowSetContext extends ExprContext {
		public Token id;
		public Token op;
		public ExprContext er;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PowSetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterPowSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitPowSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitPowSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubSetContext extends ExprContext {
		public Token id;
		public Token op;
		public ExprContext er;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubSetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterSubSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitSubSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitSubSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends ExprContext {
		public Token op;
		public ExprContext el;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends ExprContext {
		public ReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EContext extends ExprContext {
		public Token op;
		public ExprContext el;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext el;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FltContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(BcParser.FLOAT, 0); }
		public FltContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterFlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitFlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitFlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivSetContext extends ExprContext {
		public Token id;
		public Token op;
		public ExprContext er;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DivSetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterDivSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitDivSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitDivSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSetContext extends ExprContext {
		public Token id;
		public Token op;
		public ExprContext er;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddSetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterAddSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitAddSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitAddSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementContext extends ExprContext {
		public Token id;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public DecrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext el;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new FltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(107);
				match(FLOAT);
				}
				break;
			case 2:
				{
				_localctx = new IdvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				((IdvalContext)_localctx).id = match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__10);
				setState(110);
				((ParenthesisContext)_localctx).el = expr(0);
				setState(111);
				match(T__11);
				}
				break;
			case 4:
				{
				_localctx = new IncrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(T__12);
				setState(114);
				((IncrementContext)_localctx).id = match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IncrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				((IncrementContext)_localctx).id = match(ID);
				setState(116);
				match(T__12);
				}
				break;
			case 6:
				{
				_localctx = new DecrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(T__13);
				setState(118);
				((DecrementContext)_localctx).id = match(ID);
				}
				break;
			case 7:
				{
				_localctx = new DecrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				((DecrementContext)_localctx).id = match(ID);
				setState(120);
				match(T__13);
				}
				break;
			case 8:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(T__14);
				setState(122);
				((NegateContext)_localctx).el = expr(20);
				}
				break;
			case 9:
				{
				_localctx = new PowSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				((PowSetContext)_localctx).id = match(ID);
				setState(124);
				((PowSetContext)_localctx).op = match(T__20);
				setState(125);
				((PowSetContext)_localctx).er = expr(13);
				}
				break;
			case 10:
				{
				_localctx = new MultSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				((MultSetContext)_localctx).id = match(ID);
				setState(127);
				((MultSetContext)_localctx).op = match(T__21);
				setState(128);
				((MultSetContext)_localctx).er = expr(12);
				}
				break;
			case 11:
				{
				_localctx = new DivSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				((DivSetContext)_localctx).id = match(ID);
				setState(130);
				((DivSetContext)_localctx).op = match(T__22);
				setState(131);
				((DivSetContext)_localctx).er = expr(11);
				}
				break;
			case 12:
				{
				_localctx = new ModSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((ModSetContext)_localctx).id = match(ID);
				setState(133);
				((ModSetContext)_localctx).op = match(T__23);
				setState(134);
				((ModSetContext)_localctx).er = expr(10);
				}
				break;
			case 13:
				{
				_localctx = new AddSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				((AddSetContext)_localctx).id = match(ID);
				setState(136);
				((AddSetContext)_localctx).op = match(T__24);
				setState(137);
				((AddSetContext)_localctx).er = expr(9);
				}
				break;
			case 14:
				{
				_localctx = new SubSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				((SubSetContext)_localctx).id = match(ID);
				setState(139);
				((SubSetContext)_localctx).op = match(T__25);
				setState(140);
				((SubSetContext)_localctx).er = expr(8);
				}
				break;
			case 15:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(T__26);
				}
				break;
			case 16:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(T__27);
				setState(143);
				((SqrtContext)_localctx).el = expr(0);
				setState(144);
				match(T__11);
				}
				break;
			case 17:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				((SinContext)_localctx).op = match(T__28);
				setState(147);
				((SinContext)_localctx).el = expr(0);
				setState(148);
				match(T__11);
				}
				break;
			case 18:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				((CosContext)_localctx).op = match(T__29);
				setState(151);
				((CosContext)_localctx).el = expr(0);
				setState(152);
				match(T__11);
				}
				break;
			case 19:
				{
				_localctx = new LogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				((LogContext)_localctx).op = match(T__30);
				setState(155);
				((LogContext)_localctx).el = expr(0);
				setState(156);
				match(T__11);
				}
				break;
			case 20:
				{
				_localctx = new EContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				((EContext)_localctx).op = match(T__31);
				setState(159);
				((EContext)_localctx).el = expr(0);
				setState(160);
				match(T__11);
				}
				break;
			case 21:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				((FunctionContext)_localctx).id = match(ID);
				setState(163);
				match(T__10);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FLOAT) {
					{
					setState(164);
					match(FLOAT);
					}
				}

				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(167);
					match(T__32);
					setState(168);
					match(FLOAT);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__11);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(178);
						((PowContext)_localctx).op = match(T__15);
						setState(179);
						((PowContext)_localctx).er = expr(20);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						((MultContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(181);
						((MultContext)_localctx).op = match(T__16);
						setState(182);
						((MultContext)_localctx).er = expr(19);
						}
						break;
					case 3:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						((DivContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(184);
						((DivContext)_localctx).op = match(T__17);
						setState(185);
						((DivContext)_localctx).er = expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						((ModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(187);
						((ModContext)_localctx).op = match(T__18);
						setState(188);
						((ModContext)_localctx).er = expr(17);
						}
						break;
					case 5:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(190);
						((AddContext)_localctx).op = match(T__19);
						setState(191);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						((SubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(193);
						((SubContext)_localctx).op = match(T__14);
						setState(194);
						((SubContext)_localctx).er = expr(15);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Assignment_exprContext extends ParserRuleContext {
		public Assignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expr; }
	 
		public Assignment_exprContext() { }
		public void copyFrom(Assignment_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefineFuncContext extends Assignment_exprContext {
		public Token id;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(BcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BcParser.ID, i);
		}
		public List<Adv_exprContext> adv_expr() {
			return getRuleContexts(Adv_exprContext.class);
		}
		public Adv_exprContext adv_expr(int i) {
			return getRuleContext(Adv_exprContext.class,i);
		}
		public DefineFuncContext(Assignment_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterDefineFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitDefineFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitDefineFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineVarContext extends Assignment_exprContext {
		public Token id;
		public ExprContext er;
		public TerminalNode ID() { return getToken(BcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefineVarContext(Assignment_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).enterDefineVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcListener ) ((BcListener)listener).exitDefineVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcVisitor ) return ((BcVisitor<? extends T>)visitor).visitDefineVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_exprContext assignment_expr() throws RecognitionException {
		Assignment_exprContext _localctx = new Assignment_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment_expr);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new DefineVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((DefineVarContext)_localctx).id = match(ID);
				setState(201);
				match(T__33);
				setState(202);
				((DefineVarContext)_localctx).er = expr(0);
				}
				break;
			case T__34:
				_localctx = new DefineFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__34);
				setState(204);
				((DefineFuncContext)_localctx).id = match(ID);
				setState(205);
				match(T__10);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(206);
					match(ID);
					}
				}

				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(209);
					match(T__32);
					setState(210);
					match(ID);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(T__11);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__34) | (1L << FLOAT) | (1L << ID))) != 0)) {
					{
					{
					setState(217);
					adv_expr();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(T__35);
				setState(224);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\7"+
		"\3\26\n\3\f\3\16\3\31\13\3\3\3\5\3\34\n\3\3\4\3\4\5\4 \n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5\3\5\5\5"+
		"\64\n\5\3\5\3\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"D\n\5\3\5\3\5\3\5\3\5\3\5\6\5K\n\5\r\5\16\5L\5\5O\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a8\n\7\3"+
		"\7\3\7\7\7\u00ac\n\7\f\7\16\7\u00af\13\7\3\7\5\7\u00b2\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c6"+
		"\n\7\f\7\16\7\u00c9\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d2\n\b\3\b"+
		"\3\b\7\b\u00d6\n\b\f\b\16\b\u00d9\13\b\3\b\3\b\7\b\u00dd\n\b\f\b\16\b"+
		"\u00e0\13\b\3\b\3\b\5\b\u00e4\n\b\3\b\2\3\f\t\2\4\6\b\n\f\16\2\2\2\u0110"+
		"\2\20\3\2\2\2\4\22\3\2\2\2\6\37\3\2\2\2\bN\3\2\2\2\nj\3\2\2\2\f\u00b1"+
		"\3\2\2\2\16\u00e3\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\27\5\6\4\2\23"+
		"\24\7*\2\2\24\26\5\6\4\2\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\32\34\7*\2\2\33\32\3\2\2\2\33"+
		"\34\3\2\2\2\34\5\3\2\2\2\35 \5\n\6\2\36 \5\b\5\2\37\35\3\2\2\2\37\36\3"+
		"\2\2\2 \7\3\2\2\2!O\5\f\7\2\"O\5\16\b\2#$\7\3\2\2$%\5\n\6\2%&\7\4\2\2"+
		"&.\5\b\5\2\'(\7\5\2\2()\5\n\6\2)*\7\4\2\2*+\5\b\5\2+-\3\2\2\2,\'\3\2\2"+
		"\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\63\3\2\2\2\60.\3\2\2\2\61\62\7\6\2"+
		"\2\62\64\5\b\5\2\63\61\3\2\2\2\63\64\3\2\2\2\64O\3\2\2\2\65\66\7\7\2\2"+
		"\66\67\5\n\6\2\679\7\b\2\28:\5\b\5\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<=\3\2\2\2=>\7\t\2\2>O\3\2\2\2?C\7\n\2\2@A\5\16\b\2AB\7\13\2\2B"+
		"D\3\2\2\2C@\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\n\6\2FG\7\13\2\2GH\5\f\7\2"+
		"HJ\7\f\2\2IK\5\b\5\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2"+
		"N!\3\2\2\2N\"\3\2\2\2N#\3\2\2\2N\65\3\2\2\2N?\3\2\2\2O\t\3\2\2\2PQ\5\f"+
		"\7\2QR\7.\2\2RS\5\f\7\2Sk\3\2\2\2TU\5\f\7\2UV\7/\2\2VW\5\f\7\2Wk\3\2\2"+
		"\2XY\7\60\2\2Yk\5\f\7\2Z[\5\f\7\2[\\\7\62\2\2\\]\5\f\7\2]k\3\2\2\2^_\5"+
		"\f\7\2_`\7\63\2\2`a\5\f\7\2ak\3\2\2\2bc\5\f\7\2cd\7\61\2\2de\5\f\7\2e"+
		"k\3\2\2\2fg\5\f\7\2gh\7\64\2\2hi\5\f\7\2ik\3\2\2\2jP\3\2\2\2jT\3\2\2\2"+
		"jX\3\2\2\2jZ\3\2\2\2j^\3\2\2\2jb\3\2\2\2jf\3\2\2\2k\13\3\2\2\2lm\b\7\1"+
		"\2m\u00b2\7\'\2\2n\u00b2\7(\2\2op\7\r\2\2pq\5\f\7\2qr\7\16\2\2r\u00b2"+
		"\3\2\2\2st\7\17\2\2t\u00b2\7(\2\2uv\7(\2\2v\u00b2\7\17\2\2wx\7\20\2\2"+
		"x\u00b2\7(\2\2yz\7(\2\2z\u00b2\7\20\2\2{|\7\21\2\2|\u00b2\5\f\7\26}~\7"+
		"(\2\2~\177\7\27\2\2\177\u00b2\5\f\7\17\u0080\u0081\7(\2\2\u0081\u0082"+
		"\7\30\2\2\u0082\u00b2\5\f\7\16\u0083\u0084\7(\2\2\u0084\u0085\7\31\2\2"+
		"\u0085\u00b2\5\f\7\r\u0086\u0087\7(\2\2\u0087\u0088\7\32\2\2\u0088\u00b2"+
		"\5\f\7\f\u0089\u008a\7(\2\2\u008a\u008b\7\33\2\2\u008b\u00b2\5\f\7\13"+
		"\u008c\u008d\7(\2\2\u008d\u008e\7\34\2\2\u008e\u00b2\5\f\7\n\u008f\u00b2"+
		"\7\35\2\2\u0090\u0091\7\36\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7\16\2"+
		"\2\u0093\u00b2\3\2\2\2\u0094\u0095\7\37\2\2\u0095\u0096\5\f\7\2\u0096"+
		"\u0097\7\16\2\2\u0097\u00b2\3\2\2\2\u0098\u0099\7 \2\2\u0099\u009a\5\f"+
		"\7\2\u009a\u009b\7\16\2\2\u009b\u00b2\3\2\2\2\u009c\u009d\7!\2\2\u009d"+
		"\u009e\5\f\7\2\u009e\u009f\7\16\2\2\u009f\u00b2\3\2\2\2\u00a0\u00a1\7"+
		"\"\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\16\2\2\u00a3\u00b2\3\2\2\2\u00a4"+
		"\u00a5\7(\2\2\u00a5\u00a7\7\r\2\2\u00a6\u00a8\7\'\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa"+
		"\u00ac\7\'\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b2\7\16\2\2\u00b1l\3\2\2\2\u00b1n\3\2\2\2\u00b1o\3\2\2\2\u00b1s\3"+
		"\2\2\2\u00b1u\3\2\2\2\u00b1w\3\2\2\2\u00b1y\3\2\2\2\u00b1{\3\2\2\2\u00b1"+
		"}\3\2\2\2\u00b1\u0080\3\2\2\2\u00b1\u0083\3\2\2\2\u00b1\u0086\3\2\2\2"+
		"\u00b1\u0089\3\2\2\2\u00b1\u008c\3\2\2\2\u00b1\u008f\3\2\2\2\u00b1\u0090"+
		"\3\2\2\2\u00b1\u0094\3\2\2\2\u00b1\u0098\3\2\2\2\u00b1\u009c\3\2\2\2\u00b1"+
		"\u00a0\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b2\u00c7\3\2\2\2\u00b3\u00b4\f\25"+
		"\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00c6\5\f\7\26\u00b6\u00b7\f\24\2\2\u00b7"+
		"\u00b8\7\23\2\2\u00b8\u00c6\5\f\7\25\u00b9\u00ba\f\23\2\2\u00ba\u00bb"+
		"\7\24\2\2\u00bb\u00c6\5\f\7\24\u00bc\u00bd\f\22\2\2\u00bd\u00be\7\25\2"+
		"\2\u00be\u00c6\5\f\7\23\u00bf\u00c0\f\21\2\2\u00c0\u00c1\7\26\2\2\u00c1"+
		"\u00c6\5\f\7\22\u00c2\u00c3\f\20\2\2\u00c3\u00c4\7\21\2\2\u00c4\u00c6"+
		"\5\f\7\21\u00c5\u00b3\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00b9\3\2\2\2"+
		"\u00c5\u00bc\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\r\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7$\2\2\u00cc\u00e4\5\f\7"+
		"\2\u00cd\u00ce\7%\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d1\7\r\2\2\u00d0\u00d2"+
		"\7(\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\3\2\2\2\u00d3"+
		"\u00d4\7#\2\2\u00d4\u00d6\7(\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00de\7\16\2\2\u00db\u00dd\5\b\5\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7&\2\2\u00e2\u00e4\5\f\7\2\u00e3"+
		"\u00ca\3\2\2\2\u00e3\u00cd\3\2\2\2\u00e4\17\3\2\2\2\25\27\33\37.\63;C"+
		"LNj\u00a7\u00ad\u00b1\u00c5\u00c7\u00d1\u00d7\u00de\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}