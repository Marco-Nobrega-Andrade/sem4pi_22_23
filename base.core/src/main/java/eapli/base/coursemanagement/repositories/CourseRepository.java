package eapli.base.coursemanagement.repositories;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface CourseRepository extends DomainRepository<CourseIdentifier, Course> {
    public List<Course> listOpenableClosableCourses();
}
