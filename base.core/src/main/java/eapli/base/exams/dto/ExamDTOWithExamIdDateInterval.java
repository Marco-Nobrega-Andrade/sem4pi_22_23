package eapli.base.exams.dto;

public class ExamDTOWithExamIdDateInterval {

    public String examId;
    public String initialDate;
    public String finalDate;

    protected ExamDTOWithExamIdDateInterval(String examId, String initialDate, String finalDate){
        this.examId = examId;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }

    @Override
    public String toString() {
        return examId +
                initialDate +
                finalDate;
    }
}
