package eapli.base.postitmanager.application;

import eapli.base.exceptions.CellOccupiedException;

public class UndoLastChangePostItController {

    private final UndoLastChangePostItService service = new UndoLastChangePostItService();
    public void undoLastChangePostIt(String boardTittle, int column, int row) throws CellOccupiedException {
        service.undoLastChangePostIt(boardTittle, column, row);
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
