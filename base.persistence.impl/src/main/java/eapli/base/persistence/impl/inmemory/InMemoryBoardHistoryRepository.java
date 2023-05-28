package eapli.base.persistence.impl.inmemory;

import eapli.base.boardhistory.domain.BoardHistory;
import eapli.base.boardhistory.domain.BoardHistoryId;
import eapli.base.boardhistory.repositories.BoardHistoryRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryBoardHistoryRepository extends InMemoryDomainRepository<BoardHistory, BoardHistoryId> implements BoardHistoryRepository {
    @Override
    public long getLastTaskId() {
        return 0;
    }
}
