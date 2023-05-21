package eapli.base.meetingmanagement.domain;

import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.domain.Duration;
import eapli.base.courseclasses.domain.ScheduledDate;
import eapli.base.meetingmanagement.domain.Factory.MeetingOwnerFactory;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.builder.PersonBuilder;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeetingOwnerTest {

    public static SystemUser dummyUser(final String username, final Role... roles) {
        SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.MANAGER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyMeetingWithNullValues() {
        new MeetingOwnerFactory().build(1, null, null);
    }

    @Test
    public void verifySameAs_WithEqualId() {

        Person platinum = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Brimstone").build();

        Person gold = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Breach").build();

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), platinum));
        List<Invitation> invitationB = new ArrayList<>();
        invitationB.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), gold));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(101),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationB);

        List<Meeting> meetingList = new ArrayList<>();

        meetingList.add(meeting);meetingList.add(meeting2);

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,platinum);
        MeetingOwner meetingOwner2 = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,gold);

        assertFalse(meetingOwner.sameAs(meetingOwner2));//cause the person is different
    }


    @Test
    public void verifySameAs_WithEqualIdAndEqualPerson() {

        Person silver = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Yoru").build();


        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), silver));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(101),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationA);

        List<Meeting> meetingList = new ArrayList<>();

        meetingList.add(meeting);meetingList.add(meeting2);

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,silver);
        MeetingOwner meetingOwner2 = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,silver);

        assertTrue(meetingOwner.sameAs(meetingOwner2));
    }

    @Test
    public void verifySameAs_WithDifferentId() {

        Person bronze = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Neon").build();

        Person iron = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Astra").build();

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), bronze));
        List<Invitation> invitationB = new ArrayList<>();
        invitationB.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), iron));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(101),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationB);

        List<Meeting> meetingList = new ArrayList<>();

        meetingList.add(meeting);meetingList.add(meeting2);

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,bronze);
        MeetingOwner meetingOwner2 = new MeetingOwner(new MeetingOwnerIdentifier(2),meetingList,iron);

        assertFalse(meetingOwner.sameAs(meetingOwner2));//cause the id is different
    }

    @Test
    public void verifySameAs_WithEqualInstances() {
        Person jgDiff = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Warwick").build();


        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), jgDiff));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(101),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationA);

        List<Meeting> meetingList = new ArrayList<>();

        meetingList.add(meeting);meetingList.add(meeting2);

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,jgDiff);

        assertTrue(meetingOwner.sameAs(meetingOwner));
    }

    @Test
    public void verifySameAs_WithDifferentObjectTypes() {
        Person supDiff = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Lux").build();


        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), supDiff));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(101),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationA);

        List<Meeting> meetingList = new ArrayList<>();

        meetingList.add(meeting);meetingList.add(meeting2);

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,supDiff);

        assertFalse(meetingOwner.sameAs(meeting));
    }

    @Test
    public void verifyIfAddMeeting() {
        Person topDiff = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Lux").build();


        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), topDiff));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(101),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationA);

        List<Meeting> meetingList = new ArrayList<>();

        meetingList.add(meeting);

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),meetingList,topDiff);
        meetingOwner.addMeeting(meeting2);

        assertTrue(meetingOwner.hasMeeting(meeting2));
    }
}