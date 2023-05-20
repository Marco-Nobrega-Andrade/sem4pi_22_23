package eapli.base.meetingmanagement.application.service;

import eapli.base.courseclasses.domain.Class;
import eapli.base.courseclasses.domain.ExtraClass;
import eapli.base.courseclasses.repositories.ClassRepository;
import eapli.base.courseclasses.repositories.ExtraClassRepository;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingmanagement.domain.Factory.MeetingOwnerFactory;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.Factory.MeetingFactory;
import eapli.base.meetingmanagement.domain.MeetingOwner;
import eapli.base.meetingmanagement.repositories.InvitationRepository;
import eapli.base.meetingmanagement.repositories.MeetingRepository;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.Teacher;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import org.springframework.transaction.IllegalTransactionStateException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ScheduleMeetingService {

  private final MeetingRepository meetingRepository = PersistenceContext.repositories().meetingRepository();
  private final PersonRepository personRepository = PersistenceContext.repositories().personRepository();
  private final ClassRepository classRepository = PersistenceContext.repositories().classRepository();
  private final ExtraClassRepository extraClassRepository = PersistenceContext.repositories().extraClassRepository();

  private final CourseRepository courseRepository = PersistenceContext.repositories().courseRepository();
  private final InvitationRepository invitationRepository = PersistenceContext.repositories().invitationRepository();
    public boolean verifyMeeting(List<String> emails, Date date, int duration) {
        // TODO
        List<Person> people = getPersonsByEmail(emails);
        List<Boolean> areAvailable = new ArrayList<>();
        areAvailable.add(verifyIfExistAMeeting(people,date, duration));
        areAvailable.add(verifyIfExistAClass(people,date, duration));
        areAvailable.add(verifyIfExistAExtraClass(people,date, duration));

        for (Boolean available : areAvailable) {
            if (available) {
                return false;
            }
        }
        return true;
    }

    private Boolean verifyIfExistAExtraClass(List<Person> people, Date utilDate, int duration) {
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

    /**
     * Verifies if exist a class at the time for the given people
     * @param people List of person who can be a teacher or a student of the class
     * @param utilDate date of the class
     * @param duration duration of the class
     * @return true if exist a class at the time
     */
    private Boolean verifyIfExistAClass(List<Person> people, Date utilDate, int duration) {
        // TODO

       List<List<Course>> coursesList = new ArrayList<>();

       for (Person person : people){
           coursesList.add(courseRepository.findStudentInACourses(person.user()));
       }

        List<List<Class>> classesListByStudents = new ArrayList<>();
        for (List<Course> courses: coursesList) {
            for (Course course: courses) {
                if (course!=null){
                    classesListByStudents.add(classRepository.findClassesInACourse(course));
                }
            }
        }

        List<Person> teachers = new ArrayList<>();
        for (Person person : people){
            if (person.isATeacher()){
                teachers.add(person);
            }
        }

        List<Class> teacherClasses =classRepository.findAllClassesByTeacher(teachers);

        if (teacherClasses.isEmpty()&&classesListByStudents.isEmpty()){
            return false;
        }

        for (Class classe : teacherClasses){
            if (classe.verifyIfAClassAtTheTime(utilDate,duration)) {
                return true;
            }
        }
        for (List<Class> classes : classesListByStudents){
            for (Class classe : classes){
                if (classe.verifyIfAClassAtTheTime(utilDate,duration)) {
                    return true;
                }
            }
        }

        return false;
    }

    public List<Person> getPersonsByEmail(List<String> emails) {
        // TODO
        List<EmailAddress> emailAddresses = new ArrayList<>();
        for (String email : emails) {
            EmailAddress emailAddress = EmailAddress.valueOf(email);
            emailAddresses.add(emailAddress);
        }
        List<Person> persons = personRepository.findAllPersonsWhoMatch(emailAddresses);

        if (persons.isEmpty()) {
            throw new IllegalTransactionStateException("No person found with the given email");
        }

        return persons;
    }


    public boolean verifyIfExistAMeeting(List<Person> people, java.util.Date utilDate, int duration) {
        // TODO
        List<Meeting> meetings = meetingRepository.findAllMeetingsWhoMatch(people);

        if (meetings.isEmpty()){
            return false;
        }

        for (Meeting meeting : meetings){
            if (meeting.verifyIfIsTheMeetingDate(utilDate,duration)) {
                return true;
            }
        }

        return false;
    }

    public boolean scheduledMeeting(List<String> emails, Date date, int duration) {
        // TODO

        MeetingFactory meetingFactory = new MeetingFactory();
        long idMeeting = meetingRepository.count()+1;
        List<Long> idInvitations = new ArrayList<>();
        List<Person> people = getPersonsByEmail(emails);
        for (Person person: people) {
            idInvitations.add(invitationRepository.count()+1);
        }
        Meeting meeting = meetingFactory.build(idMeeting, idInvitations, 30, date,people);
        AuthorizationService authz = AuthzRegistry.authorizationService();
        SystemUser user = authz.session().get().authenticatedUser();
        List<EmailAddress> emailAddresses = new ArrayList<>();
        emailAddresses.add(user.email());
        List<Person> meetingOwnerPerson = personRepository.findAllPersonsWhoMatch(emailAddresses);
        List<MeetingOwner> meetingOwner = meetingRepository.findIfPersonIsAMeetingOwner(meetingOwnerPerson.get(0));

        if (!meetingOwner.isEmpty()){
            meetingOwner.get(0).addMeeting(meeting);
            meetingRepository.save(meeting);
            return true;
        }
        else {
            List<Meeting> meetings = new ArrayList<>();
            meetings.add(meeting);
            MeetingOwnerFactory meetingOwnerFactory = new MeetingOwnerFactory();
            MeetingOwner owner = meetingOwnerFactory.build(meetingRepository.countNumberOfOwners()+1,meetings,meetingOwnerPerson.get(0));
            meetingRepository.save(meeting);
            return true;
        }
    }

}
