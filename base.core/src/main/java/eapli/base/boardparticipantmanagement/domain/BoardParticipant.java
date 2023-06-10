package eapli.base.boardparticipantmanagement.domain;

import eapli.base.board.domain.Board;
import eapli.base.exceptions.ParameterNullBlankException;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class BoardParticipant implements AggregateRoot<BoardParticipantId> {
    @EmbeddedId
    private BoardParticipantId boardParticipantId;
    private Permission permission;
    @OneToOne
    private Board board;

    protected BoardParticipant(BoardParticipantId boardParticipantId, Permission permission, Board board) throws ParameterNullBlankException {
        verifyNullBlankParameters(boardParticipantId, permission, board);
        this.boardParticipantId = boardParticipantId;
        this.permission = permission;
        this.board = board;
    }

    protected BoardParticipant() {
        //only for ORM
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof BoardParticipant)) {
            return false;
        }
        final BoardParticipant that = (BoardParticipant) other;

        return boardParticipantId.equals(that.boardParticipantId) && board.equals(that.board);
    }
    public String returnBoardTitleString(){
        return board.returnBoardTitleString();
    }
    @Override
    public BoardParticipantId identity() {
        return null;
    }

    public boolean verifyNullBlankParameters(BoardParticipantId boardParticipantId, Permission permission, Board board) throws ParameterNullBlankException {
        if(boardParticipantId == null){
            throw new ParameterNullBlankException("BoardParticipantId cannot be null");
        }
        if(permission == null){
            throw new ParameterNullBlankException("The permission needs to be assigned.");
        }
        if(board == null){
            throw new ParameterNullBlankException("A board needs to be chosen.");
        }
        return true;
    }

    public boolean hasWritePermission() {
        return permission.hasWritePermission();
    }

    public boolean isBoardParticipant(Board board) {
        return this.board.equals(board);
    }
}
