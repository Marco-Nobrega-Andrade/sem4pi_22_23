package eapli.base.board.domain;

import eapli.base.boardhistory.domain.BoardHistory;
import eapli.base.boardhistory.domain.Task;
import eapli.base.exceptions.AlreadyDeactivatedException;
import eapli.base.exceptions.CellOccupiedException;
import eapli.base.postitmanager.domain.PostIt;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
public class Board implements AggregateRoot<BoardTitle> {
    @EmbeddedId
    private BoardTitle boardTitle;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cell> cellList;

    private BoardStatus boardStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private BoardHistory boardHistory;

    @ElementCollection
    private List<eapli.base.board.domain.Notification> notificationList;

    protected Board(BoardTitle boardTiTle, List<Cell> cellList){
        if (boardTiTle == null || cellList.isEmpty()) {
            throw new IllegalArgumentException("The board cannot be created with null Value Objects");
        }
        this.boardTitle = boardTiTle;
        this.cellList = cellList;
        this.boardStatus = new BoardStatus(true);
        this.notificationList = new ArrayList<>();
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

    public void addPostIt(PostIt postIt, int column, int row) throws CellOccupiedException {
        for (Cell cell : cellList) {
            if (cell.isColumn(column)  && cell.isRow(row)) {
                if (!cell.hasPostIt()) {
                    cell.addPostIt(postIt);
                }
                else {
                    throw new CellOccupiedException();
                }
            }
        }
    }

    /**
     * Returns the maximum column number of the board
     * @return int number of the maximum column
     */
    public int maxColumn() {
        int maxColumn = 0;
        for (Cell cell : cellList) {
            if (Integer.parseInt(cell.returnColumnIdentifierString()) > maxColumn) {
                maxColumn = Integer.parseInt(cell.returnColumnIdentifierString());
            }
        }
        return maxColumn;
    }

    /**
     * Returns the maximum row number of the board
     * @return int number of the maximum row
     */
    public int maxRow() {
        int maxRow = 0;
        for (Cell cell : cellList) {
            if (Integer.parseInt(cell.returnRowIdentifierString()) > maxRow) {
                maxRow = Integer.parseInt(cell.returnRowIdentifierString());
            }
        }
        return maxRow;
    }

    public void addBoardHistory(BoardHistory boardHistory){
        this.boardHistory = boardHistory;
    }

    public void addNotification(eapli.base.board.domain.Notification notification){
        this.notificationList.add(notification);
    }

    public void addTaskToHistory(Task task){
        this.boardHistory.addTask(task);
    }

    public void updatePostIt(PostIt postIt, int column, int row) {
        for (Cell cell : cellList) {
            if (cell.isColumn(column)  && cell.isRow(row)) {
                cell.addPostIt(postIt);
            }
        }
    }
}
