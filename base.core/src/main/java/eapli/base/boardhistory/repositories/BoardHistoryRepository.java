package eapli.base.boardhistory.repositories;

import eapli.base.board.domain.BoardTitle;
import eapli.base.boardhistory.domain.BoardHistory;
import eapli.base.boardhistory.domain.BoardHistoryId;
import eapli.base.boardhistory.domain.Task;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface BoardHistoryRepository extends DomainRepository<BoardHistoryId, BoardHistory> {
    long getLastTaskId();

    BoardHistory getBoardHistoryByBoardTitle(String boardTitle);
    List<Task> historyOfUpdates(BoardHistoryId boardHistoryId);
}
