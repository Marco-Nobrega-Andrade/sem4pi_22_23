package eapli.base.meetingmanagement.domain;
import eapli.framework.domain.model.AggregateRoot;
import javax.persistence.*;

@Entity
public class Invitation implements AggregateRoot<InvitationIdentifier> {

    private ResponseStatus status;
    @EmbeddedId
    private InvitationIdentifier idInvitation;

    protected Invitation(InvitationIdentifier idInvitation, ResponseStatus status) {
        this.idInvitation = idInvitation;
        this.status = status;
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

        return idInvitation.equals(that.idInvitation) && status.equals(that.status);
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
