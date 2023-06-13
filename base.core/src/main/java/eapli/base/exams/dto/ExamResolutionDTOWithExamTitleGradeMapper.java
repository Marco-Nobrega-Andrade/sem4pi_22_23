package eapli.base.exams.dto;

import eapli.base.exams.domain.ExamResolution;

public class ExamResolutionDTOWithExamTitleGradeMapper {

    public ExamResolutionDTOExamTitleGrade toDto(ExamResolution examResolution){
        return new ExamResolutionDTOExamTitleGradeBuilder()
                .withExamTitleGrade(examResolution.returnExamTitleString(), examResolution.returnGradeString())
                .build();
    }
}
