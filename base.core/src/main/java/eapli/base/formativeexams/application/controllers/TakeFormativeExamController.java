package eapli.base.formativeexams.application.controllers;

import eapli.base.formativeexams.application.services.TakeFormativeExamService;

import java.util.List;

public class TakeFormativeExamController {

    public static TakeFormativeExamService takeFormativeExamService = new TakeFormativeExamService();

    public List<String> listFormativeExams(){
        return takeFormativeExamService.listFormativeExams();
    }
    public List<String> takeFormativeExam(long formativeExamId,String resolutionFilePath){
        return takeFormativeExamService.takeFormativeExam(formativeExamId, resolutionFilePath);
    }
}
