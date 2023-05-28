package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.boardhistory.domain.BoardHistory;
import eapli.base.boardhistory.domain.BoardHistoryId;
import eapli.base.boardhistory.repositories.BoardHistoryRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaBoardHistoryRepository extends JpaAutoTxRepository<BoardHistory, BoardHistoryId, BoardHistoryId> implements BoardHistoryRepository{
    public JpaBoardHistoryRepository(final TransactionalContext autoTx) {
        super(autoTx, "boarHistoryId");
    }

    public JpaBoardHistoryRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "boarHistoryId");
    }

    @Override
    public long getLastTaskId() {
        return createQuery("SELECT COUNT(t) FROM Task t", Long.class).getSingleResult();
    }
}
