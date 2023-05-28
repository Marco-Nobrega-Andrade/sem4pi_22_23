package eapli.base.meetingmanagement.repositories;

import eapli.base.meetingmanagement.domain.Invitation;
import eapli.base.meetingmanagement.domain.InvitationIdentifier;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface InvitationRepository extends DomainRepository<InvitationIdentifier,Invitation> {
    List<Invitation> getInvitationWithIdMeeting(long meetingId);
}
