package eapli.base.boardparticipantmanagement.repositories;

import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.boardparticipantmanagement.domain.BoardParticipantId;
import eapli.framework.domain.repositories.DomainRepository;

public interface BoardParticipantRepository extends DomainRepository<BoardParticipantId, BoardParticipant> {
    Long findMaxId();
}
