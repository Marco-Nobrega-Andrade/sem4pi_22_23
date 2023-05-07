package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.usermanagement.domain.MecanographicNumber;
import eapli.base.usermanagement.domain.Student;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaCourseRepository extends JpaAutoTxRepository<Course, CourseIdentifier, CourseIdentifier> implements CourseRepository {

    public JpaCourseRepository(final TransactionalContext autoTx) {
        super(autoTx, "courseId");
    }

    public JpaCourseRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "courseId");
    }

    @Override
    public List<Course> listOpenableClosableCourses() {
        Query query = createQuery("SELECT c FROM Course c WHERE c.courseStatus.courseStatusValue = 'CLOSED_ENROLLMENTS' OR c.courseStatus.courseStatusValue = 'CLOSE'",Course.class);
        return query.getResultList();
    }

    @Override
    public List<Course> listAllOpenCLoseEnrollmentsAvailableCourses() {
        return createQuery("SELECT c FROM Course c WHERE c.courseStatus.courseStatusValue = 'OPEN' OR c.courseStatus.courseStatusValue = 'OPEN_ENROLLMENTS'", Course.class).getResultList();
    }
}
