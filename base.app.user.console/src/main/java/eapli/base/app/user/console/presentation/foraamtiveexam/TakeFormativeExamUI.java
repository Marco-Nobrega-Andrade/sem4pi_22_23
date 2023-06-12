package eapli.base.app.user.console.presentation.foraamtiveexam;

import eapli.base.formativeexams.application.controllers.TakeFormativeExamController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;

public class TakeFormativeExamUI extends AbstractUI {

    private static TakeFormativeExamController takeFormativeExamController = new TakeFormativeExamController();
    @Override
    protected boolean doShow() {

        List<String> formativeExamList = takeFormativeExamController.listFormativeExams();

        if(!formativeExamList.isEmpty()){

            int size = formativeExamList.size();

            for (int i = 0; i < size; i++) {
                System.out.println(i + 1 + ". " + formativeExamList.get(i));
            }

            System.out.println("0. Return\n");
            int idx = Console.readOption(1, size, 0);

            if(idx!=0) {

                System.out.println("The answers file should have a answer per line and in case of a multiple answer separate each of de answers in the same line by a comma.");
                String filePath = Console.readLine("Insert the answers file name:");

                List<String> gradeAndFeedback = takeFormativeExamController.takeFormativeExam(Long.parseLong(formativeExamList.get(idx -1)), filePath);

                for (String info : gradeAndFeedback) {

                    System.out.println(info);

                }

            }

        }else{

            System.out.println("There are no formative exams available!");

        }

        return true;
    }

    @Override
    public String headline() {
        return "Take Formative Exam";
    }
}
