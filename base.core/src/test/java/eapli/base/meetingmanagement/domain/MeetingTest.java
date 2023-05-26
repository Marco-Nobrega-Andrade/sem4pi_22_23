package eapli.base.meetingmanagement.domain;

import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.domain.Duration;
import eapli.base.courseclasses.domain.ScheduledDate;
import eapli.base.meetingmanagement.domain.Factory.MeetingFactory;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.usermanagement.domain.MeetingOwner;
import eapli.base.usermanagement.domain.MeetingOwnerIdentifier;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.builder.PersonBuilder;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeetingTest {

    public static SystemUser dummyUser(final String username, final Role... roles) {
        SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy",
                "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.MANAGER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyMeetingOwnerWithNullValues() {
        new MeetingFactory().build(1, null,0, null,
                null,0 , null);
    }

    @Test
    public void verifySameAs_WithEqualId() {

        Person challenger = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Reyna").build();

        Person radiant = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Phoenix").build();

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),challenger);
        MeetingOwner meetingOwner2 = new MeetingOwner(new MeetingOwnerIdentifier(1),radiant);

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1),
                new ResponseStatus(ResponseStatusValue.REJECTED), challenger));
        List<Invitation> invitationB = new ArrayList<>();
        invitationB.add(new Invitation(new InvitationIdentifier(2),
                new ResponseStatus(ResponseStatusValue.REJECTED), radiant));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10),
                        new Date(new java.util.Date())),meetingOwner ,invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(25),
                        new Date(new java.util.Date())),meetingOwner2 ,invitationB);

        assertTrue(meeting.sameAs(meeting2));
    }

    @Test
    public void verifySameAs_WithDifferentId() {

        Person grandMaster = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Jett").build();

        Person inmortal = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Sage").build();

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),grandMaster);
        MeetingOwner meetingOwner2 = new MeetingOwner(new MeetingOwnerIdentifier(1),inmortal);

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1),
                new ResponseStatus(ResponseStatusValue.REJECTED), grandMaster));
        List<Invitation> invitationB = new ArrayList<>();
        invitationB.add(new Invitation(new InvitationIdentifier(2),
                new ResponseStatus(ResponseStatusValue.REJECTED), inmortal));

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10),
                        new Date(new java.util.Date())),meetingOwner ,invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(666),
                new ScheduledDate(new Duration(25),
                        new Date(new java.util.Date())),meetingOwner2 ,invitationB);

        assertFalse(meeting.sameAs(meeting2));
    }

    @Test
    public void verifySameAs_WithEqualInstances() {
        Person master = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Sova").build();

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),master);

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1),
                new ResponseStatus(ResponseStatusValue.REJECTED), master));

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10),
                        new Date(new java.util.Date())), meetingOwner ,invitationA);

        assertTrue(meeting.sameAs(meeting));
    }

    @Test
    public void verifySameAs_WithDifferentObjectTypes() {
        Person ascendant = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Gekko").build();

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),ascendant);


        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), ascendant));

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())),meetingOwner ,invitationA);

        assertFalse(meeting.sameAs(ascendant));
    }

    @Test
    public void verifyIfIsTheMeetingDateTrue() {
        Person immortal = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Skye").build();

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),immortal);

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), immortal));

        java.util.Date date = new java.util.Date(1000, Calendar.NOVEMBER,9,10,10,10);

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(date)),meetingOwner ,invitationA);
        boolean b = meeting.verifyIfIsTheMeetingDate(date, 10);
        assertTrue(b);
    }

    @Test
    public void verifyIfIsTheMeetingDateFalse() {
        Person diamond = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Viper").build();

        MeetingOwner meetingOwner = new MeetingOwner(new MeetingOwnerIdentifier(1),diamond);

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1),
                new ResponseStatus(ResponseStatusValue.REJECTED), diamond));

        java.util.Date date = new java.util.Date(1000, Calendar.NOVEMBER,9,10,10,10);

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(date)),meetingOwner ,invitationA);

        boolean b = meeting.verifyIfIsTheMeetingDate(
                new java.util.Date(1001, Calendar.NOVEMBER,9,10,10,10), 10);

        assertFalse(b);
    }

}