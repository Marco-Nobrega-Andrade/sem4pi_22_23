package eapli.base.coursemanagement.dto;

public class CourseDTOWithIdTitleStatus {
    public String courseTitle;
    public String courseIdentifier;
    public String courseState;
    public CourseDTOWithIdTitleStatus(String courseTitle, String courseIdentifier, String courseState) {
        this.courseTitle = courseTitle;
        this.courseIdentifier = courseIdentifier;
        this.courseState = courseState;
    }

    @Override
    public String toString() {
        return courseTitle + " - " + courseIdentifier + "(Current Status : " + courseState + ")"  ;
    }
}
