package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardTitle;
import eapli.base.board.repositories.BoardRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaBoardRepository extends JpaAutoTxRepository<Board, BoardTitle, BoardTitle> implements BoardRepository {
    public JpaBoardRepository(final TransactionalContext autoTx) {
        super(autoTx, "boardTitle");
    }

    public JpaBoardRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "boardTitle");
    }

    @Override
    public long getLastCellId() {
        return createQuery("SELECT COUNT(c) FROM Cell c", Long.class).getSingleResult();
    }
}
