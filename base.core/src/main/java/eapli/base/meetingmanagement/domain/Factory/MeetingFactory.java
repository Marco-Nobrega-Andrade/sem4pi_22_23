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
