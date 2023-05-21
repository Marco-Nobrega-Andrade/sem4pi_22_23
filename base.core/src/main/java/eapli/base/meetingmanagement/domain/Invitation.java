package eapli.base.meetingmanagement.domain;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.model.AggregateRoot;
import javax.persistence.*;

@Entity
public class Invitation implements AggregateRoot<InvitationIdentifier> {

    private ResponseStatus status;
    @EmbeddedId
    private InvitationIdentifier idInvitation;

    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    public Invitation(InvitationIdentifier idInvitation, ResponseStatus status, Person person) {
        if (idInvitation == null || status == null || person == null) {
            throw new IllegalArgumentException("Parameters can't be null");
        }
        if (idInvitation.returnInvitationIdentifier() < 0) {
            throw new IllegalArgumentException("Id must be positive");
        }
        this.idInvitation = idInvitation;
        this.status = status;
        this.person = person;
    }

    protected Invitation() {
        //for ORM
    }
    public ResponseStatus returnResponseStatus() {
        return status;
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Invitation)) {
            return false;
        }
        final Invitation that = (Invitation) other;

        return idInvitation.equals(that.idInvitation) && status.equals(that.status) && person.equals(that.person);
    }

    @Override
    public int compareTo(InvitationIdentifier other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public InvitationIdentifier identity() {
        return idInvitation;
    }

    @Override
    public boolean hasIdentity(InvitationIdentifier id) {
        return AggregateRoot.super.hasIdentity(id);
    }

}
