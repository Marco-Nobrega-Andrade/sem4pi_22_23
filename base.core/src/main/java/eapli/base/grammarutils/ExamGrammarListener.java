// Generated from D:/Uni_2ano_2sem/SEM_4_PI/sem4pi-22-23-24/base.core/src/main/antlr4\ExamGrammar.g4 by ANTLR 4.12.0
package eapli.base.grammarutils;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExamGrammarParser}.
 */
public interface ExamGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExamGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExamGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ExamGrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ExamGrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(ExamGrammarParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(ExamGrammarParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(ExamGrammarParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(ExamGrammarParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#middle_phrase}.
	 * @param ctx the parse tree
	 */
	void enterMiddle_phrase(ExamGrammarParser.Middle_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#middle_phrase}.
	 * @param ctx the parse tree
	 */
	void exitMiddle_phrase(ExamGrammarParser.Middle_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#list_with_title}.
	 * @param ctx the parse tree
	 */
	void enterList_with_title(ExamGrammarParser.List_with_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#list_with_title}.
	 * @param ctx the parse tree
	 */
	void exitList_with_title(ExamGrammarParser.List_with_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#title_list}.
	 * @param ctx the parse tree
	 */
	void enterTitle_list(ExamGrammarParser.Title_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#title_list}.
	 * @param ctx the parse tree
	 */
	void exitTitle_list(ExamGrammarParser.Title_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ExamGrammarParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ExamGrammarParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#topic_list}.
	 * @param ctx the parse tree
	 */
	void enterTopic_list(ExamGrammarParser.Topic_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#topic_list}.
	 * @param ctx the parse tree
	 */
	void exitTopic_list(ExamGrammarParser.Topic_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(ExamGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(ExamGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#multiple_choice_question}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_choice_question(ExamGrammarParser.Multiple_choice_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#multiple_choice_question}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_choice_question(ExamGrammarParser.Multiple_choice_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#multiple_choice_solution}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_choice_solution(ExamGrammarParser.Multiple_choice_solutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#multiple_choice_solution}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_choice_solution(ExamGrammarParser.Multiple_choice_solutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#matching_type_question}.
	 * @param ctx the parse tree
	 */
	void enterMatching_type_question(ExamGrammarParser.Matching_type_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#matching_type_question}.
	 * @param ctx the parse tree
	 */
	void exitMatching_type_question(ExamGrammarParser.Matching_type_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#matching_type_solution}.
	 * @param ctx the parse tree
	 */
	void enterMatching_type_solution(ExamGrammarParser.Matching_type_solutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#matching_type_solution}.
	 * @param ctx the parse tree
	 */
	void exitMatching_type_solution(ExamGrammarParser.Matching_type_solutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#true_false_question}.
	 * @param ctx the parse tree
	 */
	void enterTrue_false_question(ExamGrammarParser.True_false_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#true_false_question}.
	 * @param ctx the parse tree
	 */
	void exitTrue_false_question(ExamGrammarParser.True_false_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#true_false_solution}.
	 * @param ctx the parse tree
	 */
	void enterTrue_false_solution(ExamGrammarParser.True_false_solutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#true_false_solution}.
	 * @param ctx the parse tree
	 */
	void exitTrue_false_solution(ExamGrammarParser.True_false_solutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#select_missing_words}.
	 * @param ctx the parse tree
	 */
	void enterSelect_missing_words(ExamGrammarParser.Select_missing_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#select_missing_words}.
	 * @param ctx the parse tree
	 */
	void exitSelect_missing_words(ExamGrammarParser.Select_missing_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#missing_word_question}.
	 * @param ctx the parse tree
	 */
	void enterMissing_word_question(ExamGrammarParser.Missing_word_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#missing_word_question}.
	 * @param ctx the parse tree
	 */
	void exitMissing_word_question(ExamGrammarParser.Missing_word_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#missing_word_solution}.
	 * @param ctx the parse tree
	 */
	void enterMissing_word_solution(ExamGrammarParser.Missing_word_solutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#missing_word_solution}.
	 * @param ctx the parse tree
	 */
	void exitMissing_word_solution(ExamGrammarParser.Missing_word_solutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#list_phrases}.
	 * @param ctx the parse tree
	 */
	void enterList_phrases(ExamGrammarParser.List_phrasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#list_phrases}.
	 * @param ctx the parse tree
	 */
	void exitList_phrases(ExamGrammarParser.List_phrasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#short_answer_question}.
	 * @param ctx the parse tree
	 */
	void enterShort_answer_question(ExamGrammarParser.Short_answer_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#short_answer_question}.
	 * @param ctx the parse tree
	 */
	void exitShort_answer_question(ExamGrammarParser.Short_answer_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#short_answer_solution}.
	 * @param ctx the parse tree
	 */
	void enterShort_answer_solution(ExamGrammarParser.Short_answer_solutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#short_answer_solution}.
	 * @param ctx the parse tree
	 */
	void exitShort_answer_solution(ExamGrammarParser.Short_answer_solutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#numerical_question}.
	 * @param ctx the parse tree
	 */
	void enterNumerical_question(ExamGrammarParser.Numerical_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#numerical_question}.
	 * @param ctx the parse tree
	 */
	void exitNumerical_question(ExamGrammarParser.Numerical_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#numerical_answer}.
	 * @param ctx the parse tree
	 */
	void enterNumerical_answer(ExamGrammarParser.Numerical_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#numerical_answer}.
	 * @param ctx the parse tree
	 */
	void exitNumerical_answer(ExamGrammarParser.Numerical_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#points}.
	 * @param ctx the parse tree
	 */
	void enterPoints(ExamGrammarParser.PointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#points}.
	 * @param ctx the parse tree
	 */
	void exitPoints(ExamGrammarParser.PointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void enterFeedback(ExamGrammarParser.FeedbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void exitFeedback(ExamGrammarParser.FeedbackContext ctx);
}