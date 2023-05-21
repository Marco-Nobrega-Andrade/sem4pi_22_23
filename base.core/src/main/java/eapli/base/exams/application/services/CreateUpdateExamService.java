package eapli.base.exams.application.services;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseIdentifier;
import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.exams.domain.*;
import eapli.base.exams.dto.ExamDTOWithDatesExamIdCourseId;
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

    public boolean updateQuestion(String structure, Date initialDate, Date finalDate, ExamDTOWithDatesExamIdCourseId examDTO){
        Exam exam = examRepository.ofIdentity(new ExamId(Long.parseLong(examDTO.examId))).get();
        if (structure!= null){
            ExamSpecification specification = new ExamSpecification(structure);
            new VerifyExamSpecificationService().verifyExamSpecification(structure);
            exam.updateExamSpecification(specification);
        }else if (initialDate != null && finalDate != null){
            DateInterval dateInterval = new DateInterval(initialDate,finalDate);
            exam.updateDateInterval(dateInterval);
        }
        examRepository.save(exam);
        return true;
    }
}
