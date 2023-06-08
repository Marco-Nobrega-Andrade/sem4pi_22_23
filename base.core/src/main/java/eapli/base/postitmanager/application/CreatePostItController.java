package eapli.base.postitmanager.application;

public class CreatePostItController {

    private final CreatePostItService service = new CreatePostItService();
    public boolean createPostIt(String content, byte[] image, int column, int line) {
        service.createPostIt( content, image, column, line);
        return false;
    }
}
