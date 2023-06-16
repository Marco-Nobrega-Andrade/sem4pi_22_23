package eapli.base.board.application.services;

import eapli.base.board.dto.CellDTOWithColumnRowPostItCreator;

import java.util.List;

public class BoardInformationController {

    public List<CellDTOWithColumnRowPostItCreator> getBoardInformation(String boardId){
        return new BoardInformationService().getBoardCellsInformation(boardId);
    }
}
