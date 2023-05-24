// Generated from D:/Uni_2ano_2sem/SEM_4_PI/sem4pi-22-23-24/base.core/src/main/antlr4\ExamGrammar.g4 by ANTLR 4.12.0
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
public class ExamGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SOLUTION_ENTRY=1, TRUE_FALSE_RESPONSES=2, HEADER_ENTRY=3, SECTION_ENTRY=4, 
		SECTION_DESCRIPTION_ENTRY=5, FEEDBACK_ENTRY=6, QUESTION_ENTRY=7, POINTS_ENTRY=8, 
		COMMA=9, WS=10, HASH=11, NEWLINE=12, WORD=13, COLON=14, DASH=15, INT=16, 
		ANY_CHAR=17, MISSING_WORD=18;
	public static final int
		RULE_prog = 0, RULE_question_type = 1, RULE_multiple_choice_question = 2, 
		RULE_multiple_choice_solution = 3, RULE_matching_type_question = 4, RULE_matching_type_solution = 5, 
		RULE_true_false_question = 6, RULE_true_false_solution = 7, RULE_select_missing_words = 8, 
		RULE_missing_word_phrase = 9, RULE_missing_word_solution = 10, RULE_list_phrases = 11, 
		RULE_short_answer_question = 12, RULE_short_answer_solution = 13, RULE_numerical_question = 14, 
		RULE_numerical_answer = 15, RULE_question = 16, RULE_points = 17, RULE_feedback = 18, 
		RULE_phrase = 19, RULE_list_with_title = 20, RULE_title_list = 21, RULE_list = 22, 
		RULE_topic_list = 23, RULE_header = 24, RULE_section = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "question_type", "multiple_choice_question", "multiple_choice_solution", 
			"matching_type_question", "matching_type_solution", "true_false_question", 
			"true_false_solution", "select_missing_words", "missing_word_phrase", 
			"missing_word_solution", "list_phrases", "short_answer_question", "short_answer_solution", 
			"numerical_question", "numerical_answer", "question", "points", "feedback", 
			"phrase", "list_with_title", "title_list", "list", "topic_list", "header", 
			"section"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "','", null, "'#'", 
			null, null, "':'", "'-'", null, null, "'||WORD||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SOLUTION_ENTRY", "TRUE_FALSE_RESPONSES", "HEADER_ENTRY", "SECTION_ENTRY", 
			"SECTION_DESCRIPTION_ENTRY", "FEEDBACK_ENTRY", "QUESTION_ENTRY", "POINTS_ENTRY", 
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
	public String getGrammarFileName() { return "ExamGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExamGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public List<Question_typeContext> question_type() {
			return getRuleContexts(Question_typeContext.class);
		}
		public Question_typeContext question_type(int i) {
			return getRuleContext(Question_typeContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			header();
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					match(NEWLINE);
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(58);
				section();
				setState(60); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(59);
						question_type();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(62); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(66); 
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
	public static class Question_typeContext extends ParserRuleContext {
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
		public Question_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterQuestion_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitQuestion_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitQuestion_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_typeContext question_type() throws RecognitionException {
		Question_typeContext _localctx = new Question_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question_type);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				matching_type_question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				select_missing_words();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				true_false_question();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				multiple_choice_question();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				short_answer_question();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMultiple_choice_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMultiple_choice_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMultiple_choice_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_questionContext multiple_choice_question() throws RecognitionException {
		Multiple_choice_questionContext _localctx = new Multiple_choice_questionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiple_choice_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			points();
			setState(77);
			question();
			setState(78);
			list_with_title();
			setState(79);
			multiple_choice_solution();
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(80);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(ExamGrammarParser.SOLUTION_ENTRY, 0); }
		public List_phrasesContext list_phrases() {
			return getRuleContext(List_phrasesContext.class,0);
		}
		public Multiple_choice_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMultiple_choice_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMultiple_choice_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMultiple_choice_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_solutionContext multiple_choice_solution() throws RecognitionException {
		Multiple_choice_solutionContext _localctx = new Multiple_choice_solutionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiple_choice_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(SOLUTION_ENTRY);
			setState(84);
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMatching_type_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMatching_type_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMatching_type_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_type_questionContext matching_type_question() throws RecognitionException {
		Matching_type_questionContext _localctx = new Matching_type_questionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matching_type_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			points();
			setState(87);
			question();
			setState(88);
			list_with_title();
			setState(89);
			list_with_title();
			setState(90);
			matching_type_solution();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(91);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(ExamGrammarParser.SOLUTION_ENTRY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> DASH() { return getTokens(ExamGrammarParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(ExamGrammarParser.DASH, i);
		}
		public Matching_type_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_type_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMatching_type_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMatching_type_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMatching_type_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_type_solutionContext matching_type_solution() throws RecognitionException {
		Matching_type_solutionContext _localctx = new Matching_type_solutionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matching_type_solution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SOLUTION_ENTRY);
			setState(100); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95);
					match(NEWLINE);
					setState(96);
					phrase();
					setState(97);
					match(DASH);
					setState(98);
					phrase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102); 
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
	public static class True_false_questionContext extends ParserRuleContext {
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterTrue_false_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitTrue_false_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitTrue_false_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_false_questionContext true_false_question() throws RecognitionException {
		True_false_questionContext _localctx = new True_false_questionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_true_false_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			points();
			setState(105);
			question();
			setState(106);
			true_false_solution();
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(107);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(ExamGrammarParser.SOLUTION_ENTRY, 0); }
		public TerminalNode TRUE_FALSE_RESPONSES() { return getToken(ExamGrammarParser.TRUE_FALSE_RESPONSES, 0); }
		public True_false_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterTrue_false_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitTrue_false_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitTrue_false_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_false_solutionContext true_false_solution() throws RecognitionException {
		True_false_solutionContext _localctx = new True_false_solutionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_true_false_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(SOLUTION_ENTRY);
			setState(111);
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterSelect_missing_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitSelect_missing_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitSelect_missing_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_missing_wordsContext select_missing_words() throws RecognitionException {
		Select_missing_wordsContext _localctx = new Select_missing_wordsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_select_missing_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			points();
			setState(114);
			question();
			setState(115);
			missing_word_phrase();
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				list_with_title();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(121);
			missing_word_solution();
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(122);
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
	public static class Missing_word_phraseContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> MISSING_WORD() { return getTokens(ExamGrammarParser.MISSING_WORD); }
		public TerminalNode MISSING_WORD(int i) {
			return getToken(ExamGrammarParser.MISSING_WORD, i);
		}
		public Missing_word_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_word_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMissing_word_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMissing_word_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMissing_word_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_word_phraseContext missing_word_phrase() throws RecognitionException {
		Missing_word_phraseContext _localctx = new Missing_word_phraseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_missing_word_phrase);
		int _la;
		try {
			int _alt;
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					match(NEWLINE);
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 204800L) != 0)) {
					{
					setState(130);
					phrase();
					}
				}

				setState(135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(133);
						match(MISSING_WORD);
						setState(134);
						phrase();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MISSING_WORD) {
					{
					setState(139);
					match(MISSING_WORD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					match(NEWLINE);
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MISSING_WORD) {
					{
					setState(147);
					match(MISSING_WORD);
					}
				}

				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						phrase();
						setState(151);
						match(MISSING_WORD);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 204800L) != 0)) {
					{
					setState(157);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(ExamGrammarParser.SOLUTION_ENTRY, 0); }
		public List_phrasesContext list_phrases() {
			return getRuleContext(List_phrasesContext.class,0);
		}
		public Missing_word_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_word_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMissing_word_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMissing_word_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMissing_word_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_word_solutionContext missing_word_solution() throws RecognitionException {
		Missing_word_solutionContext _localctx = new Missing_word_solutionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_missing_word_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(SOLUTION_ENTRY);
			setState(163);
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
		public List<TerminalNode> COMMA() { return getTokens(ExamGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExamGrammarParser.COMMA, i);
		}
		public List_phrasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_phrases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterList_phrases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitList_phrases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitList_phrases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_phrasesContext list_phrases() throws RecognitionException {
		List_phrasesContext _localctx = new List_phrasesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list_phrases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			phrase();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				phrase();
				}
				}
				setState(172);
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterShort_answer_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitShort_answer_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitShort_answer_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_answer_questionContext short_answer_question() throws RecognitionException {
		Short_answer_questionContext _localctx = new Short_answer_questionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_short_answer_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			points();
			setState(174);
			question();
			setState(175);
			short_answer_solution();
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(176);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(ExamGrammarParser.SOLUTION_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public Short_answer_solutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_answer_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterShort_answer_solution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitShort_answer_solution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitShort_answer_solution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_answer_solutionContext short_answer_solution() throws RecognitionException {
		Short_answer_solutionContext _localctx = new Short_answer_solutionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_short_answer_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(SOLUTION_ENTRY);
			setState(180);
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterNumerical_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitNumerical_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitNumerical_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_questionContext numerical_question() throws RecognitionException {
		Numerical_questionContext _localctx = new Numerical_questionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numerical_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			points();
			setState(183);
			question();
			setState(184);
			numerical_answer();
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(185);
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
		public TerminalNode SOLUTION_ENTRY() { return getToken(ExamGrammarParser.SOLUTION_ENTRY, 0); }
		public List<TerminalNode> INT() { return getTokens(ExamGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExamGrammarParser.INT, i);
		}
		public TerminalNode WORD() { return getToken(ExamGrammarParser.WORD, 0); }
		public TerminalNode COMMA() { return getToken(ExamGrammarParser.COMMA, 0); }
		public Numerical_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterNumerical_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitNumerical_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitNumerical_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_answerContext numerical_answer() throws RecognitionException {
		Numerical_answerContext _localctx = new Numerical_answerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numerical_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(SOLUTION_ENTRY);
			setState(189);
			match(INT);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(190);
				match(COMMA);
				setState(191);
				match(INT);
				}
			}

			setState(194);
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
		public TerminalNode QUESTION_ENTRY() { return getToken(ExamGrammarParser.QUESTION_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				match(NEWLINE);
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(201);
			match(QUESTION_ENTRY);
			setState(202);
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
		public TerminalNode POINTS_ENTRY() { return getToken(ExamGrammarParser.POINTS_ENTRY, 0); }
		public TerminalNode INT() { return getToken(ExamGrammarParser.INT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitPoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitPoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_points);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				match(NEWLINE);
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(209);
			match(POINTS_ENTRY);
			setState(210);
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
		public TerminalNode FEEDBACK_ENTRY() { return getToken(ExamGrammarParser.FEEDBACK_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public FeedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterFeedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitFeedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitFeedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackContext feedback() throws RecognitionException {
		FeedbackContext _localctx = new FeedbackContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_feedback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				match(NEWLINE);
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(217);
			match(FEEDBACK_ENTRY);
			setState(218);
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
		public List<TerminalNode> ANY_CHAR() { return getTokens(ExamGrammarParser.ANY_CHAR); }
		public TerminalNode ANY_CHAR(int i) {
			return getToken(ExamGrammarParser.ANY_CHAR, i);
		}
		public List<TerminalNode> WORD() { return getTokens(ExamGrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ExamGrammarParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExamGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExamGrammarParser.INT, i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_phrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANY_CHAR) {
				{
				{
				setState(220);
				match(ANY_CHAR);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANY_CHAR) {
					{
					{
					setState(228); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(227);
							match(ANY_CHAR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(230); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(239); 
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
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterList_with_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitList_with_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitList_with_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_with_titleContext list_with_title() throws RecognitionException {
		List_with_titleContext _localctx = new List_with_titleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_with_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				match(NEWLINE);
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(246);
			title_list();
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(247);
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
		public TerminalNode COLON() { return getToken(ExamGrammarParser.COLON, 0); }
		public Title_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterTitle_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitTitle_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitTitle_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Title_listContext title_list() throws RecognitionException {
		Title_listContext _localctx = new Title_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_title_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			phrase();
			setState(251);
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
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(253);
					topic_list();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(256); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode DASH() { return getToken(ExamGrammarParser.DASH, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public Topic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topic_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterTopic_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitTopic_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitTopic_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Topic_listContext topic_list() throws RecognitionException {
		Topic_listContext _localctx = new Topic_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_topic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			match(DASH);
			setState(264);
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
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER_ENTRY() { return getToken(ExamGrammarParser.HEADER_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(HEADER_ENTRY);
			setState(267);
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
	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION_ENTRY() { return getToken(ExamGrammarParser.SECTION_ENTRY, 0); }
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public TerminalNode SECTION_DESCRIPTION_ENTRY() { return getToken(ExamGrammarParser.SECTION_DESCRIPTION_ENTRY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(SECTION_ENTRY);
			setState(270);
			phrase();
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(271);
					match(NEWLINE);
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(276);
				match(SECTION_DESCRIPTION_ENTRY);
				setState(277);
				phrase();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u0119\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0004\u00007\b"+
		"\u0000\u000b\u0000\f\u00008\u0001\u0000\u0001\u0000\u0004\u0000=\b\u0000"+
		"\u000b\u0000\f\u0000>\u0004\u0000A\b\u0000\u000b\u0000\f\u0000B\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001K\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002R\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004]\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005e\b\u0005\u000b\u0005\f\u0005f\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0004\bv\b\b"+
		"\u000b\b\f\bw\u0001\b\u0001\b\u0003\b|\b\b\u0001\t\u0004\t\u007f\b\t\u000b"+
		"\t\f\t\u0080\u0001\t\u0003\t\u0084\b\t\u0001\t\u0001\t\u0004\t\u0088\b"+
		"\t\u000b\t\f\t\u0089\u0001\t\u0003\t\u008d\b\t\u0001\t\u0004\t\u0090\b"+
		"\t\u000b\t\f\t\u0091\u0001\t\u0003\t\u0095\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0004\t\u009a\b\t\u000b\t\f\t\u009b\u0001\t\u0003\t\u009f\b\t\u0003\t"+
		"\u00a1\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00a9\b\u000b\n\u000b\f\u000b\u00ac\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00b2\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bb\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c1\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010\u00c6\b\u0010\u000b\u0010\f\u0010"+
		"\u00c7\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u00ce"+
		"\b\u0011\u000b\u0011\f\u0011\u00cf\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0004\u0012\u00d6\b\u0012\u000b\u0012\f\u0012\u00d7\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0005\u0013\u00de\b\u0013\n"+
		"\u0013\f\u0013\u00e1\t\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u00e5"+
		"\b\u0013\u000b\u0013\f\u0013\u00e6\u0005\u0013\u00e9\b\u0013\n\u0013\f"+
		"\u0013\u00ec\t\u0013\u0004\u0013\u00ee\b\u0013\u000b\u0013\f\u0013\u00ef"+
		"\u0001\u0014\u0004\u0014\u00f3\b\u0014\u000b\u0014\f\u0014\u00f4\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00f9\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016\u00ff\b\u0016\u000b\u0016\f\u0016\u0100"+
		"\u0001\u0017\u0004\u0017\u0104\b\u0017\u000b\u0017\f\u0017\u0105\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u0111\b\u0019\u000b\u0019\f"+
		"\u0019\u0112\u0001\u0019\u0001\u0019\u0003\u0019\u0117\b\u0019\u0001\u0019"+
		"\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0001\u0002\u0000\r\r"+
		"\u0010\u0010\u0126\u00004\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000"+
		"\u0000\u0004L\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\b"+
		"V\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000"+
		"\u0000\u000en\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012"+
		"\u00a0\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016"+
		"\u00a5\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000\u0000\u0000\u001a"+
		"\u00b3\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000\u0000\u0000\u001e"+
		"\u00bc\u0001\u0000\u0000\u0000 \u00c5\u0001\u0000\u0000\u0000\"\u00cd"+
		"\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000&\u00df\u0001\u0000"+
		"\u0000\u0000(\u00f2\u0001\u0000\u0000\u0000*\u00fa\u0001\u0000\u0000\u0000"+
		",\u00fe\u0001\u0000\u0000\u0000.\u0103\u0001\u0000\u0000\u00000\u010a"+
		"\u0001\u0000\u0000\u00002\u010d\u0001\u0000\u0000\u00004@\u00030\u0018"+
		"\u000057\u0005\f\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:<\u00032\u0019\u0000;=\u0003\u0002\u0001\u0000<;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@6\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\u0001\u0001\u0000\u0000\u0000DK\u0003\b\u0004\u0000EK\u0003\u0010"+
		"\b\u0000FK\u0003\f\u0006\u0000GK\u0003\u0004\u0002\u0000HK\u0003\u0018"+
		"\f\u0000IK\u0003\u001c\u000e\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000"+
		"\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0003\u0001\u0000\u0000"+
		"\u0000LM\u0003\"\u0011\u0000MN\u0003 \u0010\u0000NO\u0003(\u0014\u0000"+
		"OQ\u0003\u0006\u0003\u0000PR\u0003$\u0012\u0000QP\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0005\u0001"+
		"\u0000\u0000TU\u0003\u0016\u000b\u0000U\u0007\u0001\u0000\u0000\u0000"+
		"VW\u0003\"\u0011\u0000WX\u0003 \u0010\u0000XY\u0003(\u0014\u0000YZ\u0003"+
		"(\u0014\u0000Z\\\u0003\n\u0005\u0000[]\u0003$\u0012\u0000\\[\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000^d\u0005"+
		"\u0001\u0000\u0000_`\u0005\f\u0000\u0000`a\u0003&\u0013\u0000ab\u0005"+
		"\u000f\u0000\u0000bc\u0003&\u0013\u0000ce\u0001\u0000\u0000\u0000d_\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000hi\u0003\"\u0011"+
		"\u0000ij\u0003 \u0010\u0000jl\u0003\u000e\u0007\u0000km\u0003$\u0012\u0000"+
		"lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\r\u0001\u0000\u0000"+
		"\u0000no\u0005\u0001\u0000\u0000op\u0005\u0002\u0000\u0000p\u000f\u0001"+
		"\u0000\u0000\u0000qr\u0003\"\u0011\u0000rs\u0003 \u0010\u0000su\u0003"+
		"\u0012\t\u0000tv\u0003(\u0014\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0003\u0014\n\u0000z|\u0003$\u0012\u0000"+
		"{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0011\u0001\u0000"+
		"\u0000\u0000}\u007f\u0005\f\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0003&\u0013\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u0012\u0000\u0000\u0086\u0088\u0003&\u0013\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0005\u0012\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u00a1\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0005\f\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0005\u0012\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0099\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0003&\u0013\u0000\u0097\u0098\u0005\u0012\u0000\u0000"+
		"\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0003&\u0013\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0"+
		"~\u0001\u0000\u0000\u0000\u00a0\u008f\u0001\u0000\u0000\u0000\u00a1\u0013"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00a4"+
		"\u0003\u0016\u000b\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00aa"+
		"\u0003&\u0013\u0000\u00a6\u00a7\u0005\t\u0000\u0000\u00a7\u00a9\u0003"+
		"&\u0013\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u0017\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0003\"\u0011\u0000\u00ae\u00af\u0003 \u0010"+
		"\u0000\u00af\u00b1\u0003\u001a\r\u0000\u00b0\u00b2\u0003$\u0012\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0001\u0000\u0000"+
		"\u00b4\u00b5\u0003&\u0013\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0003\"\u0011\u0000\u00b7\u00b8\u0003 \u0010\u0000\u00b8\u00ba"+
		"\u0003\u001e\u000f\u0000\u00b9\u00bb\u0003$\u0012\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u001d\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0001\u0000\u0000\u00bd\u00c0\u0005"+
		"\u0010\u0000\u0000\u00be\u00bf\u0005\t\u0000\u0000\u00bf\u00c1\u0005\u0010"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\r\u0000"+
		"\u0000\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005\f\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0007\u0000\u0000"+
		"\u00ca\u00cb\u0003&\u0013\u0000\u00cb!\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0005\f\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\b\u0000\u0000\u00d2\u00d3\u0005\u0010\u0000\u0000\u00d3#\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0005\f\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00db\u0003&\u0013\u0000"+
		"\u00db%\u0001\u0000\u0000\u0000\u00dc\u00de\u0005\u0011\u0000\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00ed\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2"+
		"\u00ea\u0007\u0000\u0000\u0000\u00e3\u00e5\u0005\u0011\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ed\u00e2\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\'\u0001\u0000\u0000\u0000\u00f1\u00f3"+
		"\u0005\f\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003"+
		"*\u0015\u0000\u00f7\u00f9\u0003,\u0016\u0000\u00f8\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9)\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0003&\u0013\u0000\u00fb\u00fc\u0005\u000e\u0000\u0000\u00fc"+
		"+\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003.\u0017\u0000\u00fe\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101-\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0005\f\u0000\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0005\u000f\u0000\u0000\u0108\u0109\u0003&\u0013\u0000"+
		"\u0109/\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0003\u0000\u0000\u010b"+
		"\u010c\u0003&\u0013\u0000\u010c1\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"\u0004\u0000\u0000\u010e\u0116\u0003&\u0013\u0000\u010f\u0111\u0005\f"+
		"\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0005"+
		"\u0000\u0000\u0115\u0117\u0003&\u0013\u0000\u0116\u0110\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u01173\u0001\u0000\u0000\u0000"+
		"$8>BJQ\\flw{\u0080\u0083\u0089\u008c\u0091\u0094\u009b\u009e\u00a0\u00aa"+
		"\u00b1\u00ba\u00c0\u00c7\u00cf\u00d7\u00df\u00e6\u00ea\u00ef\u00f4\u00f8"+
		"\u0100\u0105\u0112\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}