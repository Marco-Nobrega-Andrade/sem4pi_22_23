package eapli.base.postitmanager.domain;

public class PostItFactory {

    /**
     * @param id long with the id to set in the PostIt
     * @param content String with the content to set in the PostIt
     * @return the PostIt with the id and content set
     */
    public PostIt build(String content, long id) {
        return new PostIt(new PostItIdentifier(id), new Content(content));
    }
}
