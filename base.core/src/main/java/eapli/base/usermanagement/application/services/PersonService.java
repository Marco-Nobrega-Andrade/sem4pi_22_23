package eapli.base.usermanagement.application.services;


import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.Student;
import eapli.base.usermanagement.domain.Teacher;
import eapli.base.usermanagement.domain.builder.PersonBuilder;
import eapli.base.usermanagement.domain.builder.StudentBuilder;
import eapli.base.usermanagement.domain.builder.TeacherBuilder;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Calendar;

public class PersonService {


    public String registerNewPerson(String fullname, SystemUser user){
        try {
            PersonBuilder personBuilder = new PersonBuilder();
            personBuilder.with(fullname,user);
            PersonRepository personRepository = PersistenceContext.repositories().personRepository();
            personBuilder.withID(personRepository.findTotalNumberOfPerson()+1);
            Person per = personBuilder.build();
            personRepository.save(per);
        } catch (Exception e) {
            PersistenceContext.repositories().users().delete(user);
            return e.getMessage();
        }
        return "Success";
    }

    public String registerNewTeacher(String fullname,SystemUser user ,String acronym, String dateOfBirth, int taxPayerNumber){
        try {
            TeacherBuilder teacherBuilder = new TeacherBuilder();
            teacherBuilder.with(fullname,user,acronym,dateOfBirth,taxPayerNumber);
            PersonRepository personRepository = PersistenceContext.repositories().personRepository();
            teacherBuilder.withID( personRepository.findTotalNumberOfPerson()+1);
            Teacher teacher = teacherBuilder.build();
            personRepository.save(teacher);
        } catch (Exception e) {
            PersistenceContext.repositories().users().delete(user);
            return e.getMessage();
        }
        return "Success";
    }

    public String registerNewStudent(String fullname,SystemUser user , String dateOfBirth, int taxPayerNumber){
        try {
            StudentBuilder studentBuilder = new StudentBuilder();
            studentBuilder.with(fullname,user,dateOfBirth,taxPayerNumber);
            PersonRepository personRepository = PersistenceContext.repositories().personRepository();
            studentBuilder.withID( personRepository.findTotalNumberOfPerson()+1);
            String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
            studentBuilder.withMecanographicNumber(personRepository.findTotalMecanographicNumberByYear(year) + 1,year);
            Student student = studentBuilder.build();
            personRepository.save(student);
        }catch (Exception e){
            PersistenceContext.repositories().users().delete(user);
            return e.getMessage();
        }
        return "Success";
    }
}
