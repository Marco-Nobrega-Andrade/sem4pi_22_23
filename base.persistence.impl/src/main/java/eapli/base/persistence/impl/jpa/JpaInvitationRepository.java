package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.meetingmanagement.domain.Invitation;
import eapli.base.meetingmanagement.domain.InvitationIdentifier;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.MeetingIdentifier;
import eapli.base.meetingmanagement.repositories.InvitationRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaInvitationRepository extends JpaAutoTxRepository<Invitation, InvitationIdentifier, InvitationIdentifier>  implements InvitationRepository {
    public JpaInvitationRepository(final TransactionalContext autoTx) {
        super(autoTx, "idInvitation");
    }
    public JpaInvitationRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "idInvitation");
    }

}
