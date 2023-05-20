package eapli.base.meetingmanagement.domain.Factory;

import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.domain.Duration;
import eapli.base.courseclasses.domain.ScheduledDate;
import eapli.base.meetingmanagement.domain.*;
import eapli.base.usermanagement.domain.Person;

import java.util.ArrayList;
import java.util.List;


public class MeetingFactory  {

    public Meeting build(long idMeeting, List<Long> idInvitations, int minDuration, java.util.Date date_time, List<Person> people) {

        if (idInvitations.size()!=people.size()){
            throw new IllegalArgumentException("The number of invitations and people must be the same");
        }
        if (idInvitations.isEmpty() | people.isEmpty()){
            throw new IllegalArgumentException("There is not invitations or people");
        }
        if (minDuration<=0){
            throw new IllegalArgumentException("The duration must be greater than 0");
        }
        if (date_time==null){
            throw new IllegalArgumentException("The date can't be null");
        }
        if (idMeeting<=0){
            throw new IllegalArgumentException("The id must be greater than 0");
        }

        List<Invitation> invitations = new ArrayList<>();
        for (int i = 0; i < idInvitations.size(); i++) {
            invitations.add(new Invitation(new InvitationIdentifier(idInvitations.get(i)), new ResponseStatus(false), people.get(i)));
        }
        ScheduledDate scheduledDate = new ScheduledDate(new Duration(minDuration), new Date(date_time));
        MeetingIdentifier meetingIdentifier = new MeetingIdentifier(idMeeting);

        return new Meeting(meetingIdentifier, scheduledDate, invitations);
    }
}
