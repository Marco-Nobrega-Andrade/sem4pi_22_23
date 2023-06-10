package eapli.base.postitmanager.application;

public class CreatePostItController {

    private final CreatePostItService service = new CreatePostItService();
    public boolean createPostIt(String boardTittle, String content, int column, int row) {
        return service.createPostIt(boardTittle, content, column, row);
    }
}
