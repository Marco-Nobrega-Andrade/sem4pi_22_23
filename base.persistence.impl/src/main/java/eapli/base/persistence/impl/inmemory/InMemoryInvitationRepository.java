package eapli.base.persistence.impl.inmemory;

import eapli.base.meetingmanagement.domain.Invitation;
import eapli.base.meetingmanagement.domain.InvitationIdentifier;

import eapli.base.meetingmanagement.repositories.InvitationRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;

public class InMemoryInvitationRepository extends InMemoryDomainRepository<Invitation, InvitationIdentifier> implements InvitationRepository {

    @Override
    public List<Invitation> getInvitationWithIdMeeting(long meetingId) {
        return null;
    }
}
