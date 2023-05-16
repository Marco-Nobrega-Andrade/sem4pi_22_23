package eapli.base.meetingmanagement.repositories;

import eapli.base.meetingmanagement.domain.Invitation;
import eapli.base.meetingmanagement.domain.InvitationIdentifier;
import eapli.framework.domain.repositories.DomainRepository;

public interface InvitationRepository extends DomainRepository<InvitationIdentifier,Invitation> {
}
