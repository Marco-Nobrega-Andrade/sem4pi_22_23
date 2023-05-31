package eapli.base.invitationmanagement.domain.Factory;

import eapli.base.invitationmanagement.domain.Invitation;
import eapli.base.invitationmanagement.domain.InvitationIdentifier;
import eapli.base.meetingmanagement.domain.ResponseStatus;
import eapli.base.meetingmanagement.domain.ResponseStatusValue;
import eapli.base.usermanagement.domain.Person;

public class InvitationFactory {
    public Invitation build(long idInvitation, Person person) {
        if (person==null){
            throw new IllegalArgumentException("The person can't be null");
        }
        if (idInvitation<=0){
            throw new IllegalArgumentException("The id must be greater than 0");
        }
        return new Invitation(new InvitationIdentifier(idInvitation), new ResponseStatus(ResponseStatusValue.PENDING), person);
    }
}
