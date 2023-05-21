package eapli.base.board.repositories;

import eapli.base.board.domain.BoardOwner;
import eapli.base.board.domain.BoardOwnerId;
import eapli.framework.domain.repositories.DomainRepository;

public interface BoardOwnerRepository extends DomainRepository<BoardOwnerId, BoardOwner> {
}
