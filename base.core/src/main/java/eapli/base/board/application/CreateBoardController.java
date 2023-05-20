package eapli.base.board.application;

import eapli.base.board.application.services.CreateBoardService;

public class CreateBoardController {

    private final CreateBoardService createBoardService = new CreateBoardService();

    public boolean createBoard(String boardTitle, int rowNumber, int columnNumber){
        return createBoardService.createBoard(boardTitle, rowNumber, columnNumber);
    }
}
