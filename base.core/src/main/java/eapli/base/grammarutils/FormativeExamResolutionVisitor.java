package eapli.base.grammarutils;

import org.antlr.v4.runtime.tree.TerminalNode;

public class FormativeExamResolutionVisitor extends FormativeExamGrammarBaseVisitor<String>{

    private Integer grade;

    public FormativeExamResolutionVisitor(){
        this.grade = 0;
    }

    @Override
    public String visitTrue_false_question(FormativeExamGrammarParser.True_false_questionContext ctx) {

        String answer = ctx.true_false_answer().TRUE_FALSE_RESPONSES().getText();
        int points = Integer.parseInt(ctx.points().INT().getText());
        String solution = ctx.true_false_solution().TRUE_FALSE_RESPONSES().getText();

        if(answer.equals(solution)){
            grade += points;
        }

        return null;
    }

    @Override
    public String visitNumerical_question(FormativeExamGrammarParser.Numerical_questionContext ctx) {

        int points = Integer.parseInt(ctx.points().INT().getText());
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

        return null;
    }

    @Override
    public String visitTrue_false_answer(FormativeExamGrammarParser.True_false_answerContext ctx) {
        return null;
    }

    public Integer grade(){
        return this.grade;
    }
}
