package eapli.base.board.domain;

import eapli.base.exceptions.AlreadyDeactivatedException;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;
@Entity
public class Board implements AggregateRoot<BoardTitle> {
    @EmbeddedId
    private BoardTitle boardTitle;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cell> cellList;

    private BoardStatus boardStatus;

    protected Board(BoardTitle boardTiTle, List<Cell> cellList){
        if (boardTiTle == null || cellList.isEmpty()) {
            throw new IllegalArgumentException("The board cannot be created with null Value Objects");
        }
        this.boardTitle = boardTiTle;
        this.cellList = cellList;
        this.boardStatus = new BoardStatus(true);
    }

    protected Board(){
        //ORM use only
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(boardTitle, board.boardTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardTitle);
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Board)) {
            return false;
        }

        final Board that = (Board) other;

        return this.boardTitle.equals(that.boardTitle);
    }

    @Override
    public BoardTitle identity() {
        return boardTitle;
    }

    public String returnBoardTitleString(){
        return boardTitle.toString();
    }

    public boolean archiveBoard() throws AlreadyDeactivatedException {
        BoardStatus newBoardStatus = new BoardStatus(false);
        if(newBoardStatus.equals(this.boardStatus)){
            throw new AlreadyDeactivatedException("ERROR: The board is already archived!");
        }
        this.boardStatus = newBoardStatus;
        return true;
    }

}
