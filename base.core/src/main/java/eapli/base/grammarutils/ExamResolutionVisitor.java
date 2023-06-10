package eapli.base.grammarutils;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamResolutionVisitor extends ExamGrammarBaseVisitor<String>{
    private Double grade;

    private List<String> feedback = new ArrayList<>();

    public ExamResolutionVisitor(){
        this.grade = 0.0;
    }

    @Override
    public String visitMatching_type_question(ExamGrammarParser.Matching_type_questionContext ctx) {
        int points = Integer.parseInt(ctx.points().INT().getText());

        List<String> solutions = new ArrayList<>();
        List<ExamGrammarParser.PhraseContext> solutionPhrases = ctx.matching_type_solution().phrase();
        for (int i = 0; i < solutionPhrases.size(); i = i+2){

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(solutionPhrases.get(i).getText());
            stringBuilder.append("-");
            stringBuilder.append(solutionPhrases.get(i+1).getText());

            solutions.add(stringBuilder.toString());
        }

        List<String> answers = new ArrayList<>();
        try {
            List<ExamGrammarParser.PhraseContext> answerPhrases = ctx.matching_type_answer().phrase();
            for (int i = 0; i < answerPhrases.size(); i = i+2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(answerPhrases.get(i).getText());
                stringBuilder.append("-");
                stringBuilder.append(answerPhrases.get(i+1).getText());

                answers.add(stringBuilder.toString());
            }
        } catch (Exception ignored) {

        }

        double pointsByAnswer = (double) points / solutions.size();

        for (int i = 0; i < Integer.min(answers.size(), solutions.size()); i++){
            if(solutions.contains(answers.get(i))){
                this.grade += pointsByAnswer;
            }
        }
        return null;
    }

    @Override
    public String visitSelect_missing_words(ExamGrammarParser.Select_missing_wordsContext ctx) {
        int points = Integer.parseInt(ctx.points().INT().getText());

        List<String> solutions = new ArrayList<>();
        List<ExamGrammarParser.PhraseContext> solutionPhrases = ctx.missing_word_solution().list_phrases().phrase();
        for (ExamGrammarParser.PhraseContext phraseContext : solutionPhrases){
            solutions.add(phraseContext.getText());
        }

        List<String> answers = new ArrayList<>();
        try {
            List<ExamGrammarParser.PhraseContext> answerPhrases = ctx.missing_word_answer().list_phrases().phrase();
            for (ExamGrammarParser.PhraseContext phraseContext : answerPhrases){
                answers.add(phraseContext.getText());
            }
        } catch (Exception ignored) {

        }

        double pointsByAnswer = (double) points / solutions.size();

        for (int i = 0; i < Integer.min(answers.size(), solutions.size()); i++){
            if(answers.get(i).equalsIgnoreCase(solutions.get(i))){
                this.grade += pointsByAnswer;
            }
        }
        return null;
    }

    @Override
    public String visitShort_answer_question(ExamGrammarParser.Short_answer_questionContext ctx) {
        int points = Integer.parseInt(ctx.points().INT().getText());
        String answer;
        try {
            answer = ctx.short_answer_answer().phrase().getText();
        } catch (Exception e) {
            answer = "";
        }
        String solution = ctx.short_answer_solution().phrase().getText();

        if ((answer.trim()).equalsIgnoreCase(solution.trim())){
            this.grade += points;
        }
        return null;
    }

    @Override
    public String visitTrue_false_question(ExamGrammarParser.True_false_questionContext ctx) {
        String answer;
        try {
            answer = ctx.true_false_answer().TRUE_FALSE_RESPONSES().getText();
        } catch (Exception e) {
            answer = "";
        }
        int points = Integer.parseInt(ctx.points().INT().getText());
        String solution = ctx.true_false_solution().TRUE_FALSE_RESPONSES().getText();

        if((answer.trim()).equalsIgnoreCase(solution.trim())){
            grade += points;
        }

        return null;
    }

    @Override
    public String visitMultiple_choice_question(ExamGrammarParser.Multiple_choice_questionContext ctx) {
        List<String> answerList;
        List<String> solutionList;

        String answerText = ctx.multiple_choice_answer().list_phrases().getText();
        String solutionText = ctx.multiple_choice_solution().list_phrases().getText();

        answerList = Arrays.asList(answerText.split(","));
        solutionList = Arrays.asList(solutionText.split(","));

        double points = Double.parseDouble(ctx.points().INT().getText());
        double valueByAnswer = points/solutionList.size();
        double questionGrade = 0;

        for (String answer : answerList) {

            if(solutionList.contains(answer)){
                questionGrade += valueByAnswer;
            }else{
                questionGrade -= valueByAnswer;
            }

        }

        if(questionGrade > 0){
            grade += questionGrade;
        }

        return null;
    }

    @Override
    public String visitNumerical_question(ExamGrammarParser.Numerical_questionContext ctx) {
        double points = Double.parseDouble(ctx.points().INT().getText());
        String answerInt = "";
        String answerNumericalValue = "";
        String solutionInt = "";
        String solutionNumericalValue = "";

        try{

            answerInt = ctx.numerical_answer().INT().getText();
            answerNumericalValue = ctx.numerical_answer().NUMERICAL_VALUE().getText();

            solutionInt = ctx.numerical_solution().INT().getText();
            solutionNumericalValue = ctx.numerical_solution().NUMERICAL_VALUE().getText();

        }catch (Exception ignore){

        }

        String finalAnswer = "";
        String finalSolution = "";

        if(answerInt.isEmpty()){
            finalAnswer = answerNumericalValue;
        }else {
            finalAnswer = answerInt;
        }

        if(solutionInt.isEmpty()){
            finalSolution = solutionNumericalValue;
        }else {
            finalSolution = solutionInt;
        }

        if(finalAnswer.equals(finalSolution)){
            grade += points;
        }

        return null;
    }

    public Double grade(){
        return (double) Math.round(this.grade * 100) / 100;
    }

    public List<String> feedback(){
        return this.feedback;
    }
}
