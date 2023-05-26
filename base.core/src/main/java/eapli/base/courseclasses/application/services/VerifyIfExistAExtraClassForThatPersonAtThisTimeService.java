package eapli.base.courseclasses.application.services;

import eapli.base.courseclasses.domain.ExtraClass;
import eapli.base.courseclasses.repositories.ExtraClassRepository;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VerifyIfExistAExtraClassForThatPersonAtThisTimeService {

    private final ExtraClassRepository extraClassRepository = PersistenceContext.repositories().extraClassRepository();

    private final CourseRepository courseRepository = PersistenceContext.repositories().courseRepository();

    public Boolean verifyIfExistAExtraClass(List<Person> people, Date utilDate, int duration) {
        // TODO
        List<List<Course>> coursesList = new ArrayList<>();

        for (Person person : people){
            coursesList.add(courseRepository.findStudentInACourses(person.user()));
        }

        List<List<ExtraClass>> classesListByStudents = new ArrayList<>();
        for (List<Course> courses: coursesList) {
            for (Course course: courses) {
                if (course!=null){
                    classesListByStudents.add(extraClassRepository.findExtraClassesInACourse(course));
                }
            }
        }

        List<Person> teachers = new ArrayList<>();
        for (Person person : people){
            if (person.isATeacher()){
                teachers.add(person);
            }
        }

        List<ExtraClass> teacherClasses =extraClassRepository.findAllClassesByTeacher(teachers);

        if (teacherClasses.isEmpty()&&classesListByStudents.isEmpty()){
            return false;
        }

        for (ExtraClass classe : teacherClasses){
            if (classe.verifyIfExistAnExtraClassAtTheTime(utilDate,duration)) {
                return true;
            }
        }
        for (List<ExtraClass> classes : classesListByStudents){
            for (ExtraClass classe : classes){
                if (classe.verifyIfExistAnExtraClassAtTheTime(utilDate,duration)) {
                    return true;
                }
            }
        }

        return false;

    }
}
