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
		SOLUTION_ENTRY=1, TRUE_FALSE_RESPONSES=2, TITLE_ENTRY=3, SECTION_ENTRY=4, 
		SECTION_DESCRIPTION_ENTRY=5, FEEDBACK_ENTRY=6, QUESTION_ENTRY=7, POINTS_ENTRY=8, 
		TYPE_OF_GRADE_ENTRY=9, TYPE_OF_FEEDBACK_ENTRY=10, HEADER_DESCRIPTION_ENTRY=11, 
		WITH_PARAM=12, WITHOUT_PARAM=13, COMMA=14, WS=15, HASH=16, NEWLINE=17, 
		WORD=18, COLON=19, DASH=20, INT=21, ANY_CHAR=22, MISSING_WORD=23;
	public static final int
		RULE_prog = 0, RULE_question_type_with_feedback = 1, RULE_question_type_without_feedback = 2, 
		RULE_type_of_grade = 3, RULE_type_of_feedback = 4, RULE_header_description = 5, 
		RULE_multiple_choice_question = 6, RULE_multiple_choice_solution = 7, 
		RULE_matching_type_question = 8, RULE_matching_type_solution = 9, RULE_true_false_question = 10, 
		RULE_true_false_solution = 11, RULE_select_missing_words = 12, RULE_missing_word_phrase = 13, 
		RULE_missing_word_solution = 14, RULE_list_phrases = 15, RULE_short_answer_question = 16, 
		RULE_short_answer_solution = 17, RULE_numerical_question = 18, RULE_numerical_answer = 19, 
		RULE_question = 20, RULE_points = 21, RULE_feedback = 22, RULE_phrase = 23, 
		RULE_list_with_title = 24, RULE_title_list = 25, RULE_list = 26, RULE_topic_list = 27, 
		RULE_title = 28, RULE_section = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "question_type_with_feedback", "question_type_without_feedback", 
			"type_of_grade", "type_of_feedback", "header_description", "multiple_choice_question", 
			"multiple_choice_solution", "matching_type_question", "matching_type_solution", 
			"true_false_question", "true_false_solution", "select_missing_words", 
			"missing_word_phrase", "missing_word_solution", "list_phrases", "short_answer_question", 
			"short_answer_solution", "numerical_question", "numerical_answer", "question", 
			"points", "feedback", "phrase", "list_with_title", "title_list", "list", 
			"topic_list", "title", "section"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "','", null, "'#'", null, null, "':'", "'-'", null, null, 
			"'||WORD||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SOLUTION_ENTRY", "TRUE_FALSE_RESPONSES", "TITLE_ENTRY", "SECTION_ENTRY", 
			"SECTION_DESCRIPTION_ENTRY", "FEEDBACK_ENTRY", "QUESTION_ENTRY", "POINTS_ENTRY", 
			"TYPE_OF_GRADE_ENTRY", "TYPE_OF_FEEDBACK_ENTRY", "HEADER_DESCRIPTION_ENTRY", 
			"WITH_PARAM", "WITHOUT_PARAM", "COMMA", "WS", "HASH", "NEWLINE", "WORD", 
			"COLON", "DASH", "INT", "ANY_CHAR", "MISSING_WORD"
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
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public Type_of_gradeContext type_of_grade() {
			return getRuleContext(Type_of_gradeContext.class,0);
		}
		public Type_of_feedbackContext type_of_feedback() {
			return getRuleContext(Type_of_feedbackContext.class,0);
		}
		public TerminalNode WITH_PARAM() { return getToken(ExamGrammarParser.WITH_PARAM, 0); }
		public TerminalNode WITHOUT_PARAM() { return getToken(ExamGrammarParser.WITHOUT_PARAM, 0); }
		public Header_descriptionContext header_description() {
			return getRuleContext(Header_descriptionContext.class,0);
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
		public List<Question_type_with_feedbackContext> question_type_with_feedback() {
			return getRuleContexts(Question_type_with_feedbackContext.class);
		}
		public Question_type_with_feedbackContext question_type_with_feedback(int i) {
			return getRuleContext(Question_type_with_feedbackContext.class,i);
		}
		public List<Question_type_without_feedbackContext> question_type_without_feedback() {
			return getRuleContexts(Question_type_without_feedbackContext.class);
		}
		public Question_type_without_feedbackContext question_type_without_feedback(int i) {
			return getRuleContext(Question_type_without_feedbackContext.class,i);
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
			setState(60);
			title();
			setState(61);
			type_of_grade();
			setState(62);
			type_of_feedback();
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH_PARAM:
				{
				{
				setState(63);
				match(WITH_PARAM);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					header_description();
					}
					break;
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(67);
						match(NEWLINE);
						}
						}
						setState(70); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(72);
					section();
					setState(74); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(73);
							question_type_with_feedback();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(76); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				break;
			case WITHOUT_PARAM:
				{
				{
				setState(82);
				match(WITHOUT_PARAM);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(83);
					header_description();
					}
					break;
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(86);
						match(NEWLINE);
						}
						}
						setState(89); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(91);
					section();
					setState(93); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(92);
							question_type_without_feedback();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(95); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Question_type_with_feedbackContext extends ParserRuleContext {
		public Matching_type_questionContext matching_type_question() {
			return getRuleContext(Matching_type_questionContext.class,0);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
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
		public Question_type_with_feedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_type_with_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterQuestion_type_with_feedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitQuestion_type_with_feedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitQuestion_type_with_feedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_type_with_feedbackContext question_type_with_feedback() throws RecognitionException {
		Question_type_with_feedbackContext _localctx = new Question_type_with_feedbackContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question_type_with_feedback);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(103);
				matching_type_question();
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(104);
					feedback();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(107);
				select_missing_words();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(108);
					feedback();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(111);
				true_false_question();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(112);
					feedback();
					}
					break;
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(115);
				multiple_choice_question();
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(116);
					feedback();
					}
					break;
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(119);
				short_answer_question();
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(120);
					feedback();
					}
					break;
				}
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(123);
				numerical_question();
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(124);
					feedback();
					}
					break;
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
	public static class Question_type_without_feedbackContext extends ParserRuleContext {
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
		public Question_type_without_feedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_type_without_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterQuestion_type_without_feedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitQuestion_type_without_feedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitQuestion_type_without_feedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_type_without_feedbackContext question_type_without_feedback() throws RecognitionException {
		Question_type_without_feedbackContext _localctx = new Question_type_without_feedbackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question_type_without_feedback);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				matching_type_question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				select_missing_words();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				true_false_question();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				multiple_choice_question();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				short_answer_question();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
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
	public static class Type_of_gradeContext extends ParserRuleContext {
		public TerminalNode TYPE_OF_GRADE_ENTRY() { return getToken(ExamGrammarParser.TYPE_OF_GRADE_ENTRY, 0); }
		public TerminalNode WITH_PARAM() { return getToken(ExamGrammarParser.WITH_PARAM, 0); }
		public TerminalNode WITHOUT_PARAM() { return getToken(ExamGrammarParser.WITHOUT_PARAM, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public Type_of_gradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_of_grade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterType_of_grade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitType_of_grade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitType_of_grade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_of_gradeContext type_of_grade() throws RecognitionException {
		Type_of_gradeContext _localctx = new Type_of_gradeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_of_grade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(NEWLINE);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(142);
			match(TYPE_OF_GRADE_ENTRY);
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==WITH_PARAM || _la==WITHOUT_PARAM) ) {
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
	public static class Type_of_feedbackContext extends ParserRuleContext {
		public TerminalNode TYPE_OF_FEEDBACK_ENTRY() { return getToken(ExamGrammarParser.TYPE_OF_FEEDBACK_ENTRY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public Type_of_feedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_of_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterType_of_feedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitType_of_feedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitType_of_feedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_of_feedbackContext type_of_feedback() throws RecognitionException {
		Type_of_feedbackContext _localctx = new Type_of_feedbackContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_of_feedback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				match(NEWLINE);
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(150);
			match(TYPE_OF_FEEDBACK_ENTRY);
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
	public static class Header_descriptionContext extends ParserRuleContext {
		public TerminalNode HEADER_DESCRIPTION_ENTRY() { return getToken(ExamGrammarParser.HEADER_DESCRIPTION_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExamGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExamGrammarParser.NEWLINE, i);
		}
		public Header_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterHeader_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitHeader_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitHeader_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_descriptionContext header_description() throws RecognitionException {
		Header_descriptionContext _localctx = new Header_descriptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_header_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
			match(HEADER_DESCRIPTION_ENTRY);
			setState(158);
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
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public List_with_titleContext list_with_title() {
			return getRuleContext(List_with_titleContext.class,0);
		}
		public Multiple_choice_solutionContext multiple_choice_solution() {
			return getRuleContext(Multiple_choice_solutionContext.class,0);
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
		enterRule(_localctx, 12, RULE_multiple_choice_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			points();
			setState(161);
			question();
			setState(162);
			list_with_title();
			setState(163);
			multiple_choice_solution();
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
		enterRule(_localctx, 14, RULE_multiple_choice_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SOLUTION_ENTRY);
			setState(166);
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
		enterRule(_localctx, 16, RULE_matching_type_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			points();
			setState(169);
			question();
			setState(170);
			list_with_title();
			setState(171);
			list_with_title();
			setState(172);
			matching_type_solution();
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
		enterRule(_localctx, 18, RULE_matching_type_solution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(SOLUTION_ENTRY);
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					match(NEWLINE);
					setState(176);
					phrase();
					setState(177);
					match(DASH);
					setState(178);
					phrase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 20, RULE_true_false_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			points();
			setState(185);
			question();
			setState(186);
			true_false_solution();
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
		enterRule(_localctx, 22, RULE_true_false_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(SOLUTION_ENTRY);
			setState(189);
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
		enterRule(_localctx, 24, RULE_select_missing_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			points();
			setState(192);
			question();
			setState(193);
			missing_word_phrase();
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				list_with_title();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(199);
			missing_word_solution();
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
		enterRule(_localctx, 26, RULE_missing_word_phrase);
		int _la;
		try {
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					match(NEWLINE);
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6553600L) != 0)) {
					{
					setState(206);
					phrase();
					}
				}

				setState(211); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(209);
						match(MISSING_WORD);
						setState(210);
						phrase();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(213); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MISSING_WORD) {
					{
					setState(215);
					match(MISSING_WORD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					match(NEWLINE);
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MISSING_WORD) {
					{
					setState(223);
					match(MISSING_WORD);
					}
				}

				setState(229); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						phrase();
						setState(227);
						match(MISSING_WORD);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(231); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6553600L) != 0)) {
					{
					setState(233);
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
		enterRule(_localctx, 28, RULE_missing_word_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(SOLUTION_ENTRY);
			setState(239);
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
		enterRule(_localctx, 30, RULE_list_phrases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			phrase();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				phrase();
				}
				}
				setState(248);
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
		enterRule(_localctx, 32, RULE_short_answer_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			points();
			setState(250);
			question();
			setState(251);
			short_answer_solution();
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
		enterRule(_localctx, 34, RULE_short_answer_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(SOLUTION_ENTRY);
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
		enterRule(_localctx, 36, RULE_numerical_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			points();
			setState(257);
			question();
			setState(258);
			numerical_answer();
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
		enterRule(_localctx, 38, RULE_numerical_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(SOLUTION_ENTRY);
			setState(261);
			match(INT);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(262);
				match(COMMA);
				setState(263);
				match(INT);
				}
			}

			setState(266);
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
		enterRule(_localctx, 40, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			match(QUESTION_ENTRY);
			setState(274);
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
		enterRule(_localctx, 42, RULE_points);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			match(POINTS_ENTRY);
			setState(282);
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
		enterRule(_localctx, 44, RULE_feedback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284);
				match(NEWLINE);
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(289);
			match(FEEDBACK_ENTRY);
			setState(290);
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
		enterRule(_localctx, 46, RULE_phrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANY_CHAR) {
				{
				{
				setState(292);
				match(ANY_CHAR);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANY_CHAR) {
					{
					{
					setState(300); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(299);
							match(ANY_CHAR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(302); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(311); 
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
		enterRule(_localctx, 48, RULE_list_with_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				match(NEWLINE);
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(318);
			title_list();
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(319);
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
		enterRule(_localctx, 50, RULE_title_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			phrase();
			setState(323);
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
		enterRule(_localctx, 52, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(325);
					topic_list();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 54, RULE_topic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				match(NEWLINE);
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(335);
			match(DASH);
			setState(336);
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
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE_ENTRY() { return getToken(ExamGrammarParser.TITLE_ENTRY, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(TITLE_ENTRY);
			setState(339);
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
		enterRule(_localctx, 58, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(SECTION_ENTRY);
			setState(342);
			phrase();
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(343);
					match(NEWLINE);
					}
					}
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(348);
				match(SECTION_DESCRIPTION_ENTRY);
				setState(349);
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
		"\u0004\u0001\u0017\u0161\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000B\b\u0000\u0001"+
		"\u0000\u0004\u0000E\b\u0000\u000b\u0000\f\u0000F\u0001\u0000\u0001\u0000"+
		"\u0004\u0000K\b\u0000\u000b\u0000\f\u0000L\u0004\u0000O\b\u0000\u000b"+
		"\u0000\f\u0000P\u0001\u0000\u0001\u0000\u0003\u0000U\b\u0000\u0001\u0000"+
		"\u0004\u0000X\b\u0000\u000b\u0000\f\u0000Y\u0001\u0000\u0001\u0000\u0004"+
		"\u0000^\b\u0000\u000b\u0000\f\u0000_\u0004\u0000b\b\u0000\u000b\u0000"+
		"\f\u0000c\u0003\u0000f\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001j\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001n\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001r\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001v\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001z\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001~\b\u0001\u0003\u0001\u0080\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0088\b\u0002"+
		"\u0001\u0003\u0004\u0003\u008b\b\u0003\u000b\u0003\f\u0003\u008c\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u0093\b\u0004\u000b"+
		"\u0004\f\u0004\u0094\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005\u009a"+
		"\b\u0005\u000b\u0005\f\u0005\u009b\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00b5\b\t\u000b"+
		"\t\f\t\u00b6\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00c4\b\f\u000b\f\f\f\u00c5"+
		"\u0001\f\u0001\f\u0001\r\u0004\r\u00cb\b\r\u000b\r\f\r\u00cc\u0001\r\u0003"+
		"\r\u00d0\b\r\u0001\r\u0001\r\u0004\r\u00d4\b\r\u000b\r\f\r\u00d5\u0001"+
		"\r\u0003\r\u00d9\b\r\u0001\r\u0004\r\u00dc\b\r\u000b\r\f\r\u00dd\u0001"+
		"\r\u0003\r\u00e1\b\r\u0001\r\u0001\r\u0001\r\u0004\r\u00e6\b\r\u000b\r"+
		"\f\r\u00e7\u0001\r\u0003\r\u00eb\b\r\u0003\r\u00ed\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00f5"+
		"\b\u000f\n\u000f\f\u000f\u00f8\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0109\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014"+
		"\u010e\b\u0014\u000b\u0014\f\u0014\u010f\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0004\u0015\u0116\b\u0015\u000b\u0015\f\u0015\u0117"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u011e\b\u0016"+
		"\u000b\u0016\f\u0016\u011f\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0005\u0017\u0126\b\u0017\n\u0017\f\u0017\u0129\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u012d\b\u0017\u000b\u0017\f\u0017\u012e\u0005\u0017"+
		"\u0131\b\u0017\n\u0017\f\u0017\u0134\t\u0017\u0004\u0017\u0136\b\u0017"+
		"\u000b\u0017\f\u0017\u0137\u0001\u0018\u0004\u0018\u013b\b\u0018\u000b"+
		"\u0018\f\u0018\u013c\u0001\u0018\u0001\u0018\u0003\u0018\u0141\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u0147\b\u001a"+
		"\u000b\u001a\f\u001a\u0148\u0001\u001b\u0004\u001b\u014c\b\u001b\u000b"+
		"\u001b\f\u001b\u014d\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u0159"+
		"\b\u001d\u000b\u001d\f\u001d\u015a\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u015f\b\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:\u0000\u0002\u0001\u0000\f\r\u0002\u0000\u0012\u0012\u0015\u0015\u0178"+
		"\u0000<\u0001\u0000\u0000\u0000\u0002\u007f\u0001\u0000\u0000\u0000\u0004"+
		"\u0087\u0001\u0000\u0000\u0000\u0006\u008a\u0001\u0000\u0000\u0000\b\u0092"+
		"\u0001\u0000\u0000\u0000\n\u0099\u0001\u0000\u0000\u0000\f\u00a0\u0001"+
		"\u0000\u0000\u0000\u000e\u00a5\u0001\u0000\u0000\u0000\u0010\u00a8\u0001"+
		"\u0000\u0000\u0000\u0012\u00ae\u0001\u0000\u0000\u0000\u0014\u00b8\u0001"+
		"\u0000\u0000\u0000\u0016\u00bc\u0001\u0000\u0000\u0000\u0018\u00bf\u0001"+
		"\u0000\u0000\u0000\u001a\u00ec\u0001\u0000\u0000\u0000\u001c\u00ee\u0001"+
		"\u0000\u0000\u0000\u001e\u00f1\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000"+
		"\u0000\u0000\"\u00fd\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000"+
		"\u0000&\u0104\u0001\u0000\u0000\u0000(\u010d\u0001\u0000\u0000\u0000*"+
		"\u0115\u0001\u0000\u0000\u0000,\u011d\u0001\u0000\u0000\u0000.\u0127\u0001"+
		"\u0000\u0000\u00000\u013a\u0001\u0000\u0000\u00002\u0142\u0001\u0000\u0000"+
		"\u00004\u0146\u0001\u0000\u0000\u00006\u014b\u0001\u0000\u0000\u00008"+
		"\u0152\u0001\u0000\u0000\u0000:\u0155\u0001\u0000\u0000\u0000<=\u0003"+
		"8\u001c\u0000=>\u0003\u0006\u0003\u0000>e\u0003\b\u0004\u0000?A\u0005"+
		"\f\u0000\u0000@B\u0003\n\u0005\u0000A@\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BN\u0001\u0000\u0000\u0000CE\u0005\u0011\u0000\u0000"+
		"DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0003:\u001d"+
		"\u0000IK\u0003\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001"+
		"\u0000\u0000\u0000ND\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Qf\u0001\u0000\u0000"+
		"\u0000RT\u0005\r\u0000\u0000SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000Ua\u0001\u0000\u0000\u0000VX\u0005\u0011"+
		"\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[]\u0003:\u001d\u0000\\^\u0003\u0004\u0002\u0000]\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`b\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000e?\u0001\u0000\u0000\u0000eR\u0001\u0000\u0000"+
		"\u0000f\u0001\u0001\u0000\u0000\u0000gi\u0003\u0010\b\u0000hj\u0003,\u0016"+
		"\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0080\u0001"+
		"\u0000\u0000\u0000km\u0003\u0018\f\u0000ln\u0003,\u0016\u0000ml\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0080\u0001\u0000\u0000"+
		"\u0000oq\u0003\u0014\n\u0000pr\u0003,\u0016\u0000qp\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000r\u0080\u0001\u0000\u0000\u0000su\u0003"+
		"\f\u0006\u0000tv\u0003,\u0016\u0000ut\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000v\u0080\u0001\u0000\u0000\u0000wy\u0003 \u0010\u0000"+
		"xz\u0003,\u0016\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\u0080\u0001\u0000\u0000\u0000{}\u0003$\u0012\u0000|~\u0003,\u0016\u0000"+
		"}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000"+
		"\u0000\u0000\u007fg\u0001\u0000\u0000\u0000\u007fk\u0001\u0000\u0000\u0000"+
		"\u007fo\u0001\u0000\u0000\u0000\u007fs\u0001\u0000\u0000\u0000\u007fw"+
		"\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u0080\u0003\u0001"+
		"\u0000\u0000\u0000\u0081\u0088\u0003\u0010\b\u0000\u0082\u0088\u0003\u0018"+
		"\f\u0000\u0083\u0088\u0003\u0014\n\u0000\u0084\u0088\u0003\f\u0006\u0000"+
		"\u0085\u0088\u0003 \u0010\u0000\u0086\u0088\u0003$\u0012\u0000\u0087\u0081"+
		"\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0083"+
		"\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0005"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0005\u0011\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0090\u0007"+
		"\u0000\u0000\u0000\u0090\u0007\u0001\u0000\u0000\u0000\u0091\u0093\u0005"+
		"\u0011\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"\n\u0000\u0000\u0097\t\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u0011"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u000b"+
		"\u0000\u0000\u009e\u009f\u0003.\u0017\u0000\u009f\u000b\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0003*\u0015\u0000\u00a1\u00a2\u0003(\u0014\u0000\u00a2"+
		"\u00a3\u00030\u0018\u0000\u00a3\u00a4\u0003\u000e\u0007\u0000\u00a4\r"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a7"+
		"\u0003\u001e\u000f\u0000\u00a7\u000f\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0003*\u0015\u0000\u00a9\u00aa\u0003(\u0014\u0000\u00aa\u00ab\u00030"+
		"\u0018\u0000\u00ab\u00ac\u00030\u0018\u0000\u00ac\u00ad\u0003\u0012\t"+
		"\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00b4\u0005\u0001\u0000"+
		"\u0000\u00af\u00b0\u0005\u0011\u0000\u0000\u00b0\u00b1\u0003.\u0017\u0000"+
		"\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00b3\u0003.\u0017\u0000\u00b3"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0003*\u0015\u0000\u00b9\u00ba\u0003(\u0014\u0000\u00ba\u00bb\u0003"+
		"\u0016\u000b\u0000\u00bb\u0015\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0001\u0000\u0000\u00bd\u00be\u0005\u0002\u0000\u0000\u00be\u0017\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0003*\u0015\u0000\u00c0\u00c1\u0003(\u0014"+
		"\u0000\u00c1\u00c3\u0003\u001a\r\u0000\u00c2\u00c4\u00030\u0018\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u001c\u000e\u0000"+
		"\u00c8\u0019\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005\u0011\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003.\u0017\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0017\u0000\u0000\u00d2"+
		"\u00d4\u0003.\u0017\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d9"+
		"\u0005\u0017\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00ed\u0001\u0000\u0000\u0000\u00da\u00dc"+
		"\u0005\u0011\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0005\u0017\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e5\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0003.\u0017\u0000\u00e3\u00e4\u0005\u0017\u0000\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00eb\u0003"+
		".\u0017\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ec\u00db\u0001\u0000\u0000\u0000\u00ed\u001b\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0001\u0000\u0000\u00ef\u00f0\u0003\u001e"+
		"\u000f\u0000\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1\u00f6\u0003.\u0017"+
		"\u0000\u00f2\u00f3\u0005\u000e\u0000\u0000\u00f3\u00f5\u0003.\u0017\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u001f\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0003*\u0015\u0000\u00fa\u00fb\u0003(\u0014\u0000\u00fb\u00fc"+
		"\u0003\"\u0011\u0000\u00fc!\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"\u0001\u0000\u0000\u00fe\u00ff\u0003.\u0017\u0000\u00ff#\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0003*\u0015\u0000\u0101\u0102\u0003(\u0014\u0000\u0102"+
		"\u0103\u0003&\u0013\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u0001\u0000\u0000\u0105\u0108\u0005\u0015\u0000\u0000\u0106\u0107\u0005"+
		"\u000e\u0000\u0000\u0107\u0109\u0005\u0015\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u0012\u0000\u0000\u010b\'\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0005\u0011\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\u0007\u0000\u0000\u0112\u0113\u0003.\u0017"+
		"\u0000\u0113)\u0001\u0000\u0000\u0000\u0114\u0116\u0005\u0011\u0000\u0000"+
		"\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005\b\u0000\u0000\u011a"+
		"\u011b\u0005\u0015\u0000\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u0005\u0011\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u0006\u0000\u0000\u0122\u0123\u0003.\u0017\u0000\u0123-\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0005\u0016\u0000\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0135\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0132\u0007\u0001"+
		"\u0000\u0000\u012b\u012d\u0005\u0016\u0000\u0000\u012c\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000"+
		"\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u012a\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138/\u0001\u0000\u0000\u0000\u0139\u013b\u0005\u0011\u0000"+
		"\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u00032\u0019\u0000"+
		"\u013f\u0141\u00034\u001a\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u01411\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0003.\u0017\u0000\u0143\u0144\u0005\u0013\u0000\u0000\u01443\u0001\u0000"+
		"\u0000\u0000\u0145\u0147\u00036\u001b\u0000\u0146\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u01495\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0005\u0011\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005\u0014\u0000\u0000\u0150\u0151\u0003.\u0017\u0000\u0151"+
		"7\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0003\u0000\u0000\u0153\u0154"+
		"\u0003.\u0017\u0000\u01549\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0004"+
		"\u0000\u0000\u0156\u015e\u0003.\u0017\u0000\u0157\u0159\u0005\u0011\u0000"+
		"\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0005\u0000"+
		"\u0000\u015d\u015f\u0003.\u0017\u0000\u015e\u0158\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f;\u0001\u0000\u0000\u0000.A"+
		"FLPTY_ceimquy}\u007f\u0087\u008c\u0094\u009b\u00b6\u00c5\u00cc\u00cf\u00d5"+
		"\u00d8\u00dd\u00e0\u00e7\u00ea\u00ec\u00f6\u0108\u010f\u0117\u011f\u0127"+
		"\u012e\u0132\u0137\u013c\u0140\u0148\u014d\u015a\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}