package eapli.base.postitmanager;

import eapli.base.postitmanager.domain.PostItFactory;
import org.junit.Test;

public class ContentTest {
    @Test(expected = IllegalArgumentException.class)
    public void ensureContentCannotBeNull() {
        PostItFactory factory = new PostItFactory();
        factory.build(null, 1);
    }
}
