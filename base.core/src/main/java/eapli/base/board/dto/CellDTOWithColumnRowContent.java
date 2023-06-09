package eapli.base.board.dto;

public class CellDTOWithColumnRowContent {

    public String rowIdentifier;
    public String rowTitle;
    public String columnIdentifier;
    public String columnTitle;
    public String content;

    public CellDTOWithColumnRowContent(String rowIdentifier, String rowTitle, String columnIdentifier, String columnTitle, String content) {
        this.rowIdentifier = rowIdentifier;
        this.rowTitle = rowTitle;
        this.columnIdentifier = columnIdentifier;
        this.columnTitle = columnTitle;
        this.content = content;
    }

    @Override
    public String toString() {
        return rowIdentifier + ',' +
                rowTitle + ',' +
                columnIdentifier + ',' +
                columnTitle + ',' +
                content;
    }
}
