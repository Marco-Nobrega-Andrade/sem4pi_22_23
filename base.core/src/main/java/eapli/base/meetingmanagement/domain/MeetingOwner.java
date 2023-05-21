package eapli.base.meetingmanagement.domain;

import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.model.DomainEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class MeetingOwner implements eapli.framework.domain.model.DomainEntity<MeetingOwnerIdentifier>{

    @EmbeddedId
    private MeetingOwnerIdentifier id_MeetingOwner;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Meeting> meetingList;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    public MeetingOwner(MeetingOwnerIdentifier id_MeetingOwner ,List<Meeting> meetingList, Person person){
        if (meetingList==null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        if(meetingList.isEmpty()){
            throw new IllegalArgumentException("Meeting Owner cannot have no meeting associated");
        }
        if(person == null | id_MeetingOwner == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        this.id_MeetingOwner = id_MeetingOwner;
        this.meetingList = meetingList;
        this.person = person;
    }

    protected MeetingOwner() {
        //for ORM
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof MeetingOwner)) {
            return false;
        }

        final MeetingOwner that = (MeetingOwner) other;

        return id_MeetingOwner.equals(that.id_MeetingOwner) && person.equals(that.person);
    }

    public boolean hasIdentity(MeetingOwnerIdentifier id) {
        return DomainEntity.super.hasIdentity(id);
    }

    @Override
    public MeetingOwnerIdentifier identity() {
        return id_MeetingOwner;
    }

    @Override
    public int compareTo(MeetingOwnerIdentifier other) {
        return DomainEntity.super.compareTo(other);
    }

    public void addMeeting(Meeting meeting) {
        meetingList.add(meeting);
    }

    public boolean hasMeeting(Meeting meeting) {
        return meetingList.contains(meeting);
    }
}
