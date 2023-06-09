package eapli.base.grammarutils;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormativeExamResolutionVisitor extends FormativeExamGrammarBaseVisitor<String>{

    private double grade;
    private String feedback;

    public FormativeExamResolutionVisitor(){
        this.grade = 0;
        this.feedback = "";
    }

    @Override
    public String visitTrue_false_question(FormativeExamGrammarParser.True_false_questionContext ctx) {

        String answer = ctx.true_false_answer().TRUE_FALSE_RESPONSES().getText();
        double points = Double.parseDouble(ctx.points().INT().getText());
        String solution = ctx.true_false_solution().TRUE_FALSE_RESPONSES().getText();

        if(answer.equals(solution)){
            grade += points;
        }

        if(!ctx.feedback().getText().isEmpty()){
            feedback += ctx.feedback().getText();
        }

        return null;
    }

    @Override
    public String visitNumerical_question(FormativeExamGrammarParser.Numerical_questionContext ctx) {

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

        }catch (Exception e){

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

        if(!ctx.feedback().getText().isEmpty()){
            feedback += ctx.feedback().getText();
        }

        return null;
    }

    @Override
    public String visitMultiple_choice_question(FormativeExamGrammarParser.Multiple_choice_questionContext ctx) {

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

        if(!ctx.feedback().getText().isEmpty()){
            feedback += ctx.feedback().getText();
        }

        return null;
    }

    public double grade(){
        if(this.grade < 0) return 0;
        return this.grade;
    }

    public String feedback(){
        return this.feedback;
    }
}
