package eapli.base.board.domain;

import eapli.base.postitmanager.domain.PostIt;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cell implements Comparable<Cell>{
    @EmbeddedId
    private CellId cellId;
    private Row row;
    private Column column;

    @OneToOne
    private PostIt postIt;

    protected Cell(CellId cellId, Row row, Column column){
        if(cellId == null || row == null || column == null){
            throw new IllegalArgumentException("The cell cannot be created with null Value Objects");
        }
        this.cellId = cellId;
        this.row = row;
        this.column = column;
    }

    protected Cell(){
        // Only for ORM
    }

    public String returnRowTitleString() {
        return row.returnRowTitleString();
    }

    public String returnRowIdentifierString() {
        return row.returnRowIdentifierString();
    }

    public String returnColumnTitleString() {
        return column.returnColumnTitleString();
    }

    public String returnColumnIdentifierString() {
        return column.returnColumnIdentifierString();
    }

    public String returnPostItContentString(){
        return postIt.returnContentString();
    }

    @Override
    public int compareTo(Cell o) {
        return this.cellId.compareTo(o.cellId);
    }
}
