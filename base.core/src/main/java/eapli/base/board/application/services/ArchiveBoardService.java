package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.Notification;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.boardhistory.domain.OperationValue;
import eapli.base.boardhistory.domain.Task;
import eapli.base.boardhistory.domain.TaskBuilder;
import eapli.base.boardhistory.repositories.BoardHistoryRepository;
import eapli.base.exceptions.AlreadyDeactivatedException;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.usermanagement.repositories.BoardOwnerRepository;

public class ArchiveBoardService {
    public boolean archiveBoard(String boardTitle) throws AlreadyDeactivatedException {
        RepositoryFactory factory = PersistenceContext.repositories();
        BoardRepository boardRepository = factory.boardRepository();
        BoardHistoryRepository boardHistoryRepository = factory.boardHistoryRepository();
        BoardOwnerRepository boardOwnerRepository = factory.boardOwnerRepository();
        Board board = boardRepository.findBoardByTitle(boardTitle);
        board.archiveBoard();
        board.addNotification(new Notification("The board " + boardTitle +" was archived."));
        Task task = new TaskBuilder().withTaskId(boardHistoryRepository
                        .getLastTaskId()+1).withOperation(OperationValue.ARCHIVE)
                .withBoardOwner(boardOwnerRepository.findBoardOwnerByBoard(board)).build();
        board.addTaskToHistory(task);
        boardRepository.save(board);
        return true;
    }
}
