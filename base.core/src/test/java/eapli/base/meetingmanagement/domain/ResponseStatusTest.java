package eapli.base.meetingmanagement.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResponseStatusTest {

    @Test
    public void ensureResponseStatusAreEquals() {
        ResponseStatus test1 = new ResponseStatus(ResponseStatusValue.ACCEPTED);
        assertEquals(test1, test1);
    }
    @Test
    public void ensureResponseStatusAreDifferent() {
        ResponseStatus test1 = new ResponseStatus(ResponseStatusValue.ACCEPTED);
        ResponseStatus test2 = new ResponseStatus(ResponseStatusValue.REJECTED);
        assertNotEquals(test1, test2);
    }
    @Test
    public void ensureReturnStatus() {

        ResponseStatus test1 = new ResponseStatus(ResponseStatusValue.ACCEPTED);
        assertEquals("Accepted", test1.returnResponseStatus());
    }

}