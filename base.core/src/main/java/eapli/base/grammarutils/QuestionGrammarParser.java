// Generated from C:/Users/windows/Documents/sem4pi-22-23-24/base.core\QuestionGrammar.g4 by ANTLR 4.12.0
package eapli.base.grammarutils;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QuestionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NEWLINE=17, 
		SPACE=18, WORD=19, COLON=20, DASH=21, INT=22, ANY_CHAR=23, MISSING_WORD=24;
	public static final int
		RULE_prog = 0, RULE_phrase = 1, RULE_middle_phrase = 2, RULE_list_with_title = 3, 
		RULE_title_list = 4, RULE_list = 5, RULE_topic_list = 6, RULE_multiple_choice_question = 7, 
		RULE_multiple_choice_solution = 8, RULE_matching_type_question = 9, RULE_matching_type_solution = 10, 
		RULE_true_false_question = 11, RULE_true_false_solution = 12, RULE_select_missing_words = 13, 
		RULE_missing_word_question = 14, RULE_missing_word_solution = 15, RULE_list_phrases = 16, 
		RULE_short_answer_question = 17, RULE_short_answer_solution = 18, RULE_numerical_question = 19, 
		RULE_numerical_answer = 20, RULE_points = 21, RULE_feedback = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "phrase", "middle_phrase", "list_with_title", "title_list", "list", 
			"topic_list", "multiple_choice_question", "multiple_choice_solution", 
			"matching_type_question", "matching_type_solution", "true_false_question", 
			"true_false_solution", "select_missing_words", "missing_word_question", 
			"missing_word_solution", "list_phrases", "short_answer_question", "short_answer_solution", 
			"numerical_question", "numerical_answer", "points", "feedback"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Multiple Choice'", "'Solution: '", "'Matching Type'", "'Solution:'", 
			"'True/False Question'", "'T'", "'F'", "'t'", "'f'", "'Select Missing Words'", 
			"','", "'Short Answer'", "'Numerical'", "'('", "'pts)'", "'Feedback: '", 
			null, "' '", null, "':'", "'-'", null, null, "'||WORD||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NEWLINE", "SPACE", "WORD", "COLON", "DASH", 
			"INT", "ANY_CHAR", "MISSING_WORD"
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
	public String getGrammarFileName() { return "QuestionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuestionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Matching_type_questionContext matching_type_question() {
			return getRuleContext(Matching_type_questionContext.class,0);
		}
		public Select_missing_wordsContext select_missing_words() {
			return getRuleContext(Select_missing_wordsContext.class,0);
		}
		public True_false_questionContext true_false_question() {
			return getRuleContext(True_false_questionContext.class,0);
		}
		public Multiple_choice_questionContext multiple_choice_question() {
			return getRuleContext(Multiple_choice_questionContext.class,0);
		}
		public Short_answer_questionContext short_answer_question() {
			return getRuleContext(Short_answer_questionContext.class,0);
		}
		public Numerical_questionContext numerical_question() {
			return getRuleContext(Numerical_questionContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				matching_type_question();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				select_missing_words();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				true_false_question();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				multiple_choice_question();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				short_answer_question();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				numerical_question();
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
	public static class PhraseContext extends ParserRuleContext {
		public List<TerminalNode> ANY_CHAR() { return getTokens(QuestionGrammarParser.ANY_CHAR); }
		public TerminalNode ANY_CHAR(int i) {
			return getToken(QuestionGrammarParser.ANY_CHAR, i);
		}
		public List<TerminalNode> WORD() { return getTokens(QuestionGrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(QuestionGrammarParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(QuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(QuestionGrammarParser.INT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(QuestionGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(QuestionGrammarParser.SPACE, i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_phrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANY_CHAR) {
				{
				{
				setState(54);
				match(ANY_CHAR);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(60);
						match(SPACE);
						}
						}
						setState(65);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(66);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==INT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(70);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==SPACE) {
								{
								{
								setState(67);
								match(SPACE);
								}
								}
								setState(72);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(74); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(73);
									match(ANY_CHAR);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(76); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							} 
						}
						setState(82);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public TerminalNode SPACE() { return getToken(QuestionGrammarParser.SPACE, 0); }
		public Middle_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_middle_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMiddle_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMiddle_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMiddle_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Middle_phraseContext middle_phrase() throws RecognitionException {
		Middle_phraseContext _localctx = new Middle_phraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_middle_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			phrase();
			setState(88);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterList_with_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitList_with_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitList_with_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_with_titleContext list_with_title() throws RecognitionException {
		List_with_titleContext _localctx = new List_with_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_with_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			title_list();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91);
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
		public TerminalNode COLON() { return getToken(QuestionGrammarParser.COLON, 0); }
		public List<TerminalNode> SPACE() { return getTokens(QuestionGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(QuestionGrammarParser.SPACE, i);
		}
		public Title_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterTitle_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitTitle_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitTitle_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Title_listContext title_list() throws RecognitionException {
		Title_listContext _localctx = new Title_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_title_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(SPACE);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(100);
			phrase();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(101);
				match(SPACE);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(COLON);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(SPACE);
					}
					} 
				}
				setState(113);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(114);
					topic_list();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode DASH() { return getToken(QuestionGrammarParser.DASH, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
		}
		public Topic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topic_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterTopic_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitTopic_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitTopic_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Topic_listContext topic_list() throws RecognitionException {
		Topic_listContext _localctx = new Topic_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_topic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				match(NEWLINE);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(124);
			match(DASH);
			setState(125);
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMultiple_choice_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMultiple_choice_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMultiple_choice_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_questionContext multiple_choice_question() throws RecognitionException {
		Multiple_choice_questionContext _localctx = new Multiple_choice_questionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiple_choice_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__0);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				match(NEWLINE);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(133);
			points();
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				match(NEWLINE);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(139);
			phrase();
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				match(NEWLINE);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(145);
			list_with_title();
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(NEWLINE);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(151);
			multiple_choice_solution();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					match(NEWLINE);
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(157);
				feedback();
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
	public static class Multiple_choice_solutionContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public Multiple_choice_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMultiple_choice_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMultiple_choice_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMultiple_choice_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_solutionContext multiple_choice_solution() throws RecognitionException {
		Multiple_choice_solutionContext _localctx = new Multiple_choice_solutionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiple_choice_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__1);
			setState(161);
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
		}
		public Matching_type_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_type_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMatching_type_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMatching_type_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMatching_type_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_type_questionContext matching_type_question() throws RecognitionException {
		Matching_type_questionContext _localctx = new Matching_type_questionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matching_type_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__2);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(NEWLINE);
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(169);
			points();
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				match(NEWLINE);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(175);
			phrase();
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				match(NEWLINE);
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(181);
			list_with_title();
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				match(NEWLINE);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(187);
			list_with_title();
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				match(NEWLINE);
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(193);
			matching_type_solution();
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				match(NEWLINE);
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
		}
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> DASH() { return getTokens(QuestionGrammarParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(QuestionGrammarParser.DASH, i);
		}
		public Matching_type_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_type_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMatching_type_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMatching_type_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMatching_type_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_type_solutionContext matching_type_solution() throws RecognitionException {
		Matching_type_solutionContext _localctx = new Matching_type_solutionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matching_type_solution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__3);
			setState(205); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200);
					match(NEWLINE);
					setState(201);
					phrase();
					setState(202);
					match(DASH);
					setState(203);
					phrase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterTrue_false_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitTrue_false_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitTrue_false_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_false_questionContext true_false_question() throws RecognitionException {
		True_false_questionContext _localctx = new True_false_questionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_true_false_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__4);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(NEWLINE);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(215);
			points();
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
			phrase();
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
			true_false_solution();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
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
				feedback();
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
	public static class True_false_solutionContext extends ParserRuleContext {
		public True_false_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterTrue_false_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitTrue_false_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitTrue_false_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_false_solutionContext true_false_solution() throws RecognitionException {
		True_false_solutionContext _localctx = new True_false_solutionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_true_false_solution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__1);
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterSelect_missing_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitSelect_missing_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitSelect_missing_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_missing_wordsContext select_missing_words() throws RecognitionException {
		Select_missing_wordsContext _localctx = new Select_missing_wordsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_select_missing_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__9);
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
			points();
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				match(NEWLINE);
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(251);
			phrase();
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
			missing_word_question();
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
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				list_with_title();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13369344L) != 0) );
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				match(NEWLINE);
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(273);
			missing_word_solution();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					match(NEWLINE);
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(279);
				feedback();
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
	public static class Missing_word_questionContext extends ParserRuleContext {
		public List<TerminalNode> MISSING_WORD() { return getTokens(QuestionGrammarParser.MISSING_WORD); }
		public TerminalNode MISSING_WORD(int i) {
			return getToken(QuestionGrammarParser.MISSING_WORD, i);
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
		public List<TerminalNode> SPACE() { return getTokens(QuestionGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(QuestionGrammarParser.SPACE, i);
		}
		public Missing_word_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_word_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMissing_word_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMissing_word_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMissing_word_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_word_questionContext missing_word_question() throws RecognitionException {
		Missing_word_questionContext _localctx = new Missing_word_questionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_missing_word_question);
		int _la;
		try {
			int _alt;
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(MISSING_WORD);
				setState(283);
				phrase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13369344L) != 0)) {
					{
					setState(284);
					middle_phrase();
					}
				}

				setState(287);
				match(MISSING_WORD);
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288);
						match(SPACE);
						setState(289);
						match(MISSING_WORD);
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(295);
						middle_phrase();
						setState(304);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MISSING_WORD) {
							{
							setState(296);
							match(MISSING_WORD);
							setState(301);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(297);
									match(SPACE);
									setState(298);
									match(MISSING_WORD);
									}
									} 
								}
								setState(303);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
							}
							}
						}

						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13369344L) != 0)) {
					{
					setState(311);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMissing_word_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMissing_word_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMissing_word_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_word_solutionContext missing_word_solution() throws RecognitionException {
		Missing_word_solutionContext _localctx = new Missing_word_solutionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_missing_word_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__1);
			setState(317);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterList_phrases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitList_phrases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitList_phrases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_phrasesContext list_phrases() throws RecognitionException {
		List_phrasesContext _localctx = new List_phrasesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_list_phrases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			phrase();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(320);
				match(T__10);
				setState(321);
				phrase();
				}
				}
				setState(326);
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterShort_answer_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitShort_answer_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitShort_answer_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_answer_questionContext short_answer_question() throws RecognitionException {
		Short_answer_questionContext _localctx = new Short_answer_questionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_short_answer_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__11);
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				match(NEWLINE);
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(333);
			points();
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				match(NEWLINE);
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(339);
			phrase();
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				match(NEWLINE);
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(345);
			short_answer_solution();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(346);
					match(NEWLINE);
					}
					}
					setState(349); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(351);
				feedback();
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterShort_answer_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitShort_answer_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitShort_answer_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_answer_solutionContext short_answer_solution() throws RecognitionException {
		Short_answer_solutionContext _localctx = new Short_answer_solutionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_short_answer_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__1);
			setState(355);
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterNumerical_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitNumerical_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitNumerical_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_questionContext numerical_question() throws RecognitionException {
		Numerical_questionContext _localctx = new Numerical_questionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numerical_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__12);
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				match(NEWLINE);
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(363);
			points();
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
			phrase();
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
			numerical_answer();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(376);
					match(NEWLINE);
					}
					}
					setState(379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(381);
				feedback();
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
	public static class Numerical_answerContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(QuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(QuestionGrammarParser.INT, i);
		}
		public TerminalNode SPACE() { return getToken(QuestionGrammarParser.SPACE, 0); }
		public TerminalNode WORD() { return getToken(QuestionGrammarParser.WORD, 0); }
		public Numerical_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterNumerical_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitNumerical_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitNumerical_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_answerContext numerical_answer() throws RecognitionException {
		Numerical_answerContext _localctx = new Numerical_answerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numerical_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__1);
			setState(385);
			match(INT);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(386);
				match(T__10);
				setState(387);
				match(INT);
				}
			}

			setState(390);
			match(SPACE);
			setState(391);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QuestionGrammarParser.INT, 0); }
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitPoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitPoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_points);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__13);
			setState(394);
			match(INT);
			setState(395);
			match(T__14);
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
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterFeedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitFeedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitFeedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackContext feedback() throws RecognitionException {
		FeedbackContext _localctx = new FeedbackContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_feedback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__15);
			setState(398);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0191\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u00005\b\u0000\u0001\u0001\u0005"+
		"\u00018\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0005\u0001>\b\u0001"+
		"\n\u0001\f\u0001A\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001E\b\u0001"+
		"\n\u0001\f\u0001H\t\u0001\u0001\u0001\u0004\u0001K\b\u0001\u000b\u0001"+
		"\f\u0001L\u0005\u0001O\b\u0001\n\u0001\f\u0001R\t\u0001\u0004\u0001T\b"+
		"\u0001\u000b\u0001\f\u0001U\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0004\u0005\u0004`\b\u0004"+
		"\n\u0004\f\u0004c\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004g\b\u0004"+
		"\n\u0004\f\u0004j\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004n\b\u0004"+
		"\n\u0004\f\u0004q\t\u0004\u0001\u0005\u0004\u0005t\b\u0005\u000b\u0005"+
		"\f\u0005u\u0001\u0006\u0004\u0006y\b\u0006\u000b\u0006\f\u0006z\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u0082"+
		"\b\u0007\u000b\u0007\f\u0007\u0083\u0001\u0007\u0001\u0007\u0004\u0007"+
		"\u0088\b\u0007\u000b\u0007\f\u0007\u0089\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u008e\b\u0007\u000b\u0007\f\u0007\u008f\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u0094\b\u0007\u000b\u0007\f\u0007\u0095\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u009a\b\u0007\u000b\u0007\f\u0007\u009b\u0001\u0007"+
		"\u0003\u0007\u009f\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004"+
		"\t\u00a6\b\t\u000b\t\f\t\u00a7\u0001\t\u0001\t\u0004\t\u00ac\b\t\u000b"+
		"\t\f\t\u00ad\u0001\t\u0001\t\u0004\t\u00b2\b\t\u000b\t\f\t\u00b3\u0001"+
		"\t\u0001\t\u0004\t\u00b8\b\t\u000b\t\f\t\u00b9\u0001\t\u0001\t\u0004\t"+
		"\u00be\b\t\u000b\t\f\t\u00bf\u0001\t\u0001\t\u0004\t\u00c4\b\t\u000b\t"+
		"\f\t\u00c5\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00ce"+
		"\b\n\u000b\n\f\n\u00cf\u0001\u000b\u0001\u000b\u0004\u000b\u00d4\b\u000b"+
		"\u000b\u000b\f\u000b\u00d5\u0001\u000b\u0001\u000b\u0004\u000b\u00da\b"+
		"\u000b\u000b\u000b\f\u000b\u00db\u0001\u000b\u0001\u000b\u0004\u000b\u00e0"+
		"\b\u000b\u000b\u000b\f\u000b\u00e1\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u00e6\b\u000b\u000b\u000b\f\u000b\u00e7\u0001\u000b\u0003\u000b\u00eb"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u00f2\b\r\u000b"+
		"\r\f\r\u00f3\u0001\r\u0001\r\u0004\r\u00f8\b\r\u000b\r\f\r\u00f9\u0001"+
		"\r\u0001\r\u0004\r\u00fe\b\r\u000b\r\f\r\u00ff\u0001\r\u0001\r\u0004\r"+
		"\u0104\b\r\u000b\r\f\r\u0105\u0001\r\u0004\r\u0109\b\r\u000b\r\f\r\u010a"+
		"\u0001\r\u0004\r\u010e\b\r\u000b\r\f\r\u010f\u0001\r\u0001\r\u0004\r\u0114"+
		"\b\r\u000b\r\f\r\u0115\u0001\r\u0003\r\u0119\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u011e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0123\b\u000e\n\u000e\f\u000e\u0126\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u012c\b\u000e\n\u000e\f\u000e"+
		"\u012f\t\u000e\u0003\u000e\u0131\b\u000e\u0005\u000e\u0133\b\u000e\n\u000e"+
		"\f\u000e\u0136\t\u000e\u0001\u000e\u0003\u000e\u0139\b\u000e\u0003\u000e"+
		"\u013b\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0143\b\u0010\n\u0010\f\u0010\u0146\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0004\u0011\u014a\b\u0011\u000b\u0011\f\u0011\u014b"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u0150\b\u0011\u000b\u0011\f\u0011"+
		"\u0151\u0001\u0011\u0001\u0011\u0004\u0011\u0156\b\u0011\u000b\u0011\f"+
		"\u0011\u0157\u0001\u0011\u0001\u0011\u0004\u0011\u015c\b\u0011\u000b\u0011"+
		"\f\u0011\u015d\u0001\u0011\u0003\u0011\u0161\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0004\u0013\u0168\b\u0013\u000b"+
		"\u0013\f\u0013\u0169\u0001\u0013\u0001\u0013\u0004\u0013\u016e\b\u0013"+
		"\u000b\u0013\f\u0013\u016f\u0001\u0013\u0001\u0013\u0004\u0013\u0174\b"+
		"\u0013\u000b\u0013\f\u0013\u0175\u0001\u0013\u0001\u0013\u0004\u0013\u017a"+
		"\b\u0013\u000b\u0013\f\u0013\u017b\u0001\u0013\u0003\u0013\u017f\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0185\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000"+
		"\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,\u0000\u0002\u0002\u0000\u0013\u0013\u0016\u0016"+
		"\u0001\u0000\u0006\t\u01b7\u00004\u0001\u0000\u0000\u0000\u00029\u0001"+
		"\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000"+
		"\u0000\ba\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000\fx\u0001"+
		"\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u00a0\u0001"+
		"\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00c7\u0001"+
		"\u0000\u0000\u0000\u0016\u00d1\u0001\u0000\u0000\u0000\u0018\u00ec\u0001"+
		"\u0000\u0000\u0000\u001a\u00ef\u0001\u0000\u0000\u0000\u001c\u013a\u0001"+
		"\u0000\u0000\u0000\u001e\u013c\u0001\u0000\u0000\u0000 \u013f\u0001\u0000"+
		"\u0000\u0000\"\u0147\u0001\u0000\u0000\u0000$\u0162\u0001\u0000\u0000"+
		"\u0000&\u0165\u0001\u0000\u0000\u0000(\u0180\u0001\u0000\u0000\u0000*"+
		"\u0189\u0001\u0000\u0000\u0000,\u018d\u0001\u0000\u0000\u0000.5\u0003"+
		"\u0012\t\u0000/5\u0003\u001a\r\u000005\u0003\u0016\u000b\u000015\u0003"+
		"\u000e\u0007\u000025\u0003\"\u0011\u000035\u0003&\u0013\u00004.\u0001"+
		"\u0000\u0000\u00004/\u0001\u0000\u0000\u000040\u0001\u0000\u0000\u0000"+
		"41\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000\u0000"+
		"\u00005\u0001\u0001\u0000\u0000\u000068\u0005\u0017\u0000\u000076\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:S\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<>\u0005\u0012\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BP\u0007\u0000\u0000\u0000"+
		"CE\u0005\u0012\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0005\u0017\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S?\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\u0003\u0001\u0000\u0000\u0000WX\u0003\u0002"+
		"\u0001\u0000XY\u0005\u0012\u0000\u0000Y\u0005\u0001\u0000\u0000\u0000"+
		"Z\\\u0003\b\u0004\u0000[]\u0003\n\u0005\u0000\\[\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\u0007\u0001\u0000\u0000\u0000^`\u0005\u0012"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000dh\u0003\u0002\u0001\u0000eg\u0005\u0012\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000ko\u0005\u0014\u0000\u0000ln\u0005\u0012\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\t\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000rt\u0003\f\u0006\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u000b"+
		"\u0001\u0000\u0000\u0000wy\u0005\u0011\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0015\u0000\u0000}~\u0003"+
		"\u0002\u0001\u0000~\r\u0001\u0000\u0000\u0000\u007f\u0081\u0005\u0001"+
		"\u0000\u0000\u0080\u0082\u0005\u0011\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0003*\u0015\u0000\u0086\u0088\u0005\u0011\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u0002\u0001"+
		"\u0000\u008c\u008e\u0005\u0011\u0000\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0003\u0006\u0003\u0000\u0092\u0094\u0005\u0011\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009e\u0003\u0010\b\u0000"+
		"\u0098\u009a\u0005\u0011\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0003,\u0016\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u000f\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0002\u0000\u0000\u00a1\u00a2\u0003\u0002\u0001\u0000\u00a2"+
		"\u0011\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u0003\u0000\u0000\u00a4"+
		"\u00a6\u0005\u0011\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0003*\u0015\u0000\u00aa\u00ac\u0005\u0011\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0003\u0002\u0001\u0000\u00b0\u00b2"+
		"\u0005\u0011\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0003\u0006\u0003\u0000\u00b6\u00b8\u0005\u0011\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\u0006\u0003\u0000\u00bc\u00be"+
		"\u0005\u0011\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3"+
		"\u0003\u0014\n\u0000\u00c2\u00c4\u0005\u0011\u0000\u0000\u00c3\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u0013\u0001"+
		"\u0000\u0000\u0000\u00c7\u00cd\u0005\u0004\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0011\u0000\u0000\u00c9\u00ca\u0003\u0002\u0001\u0000\u00ca\u00cb\u0005"+
		"\u0015\u0000\u0000\u00cb\u00cc\u0003\u0002\u0001\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u0015\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005"+
		"\u0005\u0000\u0000\u00d2\u00d4\u0005\u0011\u0000\u0000\u00d3\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0003*\u0015\u0000\u00d8\u00da\u0005\u0011"+
		"\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0003\u0002"+
		"\u0001\u0000\u00de\u00e0\u0005\u0011\u0000\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00ea\u0003\u0018\f\u0000\u00e4\u00e6\u0005\u0011\u0000"+
		"\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0003,\u0016\u0000"+
		"\u00ea\u00e5\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u0017\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0002\u0000\u0000"+
		"\u00ed\u00ee\u0007\u0001\u0000\u0000\u00ee\u0019\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0005\n\u0000\u0000\u00f0\u00f2\u0005\u0011\u0000\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003*\u0015\u0000\u00f6\u00f8"+
		"\u0005\u0011\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0003\u0002\u0001\u0000\u00fc\u00fe\u0005\u0011\u0000\u0000\u00fd\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0003\u001c\u000e\u0000\u0102\u0104"+
		"\u0005\u0011\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0109"+
		"\u0003\u0006\u0003\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010e"+
		"\u0005\u0011\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0118"+
		"\u0003\u001e\u000f\u0000\u0112\u0114\u0005\u0011\u0000\u0000\u0113\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117\u0119\u0003,\u0016\u0000\u0118\u0113\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u001b\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005\u0018\u0000\u0000\u011b\u013b\u0003"+
		"\u0002\u0001\u0000\u011c\u011e\u0003\u0004\u0002\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0124\u0005\u0018\u0000\u0000\u0120\u0121\u0005"+
		"\u0012\u0000\u0000\u0121\u0123\u0005\u0018\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0134\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0130\u0003"+
		"\u0004\u0002\u0000\u0128\u012d\u0005\u0018\u0000\u0000\u0129\u012a\u0005"+
		"\u0012\u0000\u0000\u012a\u012c\u0005\u0018\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0131\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0128\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001"+
		"\u0000\u0000\u0000\u0132\u0127\u0001\u0000\u0000\u0000\u0133\u0136\u0001"+
		"\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0137\u0139\u0003\u0002\u0001\u0000\u0138\u0137\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001"+
		"\u0000\u0000\u0000\u013a\u011a\u0001\u0000\u0000\u0000\u013a\u011d\u0001"+
		"\u0000\u0000\u0000\u013b\u001d\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"\u0002\u0000\u0000\u013d\u013e\u0003 \u0010\u0000\u013e\u001f\u0001\u0000"+
		"\u0000\u0000\u013f\u0144\u0003\u0002\u0001\u0000\u0140\u0141\u0005\u000b"+
		"\u0000\u0000\u0141\u0143\u0003\u0002\u0001\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145!\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0149\u0005\f\u0000\u0000"+
		"\u0148\u014a\u0005\u0011\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u014f\u0003*\u0015\u0000\u014e\u0150\u0005\u0011\u0000\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0003\u0002\u0001\u0000\u0154"+
		"\u0156\u0005\u0011\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u0160\u0003$\u0012\u0000\u015a\u015c\u0005\u0011\u0000\u0000\u015b\u015a"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0161\u0003,\u0016\u0000\u0160\u015b\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161#\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\u0002\u0000\u0000\u0163\u0164\u0003\u0002"+
		"\u0001\u0000\u0164%\u0001\u0000\u0000\u0000\u0165\u0167\u0005\r\u0000"+
		"\u0000\u0166\u0168\u0005\u0011\u0000\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016d\u0003*\u0015\u0000\u016c\u016e\u0005\u0011\u0000\u0000"+
		"\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0003\u0002\u0001\u0000"+
		"\u0172\u0174\u0005\u0011\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u017e\u0003(\u0014\u0000\u0178\u017a\u0005\u0011\u0000\u0000\u0179"+
		"\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0003,\u0016\u0000\u017e\u0179"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\'\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0005\u0002\u0000\u0000\u0181\u0184\u0005"+
		"\u0016\u0000\u0000\u0182\u0183\u0005\u000b\u0000\u0000\u0183\u0185\u0005"+
		"\u0016\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0005"+
		"\u0012\u0000\u0000\u0187\u0188\u0005\u0013\u0000\u0000\u0188)\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0005\u000e\u0000\u0000\u018a\u018b\u0005\u0016"+
		"\u0000\u0000\u018b\u018c\u0005\u000f\u0000\u0000\u018c+\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0005\u0010\u0000\u0000\u018e\u018f\u0003\u0002\u0001"+
		"\u0000\u018f-\u0001\u0000\u0000\u0000:49?FLPU\\ahouz\u0083\u0089\u008f"+
		"\u0095\u009b\u009e\u00a7\u00ad\u00b3\u00b9\u00bf\u00c5\u00cf\u00d5\u00db"+
		"\u00e1\u00e7\u00ea\u00f3\u00f9\u00ff\u0105\u010a\u010f\u0115\u0118\u011d"+
		"\u0124\u012d\u0130\u0134\u0138\u013a\u0144\u014b\u0151\u0157\u015d\u0160"+
		"\u0169\u016f\u0175\u017b\u017e\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}