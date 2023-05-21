package eapli.base.formativeexams.application.controllers;

import eapli.base.formativeexams.application.services.FormativeService;

public class FormativeController {
    // TODO
    private final FormativeService formativeService = new FormativeService();
    public boolean createFormativeExam(String questions, int number){
        return formativeService.createFormativeExam(questions, number);
    }
}
