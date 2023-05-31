package eapli.base.meetingmanagement.domain.Factory;

import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.domain.Duration;
import eapli.base.courseclasses.domain.ScheduledDate;
import eapli.base.invitationmanagement.domain.InvitationFactory;
import eapli.base.invitationmanagement.domain.Invitation;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.MeetingIdentifier;
import eapli.base.usermanagement.domain.MeetingOwner;
import eapli.base.usermanagement.domain.MeetingOwnerIdentifier;
import eapli.base.usermanagement.domain.Person;

import java.util.ArrayList;
import java.util.List;


public class MeetingFactory  {

    public Meeting build(long idMeeting, Person owner, long idMeetingOwner, List<Person> people,
                         List<Long> idInvitations, int minDuration, java.util.Date date_time) {

        if (idInvitations==null | people==null | owner==null| date_time==null){
            throw new IllegalArgumentException("The invitations or people can't be null");
        }
        if (idInvitations.isEmpty() | people.isEmpty()){
            throw new IllegalArgumentException("There is not invitations or people");
        }
        if (idInvitations.size()!=people.size()){
            throw new IllegalArgumentException("The number of invitations and people must be the same");
        }
        if (minDuration<=0){
            throw new IllegalArgumentException("The duration must be greater than 0");
        }
        if (idMeeting<=0){
            throw new IllegalArgumentException("The id must be greater than 0");
        }
        if (date_time.before(new java.util.Date())){
            throw new IllegalArgumentException("The date can't be before the current date");
        }

        MeetingOwner meetingOwner = new MeetingOwner(
                new MeetingOwnerIdentifier(idMeetingOwner),owner);

        InvitationFactory invitationFactory = new InvitationFactory();
        List<Invitation> invitations = new ArrayList<>();
        for (int i=0; i<idInvitations.size(); i++) {
            invitations.add(invitationFactory.build(idInvitations.get(i),people.get(i)));
        }

        ScheduledDate scheduledDate = new ScheduledDate(new Duration(minDuration), new Date(date_time));
        MeetingIdentifier meetingIdentifier = new MeetingIdentifier(idMeeting);

        return new Meeting(meetingIdentifier, scheduledDate, meetingOwner, invitations);
    }
}
