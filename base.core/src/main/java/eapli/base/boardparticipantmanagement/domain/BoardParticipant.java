package eapli.base.boardparticipantmanagement.domain;

import eapli.base.board.domain.Board;
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

    protected BoardParticipant(BoardParticipantId boardParticipantId, Permission permission, Board board){
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
}
