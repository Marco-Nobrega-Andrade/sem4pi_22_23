package eapli.base.courseclasses.application.services;

import eapli.base.courseclasses.domain.Class;
import eapli.base.courseclasses.domain.builder.ClassBuilder;
import eapli.base.courseclasses.repositories.ClassRepository;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.Student;
import eapli.base.usermanagement.domain.Teacher;

import java.util.Date;
import java.util.List;

public class CreateClassService {

    private CourseRepository courseRepository = PersistenceContext.repositories().courseRepository();

    public boolean verifyIfExistAClassAtTheTime(Date startingDateWithTime, int duration,CourseDTOWithIdTitle courseDTO) {
        Course course = courseRepository.ofIdentity(new CourseIdentifier(courseDTO.courseIdentifier)).get();
        if (course.verifyIfExistAClassAtTheTime(startingDateWithTime,duration)){
            throw new IllegalArgumentException("Exist already a class during that time in this Course");
        }
        if (course.verifyIfExistAnExtraClassAtTheTime(startingDateWithTime,duration)){
            throw new IllegalArgumentException("Exist already an extra class during that time in this Course");
        }
        List<Teacher> listTeacher = PersistenceContext.repositories().teacherRepository().findTeachersInACourse(course);
        List<Student> listStudent = PersistenceContext.repositories().studentRepository().findStudentsInACourse(course);

        List<Course> listCourse;
        listCourse = courseRepository.findAllCourseRelatedWithTheMembersOfAGivenCourse(listStudent,listTeacher);
        for (Course c: listCourse) {
            if (c.verifyIfExistAClassAtTheTime(startingDateWithTime,duration)){
                return true;
            }
            if (c.verifyIfExistAnExtraClassAtTheTime(startingDateWithTime,duration)){
                return true;
            }
        }

        return false;
    }

    public boolean createClass(String title, Date startingDateWithTime, int numberOfRecurrence, int duration, CourseDTOWithIdTitle courseDTO){

        Course course = courseRepository.ofIdentity(new CourseIdentifier(courseDTO.courseIdentifier)).get();

        ClassRepository classRepository = PersistenceContext.repositories().classRepository();
        Long numberOfClasses = classRepository.count();

        ClassBuilder builder= new ClassBuilder();
        builder.withTitleDateWithTimeNumberOfClassDurationID(title,startingDateWithTime,numberOfRecurrence,duration,numberOfClasses+1);
        Class courseClass = builder.build();
        classRepository.save(courseClass);
        course.addClass(courseClass);
        courseRepository.save(course);
        return true;
    }

}
