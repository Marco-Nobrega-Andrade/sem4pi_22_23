package eapli.base.coursemanagement.dto;

public class StatusCourseDTO {
    public String courseTitle;
    public String courseIdentifier;
    public String courseState;
    public StatusCourseDTO(String courseTitle, String courseIdentifier, String courseState) {
        this.courseTitle = courseTitle;
        this.courseIdentifier = courseIdentifier;
        this.courseState = courseState;
    }
}
