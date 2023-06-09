package eapli.base.board.dto;

public class CellDTOWithColumnRowContentBuilder {


    private String rowIdentifier;
    private String rowTitle;
    private String columnIdentifier;
    private String columnTitle;
    private String content;

    public CellDTOWithColumnRowContentBuilder withRowTitle(String title){
        this.rowTitle = title;
        return this;
    }
    public CellDTOWithColumnRowContentBuilder withRowIdentifier(String identifier){
        this.rowIdentifier = identifier;
        return this;
    }
    public CellDTOWithColumnRowContentBuilder withColumnTitle(String title){
        this.columnTitle = title;
        return this;
    }
    public CellDTOWithColumnRowContentBuilder withColumnIdentifier(String identifier){
        this.columnIdentifier = identifier;
        return this;
    }
    public CellDTOWithColumnRowContentBuilder withContent(String content){
        this.content = content;
        return this;
    }

    public CellDTOWithColumnRowContent build(){
        return new CellDTOWithColumnRowContent(rowIdentifier,rowTitle,columnIdentifier,columnTitle,content);
    }

}
