package eapli.base.coursemanagement.domain;

import eapli.base.usermanagement.domain.Teacher;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {
    @Test(expected = IllegalArgumentException.class)
    public void ensureThatCourseStatusCannotChangeToAWrongState(){
        Course course = new Course(new CourseIdentifier("Id1"), new CourseTitle("Title1"), new CourseName("Name1"), new Description("Desciption1"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.CLOSE), new Teacher());
        course.changeStatus("CLOSED");
    }

    @Test
    public void ensureThatCourseStatusCanChangeToNextState(){
        Course course = new Course(new CourseIdentifier("Id1"), new CourseTitle("Title1"), new CourseName("Name1"), new Description("Desciption1"), new EnrollmentLimits(1,5), new CourseStatus(CourseStatusValue.CLOSE), new Teacher());
        course.changeStatus("OPEN");
    }
}
