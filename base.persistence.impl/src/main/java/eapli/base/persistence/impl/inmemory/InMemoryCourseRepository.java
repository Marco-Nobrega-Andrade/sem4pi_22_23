package eapli.base.persistence.impl.inmemory;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;

public class InMemoryCourseRepository extends InMemoryDomainRepository<Course, CourseIdentifier> implements CourseRepository {

    @Override
    public List<Course> listOpenableClosableCourses() {
        return (List<Course>) match(e -> (e.returnCourseStatusString().equals("Enrollments closed") || e.returnCourseStatusString().equals("Close")));
    }

    @Override
    public List<Course> listAllOpenCLoseEnrollmentsAvailableCourses() {
        return null;
    }

    @Override
    public List<Course> findTeacherCourses(SystemUser systemUser) {
        return null;
    }

    @Override
    public List<Course> findStudentCourses(SystemUser systemUser) {
        return null;
    }

    @Override
    public List<Course> listAllCoursesOpenToEnrollments() {
        return (List<Course>) match(e -> (e.returnCourseStatusString().equals("Enrollments open")));
    }
}
