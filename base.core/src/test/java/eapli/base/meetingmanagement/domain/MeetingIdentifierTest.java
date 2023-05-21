package eapli.base.meetingmanagement.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MeetingIdentifierTest {
    @Test(expected = IllegalArgumentException.class)
    public void ensureIdCannotBeZero() {
        new MeetingIdentifier(0L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureIdCannotBeLessThanZero() {
        new MeetingIdentifier(-1L);
    }

    @Test
    public void ensureIdAreEquals() {
        MeetingIdentifier test1 = new MeetingIdentifier(1L);
        MeetingIdentifier test2 = new MeetingIdentifier(2L);
        assertTrue(test1.equals(test1));
        assertFalse(test1.equals(test2));
    }
}