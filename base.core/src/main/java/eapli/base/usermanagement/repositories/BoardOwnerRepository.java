package eapli.base.board.repositories;

import eapli.base.usermanagement.domain.BoardOwner;
import eapli.base.usermanagement.domain.BoardOwnerId;
import eapli.framework.domain.repositories.DomainRepository;

public interface BoardOwnerRepository extends DomainRepository<BoardOwnerId, BoardOwner> {
}
