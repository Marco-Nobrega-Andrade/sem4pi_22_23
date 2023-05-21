package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.board.domain.BoardOwner;
import eapli.base.board.domain.BoardOwnerId;
import eapli.base.board.repositories.BoardOwnerRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaBoardOwnerRepository extends JpaAutoTxRepository<BoardOwner, BoardOwnerId, BoardOwnerId> implements BoardOwnerRepository {

    public JpaBoardOwnerRepository(final TransactionalContext autoTx) {
        super(autoTx, "boardOwnerId");
    }

    public JpaBoardOwnerRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "boardOwnerId");
    }
}
