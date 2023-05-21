package eapli.base.meetingmanagement.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InvitationIdentifierTest {

    @Test(expected = IllegalArgumentException.class)
    public void ensureIdCannotBeZero() {
        new InvitationIdentifier(0L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureIdCannotBeLessThanZero() {
        new InvitationIdentifier(-1L);
    }

    @Test
    public void ensureIdAreEquals() {
        InvitationIdentifier test1 = new InvitationIdentifier(1L);
        InvitationIdentifier test2 = new InvitationIdentifier(2L);
        assertTrue(test1.equals(test1));
        assertFalse(test1.equals(test2));
    }

}