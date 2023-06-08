package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.domain.BoardTitle;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.boardparticipantmanagement.domain.BoardParticipantFactory;
import eapli.base.boardparticipantmanagement.repositories.BoardParticipantRepository;
import eapli.base.exceptions.DuplicateCreationException;
import eapli.base.exceptions.ParameterNullBlankException;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;

import javax.persistence.NoResultException;

public class ShareBoardService {
    public boolean shareBoard(String boardTitle, String email, boolean permission) throws ParameterNullBlankException, DuplicateCreationException {
        RepositoryFactory repositoryFactory = PersistenceContext.repositories();
        BoardParticipantRepository boardParticipantRepository = repositoryFactory.boardParticipantRepository();
        BoardRepository boardRepository = repositoryFactory.boardRepository();
        PersonRepository personRepository = repositoryFactory.personRepository();

        Board board = boardRepository.ofIdentity(new BoardTitle(boardTitle)).get();
        BoardParticipantFactory factory = new BoardParticipantFactory();
        BoardParticipant boardParticipant = factory.buildBoardParticipant(boardParticipantRepository.findMaxId() + 1, permission, board);
        Person person = personRepository.findPersonByEmail(email);
        person.addBoardParticipant(boardParticipant);

        boardParticipantRepository.save(boardParticipant);
        personRepository.save(person);
        return true;
    }
}
