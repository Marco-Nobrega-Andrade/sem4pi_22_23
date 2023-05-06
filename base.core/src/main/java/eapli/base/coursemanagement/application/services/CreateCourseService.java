package eapli.base.coursemanagement.application.services;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Factories.CourseFactory;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class CreateCourseService {
    public boolean createCourse(String courseId, String courseTitle, String courseName, String description, int maxEnrollments, int minEnrollments){
        CourseFactory factory = new CourseFactory();
        Course newCourse = factory.buildCourse(courseId,courseTitle,courseName,description,maxEnrollments,minEnrollments);
        CourseRepository courseRepo = PersistenceContext.repositories().courseRepository();
        courseRepo.save(newCourse);
        return true;
    }
}
