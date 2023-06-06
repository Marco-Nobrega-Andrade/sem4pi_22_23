package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.boardparticipantmanagement.domain.BoardParticipantId;
import eapli.base.boardparticipantmanagement.repositories.BoardParticipantRepository;
import eapli.base.questionmanagement.repositories.QuestionRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;


import java.util.Optional;

public class JpaBoardParticipantRepository extends JpaAutoTxRepository<BoardParticipant, BoardParticipantId, BoardParticipantId> implements BoardParticipantRepository {
    public JpaBoardParticipantRepository(final TransactionalContext autoTx) {
        super(autoTx, "boardParticipantId");
    }

    public JpaBoardParticipantRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "boardParticipantId");
    }

    @Override
    public Long findMaxId() {
        if (count() > 0) {
            return createQuery("SELECT MAX(bp.boardParticipantId.id) FROM BoardParticipant bp", Long.class).getSingleResult();
        } else {
            return 0L;
        }
    }
}
