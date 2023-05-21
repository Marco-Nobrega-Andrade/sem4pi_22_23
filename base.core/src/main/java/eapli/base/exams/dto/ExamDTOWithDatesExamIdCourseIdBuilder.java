package eapli.base.exams.dto;

public class ExamDTOWithDatesExamIdCourseIdBuilder {

    public String initialDate;
    public String finalDate;
    public String examId;
    public String courseId;

    public ExamDTOWithDatesExamIdCourseIdBuilder withDatesExamIdCourseId(String initialDate,String finalDate,String examId, String courseId){
        withInitialDate(initialDate);
        withFinalDate(finalDate);
        withExamId(examId);
        withCourseIdentifier(courseId);
        return this;
    }

    public ExamDTOWithDatesExamIdCourseIdBuilder withInitialDate(final String initialDate){
        this.initialDate = initialDate;
        return this;
    }

    public ExamDTOWithDatesExamIdCourseIdBuilder withFinalDate(final String finalDate){
        this.finalDate = finalDate;
        return this;
    }

    public ExamDTOWithDatesExamIdCourseIdBuilder withExamId (final String examId){
        this.examId = examId;
        return this;
    }

    public ExamDTOWithDatesExamIdCourseIdBuilder withCourseIdentifier (final String courseIdentifier){
        this.courseId = courseIdentifier;
        return this;
    }

    public ExamDTOWithDatesExamIdCourseId build(){
        return new ExamDTOWithDatesExamIdCourseId(initialDate, finalDate, examId,courseId);
    }



}
