package eapli.base.exams.repositories;

import eapli.base.exams.domain.Exam;
import eapli.base.exams.domain.ExamResolution;
import eapli.base.exams.domain.ExamResolutionId;
import eapli.base.usermanagement.domain.Student;
import eapli.framework.domain.repositories.DomainRepository;

public interface ExamResolutionRepository extends DomainRepository<ExamResolutionId, ExamResolution> {
    Long findMaxId();

    boolean containsOfExamAndStudent(Exam exam, Student student);
}
