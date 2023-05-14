package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
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

    @Override
    public List<Course> listAllAvailableCourses() {
        return createQuery("SELECT c FROM Course c WHERE c.courseStatus.courseStatusValue = 'OPEN' OR c.courseStatus.courseStatusValue = 'OPEN_ENROLLMENTS' OR c.courseStatus.courseStatusValue = 'CLOSE_ENROLLMENTS'", Course.class).getResultList();
    }

    @Override
    public List<Course> findTeacherCourses(SystemUser systemUser) {
        TypedQuery<Course> query = createQuery(
                "SELECT DISTINCT c FROM Course c JOIN c.teacherInCharge t JOIN Person p ON p.teacher = c.teacherInCharge WHERE p.systemUser = :systemUser " +
                        "OR (:systemUser IN (SELECT p.systemUser FROM c.teachersList t JOIN Person p ON t = p.teacher))",
                Course.class);
        query.setParameter("systemUser", systemUser);
        return query.getResultList();


    }

    @Override
    public List<Course> findStudentCourses(SystemUser systemUser) {
        TypedQuery<Course> query = createQuery(
                "SELECT DISTINCT c FROM Course c "
                        + "WHERE (c.courseStatus.courseStatusValue = 'OPEN_ENROLLMENTS' AND NOT (:systemUser IN (SELECT p.systemUser FROM c.enrollmentsList e JOIN Person p ON p.student = e.student "
                        + "Where (e.enrollmentStatus.enrollmentStatusValue = 'REJECTED')))) "
                        + "OR (:systemUser IN (SELECT p.systemUser FROM c.enrollmentsList e JOIN Person p ON p.student = e.student "
                        + "Where (e.enrollmentStatus.enrollmentStatusValue = 'ACCEPTED' OR e.enrollmentStatus.enrollmentStatusValue = 'PENDING')))",
                Course.class);
        query.setParameter("systemUser", systemUser);
        return query.getResultList();
    }
    @Override
    public List<Course> listAllCoursesOpenToEnrollments(){
        return createQuery("SELECT c FROM Course c WHERE c.courseStatus.courseStatusValue = 'OPEN_ENROLLMENTS'", Course.class).getResultList();
    }

    @Override
    public Course findCourseById(String courseIdentifier) {
        return createQuery("SELECT c FROM Course c WHERE c.courseId.course_Id = :courseIdentifier", Course.class)
                .setParameter("courseIdentifier", courseIdentifier).getSingleResult();
    }
}
