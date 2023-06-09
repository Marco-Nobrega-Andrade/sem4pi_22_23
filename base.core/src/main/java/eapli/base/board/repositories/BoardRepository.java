package eapli.base.board.repositories;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardTitle;
import eapli.base.board.domain.Cell;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.List;

public interface BoardRepository extends DomainRepository<BoardTitle, Board> {
    long getLastCellId();

    List<Board> findAllBoardsIOwn(SystemUser user);

    Board findBoardByTitle(String boardTitle);

    List<Cell> getAllCellsFromABoard(Board board);
}
