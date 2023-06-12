package eapli.base.exams.application;

import eapli.base.exams.application.services.TakeExamService;
import eapli.base.exceptions.InvalidIdException;
import eapli.base.exceptions.NegativeParameterException;

import java.util.List;

public class TakeExamController {
    public List<String> takeExam(String examId, String filePath) throws NegativeParameterException, InvalidIdException {
        return new TakeExamService().takeExam(examId,filePath);
    }
}
