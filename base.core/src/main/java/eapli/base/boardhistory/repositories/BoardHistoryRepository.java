package eapli.base.boardhistory.repositories;

import eapli.base.boardhistory.domain.BoardHistory;
import eapli.base.boardhistory.domain.BoardHistoryId;
import eapli.framework.domain.repositories.DomainRepository;

public interface BoardHistoryRepository extends DomainRepository<BoardHistoryId, BoardHistory> {
    long getLastTaskId();
}
