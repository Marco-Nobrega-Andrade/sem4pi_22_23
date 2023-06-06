package eapli.base.boardparticipantmanagement.domain;

import eapli.base.board.domain.Board;
import eapli.base.boardparticipantmanagement.domain.BoardParticipant;
import eapli.base.boardparticipantmanagement.domain.BoardParticipantId;
import eapli.base.boardparticipantmanagement.domain.Permission;

public class BoardParticipantFactory {

    public BoardParticipant buildBoardParticipant(Long boardParticipantId, boolean hasWritePermission, Board board){
        BoardParticipantId id = new BoardParticipantId(boardParticipantId);
        Permission permission = new Permission(hasWritePermission);
        return new BoardParticipant(id, permission, board);
    }
}
