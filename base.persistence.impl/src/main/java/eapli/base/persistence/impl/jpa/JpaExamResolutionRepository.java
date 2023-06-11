package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.exams.domain.ExamResolution;
import eapli.base.exams.domain.ExamResolutionId;
import eapli.base.exams.repositories.ExamResolutionRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;



public class JpaExamResolutionRepository extends JpaAutoTxRepository<ExamResolution, ExamResolutionId,ExamResolutionId> implements ExamResolutionRepository {

    public JpaExamResolutionRepository(final TransactionalContext autoTx) {
        super(autoTx, "examResolution_Id");
    }

    public JpaExamResolutionRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "examResolution_Id");
    }
}
