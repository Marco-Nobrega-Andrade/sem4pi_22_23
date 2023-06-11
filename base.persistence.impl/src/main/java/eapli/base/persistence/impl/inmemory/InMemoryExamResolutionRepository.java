package eapli.base.persistence.impl.inmemory;

import eapli.base.exams.domain.ExamResolution;
import eapli.base.exams.domain.ExamResolutionId;
import eapli.base.exams.repositories.ExamResolutionRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryExamResolutionRepository extends InMemoryDomainRepository<ExamResolution, ExamResolutionId> implements ExamResolutionRepository {

    @Override
    public Long findMaxId() {
        return 0L;
    }
}
