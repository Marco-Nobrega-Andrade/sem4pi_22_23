package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.exceptions.AlreadyDeactivatedException;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class ArchiveBoardService {
    public boolean archiveBoard(String boardTitle) throws AlreadyDeactivatedException {
        BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();
        Board board = boardRepository.findBoardByTitle(boardTitle);
        board.archiveBoard();
        boardRepository.save(board);
        return true;
    }
}
