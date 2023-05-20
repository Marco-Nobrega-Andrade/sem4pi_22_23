package eapli.base.exams.application.services;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.exams.domain.Exam;
import eapli.base.exams.domain.ExamBuilder;
import eapli.base.exams.repositories.ExamRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.Teacher;
import eapli.base.usermanagement.repositories.TeacherRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Date;

public class CreateUpdateExamService {

    private ExamRepository examRepository = PersistenceContext.repositories().examRepository();
    private CourseRepository courseRepository = PersistenceContext.repositories().courseRepository();

    private TeacherRepository teacherRepository = PersistenceContext.repositories().teacherRepository();
    public boolean createExam(String structure, CourseDTOWithIdTitle courseDto, Date initialDate, Date finalDate){

        AuthorizationService authz = AuthzRegistry.authorizationService();
        SystemUser systemUser = authz.session().get().authenticatedUser();
        Teacher teacher = teacherRepository.findTeacherBySystemUser(systemUser);

        Long numberOfExams = examRepository.count();
        ExamBuilder examBuilder = new ExamBuilder();
        Exam exam = examBuilder.withExamSpecification(structure).withDateInterval(initialDate,finalDate).withId(numberOfExams +1).withTeacher(teacher).build();
        Course course = courseRepository.ofIdentity(new CourseIdentifier(courseDto.courseIdentifier)).get();

        course.addExam(exam);
        examRepository.save(exam);
        courseRepository.save(course);

        return true;
    }
}
