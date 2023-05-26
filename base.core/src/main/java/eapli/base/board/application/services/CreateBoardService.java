package eapli.base.board.application.services;

import eapli.base.board.domain.*;
import eapli.base.usermanagement.domain.BoardOwner;
import eapli.base.usermanagement.domain.BoardOwnerBuilder;
import eapli.base.usermanagement.domain.BoardOwnerId;
import eapli.base.usermanagement.repositories.BoardOwnerRepository;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.ArrayList;
import java.util.List;

public class CreateBoardService {

    private final BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();
    private final PersonRepository personRepository = PersistenceContext.repositories().personRepository();
    private final BoardOwnerRepository boardOwnerRepository = PersistenceContext.repositories().boardOwnerRepository();
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

        AuthorizationService authz = AuthzRegistry.authorizationService();
        SystemUser systemUser = authz.session().get().authenticatedUser();
        Person person = personRepository.findPersonBySystemUser(systemUser);
        BoardOwnerBuilder boardOwnerBuilder = new BoardOwnerBuilder();

        if(person.isBoardOwner()){
            BoardOwner boardOwner = boardOwnerRepository.findBoardOwnerByPerson();
            boardOwner.addBoard(board);
            boardOwnerRepository.save(boardOwner);
        }else {
            long totalOfBoardOwnerIds = boardOwnerRepository.count();
            BoardOwner boardOwner = boardOwnerBuilder.withBoardOwnerId(new BoardOwnerId(totalOfBoardOwnerIds+1))
                    .withBoard(board)
                    .build();
            person.addBoardOwner(boardOwner);
            personRepository.save(person);
        }

        return true;
    }
}
