package eapli.base.usermanagement.domain;


import eapli.base.usermanagement.domain.builder.PersonBuilder;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;



import static org.junit.Assert.*;

public class PersonTest {

    public static SystemUser dummyUser(final String username, final Role... roles) {
        SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.MANAGER);
    }
    @Test
    public void ensurePersonEqualsPassesForTheSameID() {

        Person aPerson = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Joao Miguel").build();

        Person anotherPerson = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Joao Miguel").build();

        boolean expected = aPerson.equals(anotherPerson);

        assertTrue(expected);
    }

    @Test
    public void ensurePersonEqualsFailsForDifferenteID()  {

        Person aPerson = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Joao Miguel").build();

        Person anotherPerson = new PersonBuilder().withID(2)
                .withSystemUser(getNewDummyUser()).withfullName("Joao Miguel").build();

        boolean expected = aPerson.equals(anotherPerson);


        assertFalse(expected);
    }

    @Test
    public void ensurePersonEqualsAreTheSameForTheSameInstance() {
        Person aPerson = new Person();

        boolean expected = aPerson.equals(aPerson);

        assertTrue(expected);
    }

    @Test
    public void ensurePersonEqualsFailsForDifferenteObjectTypes(){
        Person aPerson = new Person();

        boolean expected = aPerson.equals(getNewDummyUser());

        assertFalse(expected);
    }

    @Test
    public void ensurePersonIsTheSameAsItsInstance() {
        Person aPerson = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Joao Miguel").build();

        boolean expected = aPerson.sameAs(aPerson);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoPersonWithDifferentIDAreNotTheSame()  {

        Person aPerson = new PersonBuilder().withID(1)
                .withSystemUser(getNewDummyUser()).withfullName("Joao Miguel").build();

        Person anotherPerson = new PersonBuilder().withID(2)
                .withSystemUser(getNewDummyUser()).withfullName("Joao Miguel").build();

        boolean expected = aPerson.sameAs(anotherPerson);

        assertFalse(expected);
    }

}