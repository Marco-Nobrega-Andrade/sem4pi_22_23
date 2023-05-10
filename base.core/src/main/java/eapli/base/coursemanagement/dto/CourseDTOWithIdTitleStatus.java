package eapli.base.coursemanagement.dto;

public class CourseDTOWithIdTitleStatus {
    public String courseTitle;
    public String courseIdentifier;
    public String courseState;
    public CourseDTOWithIdTitleStatus(String courseIdentifier,String courseTitle , String courseState) {
        this.courseTitle = courseTitle;
        this.courseIdentifier = courseIdentifier;
        this.courseState = courseState;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseIdentifier() {
        return courseIdentifier;
    }

    public String getCourseState() {
        return courseState;
    }

    @Override
    public String toString() {
        return courseTitle + " - " + courseIdentifier + "(Current Status : " + courseState + ")"  ;
    }
}
