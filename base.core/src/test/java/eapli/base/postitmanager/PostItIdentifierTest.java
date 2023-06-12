package eapli.base.postitmanager;

import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ZeroParameterException;
import eapli.base.postitmanager.domain.PostItFactory;
import org.junit.Test;

public class PostItIdentifierTest {
    @Test(expected = ZeroParameterException.class)
    public void ensurePostItIdentifierCannotBeZero() throws ZeroParameterException, NegativeParameterException {
        PostItFactory factory = new PostItFactory();
        factory.build("hola", 0);
    }
    @Test(expected = NegativeParameterException.class)
    public void ensurePostItIdentifierCannotBeLowerThanZero() throws ZeroParameterException, NegativeParameterException {
        PostItFactory factory = new PostItFactory();
        factory.build("hola", -1);
    }
}
