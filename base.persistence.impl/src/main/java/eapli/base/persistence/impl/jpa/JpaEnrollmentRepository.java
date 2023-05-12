package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.enrollments.repositories.EnrollmentRepository;
import eapli.base.enrollments.domain.Enrollment;
import eapli.base.enrollments.domain.EnrollmentId;
import eapli.base.usermanagement.domain.MecanographicNumber;
import eapli.base.usermanagement.domain.Student;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.List;

public class JpaEnrollmentRepository extends JpaAutoTxRepository<Enrollment, EnrollmentId, EnrollmentId> implements EnrollmentRepository {
    public JpaEnrollmentRepository(final TransactionalContext autoTx) {
        super(autoTx, "enrollmentId");
    }

    public JpaEnrollmentRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "enrollmentId");
    }

    @Override
    public List<Course> listCoursesWithEnrollments() {
        TypedQuery<Course> query = createQuery("Select Distinct e.course from Enrollment e",
                Course.class);
        return query.getResultList();
    }

    @Override
    public int getNumberOfEnrollmentsAcceptedByCourse(Course course){
        TypedQuery<Long> query = createQuery("Select COUNT e from Enrollment e WHERE e.enrollmentStatus = 'ACCEPTED' AND e.course =: courseVariable", Long.class);
        query.setParameter("courseVariable", course);
        return Math.toIntExact(query.getSingleResult());
    }

    @Override
    public List<Student> listStudentsPendingInCourse(CourseIdentifier courseId) {
        TypedQuery<Student> query = createQuery("Select e.student from enrollment e WHERE e.enrollmentStatus = 'PENDING' AND e.course.courseId =: courseIdentifier", Student.class);
        query.setParameter("courseIdentifier", courseId);
        return query.getResultList();
    }

    @Override
    public Enrollment findEnrollmentByCourseIDAndMechNumber(CourseIdentifier courseId, MecanographicNumber mechNumber) {
        TypedQuery<Enrollment> query = createQuery("Select e from Enrollment e WHERE e.course.courseId =: courseIdentifier AND e.student.mechanographicNumber =: mechNumber", Enrollment.class);
        query.setParameter("courseIdentifier", courseId);
        query.setParameter("mechNumber", mechNumber);
        return query.getSingleResult();
    }

}
