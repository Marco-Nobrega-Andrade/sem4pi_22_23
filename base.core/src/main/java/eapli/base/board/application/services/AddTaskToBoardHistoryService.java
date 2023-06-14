package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.boardhistory.domain.OperationValue;
import eapli.base.boardhistory.domain.Task;
import eapli.base.boardhistory.domain.TaskBuilder;
import eapli.base.boardhistory.repositories.BoardHistoryRepository;
import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.usermanagement.domain.BoardOwner;
import eapli.base.usermanagement.repositories.BoardOwnerRepository;

public class AddTaskToBoardHistoryService {
    RepositoryFactory repositoryFactory = PersistenceContext.repositories();
    BoardRepository boardRepository = repositoryFactory.boardRepository();
    BoardHistoryRepository boardHistoryRepository = repositoryFactory.boardHistoryRepository();
    BoardOwnerRepository boardOwnerRepository = repositoryFactory.boardOwnerRepository();

    public boolean addShareBoardTaskToHistory(String boardTitle, BoardParticipant boardParticipant){
        Board board = boardRepository.findBoardByTitle(boardTitle);
        Task task = new TaskBuilder().withTaskId(boardHistoryRepository
                        .getLastTaskId()+1).withOperation(OperationValue.ADD)
                .withBoardOwner(boardOwnerRepository.findBoardOwnerByBoard(board))
                .withBoardParticipant(boardParticipant).build();
        board.addTaskToHistory(task);
        boardRepository.save(board);
        return true;
    }

    public boolean addArchiveBoardTaskToHistory(String boardTitle){
        Board board = boardRepository.findBoardByTitle(boardTitle);
        Task task = new TaskBuilder().withTaskId(boardHistoryRepository
                        .getLastTaskId()+1).withOperation(OperationValue.ARCHIVE)
                .withBoardOwner(boardOwnerRepository.findBoardOwnerByBoard(board)).build();
        board.addTaskToHistory(task);
        boardRepository.save(board);
        return true;
    }
}
