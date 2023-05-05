package eapli.base.persistence.impl.inmemory;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCourseRepository extends InMemoryDomainRepository<Course, CourseIdentifier> implements CourseRepository {

}
