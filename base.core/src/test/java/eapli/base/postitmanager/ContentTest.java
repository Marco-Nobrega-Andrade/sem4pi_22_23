package eapli.base.postitmanager;

import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ZeroParameterException;
import eapli.base.postitmanager.domain.PostItFactory;
import org.junit.Test;

public class ContentTest {
    @Test(expected = IllegalArgumentException.class)
    public void ensureContentCannotBeNull() throws ZeroParameterException, NegativeParameterException {
        PostItFactory factory = new PostItFactory();
        factory.build(null, 1);
    }
}
