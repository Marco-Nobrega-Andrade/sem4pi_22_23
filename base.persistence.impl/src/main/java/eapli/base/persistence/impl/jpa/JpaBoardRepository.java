package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardTitle;
import eapli.base.board.domain.Cell;
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
    /**
     * Searches for the last cell id
     * @return the last cell id
     */

    @Override
    public long getLastCellId() {
        return createQuery("SELECT COUNT(c) FROM Cell c", Long.class).getSingleResult();
    }

    /**
     * Searches for all boards owned by the user
     * @param user the user to search for
     * @return a list of boards owned by the user
     */

    @Override
    public List<Board> findAllBoardsIOwn(SystemUser user) {
        return createQuery("SELECT b FROM Board b WHERE b IN (SELECT bl FROM BoardOwner bo JOIN bo.boardList bl" +
                " WHERE bo = (SELECT p.boardOwner FROM Person p WHERE p.systemUser = :systemUser)) " +
                "AND b.boardStatus.isActive = TRUE", Board.class)
                .setParameter("systemUser", user).getResultList();
    }

    /**
     * Searches for a board with the given title
     * @param boardTitle the title to search for
     * @return the board with the given title
     */
    @Override
    public Board findBoardByTitle(String boardTitle) {
        return createQuery("SELECT b FROM Board b WHERE b.boardTitle.boardTitle =: boardTitleString", Board.class)
                .setParameter("boardTitleString", boardTitle).getSingleResult();
    }

    /**
     * Searches for all boards in which the user is a participant
     * @param user the user to search for
     * @return a list of boards in which the user is a participant
     */
    @Override
    public List<Board> findAllBoardsIParticipateWithWritePermission(SystemUser user) {
        //TODO: implement this method

        return createQuery("SELECT DISTINCT b FROM Board b WHERE b IN " +
                "(SELECT bl FROM BoardOwner bo JOIN bo.boardList bl" +
                " WHERE bo = (SELECT p.boardOwner FROM Person p WHERE p.systemUser = :systemUser)) OR" +
                " b IN (SELECT DISTINCT bp.board FROM BoardParticipant bp WHERE bp IN " +
                "(SELECT bpl FROM Person p JOIN p.boardParticipantList bpl WHERE p.systemUser = :systemUser) " +
                "AND bp.permission.hasWritePermission = TRUE) "+
                "AND b.boardStatus.isActive = TRUE", Board.class)
                .setParameter("systemUser", user).getResultList();

    }

    @Override
    public List<Cell> getAllCellsFromABoard(Board board) {
        return createQuery("SELECT DISTINCT c FROM Cell c WHERE c IN (SELECT cl FROM board b  JOIN b.cellList cl WHERE b = :board)", Cell.class)
                .setParameter("board", board).getResultList();
    }
}
