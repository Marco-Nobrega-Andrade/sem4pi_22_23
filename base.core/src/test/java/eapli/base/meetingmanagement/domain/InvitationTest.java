package eapli.base.meetingmanagement.domain;

import eapli.base.invitationmanagement.domain.Invitation;
import eapli.base.invitationmanagement.domain.InvitationIdentifier;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.builder.PersonBuilder;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvitationTest {

    public static SystemUser dummyUser(final String username, final Role... roles) {
        SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.MANAGER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyInvitationWithNullValues() {
        new Invitation(null, null, null);
    }

    @Test
    public void verifySameAs_WithEqualId() {

        Person botDiff = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Caitlyn").build();

        Person kingOfAces = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Aurelion").build();

        Invitation invitationA = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), botDiff);
        Invitation invitationB = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), kingOfAces);

        assertFalse(invitationA.sameAs(invitationB)); //cause the invitation is the same but the person is different
    }

    @Test
    public void verifySameAs_WithEqualIdAndEqualPerson() {

        Person midDiff = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Sylas").build();

        Invitation invitationA = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), midDiff);
        Invitation invitationB = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.ACCEPTED), midDiff);

        assertFalse(invitationA.sameAs(invitationB)); //cause the invitation and the person is the same but the response is different
    }

    @Test
    public void verifySameAs_WithEqualIdEqualPersonAndEqualResponse() {


        Person mestreDaCulinaria = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Blitzcrank").build();


        Invitation invitationA = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), mestreDaCulinaria);
        Invitation invitationB = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), mestreDaCulinaria);

        assertTrue(invitationA.sameAs(invitationB));
    }

    @Test
    public void verifySameAs_WithEqualInstances() {

        Person pentaKiller = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Broly").build();

        Invitation invitationA = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), pentaKiller);

        assertTrue(invitationA.sameAs(invitationA));
    }

    @Test
    public void verifySameAs_WithDifferentObjectTypes() {

        Person man = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("man").build();



        Invitation invitationA = new Invitation(new InvitationIdentifier(1), new ResponseStatus(ResponseStatusValue.REJECTED), man);

        assertFalse(invitationA.sameAs(man));
    }

}