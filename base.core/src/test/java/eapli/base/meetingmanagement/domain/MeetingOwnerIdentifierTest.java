package eapli.base.meetingmanagement.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MeetingOwnerIdentifierTest {
    @Test(expected = IllegalArgumentException.class)
    public void ensureIdCannotBeZero() {
        new MeetingOwnerIdentifier(0L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureIdCannotBeLessThanZero() {
        new MeetingOwnerIdentifier(-1L);
    }

    @Test
    public void ensureClassIDEquals() {
        MeetingOwnerIdentifier test1 = new MeetingOwnerIdentifier(1L);
        MeetingOwnerIdentifier test2 = new MeetingOwnerIdentifier(2L);
        assertTrue(test1.equals(test1));
        assertFalse(test1.equals(test2));
    }
}