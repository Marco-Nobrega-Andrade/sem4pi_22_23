package eapli.base.meetingmanagement.repositories;

import eapli.base.invitationmanagement.domain.Invitation;
import eapli.base.invitationmanagement.domain.InvitationIdentifier;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface InvitationRepository extends DomainRepository<InvitationIdentifier,Invitation> {
    List<Invitation> getInvitationWithIdMeeting(long meetingId);
}
