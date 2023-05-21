package eapli.base.grammarutils;// Generated from C:/Users/David/OneDrive/Documentos/ISEP/2�Ano/SEM2/LAPR4/PI/sem4pi-22-23-24/base.core/src/main/antlr4\FormativeExamGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FormativeExamGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NEWLINE=18, SPACE=19, WORD=20, COLON=21, DASH=22, INT=23, ANY_CHAR=24, 
		MISSING_WORD=25;
	public static final int
		RULE_prog = 0, RULE_header = 1, RULE_points = 2, RULE_phrase = 3, RULE_middle_phrase = 4, 
		RULE_list_with_title = 5, RULE_title_list = 6, RULE_list = 7, RULE_topic_list = 8, 
		RULE_feedback = 9, RULE_question = 10, RULE_multiple_choice_question = 11, 
		RULE_multiple_choice_solution = 12, RULE_matching_type_question = 13, 
		RULE_matching_type_solution = 14, RULE_true_false_question = 15, RULE_true_false_solution = 16, 
		RULE_select_missing_words = 17, RULE_missing_word_question = 18, RULE_missing_word_solution = 19, 
		RULE_list_phrases = 20, RULE_short_answer_question = 21, RULE_short_answer_solution = 22, 
		RULE_numerical_question = 23, RULE_numerical_answer = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "header", "points", "phrase", "middle_phrase", "list_with_title", 
			"title_list", "list", "topic_list", "feedback", "question", "multiple_choice_question", 
			"multiple_choice_solution", "matching_type_question", "matching_type_solution", 
			"true_false_question", "true_false_solution", "select_missing_words", 
			"missing_word_question", "missing_word_solution", "list_phrases", "short_answer_question", 
			"short_answer_solution", "numerical_question", "numerical_answer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Header: '", "'('", "'pts)'", "'Feedback: '", "'Multiple Choice'", 
			"'Solution: '", "'Matching Type'", "'Solution:'", "'True/False Question'", 
			"'T'", "'F'", "'t'", "'f'", "'Select Missing Words'", "','", "'Short Answer'", 
			"'Numerical'", null, "' '", null, "':'", "'-'", null, null, "'||WORD||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NEWLINE", "SPACE", "WORD", "COLON", 
			"DASH", "INT", "ANY_CHAR", "MISSING_WORD"
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
	public String getGrammarFileName() { return "FormativeExamGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FormativeExamGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			header();
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(NEWLINE);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(56);
			question();
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(58);
				match(NEWLINE);
				}
				}
				setState(63);
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
	public static class HeaderContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			phrase();
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
	public static class PointsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FormativeExamGrammarParser.INT, 0); }
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitPoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitPoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_points);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__1);
			setState(68);
			match(INT);
			setState(69);
			match(T__2);
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
	public static class PhraseContext extends ParserRuleContext {
		public List<TerminalNode> ANY_CHAR() { return getTokens(FormativeExamGrammarParser.ANY_CHAR); }
		public TerminalNode ANY_CHAR(int i) {
			return getToken(FormativeExamGrammarParser.ANY_CHAR, i);
		}
		public List<TerminalNode> WORD() { return getTokens(FormativeExamGrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(FormativeExamGrammarParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(FormativeExamGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FormativeExamGrammarParser.INT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(FormativeExamGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(FormativeExamGrammarParser.SPACE, i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_phrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANY_CHAR) {
				{
				{
				setState(71);
				match(ANY_CHAR);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(77);
						match(SPACE);
						}
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(83);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==INT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(87);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==SPACE) {
								{
								{
								setState(84);
								match(SPACE);
								}
								}
								setState(89);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(91); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(90);
									match(ANY_CHAR);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(93); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							} 
						}
						setState(99);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Middle_phraseContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(FormativeExamGrammarParser.SPACE, 0); }
		public Middle_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_middle_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterMiddle_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitMiddle_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitMiddle_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Middle_phraseContext middle_phrase() throws RecognitionException {
		Middle_phraseContext _localctx = new Middle_phraseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_middle_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			phrase();
			setState(105);
			match(SPACE);
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
	public static class List_with_titleContext extends ParserRuleContext {
		public Title_listContext title_list() {
			return getRuleContext(Title_listContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_with_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_with_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterList_with_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitList_with_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitList_with_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_with_titleContext list_with_title() throws RecognitionException {
		List_with_titleContext _localctx = new List_with_titleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_with_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			title_list();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(108);
				list();
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
	public static class Title_listContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FormativeExamGrammarParser.COLON, 0); }
		public List<TerminalNode> SPACE() { return getTokens(FormativeExamGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(FormativeExamGrammarParser.SPACE, i);
		}
		public Title_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterTitle_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitTitle_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitTitle_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Title_listContext title_list() throws RecognitionException {
		Title_listContext _localctx = new Title_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_title_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(SPACE);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(117);
			phrase();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(118);
				match(SPACE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(COLON);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(SPACE);
					}
					} 
				}
				setState(130);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<Topic_listContext> topic_list() {
			return getRuleContexts(Topic_listContext.class);
		}
		public Topic_listContext topic_list(int i) {
			return getRuleContext(Topic_listContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
					topic_list();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Topic_listContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(FormativeExamGrammarParser.DASH, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public Topic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topic_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterTopic_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitTopic_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitTopic_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Topic_listContext topic_list() throws RecognitionException {
		Topic_listContext _localctx = new Topic_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_topic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(NEWLINE);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(141);
			match(DASH);
			setState(142);
			phrase();
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
	public static class FeedbackContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public FeedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterFeedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitFeedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitFeedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackContext feedback() throws RecognitionException {
		FeedbackContext _localctx = new FeedbackContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_feedback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__3);
			setState(145);
			phrase();
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
	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(FormativeExamGrammarParser.NEWLINE, 0); }
		public List<Matching_type_questionContext> matching_type_question() {
			return getRuleContexts(Matching_type_questionContext.class);
		}
		public Matching_type_questionContext matching_type_question(int i) {
			return getRuleContext(Matching_type_questionContext.class,i);
		}
		public List<Matching_type_solutionContext> matching_type_solution() {
			return getRuleContexts(Matching_type_solutionContext.class);
		}
		public Matching_type_solutionContext matching_type_solution(int i) {
			return getRuleContext(Matching_type_solutionContext.class,i);
		}
		public List<Select_missing_wordsContext> select_missing_words() {
			return getRuleContexts(Select_missing_wordsContext.class);
		}
		public Select_missing_wordsContext select_missing_words(int i) {
			return getRuleContext(Select_missing_wordsContext.class,i);
		}
		public List<Missing_word_solutionContext> missing_word_solution() {
			return getRuleContexts(Missing_word_solutionContext.class);
		}
		public Missing_word_solutionContext missing_word_solution(int i) {
			return getRuleContext(Missing_word_solutionContext.class,i);
		}
		public List<True_false_questionContext> true_false_question() {
			return getRuleContexts(True_false_questionContext.class);
		}
		public True_false_questionContext true_false_question(int i) {
			return getRuleContext(True_false_questionContext.class,i);
		}
		public List<True_false_solutionContext> true_false_solution() {
			return getRuleContexts(True_false_solutionContext.class);
		}
		public True_false_solutionContext true_false_solution(int i) {
			return getRuleContext(True_false_solutionContext.class,i);
		}
		public List<Multiple_choice_questionContext> multiple_choice_question() {
			return getRuleContexts(Multiple_choice_questionContext.class);
		}
		public Multiple_choice_questionContext multiple_choice_question(int i) {
			return getRuleContext(Multiple_choice_questionContext.class,i);
		}
		public List<Multiple_choice_solutionContext> multiple_choice_solution() {
			return getRuleContexts(Multiple_choice_solutionContext.class);
		}
		public Multiple_choice_solutionContext multiple_choice_solution(int i) {
			return getRuleContext(Multiple_choice_solutionContext.class,i);
		}
		public List<Short_answer_questionContext> short_answer_question() {
			return getRuleContexts(Short_answer_questionContext.class);
		}
		public Short_answer_questionContext short_answer_question(int i) {
			return getRuleContext(Short_answer_questionContext.class,i);
		}
		public List<Short_answer_solutionContext> short_answer_solution() {
			return getRuleContexts(Short_answer_solutionContext.class);
		}
		public Short_answer_solutionContext short_answer_solution(int i) {
			return getRuleContext(Short_answer_solutionContext.class,i);
		}
		public List<Numerical_questionContext> numerical_question() {
			return getRuleContexts(Numerical_questionContext.class);
		}
		public Numerical_questionContext numerical_question(int i) {
			return getRuleContext(Numerical_questionContext.class,i);
		}
		public List<Numerical_answerContext> numerical_answer() {
			return getRuleContexts(Numerical_answerContext.class);
		}
		public Numerical_answerContext numerical_answer(int i) {
			return getRuleContext(Numerical_answerContext.class,i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_question);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					matching_type_question();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(152);
				match(NEWLINE);
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					matching_type_solution();
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__7 );
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					select_missing_words();
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__13 );
				setState(163);
				match(NEWLINE);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					missing_word_solution();
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					true_false_question();
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(174);
				match(NEWLINE);
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					true_false_solution();
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					multiple_choice_question();
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(185);
				match(NEWLINE);
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					multiple_choice_solution();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(191);
					short_answer_question();
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__15 );
				setState(196);
				match(NEWLINE);
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					short_answer_solution();
					}
					}
					setState(200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					numerical_question();
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__16 );
				setState(207);
				match(NEWLINE);
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208);
					numerical_answer();
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
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
	public static class Multiple_choice_questionContext extends ParserRuleContext {
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List_with_titleContext list_with_title() {
			return getRuleContext(List_with_titleContext.class,0);
		}
		public Multiple_choice_solutionContext multiple_choice_solution() {
			return getRuleContext(Multiple_choice_solutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public Multiple_choice_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterMultiple_choice_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitMultiple_choice_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitMultiple_choice_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_questionContext multiple_choice_question() throws RecognitionException {
		Multiple_choice_questionContext _localctx = new Multiple_choice_questionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiple_choice_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__4);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				match(NEWLINE);
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(221);
			points();
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(NEWLINE);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(227);
			phrase();
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				match(NEWLINE);
				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(233);
			list_with_title();
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				match(NEWLINE);
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(239);
			multiple_choice_solution();
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					match(NEWLINE);
					}
					}
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(245);
				feedback();
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
	public static class Multiple_choice_solutionContext extends ParserRuleContext {
		public List_phrasesContext list_phrases() {
			return getRuleContext(List_phrasesContext.class,0);
		}
		public Multiple_choice_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterMultiple_choice_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitMultiple_choice_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitMultiple_choice_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_solutionContext multiple_choice_solution() throws RecognitionException {
		Multiple_choice_solutionContext _localctx = new Multiple_choice_solutionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiple_choice_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__5);
			setState(249);
			list_phrases();
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
	public static class Matching_type_questionContext extends ParserRuleContext {
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<List_with_titleContext> list_with_title() {
			return getRuleContexts(List_with_titleContext.class);
		}
		public List_with_titleContext list_with_title(int i) {
			return getRuleContext(List_with_titleContext.class,i);
		}
		public Matching_type_solutionContext matching_type_solution() {
			return getRuleContext(Matching_type_solutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public Matching_type_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_type_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterMatching_type_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitMatching_type_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitMatching_type_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_type_questionContext matching_type_question() throws RecognitionException {
		Matching_type_questionContext _localctx = new Matching_type_questionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matching_type_question);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__6);
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				match(NEWLINE);
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(257);
			points();
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				match(NEWLINE);
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(263);
			phrase();
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264);
				match(NEWLINE);
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(269);
			list_with_title();
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(270);
				match(NEWLINE);
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(275);
			list_with_title();
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				match(NEWLINE);
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(281);
			matching_type_solution();
			setState(283); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(282);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(287);
					match(NEWLINE);
					}
					}
					setState(290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(292);
				feedback();
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
	public static class Matching_type_solutionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> DASH() { return getTokens(FormativeExamGrammarParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(FormativeExamGrammarParser.DASH, i);
		}
		public Matching_type_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_type_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterMatching_type_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitMatching_type_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitMatching_type_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_type_solutionContext matching_type_solution() throws RecognitionException {
		Matching_type_solutionContext _localctx = new Matching_type_solutionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_matching_type_solution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__7);
			setState(301); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(296);
					match(NEWLINE);
					setState(297);
					phrase();
					setState(298);
					match(DASH);
					setState(299);
					phrase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(303); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class True_false_questionContext extends ParserRuleContext {
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public True_false_solutionContext true_false_solution() {
			return getRuleContext(True_false_solutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public True_false_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterTrue_false_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitTrue_false_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitTrue_false_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_false_questionContext true_false_question() throws RecognitionException {
		True_false_questionContext _localctx = new True_false_questionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_true_false_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__8);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				match(NEWLINE);
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(311);
			points();
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				match(NEWLINE);
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(317);
			phrase();
			setState(319); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(318);
				match(NEWLINE);
				}
				}
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(323);
			true_false_solution();
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(324);
					match(NEWLINE);
					}
					}
					setState(327); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(329);
				feedback();
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
	public static class True_false_solutionContext extends ParserRuleContext {
		public True_false_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterTrue_false_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitTrue_false_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitTrue_false_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_false_solutionContext true_false_solution() throws RecognitionException {
		True_false_solutionContext _localctx = new True_false_solutionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_true_false_solution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__5);
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Select_missing_wordsContext extends ParserRuleContext {
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public Missing_word_questionContext missing_word_question() {
			return getRuleContext(Missing_word_questionContext.class,0);
		}
		public Missing_word_solutionContext missing_word_solution() {
			return getRuleContext(Missing_word_solutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public List<List_with_titleContext> list_with_title() {
			return getRuleContexts(List_with_titleContext.class);
		}
		public List_with_titleContext list_with_title(int i) {
			return getRuleContext(List_with_titleContext.class,i);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public Select_missing_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_missing_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterSelect_missing_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitSelect_missing_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitSelect_missing_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_missing_wordsContext select_missing_words() throws RecognitionException {
		Select_missing_wordsContext _localctx = new Select_missing_wordsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select_missing_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__13);
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				match(NEWLINE);
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(341);
			points();
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342);
				match(NEWLINE);
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(347);
			phrase();
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				match(NEWLINE);
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(353);
			missing_word_question();
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(354);
				match(NEWLINE);
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				list_with_title();
				}
				}
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 26738688L) != 0) );
			setState(365); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(364);
				match(NEWLINE);
				}
				}
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(369);
			missing_word_solution();
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(370);
					match(NEWLINE);
					}
					}
					setState(373); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(375);
				feedback();
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
	public static class Missing_word_questionContext extends ParserRuleContext {
		public List<TerminalNode> MISSING_WORD() { return getTokens(FormativeExamGrammarParser.MISSING_WORD); }
		public TerminalNode MISSING_WORD(int i) {
			return getToken(FormativeExamGrammarParser.MISSING_WORD, i);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<Middle_phraseContext> middle_phrase() {
			return getRuleContexts(Middle_phraseContext.class);
		}
		public Middle_phraseContext middle_phrase(int i) {
			return getRuleContext(Middle_phraseContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(FormativeExamGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(FormativeExamGrammarParser.SPACE, i);
		}
		public Missing_word_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_word_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterMissing_word_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitMissing_word_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitMissing_word_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_word_questionContext missing_word_question() throws RecognitionException {
		Missing_word_questionContext _localctx = new Missing_word_questionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_missing_word_question);
		int _la;
		try {
			int _alt;
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(MISSING_WORD);
				setState(379);
				phrase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26738688L) != 0)) {
					{
					setState(380);
					middle_phrase();
					}
				}

				setState(383);
				match(MISSING_WORD);
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(384);
						match(SPACE);
						setState(385);
						match(MISSING_WORD);
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(391);
						middle_phrase();
						setState(400);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MISSING_WORD) {
							{
							setState(392);
							match(MISSING_WORD);
							setState(397);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(393);
									match(SPACE);
									setState(394);
									match(MISSING_WORD);
									}
									} 
								}
								setState(399);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
							}
							}
						}

						}
						} 
					}
					setState(406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26738688L) != 0)) {
					{
					setState(407);
					phrase();
					}
				}

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
	public static class Missing_word_solutionContext extends ParserRuleContext {
		public List_phrasesContext list_phrases() {
			return getRuleContext(List_phrasesContext.class,0);
		}
		public Missing_word_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_word_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterMissing_word_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitMissing_word_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitMissing_word_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_word_solutionContext missing_word_solution() throws RecognitionException {
		Missing_word_solutionContext _localctx = new Missing_word_solutionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_missing_word_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__5);
			setState(413);
			list_phrases();
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
	public static class List_phrasesContext extends ParserRuleContext {
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List_phrasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_phrases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterList_phrases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitList_phrases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitList_phrases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_phrasesContext list_phrases() throws RecognitionException {
		List_phrasesContext _localctx = new List_phrasesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_phrases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			phrase();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(416);
				match(T__14);
				setState(417);
				phrase();
				}
				}
				setState(422);
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
	public static class Short_answer_questionContext extends ParserRuleContext {
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public Short_answer_solutionContext short_answer_solution() {
			return getRuleContext(Short_answer_solutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public Short_answer_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_answer_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterShort_answer_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitShort_answer_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitShort_answer_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_answer_questionContext short_answer_question() throws RecognitionException {
		Short_answer_questionContext _localctx = new Short_answer_questionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_short_answer_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__15);
			setState(425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				match(NEWLINE);
				}
				}
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(429);
			points();
			setState(431); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(430);
				match(NEWLINE);
				}
				}
				setState(433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(435);
			phrase();
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(436);
				match(NEWLINE);
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(441);
			short_answer_solution();
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(442);
					match(NEWLINE);
					}
					}
					setState(445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(447);
				feedback();
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
	public static class Short_answer_solutionContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public Short_answer_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_answer_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterShort_answer_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitShort_answer_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitShort_answer_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_answer_solutionContext short_answer_solution() throws RecognitionException {
		Short_answer_solutionContext _localctx = new Short_answer_solutionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_short_answer_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__5);
			setState(451);
			phrase();
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
	public static class Numerical_questionContext extends ParserRuleContext {
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public Numerical_answerContext numerical_answer() {
			return getRuleContext(Numerical_answerContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FormativeExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FormativeExamGrammarParser.NEWLINE, i);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public Numerical_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterNumerical_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitNumerical_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitNumerical_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_questionContext numerical_question() throws RecognitionException {
		Numerical_questionContext _localctx = new Numerical_questionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numerical_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__16);
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				match(NEWLINE);
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(459);
			points();
			setState(461); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(460);
				match(NEWLINE);
				}
				}
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(465);
			phrase();
			setState(467); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				match(NEWLINE);
				}
				}
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(471);
			numerical_answer();
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(472);
					match(NEWLINE);
					}
					}
					setState(475); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(477);
				feedback();
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
	public static class Numerical_answerContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(FormativeExamGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FormativeExamGrammarParser.INT, i);
		}
		public TerminalNode SPACE() { return getToken(FormativeExamGrammarParser.SPACE, 0); }
		public TerminalNode WORD() { return getToken(FormativeExamGrammarParser.WORD, 0); }
		public Numerical_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).enterNumerical_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormativeExamGrammarListener ) ((FormativeExamGrammarListener)listener).exitNumerical_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormativeExamGrammarVisitor ) return ((FormativeExamGrammarVisitor<? extends T>)visitor).visitNumerical_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_answerContext numerical_answer() throws RecognitionException {
		Numerical_answerContext _localctx = new Numerical_answerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numerical_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__5);
			setState(481);
			match(INT);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(482);
				match(T__14);
				setState(483);
				match(INT);
				}
			}

			setState(486);
			match(SPACE);
			setState(487);
			match(WORD);
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
		"\u0004\u0001\u0019\u01ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0001\u0000\u0004\u00005\b\u0000\u000b\u0000\f\u0000"+
		"6\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003"+
		"L\t\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003\f\u0003Y\t\u0003\u0001"+
		"\u0003\u0004\u0003\\\b\u0003\u000b\u0003\f\u0003]\u0005\u0003`\b\u0003"+
		"\n\u0003\f\u0003c\t\u0003\u0004\u0003e\b\u0003\u000b\u0003\f\u0003f\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005n\b"+
		"\u0005\u0001\u0006\u0005\u0006q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006x\b\u0006\n\u0006\f\u0006{\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u007f\b\u0006\n\u0006\f\u0006\u0082\t\u0006"+
		"\u0001\u0007\u0004\u0007\u0085\b\u0007\u000b\u0007\f\u0007\u0086\u0001"+
		"\b\u0004\b\u008a\b\b\u000b\b\f\b\u008b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0004\n\u0095\b\n\u000b\n\f\n\u0096\u0001\n\u0001"+
		"\n\u0004\n\u009b\b\n\u000b\n\f\n\u009c\u0001\n\u0004\n\u00a0\b\n\u000b"+
		"\n\f\n\u00a1\u0001\n\u0001\n\u0004\n\u00a6\b\n\u000b\n\f\n\u00a7\u0001"+
		"\n\u0004\n\u00ab\b\n\u000b\n\f\n\u00ac\u0001\n\u0001\n\u0004\n\u00b1\b"+
		"\n\u000b\n\f\n\u00b2\u0001\n\u0004\n\u00b6\b\n\u000b\n\f\n\u00b7\u0001"+
		"\n\u0001\n\u0004\n\u00bc\b\n\u000b\n\f\n\u00bd\u0001\n\u0004\n\u00c1\b"+
		"\n\u000b\n\f\n\u00c2\u0001\n\u0001\n\u0004\n\u00c7\b\n\u000b\n\f\n\u00c8"+
		"\u0001\n\u0004\n\u00cc\b\n\u000b\n\f\n\u00cd\u0001\n\u0001\n\u0004\n\u00d2"+
		"\b\n\u000b\n\f\n\u00d3\u0003\n\u00d6\b\n\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u00da\b\u000b\u000b\u000b\f\u000b\u00db\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u00e0\b\u000b\u000b\u000b\f\u000b\u00e1\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u00e6\b\u000b\u000b\u000b\f\u000b\u00e7\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00ec\b\u000b\u000b\u000b\f\u000b\u00ed\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00f2\b\u000b\u000b\u000b\f\u000b\u00f3"+
		"\u0001\u000b\u0003\u000b\u00f7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0004\r\u00fe\b\r\u000b\r\f\r\u00ff\u0001\r\u0001\r\u0004\r\u0104"+
		"\b\r\u000b\r\f\r\u0105\u0001\r\u0001\r\u0004\r\u010a\b\r\u000b\r\f\r\u010b"+
		"\u0001\r\u0001\r\u0004\r\u0110\b\r\u000b\r\f\r\u0111\u0001\r\u0001\r\u0004"+
		"\r\u0116\b\r\u000b\r\f\r\u0117\u0001\r\u0001\r\u0004\r\u011c\b\r\u000b"+
		"\r\f\r\u011d\u0001\r\u0004\r\u0121\b\r\u000b\r\f\r\u0122\u0001\r\u0003"+
		"\r\u0126\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u012e\b\u000e\u000b\u000e\f\u000e\u012f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u0134\b\u000f\u000b\u000f\f\u000f\u0135"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u013a\b\u000f\u000b\u000f\f\u000f"+
		"\u013b\u0001\u000f\u0001\u000f\u0004\u000f\u0140\b\u000f\u000b\u000f\f"+
		"\u000f\u0141\u0001\u000f\u0001\u000f\u0004\u000f\u0146\b\u000f\u000b\u000f"+
		"\f\u000f\u0147\u0001\u000f\u0003\u000f\u014b\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u0152\b\u0011\u000b"+
		"\u0011\f\u0011\u0153\u0001\u0011\u0001\u0011\u0004\u0011\u0158\b\u0011"+
		"\u000b\u0011\f\u0011\u0159\u0001\u0011\u0001\u0011\u0004\u0011\u015e\b"+
		"\u0011\u000b\u0011\f\u0011\u015f\u0001\u0011\u0001\u0011\u0004\u0011\u0164"+
		"\b\u0011\u000b\u0011\f\u0011\u0165\u0001\u0011\u0004\u0011\u0169\b\u0011"+
		"\u000b\u0011\f\u0011\u016a\u0001\u0011\u0004\u0011\u016e\b\u0011\u000b"+
		"\u0011\f\u0011\u016f\u0001\u0011\u0001\u0011\u0004\u0011\u0174\b\u0011"+
		"\u000b\u0011\f\u0011\u0175\u0001\u0011\u0003\u0011\u0179\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u017e\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0183\b\u0012\n\u0012\f\u0012\u0186\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u018c\b\u0012"+
		"\n\u0012\f\u0012\u018f\t\u0012\u0003\u0012\u0191\b\u0012\u0005\u0012\u0193"+
		"\b\u0012\n\u0012\f\u0012\u0196\t\u0012\u0001\u0012\u0003\u0012\u0199\b"+
		"\u0012\u0003\u0012\u019b\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01a3\b\u0014\n\u0014\f\u0014"+
		"\u01a6\t\u0014\u0001\u0015\u0001\u0015\u0004\u0015\u01aa\b\u0015\u000b"+
		"\u0015\f\u0015\u01ab\u0001\u0015\u0001\u0015\u0004\u0015\u01b0\b\u0015"+
		"\u000b\u0015\f\u0015\u01b1\u0001\u0015\u0001\u0015\u0004\u0015\u01b6\b"+
		"\u0015\u000b\u0015\f\u0015\u01b7\u0001\u0015\u0001\u0015\u0004\u0015\u01bc"+
		"\b\u0015\u000b\u0015\f\u0015\u01bd\u0001\u0015\u0003\u0015\u01c1\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0004\u0017"+
		"\u01c8\b\u0017\u000b\u0017\f\u0017\u01c9\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u01ce\b\u0017\u000b\u0017\f\u0017\u01cf\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u01d4\b\u0017\u000b\u0017\f\u0017\u01d5\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u01da\b\u0017\u000b\u0017\f\u0017\u01db\u0001\u0017"+
		"\u0003\u0017\u01df\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01e5\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0002\u0002\u0000\u0014"+
		"\u0014\u0017\u0017\u0001\u0000\n\r\u021e\u00002\u0001\u0000\u0000\u0000"+
		"\u0002@\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006J"+
		"\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000"+
		"\u0000\fr\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000"+
		"\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000\u0000\u0000"+
		"\u0014\u00d5\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000\u0000\u0000"+
		"\u0018\u00f8\u0001\u0000\u0000\u0000\u001a\u00fb\u0001\u0000\u0000\u0000"+
		"\u001c\u0127\u0001\u0000\u0000\u0000\u001e\u0131\u0001\u0000\u0000\u0000"+
		" \u014c\u0001\u0000\u0000\u0000\"\u014f\u0001\u0000\u0000\u0000$\u019a"+
		"\u0001\u0000\u0000\u0000&\u019c\u0001\u0000\u0000\u0000(\u019f\u0001\u0000"+
		"\u0000\u0000*\u01a7\u0001\u0000\u0000\u0000,\u01c2\u0001\u0000\u0000\u0000"+
		".\u01c5\u0001\u0000\u0000\u00000\u01e0\u0001\u0000\u0000\u000024\u0003"+
		"\u0002\u0001\u000035\u0005\u0012\u0000\u000043\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u000089\u0003\u0014\n\u00009=\u0001\u0000\u0000"+
		"\u0000:<\u0005\u0012\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0001"+
		"\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0001\u0000"+
		"\u0000AB\u0003\u0006\u0003\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0002\u0000\u0000DE\u0005\u0017\u0000\u0000EF\u0005\u0003\u0000\u0000"+
		"F\u0005\u0001\u0000\u0000\u0000GI\u0005\u0018\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000Kd\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MO\u0005\u0013\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000Sa\u0007\u0000\u0000\u0000TV\u0005"+
		"\u0013\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z\\\u0005\u0018\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dP\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0003\u0006\u0003"+
		"\u0000ij\u0005\u0013\u0000\u0000j\t\u0001\u0000\u0000\u0000km\u0003\f"+
		"\u0006\u0000ln\u0003\u000e\u0007\u0000ml\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\u000b\u0001\u0000\u0000\u0000oq\u0005\u0013\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uy\u0003\u0006\u0003\u0000vx\u0005\u0013\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|\u0080\u0005\u0015\u0000\u0000}\u007f\u0005\u0013\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\r\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085\u0003"+
		"\u0010\b\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0012"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0016"+
		"\u0000\u0000\u008e\u008f\u0003\u0006\u0003\u0000\u008f\u0011\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0092\u0003\u0006"+
		"\u0003\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u001a"+
		"\r\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u0012\u0000"+
		"\u0000\u0099\u009b\u0003\u001c\u000e\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00d6\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0003\"\u0011\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0005\u0012\u0000\u0000\u00a4\u00a6\u0003&\u0013\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u001e\u000f\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u0012\u0000\u0000\u00af"+
		"\u00b1\u0003 \u0010\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00d6\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0003\u0016\u000b\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0005\u0012\u0000\u0000\u00ba\u00bc\u0003\u0018\f\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00d6\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0003*\u0015\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0005\u0012\u0000\u0000\u00c5\u00c7\u0003,\u0016"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00d6\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003.\u0017\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005\u0012\u0000\u0000"+
		"\u00d0\u00d2\u00030\u0018\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5"+
		"\u0094\u0001\u0000\u0000\u0000\u00d5\u009f\u0001\u0000\u0000\u0000\u00d5"+
		"\u00aa\u0001\u0000\u0000\u0000\u00d5\u00b5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00c0\u0001\u0000\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d6"+
		"\u0015\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005\u0005\u0000\u0000\u00d8"+
		"\u00da\u0005\u0012\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00df\u0003\u0004\u0002\u0000\u00de\u00e0\u0005\u0012\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003\u0006\u0003\u0000\u00e4"+
		"\u00e6\u0005\u0012\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00eb\u0003\n\u0005\u0000\u00ea\u00ec\u0005\u0012\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f6\u0003\u0018\f\u0000\u00f0\u00f2\u0005"+
		"\u0012\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003"+
		"\u0012\t\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u0017\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0006"+
		"\u0000\u0000\u00f9\u00fa\u0003(\u0014\u0000\u00fa\u0019\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0005\u0007\u0000\u0000\u00fc\u00fe\u0005\u0012\u0000"+
		"\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0003\u0004\u0002"+
		"\u0000\u0102\u0104\u0005\u0012\u0000\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0109\u0003\u0006\u0003\u0000\u0108\u010a\u0005\u0012\u0000"+
		"\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0003\n\u0005\u0000"+
		"\u010e\u0110\u0005\u0012\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0115\u0003\n\u0005\u0000\u0114\u0116\u0005\u0012\u0000\u0000\u0115"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0003\u001c\u000e\u0000\u011a"+
		"\u011c\u0005\u0012\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0125\u0001\u0000\u0000\u0000\u011f"+
		"\u0121\u0005\u0012\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u0003\u0012\t\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u001b\u0001\u0000\u0000\u0000\u0127\u012d"+
		"\u0005\b\u0000\u0000\u0128\u0129\u0005\u0012\u0000\u0000\u0129\u012a\u0003"+
		"\u0006\u0003\u0000\u012a\u012b\u0005\u0016\u0000\u0000\u012b\u012c\u0003"+
		"\u0006\u0003\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0128\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u001d\u0001"+
		"\u0000\u0000\u0000\u0131\u0133\u0005\t\u0000\u0000\u0132\u0134\u0005\u0012"+
		"\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0003\u0004"+
		"\u0002\u0000\u0138\u013a\u0005\u0012\u0000\u0000\u0139\u0138\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0003\u0006\u0003\u0000\u013e\u0140\u0005\u0012"+
		"\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u014a\u0003 \u0010"+
		"\u0000\u0144\u0146\u0005\u0012\u0000\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000"+
		"\u0000\u0149\u014b\u0003\u0012\t\u0000\u014a\u0145\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u001f\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005\u0006\u0000\u0000\u014d\u014e\u0007\u0001\u0000\u0000"+
		"\u014e!\u0001\u0000\u0000\u0000\u014f\u0151\u0005\u000e\u0000\u0000\u0150"+
		"\u0152\u0005\u0012\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155"+
		"\u0157\u0003\u0004\u0002\u0000\u0156\u0158\u0005\u0012\u0000\u0000\u0157"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0003\u0006\u0003\u0000\u015c"+
		"\u015e\u0005\u0012\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0163\u0003$\u0012\u0000\u0162\u0164\u0005\u0012\u0000\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0003\n\u0005\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001"+
		"\u0000\u0000\u0000\u016c\u016e\u0005\u0012\u0000\u0000\u016d\u016c\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0178\u0003&\u0013\u0000\u0172\u0174\u0005\u0012"+
		"\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0003\u0012"+
		"\t\u0000\u0178\u0173\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179#\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0019\u0000\u0000"+
		"\u017b\u019b\u0003\u0006\u0003\u0000\u017c\u017e\u0003\b\u0004\u0000\u017d"+
		"\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0184\u0005\u0019\u0000\u0000\u0180"+
		"\u0181\u0005\u0013\u0000\u0000\u0181\u0183\u0005\u0019\u0000\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"\u0194\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187"+
		"\u0190\u0003\b\u0004\u0000\u0188\u018d\u0005\u0019\u0000\u0000\u0189\u018a"+
		"\u0005\u0013\u0000\u0000\u018a\u018c\u0005\u0019\u0000\u0000\u018b\u0189"+
		"\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0191"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0188"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193"+
		"\u0001\u0000\u0000\u0000\u0192\u0187\u0001\u0000\u0000\u0000\u0193\u0196"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u0199\u0003\u0006\u0003\u0000\u0198\u0197"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b"+
		"\u0001\u0000\u0000\u0000\u019a\u017a\u0001\u0000\u0000\u0000\u019a\u017d"+
		"\u0001\u0000\u0000\u0000\u019b%\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"\u0006\u0000\u0000\u019d\u019e\u0003(\u0014\u0000\u019e\'\u0001\u0000"+
		"\u0000\u0000\u019f\u01a4\u0003\u0006\u0003\u0000\u01a0\u01a1\u0005\u000f"+
		"\u0000\u0000\u01a1\u01a3\u0003\u0006\u0003\u0000\u01a2\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5)\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9\u0005\u0010\u0000"+
		"\u0000\u01a8\u01aa\u0005\u0012\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01af\u0003\u0004\u0002\u0000\u01ae\u01b0\u0005\u0012\u0000"+
		"\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0003\u0006\u0003"+
		"\u0000\u01b4\u01b6\u0005\u0012\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01c0\u0003,\u0016\u0000\u01ba\u01bc\u0005\u0012\u0000\u0000"+
		"\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003\u0012\t\u0000\u01c0"+
		"\u01bb\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1"+
		"+\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u0006\u0000\u0000\u01c3\u01c4"+
		"\u0003\u0006\u0003\u0000\u01c4-\u0001\u0000\u0000\u0000\u01c5\u01c7\u0005"+
		"\u0011\u0000\u0000\u01c6\u01c8\u0005\u0012\u0000\u0000\u01c7\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cd\u0003\u0004\u0002\u0000\u01cc\u01ce\u0005"+
		"\u0012\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0003"+
		"\u0006\u0003\u0000\u01d2\u01d4\u0005\u0012\u0000\u0000\u01d3\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d7\u01de\u00030\u0018\u0000\u01d8\u01da\u0005\u0012"+
		"\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0003\u0012"+
		"\t\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000"+
		"\u0000\u01df/\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\u0006\u0000\u0000"+
		"\u01e1\u01e4\u0005\u0017\u0000\u0000\u01e2\u01e3\u0005\u000f\u0000\u0000"+
		"\u01e3\u01e5\u0005\u0017\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0005\u0013\u0000\u0000\u01e7\u01e8\u0005\u0014\u0000\u0000"+
		"\u01e81\u0001\u0000\u0000\u0000J6=JPW]afmry\u0080\u0086\u008b\u0096\u009c"+
		"\u00a1\u00a7\u00ac\u00b2\u00b7\u00bd\u00c2\u00c8\u00cd\u00d3\u00d5\u00db"+
		"\u00e1\u00e7\u00ed\u00f3\u00f6\u00ff\u0105\u010b\u0111\u0117\u011d\u0122"+
		"\u0125\u012f\u0135\u013b\u0141\u0147\u014a\u0153\u0159\u015f\u0165\u016a"+
		"\u016f\u0175\u0178\u017d\u0184\u018d\u0190\u0194\u0198\u019a\u01a4\u01ab"+
		"\u01b1\u01b7\u01bd\u01c0\u01c9\u01cf\u01d5\u01db\u01de\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}