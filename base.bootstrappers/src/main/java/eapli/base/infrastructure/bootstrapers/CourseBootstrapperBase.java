package eapli.base.infrastructure.bootstrapers;

import eapli.base.coursemanagement.application.CreateCourseController;
import eapli.base.coursemanagement.application.OpenCloseCourseController;
import eapli.base.coursemanagement.application.OpenCloseCourseEnrollmentsController;
import eapli.base.coursemanagement.application.services.OpenCloseCourseService;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.dto.CourseDTOWithIdTitleStatus;
import eapli.base.coursemanagement.dto.CourseMapper;
import eapli.base.usermanagement.application.AddUserController;
import eapli.base.usermanagement.application.ListUsersController;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class CourseBootstrapperBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsersBootstrapperBase.class);

    final CreateCourseController createCourseController = new CreateCourseController();
    final OpenCloseCourseController openCloseCourseController = new OpenCloseCourseController();

    final OpenCloseCourseEnrollmentsController openCloseCourseEnrollmentsController = new OpenCloseCourseEnrollmentsController();
    protected boolean createCourseBaseBootstrap(final String courseId, final String courseTitle, final String courseName, final String description, final int maxEnrollments, final int minEnrollments) {
        return createCourseController.createCourse(courseId, courseTitle, courseName, description, maxEnrollments, minEnrollments);
    }
    protected void openCourseBaseBootstrap(final String courseId, final String courseTitle) {
        CourseDTOWithIdTitleStatus courseDTO = new CourseDTOWithIdTitleStatus(courseId, courseTitle,"CLOSE");
        openCloseCourseController.changeCourseStatus(courseDTO, "OPEN");
    }
    protected void closeCourseBaseBootstrap(final String courseId, final String courseTitle){
        CourseDTOWithIdTitleStatus courseDTO = new CourseDTOWithIdTitleStatus(courseId, courseTitle,"CLOSED_ENROLLMENTS");
        openCloseCourseController.changeCourseStatus(courseDTO, "CLOSED");
    }

    protected void openEnrollmentsCourseBaseBootstrap(final String courseId, final String courseTitle){
        CourseDTOWithIdTitleStatus courseDTO = new CourseDTOWithIdTitleStatus(courseId, courseTitle,"OPEN");
        openCloseCourseEnrollmentsController.changeStatus(courseDTO, "OPEN_ENROLLMENTS");
    }

    protected void closeEnrollmentsCourseBaseBootstrap(final String courseId, final String courseTitle){
        CourseDTOWithIdTitleStatus courseDTO = new CourseDTOWithIdTitleStatus(courseId, courseTitle,"OPEN_ENROLLMENTS");
        openCloseCourseEnrollmentsController.changeStatus(courseDTO, "CLOSED_ENROLLMENTS");
    }
}
