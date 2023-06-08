package eapli.base.board.repositories;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardTitle;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.List;

public interface BoardRepository extends DomainRepository<BoardTitle, Board> {
    public long getLastCellId();

    public List<Board> findAllBoardsIOwn(SystemUser user);

    public Board findBoardByTitle(String boardTitle);
}
