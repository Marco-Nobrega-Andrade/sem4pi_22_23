package eapli.base.postitmanager;

import eapli.base.postitmanager.domain.PostItFactory;
import org.junit.Test;

public class PostItIdentifierTest {
    @Test(expected = IllegalArgumentException.class)
    public void ensurePostItIdentifierCannotBeZero() {
        PostItFactory factory = new PostItFactory();
        factory.build("hola", 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void ensurePostItIdentifierCannotBeLowerThanZero() {
        PostItFactory factory = new PostItFactory();
        factory.build("hola", -1);
    }
}
