package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.Cell;
import eapli.base.board.dto.CellDTOWithColumnRowContent;
import eapli.base.board.dto.CellDTOWithColumnRowContentMapper;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.Person;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

public class BoardInformationService {

    public List<CellDTOWithColumnRowContent> getBoardCellsInformation(String title){

        BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();
        Board board = boardRepository.findBoardByTitle(title);
        List<Cell> cellsList = boardRepository.getAllCellsFromABoard(board);
        List<CellDTOWithColumnRowContent> listCellDTO = new ArrayList<>();

        for (Cell cell: cellsList) {
            try{
            Person person = boardRepository.getCreatorOfAPostItBoardOwner(cell);
            listCellDTO.add(CellDTOWithColumnRowContentMapper.toDTO(cell,person));
            }catch (NoResultException owner){
                try {
                    Person person = boardRepository.getCreatorOfAPostItBoardParticipant(cell);
                    listCellDTO.add(CellDTOWithColumnRowContentMapper.toDTO(cell, person));
                }catch (NoResultException participant){
                    listCellDTO.add(CellDTOWithColumnRowContentMapper.toDTO(cell, null));
                }
            }
        }
        return listCellDTO;
    }
}
