package eapli.base.persistence.impl.inmemory;

import eapli.base.usermanagement.domain.BoardOwner;
import eapli.base.usermanagement.domain.BoardOwnerId;
import eapli.base.usermanagement.repositories.BoardOwnerRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryBoardOwnerRepository extends InMemoryDomainRepository<BoardOwner, BoardOwnerId> implements BoardOwnerRepository{

    @Override
    public BoardOwner findBoardOwnerByPerson() {
        return null;
    }
}
