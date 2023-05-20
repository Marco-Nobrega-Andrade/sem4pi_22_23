package eapli.base.persistence.impl.inmemory;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardTitle;
import eapli.base.board.repositories.BoardRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryBoardRepository extends InMemoryDomainRepository<Board, BoardTitle> implements BoardRepository {

    @Override
    public long getLastCellId() {
        return 0;
    }
}
