package eapli.base.board.application.services;

import eapli.base.board.domain.Board;
import eapli.base.board.dto.BoardDTOWithTitle;
import eapli.base.board.dto.BoardDTOWithTitleMapper;
import eapli.base.board.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.ArrayList;
import java.util.List;

public class ListBoardsService {
    BoardRepository boardRepository = PersistenceContext.repositories().boardRepository();
    public List<BoardDTOWithTitle> listBoardsIOwn(){
        SystemUser user = AuthzRegistry.authorizationService().session().get().authenticatedUser();
        List<Board> boardList = boardRepository.findAllBoardsIOwn(user);
        List<BoardDTOWithTitle> boardDTOList = new ArrayList<>();
        for(Board board : boardList){
            boardDTOList.add(BoardDTOWithTitleMapper.doDTO(board));
        }
        return boardDTOList;
    }
}
