package eapli.base.persistence.impl.inmemory;

import eapli.base.board.domain.Board;
import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.boardparticipantmanagement.domain.BoardParticipantId;
import eapli.base.boardparticipantmanagement.repositories.BoardParticipantRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryBoardParticipantRepository extends InMemoryDomainRepository<BoardParticipant, BoardParticipantId> implements BoardParticipantRepository {
    @Override
    public Long findMaxId() {
        return 0L;
    }

    @Override
    public BoardParticipant findBoardParticipantByBoard(Board board) {
        return null;
    }
}
