package eapli.base.coursemanagement.domain;

import eapli.base.usermanagement.domain.Teacher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    private final String OPEN_STATUS = "OPEN";
    private final String OPEN_ENROLLMENTS_STATUS = "OPEN_ENROLLMENTS";
    private final String CLOSED_ENROLLMENTS_STATUS = "CLOSED_ENROLLMENTS";
    private final String CLOSED_STATUS = "CLOSED";
    private final String CLOSE_STATUS = "CLOSE";
    private final Course COURSE_OPEN_ENROLLMENTS = new Course(new CourseIdentifier("Id"), new CourseTitle("Title"), new CourseName("Name"), new Description("Desciption"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.OPEN_ENROLLMENTS), new Teacher());
    private final Course COURSE_CLOSED_ENROLLMENTS = new Course(new CourseIdentifier("Id"), new CourseTitle("Title"), new CourseName("Name"), new Description("Desciption"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.CLOSED_ENROLLMENTS), new Teacher());

    @Test(expected = IllegalArgumentException.class)
    public void ensureThatCourseStatusCannotChangeToAWrongState(){
        Course course = new Course(new CourseIdentifier("Id1"), new CourseTitle("Title1"), new CourseName("Name1"), new Description("Desciption1"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.CLOSE), new Teacher());
        course.changeStatus("CLOSED");
    }

    @Test
    public void ensureThatCourseStatusCanChangeToNextState(){
        Course course = new Course(new CourseIdentifier("Id1"), new CourseTitle("Title1"), new CourseName("Name1"), new Description("Desciption1"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.CLOSE), new Teacher());
        assertTrue(course.changeStatus("OPEN"));
    }

    @Test
    public void ensureThatCourseStatusCanChangeFromOpenEnrollmentsToClosedEnrollments(){
        Assert.assertTrue(COURSE_OPEN_ENROLLMENTS.changeStatus(CLOSED_ENROLLMENTS_STATUS));
    }

    @Test
    public void ensureThatCourseStatusCanChangeFromClosedEnrollmentsToClosed(){
        Assert.assertTrue(COURSE_CLOSED_ENROLLMENTS.changeStatus(CLOSED_STATUS));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureThatCourseStatusCannotChangeFromOpenEnrollmentsToClosed(){
        COURSE_OPEN_ENROLLMENTS.changeStatus(CLOSED_STATUS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureThatCourseStatusCannotChangeFromOpenEnrollmentsToOpen(){
        COURSE_OPEN_ENROLLMENTS.changeStatus(OPEN_STATUS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureThatCourseStatusCannotChangeFromClosedEnrollmentsToOpenEnrollments(){
        COURSE_CLOSED_ENROLLMENTS.changeStatus(OPEN_ENROLLMENTS_STATUS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureThatCourseStatusCannotChangeFromClosedEnrollmentsToOpen(){
        COURSE_CLOSED_ENROLLMENTS.changeStatus(OPEN_STATUS);
    }

    @Test(expected = IllegalStateException.class)
    public void ensureEnrollmentsAboveMaxNotAllowed(){
        Course course = new Course(new CourseIdentifier("Id1"), new CourseTitle("Title1"), new CourseName("Name1"), new Description("Desciption1"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.CLOSE), new Teacher());
        course.verifyIfWillExceedEnrollmentLimits(7,1);
    }
    @Test
    public void ensureEnrollmentsBelowMaxAreAllowed(){
        Course course = new Course(new CourseIdentifier("Id1"), new CourseTitle("Title1"), new CourseName("Name1"), new Description("Desciption1"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.CLOSE), new Teacher());
        assertFalse(course.verifyIfWillExceedEnrollmentLimits   (3,1));
    }

    @Test(expected = IllegalStateException.class)
    public void ensureEnrollmentsAtMaxAreNotwAllowed(){
        Course course = new Course(new CourseIdentifier("Id1"), new CourseTitle("Title1"), new CourseName("Name1"), new Description("Desciption1"), new EnrollmentLimits(1,3), new CourseStatus(CourseStatusValue.CLOSE), new Teacher());
        assertFalse(course.verifyIfWillExceedEnrollmentLimits(3,1));
    }
}
