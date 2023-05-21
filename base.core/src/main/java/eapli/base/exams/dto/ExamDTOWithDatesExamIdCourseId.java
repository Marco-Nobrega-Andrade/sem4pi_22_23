package eapli.base.exams.dto;

public class ExamDTOWithDatesExamIdCourseId {

    public String initialDate;
    public String finalDate;
    public String examId;
    public String courseId;

    public ExamDTOWithDatesExamIdCourseId(String initialDate, String finalDate,String examId ,String courseId) {
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.examId = examId;
        this.courseId = courseId;
    }
}
