package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.usermanagement.domain.Student;
import eapli.base.usermanagement.domain.Teacher;
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
                "SELECT DISTINCT c FROM Course c JOIN c.teacherInCharge t JOIN Person p ON p.teacher = c.teacherInCharge WHERE p.systemUser = :systemUser AND c.courseStatus.courseStatusValue <> 'CLOSED' " +
                        "OR (:systemUser IN (SELECT p.systemUser FROM c.teachersList t JOIN Person p ON t = p.teacher where c.courseStatus.courseStatusValue <> 'CLOSED'))",
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
                        + "Where ((e.enrollmentStatus.enrollmentStatusValue = 'ACCEPTED' OR e.enrollmentStatus.enrollmentStatusValue = 'PENDING') AND c.courseStatus.courseStatusValue <> 'CLOSED')))",
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

    @Override
    public List<Course> findAllCourseRelatedWithTheMembersOfAGivenCourse(List<Student> students, List<Teacher> teachers) {
        TypedQuery<Course> query;
        if (students.isEmpty() && !teachers.isEmpty()) {
             query = createQuery(
                    "SELECT DISTINCT c FROM Course c "
                            + "WHERE (:teachers IN (SELECT t FROM c.teachersList e JOIN Teacher t ON t = e)) OR (c.teacherInCharge IN (:teachers))",
                    // +" (:students IN (Select s from Student s Join c.enrollmentsList e ON e.student = s))",
                    Course.class);
            //query.setParameter("students", students);
            query.setParameter("teachers", teachers);
            return query.getResultList();
        }else{
            query = createQuery(
                    "SELECT DISTINCT c FROM Course c " +
                            "LEFT JOIN c.enrollmentsList e On e.course = c "
                            + "WHERE (:teachers IN (SELECT t FROM c.teachersList e JOIN Teacher t ON t = e)) OR (c.teacherInCharge IN (:teachers))"
                            + "OR (:students IN (e.student) and e.enrollmentStatus.enrollmentStatusValue = 'ACCEPTED')",
                    Course.class);
            query.setParameter("students", students);
            query.setParameter("teachers", teachers);
        }

        return query.getResultList();
    }


}
