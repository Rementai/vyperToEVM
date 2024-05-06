// Generated from VyperEVM.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VyperEVMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, LINE_COMMENT=5, BLOCK_COMMENT=6, NUMBER=7, 
		STRING=8, BOOL=9, IDENTIFIER=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, 
		LBRACK=15, RBRACK=16, COMMA=17, COLON=18, SEMICOLON=19, DOT=20, ASSIGN=21, 
		PLUS=22, MINUS=23, MUL=24, DIV=25, MOD=26, POW=27, AND=28, OR=29, NOT=30, 
		NEWLINE=31, INDENT=32, DEDENT=33, ESC=34;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simpleStatement = 2, RULE_compoundStatement = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_expression = 6, RULE_atomicExpression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simpleStatement", "compoundStatement", "ifStatement", 
			"whileStatement", "expression", "atomicExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", null, null, null, null, null, null, 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "':'", "';'", 
			"'.'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'and'", "'or'", 
			"'not'", null, "'    '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "LINE_COMMENT", "BLOCK_COMMENT", "NUMBER", 
			"STRING", "BOOL", "IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMA", "COLON", "SEMICOLON", "DOT", "ASSIGN", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "POW", "AND", "OR", "NOT", "NEWLINE", "INDENT", 
			"DEDENT", "ESC"
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
	public String getGrammarFileName() { return "VyperEVM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VyperEVMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1073745802L) != 0) );
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
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
			case BOOL:
			case IDENTIFIER:
			case LPAREN:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				simpleStatement();
				}
				break;
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				compoundStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(VyperEVMParser.SEMICOLON, 0); }
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			expression(0);
			setState(26);
			match(SEMICOLON);
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compoundStatement);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				ifStatement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				whileStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(VyperEVMParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VyperEVMParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VyperEVMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VyperEVMParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(VyperEVMParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(VyperEVMParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(VyperEVMParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(VyperEVMParser.DEDENT, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			expression(0);
			setState(34);
			match(COLON);
			setState(35);
			match(NEWLINE);
			setState(36);
			match(INDENT);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1073745802L) != 0) );
			setState(42);
			match(DEDENT);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(43);
				match(T__1);
				setState(44);
				match(COLON);
				setState(45);
				match(NEWLINE);
				setState(46);
				match(INDENT);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					statement();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1073745802L) != 0) );
				setState(52);
				match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VyperEVMParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(VyperEVMParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(VyperEVMParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(VyperEVMParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(57);
			expression(0);
			setState(58);
			match(COLON);
			setState(59);
			match(NEWLINE);
			setState(60);
			match(INDENT);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1073745802L) != 0) );
			setState(66);
			match(DEDENT);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<AtomicExpressionContext> atomicExpression() {
			return getRuleContexts(AtomicExpressionContext.class);
		}
		public AtomicExpressionContext atomicExpression(int i) {
			return getRuleContext(AtomicExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VyperEVMParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VyperEVMParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(VyperEVMParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VyperEVMParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(VyperEVMParser.MOD, 0); }
		public TerminalNode POW() { return getToken(VyperEVMParser.POW, 0); }
		public TerminalNode NOT() { return getToken(VyperEVMParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(VyperEVMParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VyperEVMParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(VyperEVMParser.AND, 0); }
		public TerminalNode OR() { return getToken(VyperEVMParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(69);
				atomicExpression();
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(70);
					match(PLUS);
					setState(71);
					atomicExpression();
					}
					break;
				case MINUS:
					{
					setState(72);
					match(MINUS);
					setState(73);
					atomicExpression();
					}
					break;
				case MUL:
					{
					setState(74);
					match(MUL);
					setState(75);
					atomicExpression();
					}
					break;
				case DIV:
					{
					setState(76);
					match(DIV);
					setState(77);
					atomicExpression();
					}
					break;
				case MOD:
					{
					setState(78);
					match(MOD);
					setState(79);
					atomicExpression();
					}
					break;
				case POW:
					{
					setState(80);
					match(POW);
					setState(81);
					atomicExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(84);
				match(NOT);
				setState(85);
				expression(5);
				}
				break;
			case 3:
				{
				setState(86);
				match(LPAREN);
				setState(87);
				expression(0);
				setState(88);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(90);
				atomicExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(AND);
						setState(95);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						match(OR);
						setState(98);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class AtomicExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VyperEVMParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(VyperEVMParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(VyperEVMParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VyperEVMParser.IDENTIFIER, 0); }
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperEVMListener ) ((VyperEVMListener)listener).exitAtomicExpression(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomicExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u001f\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\'\b\u0004"+
		"\u000b\u0004\f\u0004(\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u00041\b\u0004\u000b\u0004\f\u00042\u0001"+
		"\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005?\b\u0005\u000b"+
		"\u0005\f\u0005@\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006S\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006d\b"+
		"\u0006\n\u0006\f\u0006g\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000"+
		"\u0001\f\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000"+
		"\u0007\ns\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000"+
		"\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006\u001e\u0001\u0000"+
		"\u0000\u0000\b \u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\f["+
		"\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010\u0012\u0003"+
		"\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0018\u0003"+
		"\u0004\u0002\u0000\u0016\u0018\u0003\u0006\u0003\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0003\f\u0006\u0000\u001a\u001b\u0005\u0013"+
		"\u0000\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u001c\u001f\u0003\b\u0004"+
		"\u0000\u001d\u001f\u0003\n\u0005\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0007\u0001\u0000\u0000\u0000"+
		" !\u0005\u0001\u0000\u0000!\"\u0003\f\u0006\u0000\"#\u0005\u0012\u0000"+
		"\u0000#$\u0005\u001f\u0000\u0000$&\u0005 \u0000\u0000%\'\u0003\u0002\u0001"+
		"\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*6\u0005"+
		"!\u0000\u0000+,\u0005\u0002\u0000\u0000,-\u0005\u0012\u0000\u0000-.\u0005"+
		"\u001f\u0000\u0000.0\u0005 \u0000\u0000/1\u0003\u0002\u0001\u00000/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005!\u0000\u0000"+
		"57\u0001\u0000\u0000\u00006+\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007\t\u0001\u0000\u0000\u000089\u0005\u0003\u0000\u00009:\u0003\f"+
		"\u0006\u0000:;\u0005\u0012\u0000\u0000;<\u0005\u001f\u0000\u0000<>\u0005"+
		" \u0000\u0000=?\u0003\u0002\u0001\u0000>=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0005!\u0000\u0000C\u000b\u0001\u0000\u0000"+
		"\u0000DE\u0006\u0006\uffff\uffff\u0000ER\u0003\u000e\u0007\u0000FG\u0005"+
		"\u0016\u0000\u0000GS\u0003\u000e\u0007\u0000HI\u0005\u0017\u0000\u0000"+
		"IS\u0003\u000e\u0007\u0000JK\u0005\u0018\u0000\u0000KS\u0003\u000e\u0007"+
		"\u0000LM\u0005\u0019\u0000\u0000MS\u0003\u000e\u0007\u0000NO\u0005\u001a"+
		"\u0000\u0000OS\u0003\u000e\u0007\u0000PQ\u0005\u001b\u0000\u0000QS\u0003"+
		"\u000e\u0007\u0000RF\u0001\u0000\u0000\u0000RH\u0001\u0000\u0000\u0000"+
		"RJ\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000S\\\u0001\u0000\u0000\u0000TU\u0005\u001e"+
		"\u0000\u0000U\\\u0003\f\u0006\u0005VW\u0005\u000b\u0000\u0000WX\u0003"+
		"\f\u0006\u0000XY\u0005\f\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z\\\u0003"+
		"\u000e\u0007\u0000[D\u0001\u0000\u0000\u0000[T\u0001\u0000\u0000\u0000"+
		"[V\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\e\u0001\u0000\u0000"+
		"\u0000]^\n\u0004\u0000\u0000^_\u0005\u001c\u0000\u0000_d\u0003\f\u0006"+
		"\u0005`a\n\u0003\u0000\u0000ab\u0005\u001d\u0000\u0000bd\u0003\f\u0006"+
		"\u0004c]\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000dg\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\r\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0007\u0000\u0000\u0000"+
		"i\u000f\u0001\u0000\u0000\u0000\u000b\u0013\u0017\u001e(26@R[ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}