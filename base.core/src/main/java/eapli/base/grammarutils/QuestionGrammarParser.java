// Generated from C:/Users/Marco/Desktop/MinhaPasta/Universidade/Ano2/SEM4PI/sem4pi-22-23-24/base.core/src/main/antlr4\QuestionGrammar.g4 by ANTLR 4.12.0
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
		SOLUTION_ENTRY=1, TRUE_FALSE_RESPONSES=2, FEEDBACK_ENTRY=3, QUESTION_ENTRY=4, 
		POINTS_ENTRY=5, MC_Q=6, N_Q=7, SA_Q=8, SMW_Q=9, TF_Q=10, MT_Q=11, POINTS=12, 
		COMMA=13, WS=14, HASH=15, NEWLINE=16, WORD=17, COLON=18, DASH=19, INT=20, 
		ANY_CHAR=21, MISSING_WORD=22;
	public static final int
		RULE_prog = 0, RULE_multiple_choice_question = 1, RULE_multiple_choice_solution = 2, 
		RULE_matching_type_question = 3, RULE_matching_type_solution = 4, RULE_true_false_question = 5, 
		RULE_true_false_solution = 6, RULE_select_missing_words = 7, RULE_missing_word_phrase = 8, 
		RULE_missing_word_solution = 9, RULE_list_phrases = 10, RULE_short_answer_question = 11, 
		RULE_short_answer_solution = 12, RULE_numerical_question = 13, RULE_numerical_answer = 14, 
		RULE_question = 15, RULE_points = 16, RULE_feedback = 17, RULE_phrase = 18, 
		RULE_list_with_title = 19, RULE_title_list = 20, RULE_list = 21, RULE_topic_list = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "multiple_choice_question", "multiple_choice_solution", "matching_type_question", 
			"matching_type_solution", "true_false_question", "true_false_solution", 
			"select_missing_words", "missing_word_phrase", "missing_word_solution", 
			"list_phrases", "short_answer_question", "short_answer_solution", "numerical_question", 
			"numerical_answer", "question", "points", "feedback", "phrase", "list_with_title", 
			"title_list", "list", "topic_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'Multiple Choice'", "'Numerical'", 
			"'Short Answer'", "'Select Missing Words'", "'True/False Question'", 
			"'Matching Type'", "'Points'", "','", null, "'#'", null, null, "':'", 
			"'-'", null, null, "'||WORD||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SOLUTION_ENTRY", "TRUE_FALSE_RESPONSES", "FEEDBACK_ENTRY", "QUESTION_ENTRY", 
			"POINTS_ENTRY", "MC_Q", "N_Q", "SA_Q", "SMW_Q", "TF_Q", "MT_Q", "POINTS", 
			"COMMA", "WS", "HASH", "NEWLINE", "WORD", "COLON", "DASH", "INT", "ANY_CHAR", 
			"MISSING_WORD"
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
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				matching_type_question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				select_missing_words();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				true_false_question();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				multiple_choice_question();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				short_answer_question();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				numerical_question();
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
	public static class Multiple_choice_questionContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(QuestionGrammarParser.HASH, 0); }
		public TerminalNode MC_Q() { return getToken(QuestionGrammarParser.MC_Q, 0); }
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public List_with_titleContext list_with_title() {
			return getRuleContext(List_with_titleContext.class,0);
		}
		public Multiple_choice_solutionContext multiple_choice_solution() {
			return getRuleContext(Multiple_choice_solutionContext.class,0);
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
		enterRule(_localctx, 2, RULE_multiple_choice_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(HASH);
			setState(55);
			match(MC_Q);
			setState(56);
			points();
			setState(57);
			question();
			setState(58);
			list_with_title();
			setState(59);
			multiple_choice_solution();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(60);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(QuestionGrammarParser.SOLUTION_ENTRY, 0); }
		public List_phrasesContext list_phrases() {
			return getRuleContext(List_phrasesContext.class,0);
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
		enterRule(_localctx, 4, RULE_multiple_choice_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(SOLUTION_ENTRY);
			setState(64);
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
		public TerminalNode HASH() { return getToken(QuestionGrammarParser.HASH, 0); }
		public TerminalNode MT_Q() { return getToken(QuestionGrammarParser.MT_Q, 0); }
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
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
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
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
		enterRule(_localctx, 6, RULE_matching_type_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(HASH);
			setState(67);
			match(MT_Q);
			setState(68);
			points();
			setState(69);
			question();
			setState(70);
			list_with_title();
			setState(71);
			list_with_title();
			setState(72);
			matching_type_solution();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(73);
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
	public static class Matching_type_solutionContext extends ParserRuleContext {
		public TerminalNode SOLUTION_ENTRY() { return getToken(QuestionGrammarParser.SOLUTION_ENTRY, 0); }
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
		enterRule(_localctx, 8, RULE_matching_type_solution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SOLUTION_ENTRY);
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					match(NEWLINE);
					setState(78);
					phrase();
					setState(79);
					match(DASH);
					setState(80);
					phrase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode HASH() { return getToken(QuestionGrammarParser.HASH, 0); }
		public TerminalNode TF_Q() { return getToken(QuestionGrammarParser.TF_Q, 0); }
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public True_false_solutionContext true_false_solution() {
			return getRuleContext(True_false_solutionContext.class,0);
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
		enterRule(_localctx, 10, RULE_true_false_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(HASH);
			setState(87);
			match(TF_Q);
			setState(88);
			points();
			setState(89);
			question();
			setState(90);
			true_false_solution();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(91);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(QuestionGrammarParser.SOLUTION_ENTRY, 0); }
		public TerminalNode TRUE_FALSE_RESPONSES() { return getToken(QuestionGrammarParser.TRUE_FALSE_RESPONSES, 0); }
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
		enterRule(_localctx, 12, RULE_true_false_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SOLUTION_ENTRY);
			setState(95);
			match(TRUE_FALSE_RESPONSES);
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
		public TerminalNode HASH() { return getToken(QuestionGrammarParser.HASH, 0); }
		public TerminalNode SMW_Q() { return getToken(QuestionGrammarParser.SMW_Q, 0); }
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public Missing_word_phraseContext missing_word_phrase() {
			return getRuleContext(Missing_word_phraseContext.class,0);
		}
		public Missing_word_solutionContext missing_word_solution() {
			return getRuleContext(Missing_word_solutionContext.class,0);
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
		enterRule(_localctx, 14, RULE_select_missing_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(HASH);
			setState(98);
			match(SMW_Q);
			setState(99);
			points();
			setState(100);
			question();
			setState(101);
			missing_word_phrase();
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				list_with_title();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(107);
			missing_word_solution();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(108);
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
	public static class Missing_word_phraseContext extends ParserRuleContext {
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
		public List<TerminalNode> MISSING_WORD() { return getTokens(QuestionGrammarParser.MISSING_WORD); }
		public TerminalNode MISSING_WORD(int i) {
			return getToken(QuestionGrammarParser.MISSING_WORD, i);
		}
		public Missing_word_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_word_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterMissing_word_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitMissing_word_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitMissing_word_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_word_phraseContext missing_word_phrase() throws RecognitionException {
		Missing_word_phraseContext _localctx = new Missing_word_phraseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_missing_word_phrase);
		int _la;
		try {
			int _alt;
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					match(NEWLINE);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3276800L) != 0)) {
					{
					setState(116);
					phrase();
					}
				}

				setState(121); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(119);
						match(MISSING_WORD);
						setState(120);
						phrase();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(123); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MISSING_WORD) {
					{
					setState(125);
					match(MISSING_WORD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MISSING_WORD) {
					{
					setState(133);
					match(MISSING_WORD);
					}
				}

				setState(139); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(136);
						phrase();
						setState(137);
						match(MISSING_WORD);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(141); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3276800L) != 0)) {
					{
					setState(143);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(QuestionGrammarParser.SOLUTION_ENTRY, 0); }
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
		enterRule(_localctx, 18, RULE_missing_word_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(SOLUTION_ENTRY);
			setState(149);
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
		public List<TerminalNode> COMMA() { return getTokens(QuestionGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QuestionGrammarParser.COMMA, i);
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
		enterRule(_localctx, 20, RULE_list_phrases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			phrase();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				phrase();
				}
				}
				setState(158);
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
		public TerminalNode HASH() { return getToken(QuestionGrammarParser.HASH, 0); }
		public TerminalNode SA_Q() { return getToken(QuestionGrammarParser.SA_Q, 0); }
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public Short_answer_solutionContext short_answer_solution() {
			return getRuleContext(Short_answer_solutionContext.class,0);
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
		enterRule(_localctx, 22, RULE_short_answer_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(HASH);
			setState(160);
			match(SA_Q);
			setState(161);
			points();
			setState(162);
			question();
			setState(163);
			short_answer_solution();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(164);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(QuestionGrammarParser.SOLUTION_ENTRY, 0); }
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
		enterRule(_localctx, 24, RULE_short_answer_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(SOLUTION_ENTRY);
			setState(168);
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
		public TerminalNode HASH() { return getToken(QuestionGrammarParser.HASH, 0); }
		public TerminalNode N_Q() { return getToken(QuestionGrammarParser.N_Q, 0); }
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public Numerical_answerContext numerical_answer() {
			return getRuleContext(Numerical_answerContext.class,0);
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
		enterRule(_localctx, 26, RULE_numerical_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(HASH);
			setState(171);
			match(N_Q);
			setState(172);
			points();
			setState(173);
			question();
			setState(174);
			numerical_answer();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(175);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(QuestionGrammarParser.SOLUTION_ENTRY, 0); }
		public List<TerminalNode> INT() { return getTokens(QuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(QuestionGrammarParser.INT, i);
		}
		public TerminalNode WORD() { return getToken(QuestionGrammarParser.WORD, 0); }
		public TerminalNode COMMA() { return getToken(QuestionGrammarParser.COMMA, 0); }
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
		enterRule(_localctx, 28, RULE_numerical_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SOLUTION_ENTRY);
			setState(179);
			match(INT);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(180);
				match(COMMA);
				setState(181);
				match(INT);
				}
			}

			setState(184);
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
	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode QUESTION_ENTRY() { return getToken(QuestionGrammarParser.QUESTION_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGrammarListener ) ((QuestionGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGrammarVisitor ) return ((QuestionGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				match(NEWLINE);
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(191);
			match(QUESTION_ENTRY);
			setState(192);
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
		public TerminalNode POINTS_ENTRY() { return getToken(QuestionGrammarParser.POINTS_ENTRY, 0); }
		public TerminalNode INT() { return getToken(QuestionGrammarParser.INT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 32, RULE_points);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			setState(199);
			match(POINTS_ENTRY);
			setState(200);
			match(INT);
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
		public TerminalNode FEEDBACK_ENTRY() { return getToken(QuestionGrammarParser.FEEDBACK_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
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
		enterRule(_localctx, 34, RULE_feedback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(NEWLINE);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(207);
			match(FEEDBACK_ENTRY);
			setState(208);
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
		enterRule(_localctx, 36, RULE_phrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANY_CHAR) {
				{
				{
				setState(210);
				match(ANY_CHAR);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANY_CHAR) {
					{
					{
					setState(218); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(217);
							match(ANY_CHAR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(220); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD || _la==INT );
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
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionGrammarParser.NEWLINE, i);
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
		enterRule(_localctx, 38, RULE_list_with_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				match(NEWLINE);
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(236);
			title_list();
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(237);
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
		enterRule(_localctx, 40, RULE_title_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			phrase();
			setState(241);
			match(COLON);
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
		enterRule(_localctx, 42, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(243);
					topic_list();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(246); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 44, RULE_topic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(NEWLINE);
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(253);
			match(DASH);
			setState(254);
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
		"\u0004\u0001\u0016\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u00005\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001>\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003K\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004S\b\u0004\u000b\u0004\f\u0004"+
		"T\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005]\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007"+
		"h\b\u0007\u000b\u0007\f\u0007i\u0001\u0007\u0001\u0007\u0003\u0007n\b"+
		"\u0007\u0001\b\u0004\bq\b\b\u000b\b\f\br\u0001\b\u0003\bv\b\b\u0001\b"+
		"\u0001\b\u0004\bz\b\b\u000b\b\f\b{\u0001\b\u0003\b\u007f\b\b\u0001\b\u0004"+
		"\b\u0082\b\b\u000b\b\f\b\u0083\u0001\b\u0003\b\u0087\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0004\b\u008c\b\b\u000b\b\f\b\u008d\u0001\b\u0003\b\u0091\b"+
		"\b\u0003\b\u0093\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u009b\b\n\n\n\f\n\u009e\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a6\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b1"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b7"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00bc\b\u000f"+
		"\u000b\u000f\f\u000f\u00bd\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010\u00c4\b\u0010\u000b\u0010\f\u0010\u00c5\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u00cc\b\u0011\u000b\u0011\f"+
		"\u0011\u00cd\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0005\u0012"+
		"\u00d4\b\u0012\n\u0012\f\u0012\u00d7\t\u0012\u0001\u0012\u0001\u0012\u0004"+
		"\u0012\u00db\b\u0012\u000b\u0012\f\u0012\u00dc\u0005\u0012\u00df\b\u0012"+
		"\n\u0012\f\u0012\u00e2\t\u0012\u0004\u0012\u00e4\b\u0012\u000b\u0012\f"+
		"\u0012\u00e5\u0001\u0013\u0004\u0013\u00e9\b\u0013\u000b\u0013\f\u0013"+
		"\u00ea\u0001\u0013\u0001\u0013\u0003\u0013\u00ef\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u00f5\b\u0015\u000b\u0015\f"+
		"\u0015\u00f6\u0001\u0016\u0004\u0016\u00fa\b\u0016\u000b\u0016\f\u0016"+
		"\u00fb\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,\u0000\u0001\u0002\u0000\u0011\u0011\u0014\u0014\u010c"+
		"\u00004\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004?"+
		"\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bL\u0001\u0000"+
		"\u0000\u0000\nV\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000e"+
		"a\u0001\u0000\u0000\u0000\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u0094"+
		"\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016\u009f"+
		"\u0001\u0000\u0000\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00aa"+
		"\u0001\u0000\u0000\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00bb"+
		"\u0001\u0000\u0000\u0000 \u00c3\u0001\u0000\u0000\u0000\"\u00cb\u0001"+
		"\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000&\u00e8\u0001\u0000\u0000"+
		"\u0000(\u00f0\u0001\u0000\u0000\u0000*\u00f4\u0001\u0000\u0000\u0000,"+
		"\u00f9\u0001\u0000\u0000\u0000.5\u0003\u0006\u0003\u0000/5\u0003\u000e"+
		"\u0007\u000005\u0003\n\u0005\u000015\u0003\u0002\u0001\u000025\u0003\u0016"+
		"\u000b\u000035\u0003\u001a\r\u00004.\u0001\u0000\u0000\u00004/\u0001\u0000"+
		"\u0000\u000040\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u0001\u0001\u0000\u0000"+
		"\u000067\u0005\u000f\u0000\u000078\u0005\u0006\u0000\u000089\u0003 \u0010"+
		"\u00009:\u0003\u001e\u000f\u0000:;\u0003&\u0013\u0000;=\u0003\u0004\u0002"+
		"\u0000<>\u0003\"\u0011\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0005\u0001\u0000\u0000@A\u0003"+
		"\u0014\n\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u000f\u0000\u0000"+
		"CD\u0005\u000b\u0000\u0000DE\u0003 \u0010\u0000EF\u0003\u001e\u000f\u0000"+
		"FG\u0003&\u0013\u0000GH\u0003&\u0013\u0000HJ\u0003\b\u0004\u0000IK\u0003"+
		"\"\u0011\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0007"+
		"\u0001\u0000\u0000\u0000LR\u0005\u0001\u0000\u0000MN\u0005\u0010\u0000"+
		"\u0000NO\u0003$\u0012\u0000OP\u0005\u0013\u0000\u0000PQ\u0003$\u0012\u0000"+
		"QS\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\t\u0001\u0000"+
		"\u0000\u0000VW\u0005\u000f\u0000\u0000WX\u0005\n\u0000\u0000XY\u0003 "+
		"\u0010\u0000YZ\u0003\u001e\u000f\u0000Z\\\u0003\f\u0006\u0000[]\u0003"+
		"\"\u0011\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]"+
		"\u000b\u0001\u0000\u0000\u0000^_\u0005\u0001\u0000\u0000_`\u0005\u0002"+
		"\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\u000f\u0000\u0000bc\u0005"+
		"\t\u0000\u0000cd\u0003 \u0010\u0000de\u0003\u001e\u000f\u0000eg\u0003"+
		"\u0010\b\u0000fh\u0003&\u0013\u0000gf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000km\u0003\u0012\t\u0000ln\u0003\"\u0011\u0000"+
		"ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000f\u0001\u0000"+
		"\u0000\u0000oq\u0005\u0010\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tv\u0003$\u0012\u0000ut\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wx\u0005\u0016\u0000"+
		"\u0000xz\u0003$\u0012\u0000yw\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}\u007f\u0005\u0016\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0093\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0005\u0010\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0005\u0016\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u008b\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0003$\u0012\u0000\u0089\u008a\u0005\u0016\u0000\u0000\u008a\u008c"+
		"\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0003$\u0012\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092p\u0001\u0000"+
		"\u0000\u0000\u0092\u0081\u0001\u0000\u0000\u0000\u0093\u0011\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0001\u0000\u0000\u0095\u0096\u0003\u0014"+
		"\n\u0000\u0096\u0013\u0001\u0000\u0000\u0000\u0097\u009c\u0003$\u0012"+
		"\u0000\u0098\u0099\u0005\r\u0000\u0000\u0099\u009b\u0003$\u0012\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u00a1\u0005\b\u0000\u0000\u00a1"+
		"\u00a2\u0003 \u0010\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a5"+
		"\u0003\u0018\f\u0000\u00a4\u00a6\u0003\"\u0011\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0017\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000\u00a8\u00a9\u0003"+
		"$\u0012\u0000\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u000f"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac\u00ad\u0003 \u0010"+
		"\u0000\u00ad\u00ae\u0003\u001e\u000f\u0000\u00ae\u00b0\u0003\u001c\u000e"+
		"\u0000\u00af\u00b1\u0003\"\u0011\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u001b\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b6\u0005\u0014\u0000\u0000"+
		"\u00b4\u00b5\u0005\r\u0000\u0000\u00b5\u00b7\u0005\u0014\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0011\u0000\u0000\u00b9"+
		"\u001d\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u0010\u0000\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0"+
		"\u00c1\u0003$\u0012\u0000\u00c1\u001f\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0005\u0010\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0005\u0000\u0000\u00c8\u00c9\u0005\u0014\u0000\u0000\u00c9!\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cc\u0005\u0010\u0000\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0\u00d1\u0003"+
		"$\u0012\u0000\u00d1#\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005\u0015\u0000"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00e3\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00e0\u0007\u0000\u0000\u0000\u00d9\u00db\u0005\u0015\u0000"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6%\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e9\u0005\u0010\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ee\u0003(\u0014\u0000\u00ed\u00ef\u0003*\u0015\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\'\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0003$\u0012\u0000\u00f1\u00f2\u0005\u0012"+
		"\u0000\u0000\u00f2)\u0001\u0000\u0000\u0000\u00f3\u00f5\u0003,\u0016\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7+\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\u0010\u0000\u0000\u00f9"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0013\u0000\u0000\u00fe"+
		"\u00ff\u0003$\u0012\u0000\u00ff-\u0001\u0000\u0000\u0000\u001f4=JT\\i"+
		"mru{~\u0083\u0086\u008d\u0090\u0092\u009c\u00a5\u00b0\u00b6\u00bd\u00c5"+
		"\u00cd\u00d5\u00dc\u00e0\u00e5\u00ea\u00ee\u00f6\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}