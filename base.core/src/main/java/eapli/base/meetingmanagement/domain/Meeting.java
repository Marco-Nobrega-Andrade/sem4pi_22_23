package eapli.base.meetingmanagement.domain;
import eapli.base.courseclasses.domain.ScheduledDate;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.List;

@Entity
public class Meeting implements AggregateRoot<MeetingIdentifier> {
    @EmbeddedId
    private MeetingIdentifier idMeeting;
    private ScheduledDate scheduledDate;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Invitation> invitation;

    public Meeting(MeetingIdentifier idMeeting, ScheduledDate scheduledDate, List<Invitation> invitation) {
        this.idMeeting = idMeeting;
        this.scheduledDate = scheduledDate;
        this.invitation = invitation;
    }

    protected Meeting() {
        //for ORM
    }

    public boolean verifyIfIsTheMeetingDate(java.util.Date startingDateWithTime, int duration){
        return scheduledDate.verifyIfExistAtTheCurrentTime(startingDateWithTime,duration);
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Meeting)) {
            return false;
        }

        final Meeting that = (Meeting) other;

        return idMeeting.equals(that.idMeeting);
    }

    public boolean hasIdentity(MeetingIdentifier id) {
        return AggregateRoot.super.hasIdentity(id);
    }

    @Override
    public MeetingIdentifier identity() {
        return idMeeting;
    }

    @Override
    public int compareTo(MeetingIdentifier other) {
        return AggregateRoot.super.compareTo(other);
    }

}
