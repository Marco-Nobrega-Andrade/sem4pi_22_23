package eapli.base.board.domain;

import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
public class BoardOwner implements AggregateRoot<BoardOwnerId> {

    @EmbeddedId
    private BoardOwnerId boardOwnerId;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Board> boardList;

    public BoardOwner(BoardOwnerId boardOwnerId, Person person){
        if(boardOwnerId == null || person == null){
            throw new IllegalArgumentException("Board Owner cannot be created with null Value Objects");
        }
        this.boardOwnerId = boardOwnerId;
        this.person = person;
    }

    protected BoardOwner(){
        //ORM use only
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof BoardOwner)) {
            return false;
        }

        final BoardOwner that = (BoardOwner) other;

        return this.boardOwnerId.equals(that.boardOwnerId);
    }

    @Override
    public BoardOwnerId identity() {
        return boardOwnerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardOwner that = (BoardOwner) o;
        return Objects.equals(boardOwnerId, that.boardOwnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardOwnerId);
    }

    public boolean addBoard(Board board){
        if(boardList.contains(board)) return false;
        boardList.add(board);
        return true;
    }
}