package eapli.base.coursemanagement.dto;

import eapli.base.coursemanagement.domain.Course;

public class CourseMapper{

    public static StatusCourseDTO toDTOWithIdTitleStatus(Course course){
        CourseDTOBuilder courseDTOBuilder = new CourseDTOBuilder();
        return courseDTOBuilder.withCourseIdentifier(course.returnCourseIdentifierString())
                .withCourseTitle(course.returnCourseTitleString())
                .withCourseStatus(course.returnCourseStatusString())
                .build();
    }

}
