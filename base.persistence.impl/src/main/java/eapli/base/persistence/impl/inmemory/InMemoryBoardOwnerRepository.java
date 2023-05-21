package eapli.base.persistence.impl.inmemory;

import eapli.base.board.domain.BoardOwner;
import eapli.base.board.domain.BoardOwnerId;
import eapli.base.board.repositories.BoardOwnerRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryBoardOwnerRepository extends InMemoryDomainRepository<BoardOwner, BoardOwnerId> implements BoardOwnerRepository{

}
