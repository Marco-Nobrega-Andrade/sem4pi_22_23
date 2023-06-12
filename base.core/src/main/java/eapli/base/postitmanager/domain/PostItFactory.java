package eapli.base.postitmanager.domain;

import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ZeroParameterException;

public class PostItFactory {

    /**
     * @param id long with the id to set in the PostIt
     * @param content String with the content to set in the PostIt
     * @return the PostIt with the id and content set
     */
    public PostIt build(String content, long id) throws ZeroParameterException, NegativeParameterException {
        return new PostIt( new PostItKey (new PostItIdentifier(id),new PostItVersion(1))
                ,new Content(content));
    }
}
