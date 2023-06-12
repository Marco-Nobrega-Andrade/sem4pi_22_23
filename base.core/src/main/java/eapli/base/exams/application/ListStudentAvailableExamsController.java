package eapli.base.exams.application;

import eapli.base.exams.application.services.ListStudentAvailableExamsService;
import eapli.base.exams.dto.ExamDTOWithDatesExamTitleCourseId;

import java.util.List;

public class ListStudentAvailableExamsController {
    public List<ExamDTOWithDatesExamTitleCourseId> listStudentAvailableExams(){
        return new ListStudentAvailableExamsService().listStudentAvailableExams();
    }
}
