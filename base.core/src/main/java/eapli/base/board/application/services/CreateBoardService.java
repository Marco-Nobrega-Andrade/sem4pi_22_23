package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardBuilder;
import eapli.base.board.domain.BoardTitle;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class CreateBoardService {

    private final BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();

    public boolean createBoard(String boardTitle, int rowNumber, int columnNumber){
        BoardBuilder boardBuilder = new BoardBuilder();
        if(boardRepository.ofIdentity(new BoardTitle(boardTitle)).isPresent()){
            throw new IllegalArgumentException("There is already a board with the inserted title.");
        }

        long index = boardRepository.getLastCellId();
        Board board = boardBuilder.withBoardTitle(boardTitle)
                .withCellList(index, rowNumber, columnNumber)
                .build();

        boardRepository.save(board);
        return true;
    }
}
