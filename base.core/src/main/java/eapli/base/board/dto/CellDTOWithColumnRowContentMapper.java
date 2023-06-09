package eapli.base.board.dto;

import eapli.base.board.domain.Cell;

public class CellDTOWithColumnRowContentMapper {

    public static CellDTOWithColumnRowContent toDTO(Cell cell){
        CellDTOWithColumnRowContentBuilder builder = new CellDTOWithColumnRowContentBuilder();
        return builder.withRowTitle(cell.returnRowTitleString()).withRowIdentifier(cell.returnRowIdentifierString())
                .withColumnTitle(cell.returnColumnTitleString()).withColumnIdentifier(cell.returnColumnIdentifierString()).
                withContent(cell.returnPostItContentString()).build();
    }

}
