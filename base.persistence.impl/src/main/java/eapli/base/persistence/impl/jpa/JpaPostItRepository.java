package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.postitmanager.domain.PostIt;
import eapli.base.postitmanager.domain.PostItIdentifier;
import eapli.base.postitmanager.domain.PostItKey;
import eapli.base.postitmanager.repositories.PostItRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaPostItRepository extends JpaAutoTxRepository<PostIt, PostItKey, PostItKey> implements PostItRepository {
    public JpaPostItRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "postItKey");
    }
    public JpaPostItRepository(final TransactionalContext autoTx) {
        super(autoTx, "postItKey");
    }
}
