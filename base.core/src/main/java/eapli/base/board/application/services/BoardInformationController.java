package eapli.base.board.application.services;

import eapli.base.board.dto.CellDTOWithColumnRowContent;

import java.util.List;

public class BoardInformationController {

    public List<CellDTOWithColumnRowContent> getBoardInformation(String boardId){
        return new BoardInformationService().getBoardCellsInformation(boardId);
    }
}
