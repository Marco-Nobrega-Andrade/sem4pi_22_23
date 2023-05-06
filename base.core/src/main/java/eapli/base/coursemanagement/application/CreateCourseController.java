package eapli.base.coursemanagement.application;

import eapli.base.coursemanagement.application.services.CreateCourseService;

public class CreateCourseController {
    public boolean createCourse(String courseId, String courseTitle, String courseName, String description, int maxEnrollments, int minEnrollments){
        CreateCourseService service = new CreateCourseService();
        return service.createCourse(courseId,courseTitle,courseName,description,maxEnrollments,minEnrollments);
    }
}
