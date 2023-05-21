package eapli.base.exams.dto;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.exams.domain.Exam;

public class ExamDTOWithDatesExamIdCourseIdMapper {

    public static ExamDTOWithDatesExamIdCourseId toDto(Exam exam,Course course){
        ExamDTOWithDatesExamIdCourseIdBuilder examDTOWithDatesExamIdCourseIdBuilder = new ExamDTOWithDatesExamIdCourseIdBuilder();
        return examDTOWithDatesExamIdCourseIdBuilder.withDatesExamIdCourseId(exam.returnInitialDateString(), exam.returnFinalDateString(), exam.returnExamIdString(),course.returnCourseIdentifierString()).build();
    }
}
