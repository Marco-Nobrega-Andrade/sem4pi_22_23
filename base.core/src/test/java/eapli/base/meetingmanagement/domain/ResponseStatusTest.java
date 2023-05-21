package eapli.base.meetingmanagement.domain;

import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.domain.Duration;
import eapli.base.courseclasses.domain.ScheduledDate;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ResponseStatusTest {

    @Test
    public void ensureResponseStatusEquals() {

        ResponseStatus test1 = new ResponseStatus(true);
        ResponseStatus test2 = new ResponseStatus(false);

        assertTrue(test1.equals(test1));
        assertFalse(test1.equals(test2));
    }
    @Test
    public void ensureReturnStatus() {

        ResponseStatus test1 = new ResponseStatus(true);
        ResponseStatus test2 = new ResponseStatus(false);

        assertTrue(test1.returnResponseStatus());
        assertFalse(test2.returnResponseStatus());
    }

}