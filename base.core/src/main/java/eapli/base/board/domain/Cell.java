package eapli.base.board.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cell implements Comparable<Cell>{
    @EmbeddedId
    private CellId cellId;
    private Row row;
    private Column column;

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

    @Override
    public int compareTo(Cell o) {
        return this.cellId.compareTo(o.cellId);
    }
}
