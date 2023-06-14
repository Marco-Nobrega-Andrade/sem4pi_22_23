package eapli.base.postitmanager.application;

import eapli.base.board.application.services.AddNotificationService;
import eapli.base.board.domain.Board;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.boardhistory.domain.OperationValue;
import eapli.base.boardhistory.domain.TaskBuilder;
import eapli.base.boardhistory.repositories.BoardHistoryRepository;
import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.boardparticipantmanagement.repositories.BoardParticipantRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.postitmanager.domain.PostIt;
import eapli.base.postitmanager.repositories.PostItRepository;
import eapli.base.usermanagement.domain.BoardOwner;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class UndoLastChangePostItService {
    PostItRepository postItRepository = PersistenceContext.repositories().postItRepository();
    BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();
    BoardHistoryRepository boardHistoryRepository = PersistenceContext.repositories().boardHistoryRepository();
    PersonRepository personRepository = PersistenceContext.repositories().personRepository();
    BoardParticipantRepository boardParticipantRepository = PersistenceContext.repositories().boardParticipantRepository();
    public void undoLastChangePostIt(String boardTittle, int column, int row) {

        AuthorizationService authz = AuthzRegistry.authorizationService();
        SystemUser systemUser;
        if (authz.session().isPresent()) {
            systemUser = authz.session().get().authenticatedUser();
        }
        else {
            throw new IllegalStateException("Session must exist to create a board");
        }
        Person person = personRepository.findPersonBySystemUser(systemUser);
        Board board = boardRepository.findBoardByTitle(boardTittle);
        PostIt postIt = postItRepository.getPostItInACell(board, column, row);
        int version = postIt.returnPostItVersion();
        long id = postIt.returnPostItIdentifier();
        version--;
        PostIt lastVersionOfPostIt = postItRepository.getLastVersionOfPostIt(version, id);
        lastVersionOfPostIt.updateVersion();
        lastVersionOfPostIt.updateVersion();
        board.updateCell(lastVersionOfPostIt,column,row);

        TaskBuilder taskBuilder = new TaskBuilder();
        if (person.isBoardOwner(board)) {
            BoardOwner boardOwner = personRepository.findBoardOwnerByPerson(person);
            board.addTaskToHistory(taskBuilder.withBoardOwner(boardOwner).withPostIt(postIt).
                    withTaskId(boardHistoryRepository.getLastTaskId()+1).withOperation(OperationValue.UNDO_CHANGE).build());

            new AddNotificationService().addNotification("The last change was removed in "+board.returnBoardTitleString()
                    +" on column "+column+" and row "+row+ "by "+person.returnFullNameString(),board.returnBoardTitleString());
            postItRepository.save(lastVersionOfPostIt);
            boardRepository.save(board);
        }
        else if (person.isBoardParticipant(board)) {
            BoardParticipant boardParticipant =boardParticipantRepository.findBoardParticipantByPerson(person);
            board.addTaskToHistory(taskBuilder.withBoardParticipant(boardParticipant).withPostIt(postIt).
                    withTaskId(boardHistoryRepository.getLastTaskId()+1).withOperation(OperationValue.UNDO_CHANGE).build());
            new AddNotificationService().addNotification("The last change was removed in "+board.returnBoardTitleString()
                    +" on column "+column+" and row "+row+ "by "+person.returnFullNameString(),board.returnBoardTitleString());
            postItRepository.save(lastVersionOfPostIt);
            boardRepository.save(board);
        }
    }
}
