package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formativeexams.domain.FormativeExam;
import eapli.base.formativeexams.domain.FormativeExamID;
import eapli.base.formativeexams.repositories.FormativeExamRepository;
import eapli.base.questionmanagement.domain.Question;
import eapli.base.questionmanagement.domain.QuestionIdentifier;
import eapli.base.questionmanagement.repositories.QuestionRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.Map;

public class JpaFormativeExamRepository extends JpaAutoTxRepository<FormativeExam, FormativeExamID, FormativeExamID> implements FormativeExamRepository {

    public JpaFormativeExamRepository(final TransactionalContext autoTx) {
        super(autoTx, "formativeExamID");
    }

    public JpaFormativeExamRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "formativeExamID");
    }
}
