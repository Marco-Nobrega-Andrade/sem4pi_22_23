package eapli.base.exams.application;

import eapli.base.exams.application.services.CreateUpdateExamService;
import eapli.base.exams.dto.ExamDTOWithDatesExamIdCourseId;

import java.util.Date;
import java.util.List;

public class UpdateExamController {

        public List<ExamDTOWithDatesExamIdCourseId> listTeacherExams(){
            return new ListTeacherExamsController().listTeacherExams();
        }

        public boolean updateQuestion(String structure, Date initialDate, Date finalDate, ExamDTOWithDatesExamIdCourseId examDTO){
            return new CreateUpdateExamService().updateQuestion(structure,initialDate,finalDate,examDTO);
        }
}
