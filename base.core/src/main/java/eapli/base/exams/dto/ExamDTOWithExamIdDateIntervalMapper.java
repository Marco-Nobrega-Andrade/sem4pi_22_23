package eapli.base.exams.dto;

import eapli.base.exams.domain.Exam;

public class ExamDTOWithExamIdDateIntervalMapper {

    public ExamDTOWithExamIdDateInterval toDto(Exam exam){
        ExamDTOWithExamIdDateIntervalBuilder examDTOWithExamIdDateIntervalBuilder = new ExamDTOWithExamIdDateIntervalBuilder();

        return examDTOWithExamIdDateIntervalBuilder.withExamId(exam.returnExamTitleString())
                .withInitialDate(exam.returnInitialDateString())
                .withFinalDate(exam.returnFinalDateString())
                .build();
    }
}
