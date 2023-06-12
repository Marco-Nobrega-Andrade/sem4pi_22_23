package eapli.base.exams.repositories;

import eapli.base.exams.domain.ExamResolution;
import eapli.base.exams.domain.ExamResolutionId;
import eapli.framework.domain.repositories.DomainRepository;

public interface ExamResolutionRepository extends DomainRepository<ExamResolutionId, ExamResolution> {
    Long findMaxId();
}
