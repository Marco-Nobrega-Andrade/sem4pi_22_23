package eapli.base.postitmanager.application;

import eapli.base.board.domain.Board;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.boardhistory.domain.BoardHistory;
import eapli.base.boardhistory.domain.BoardHistoryBuilder;
import eapli.base.boardhistory.domain.OperationValue;
import eapli.base.boardhistory.repositories.BoardHistoryRepository;
import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.boardparticipantmanagement.repositories.BoardParticipantRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.postitmanager.domain.PostIt;
import eapli.base.postitmanager.domain.PostItFactory;
import eapli.base.postitmanager.repositories.PostItRepository;
import eapli.base.usermanagement.domain.BoardOwner;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.BoardOwnerRepository;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class CreatePostItService {
    PostItRepository postItRepository = PersistenceContext.repositories().postItRepository();
    BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();
    BoardHistoryRepository boardHistoryRepository = PersistenceContext.repositories().boardHistoryRepository();
    PersonRepository personRepository = PersistenceContext.repositories().personRepository();
    BoardOwnerRepository boardOwnerRepository = PersistenceContext.repositories().boardOwnerRepository();
    BoardParticipantRepository boardParticipantRepository = PersistenceContext.repositories().boardParticipantRepository();


    public boolean createPostIt(String boardTittle, String content, int column, int row) {

        //create postIt and save it
        PostItFactory postItFactory = new PostItFactory();
        PostIt postIt = postItFactory.build(content,postItRepository.count()+1);
        postItRepository.save(postIt);
        //get the board and add the postIt to it
        Board board = boardRepository.findBoardByTitle(boardTittle);
        board.addPostIt(postIt, column, row);
        boardRepository.save(board);

        //get person with session
        AuthorizationService authz = AuthzRegistry.authorizationService();
        SystemUser systemUser;
        if (authz.session().isPresent()) {
            systemUser = authz.session().get().authenticatedUser();
        }
        else {
            throw new IllegalStateException("Session must exist to create a board");
        }
        Person person = personRepository.findPersonBySystemUser(systemUser);

        //create task and save it
        BoardHistoryBuilder boardHistoryBuilder = new BoardHistoryBuilder();
        if (person.isBoardOwner(board)) {
            BoardOwner boardOwner = personRepository.findBoardOwnerByPerson(person);
            BoardHistory boardHistory = boardHistoryBuilder.withBoardHistoryId(boardHistoryRepository.count()+1)
                    .withTask(boardHistoryRepository.getLastTaskId()+1, OperationValue.CREATE, boardOwner)
                    .build();
            boardHistoryRepository.save(boardHistory);
        }
        else if (person.isBoardParticipant(board)) {
            BoardParticipant boardParticipant =boardParticipantRepository.findBoardParticipantByBoard(board);
            BoardHistory boardHistory = boardHistoryBuilder.withBoardHistoryId(boardHistoryRepository.count()+1)
                    .withTask(boardHistoryRepository.getLastTaskId()+1, OperationValue.CREATE, boardParticipant)
                    .build();
            boardHistoryRepository.save(boardHistory);
        }

        return true;
    }
}
