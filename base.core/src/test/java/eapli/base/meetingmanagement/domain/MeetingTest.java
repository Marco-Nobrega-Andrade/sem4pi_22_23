package eapli.base.meetingmanagement.domain;

import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.domain.Duration;
import eapli.base.courseclasses.domain.ScheduledDate;
import eapli.base.meetingmanagement.domain.Factory.MeetingFactory;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.builder.PersonBuilder;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeetingTest {

    public static SystemUser dummyUser(final String username, final Role... roles) {
        SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.MANAGER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyMeetingOwnerWithNullValues() {
        Meeting meeting = new MeetingFactory().build(1, null, 0, null, null);
    }

    @Test
    public void verifySameAs_WithEqualId() {

        Person challenger = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Reyna").build();

        Person radiant = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Phoenix").build();

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), challenger));
        List<Invitation> invitationB = new ArrayList<>();
        invitationB.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), radiant));

        Meeting meeting = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(100),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationB);
        assertTrue(meeting.sameAs(meeting2));
    }

    @Test
    public void verifySameAs_WithDifferentId() {

        Person grandMaster = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Jett").build();

        Person inmortal = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Sage").build();

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), grandMaster));
        List<Invitation> invitationB = new ArrayList<>();
        invitationB.add(new Invitation(new InvitationIdentifier(2), new ResponseStatus(false), inmortal));

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);
        Meeting meeting2 = new Meeting(new MeetingIdentifier(666),
                new ScheduledDate(new Duration(25), new Date(new java.util.Date())), invitationB);
        assertFalse(meeting.sameAs(meeting2));
    }

    @Test
    public void verifySameAs_WithEqualInstances() {
        Person master = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Sova").build();


        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), master));

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);

        assertTrue(meeting.sameAs(meeting));
    }

    @Test
    public void verifySameAs_WithDifferentObjectTypes() {
        Person ascendant = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Gekko").build();

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), ascendant));

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(new java.util.Date())), invitationA);

        assertFalse(meeting.sameAs(ascendant));
    }

    @Test
    public void verifyIfIsTheMeetingDateTrue() {
        Person immortal = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Skye").build();

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), immortal));

        java.util.Date date = new java.util.Date(1000,10,9,10,10,10);

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(date)), invitationA);
        boolean b = meeting.verifyIfIsTheMeetingDate(date, 10);
        assertTrue(b);
    }

    @Test
    public void verifyIfIsTheMeetingDateFalse() {
        Person diamond = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Viper").build();

        List<Invitation> invitationA = new ArrayList<>();
        invitationA.add(new Invitation(new InvitationIdentifier(1), new ResponseStatus(false), diamond));

        java.util.Date date = new java.util.Date(1000,10,9,10,10,10);

        Meeting meeting = new Meeting(new MeetingIdentifier(777),
                new ScheduledDate(new Duration(10), new Date(date)), invitationA);
        boolean b = meeting.verifyIfIsTheMeetingDate(new java.util.Date(1001,10,9,10,10,10), 10);
        assertFalse(b);
    }

}