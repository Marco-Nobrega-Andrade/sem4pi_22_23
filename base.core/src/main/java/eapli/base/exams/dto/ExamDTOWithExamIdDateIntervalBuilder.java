package eapli.base.exams.dto;

public class ExamDTOWithExamIdDateIntervalBuilder {

    private String examId;
    private String initialDate;
    private String finalDate;

    public ExamDTOWithExamIdDateIntervalBuilder withExamId(String examId){
        this.examId = examId;
        return this;
    }

    public ExamDTOWithExamIdDateIntervalBuilder withInitialDate(String initialDate){
        this.initialDate = initialDate;
        return this;
    }

    public ExamDTOWithExamIdDateIntervalBuilder withFinalDate(String finalDate){
        this.finalDate = finalDate;
        return this;
    }

    public ExamDTOWithExamIdDateInterval build(){
        return new ExamDTOWithExamIdDateInterval(this.examId, this.initialDate, this.finalDate);
    }
}
