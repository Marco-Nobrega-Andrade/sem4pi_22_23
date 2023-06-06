package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardTitle;
import eapli.base.board.repositories.BoardRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.List;

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

    @Override
    public List<Board> findAllBoardsIOwn(SystemUser user) {
        return createQuery("SELECT bl FROM BoardOwner bo JOIN bo.boardList bl WHERE bo = (SELECT p.boardOwner FROM Person p WHERE p.systemUser = :systemUser)", Board.class)
                .setParameter("systemUser", user).getResultList();

    }
}
