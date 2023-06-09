package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.Cell;
import eapli.base.board.dto.CellDTOWithColumnRowContent;
import eapli.base.board.dto.CellDTOWithColumnRowContentMapper;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

public class BoardInformationService {

    public List<CellDTOWithColumnRowContent> getBoardCellsInformation(String title){

        BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();
        Board board = boardRepository.findBoardByTitle(title);
        List<Cell> cellsList = boardRepository.getAllCellsFromABoard(board);
        List<CellDTOWithColumnRowContent> listCellDTO = new ArrayList<>();
        for (Cell cell: cellsList) {
            listCellDTO.add(CellDTOWithColumnRowContentMapper.toDTO(cell));
        }
        return listCellDTO;
    }
}
