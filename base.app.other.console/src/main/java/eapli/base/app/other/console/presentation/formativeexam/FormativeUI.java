package eapli.base.app.other.console.presentation.formativeexam;

import eapli.base.formativeexams.application.controllers.FormativeController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class FormativeUI extends AbstractUI {

    private final FormativeController theController = new FormativeController();

    @Override
    protected boolean doShow() {
        String type = Console.readLine("Insert the type of questions of the formative exam:");
        int integer = Console.readInteger("Insert the number of questions of the formative exam:");
        try {
            theController.createFormativeExam(type, integer);
            System.out.println("Formative exam created successfully!");
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public String headline() {
        return "Create a formative exam";
    }
}
