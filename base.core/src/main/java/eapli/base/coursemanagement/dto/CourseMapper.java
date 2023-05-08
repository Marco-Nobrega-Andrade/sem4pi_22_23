package eapli.base.coursemanagement.dto;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.repositories.CourseRepository;

public class CourseMapper{

    public static CourseDTOWithIdTitleStatus toDTOWithIdTitleStatus(Course course){
        CourseDTOBuilder courseDTOBuilder = new CourseDTOBuilder();
        return courseDTOBuilder.withCourseIdentifier(course.returnCourseIdentifierString())
                .withCourseTitle(course.returnCourseTitleString())
                .withCourseStatus(course.returnCourseStatusString())
                .buildWithIdTitleStatus();
    }

    public static Course toCourse(CourseDTOWithIdTitleStatus courseDTOWithIdTitleStatus, CourseRepository courseRepository){
        return courseRepository.ofIdentity(new CourseIdentifier(courseDTOWithIdTitleStatus.courseIdentifier)).get();
    }

    public static CourseDTOWithIdTitle toDTOWithIdTitle(Course course){
        CourseDTOBuilder courseDTOBuilder = new CourseDTOBuilder();
        return courseDTOBuilder.withCourseIdentifier(course.returnCourseIdentifierString())
                .withCourseTitle(course.returnCourseTitleString())
                .buildWithIdTitle();
    }

}
