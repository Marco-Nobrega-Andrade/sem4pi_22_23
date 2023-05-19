package eapli.base.persistence.impl.inmemory;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.exams.domain.Exam;
import eapli.base.exams.domain.ExamId;
import eapli.base.exams.repositories.ExamRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Date;
import java.util.List;


public class InMemoryExamRepository extends InMemoryDomainRepository<Exam, ExamId> implements ExamRepository {

    @Override
    public List<Exam> listFutureExamsByCourse(Course course, Date currentDate) {
        return null;
    }
}
