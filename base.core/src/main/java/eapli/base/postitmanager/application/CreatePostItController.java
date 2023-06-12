package eapli.base.postitmanager.application;

import eapli.base.exceptions.CellOccupiedException;
import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ZeroParameterException;

public class CreatePostItController {

    private final CreatePostItService service = new CreatePostItService();
    public boolean createPostIt(String boardTittle, String content, int column, int row) throws CellOccupiedException, ZeroParameterException, NegativeParameterException {
        return service.createPostIt(boardTittle, content, column, row);
    }
}
