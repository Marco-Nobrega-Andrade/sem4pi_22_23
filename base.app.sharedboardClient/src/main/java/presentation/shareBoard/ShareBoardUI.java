package presentation.shareBoard;

import eapli.base.board.dto.BoardDTOWithTitle;
import eapli.base.sharedBoard.SBPMessageFormat;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class ShareBoardUI extends AbstractUI {
    private final Socket socket;
    public ShareBoardUI (Socket socket){
        this.socket = socket;
    }

    @Override
    protected boolean doShow() {
        DataOutputStream dos;
        DataInputStream dis;
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(new String(SBPMessageFormat.createListBoardIOwnRequestSend()));
            dis = new DataInputStream(socket.getInputStream());
            String message = dis.readUTF();
            if(SBPMessageFormat.decodeFormat(message.getBytes())[SBPMessageFormat.CODE_OFFSET] == SBPMessageFormat.LIST_BOARD_I_OWN_RCV){
                List<String> boardList = SBPMessageFormat.decodeParam(message.getBytes());
                if(!boardList.isEmpty()){
                    SelectWidget<String> selected = new SelectWidget<>("Select the board.", boardList, new BoardTitlePrinter());
                    selected.show();
                    String board = selected.selectedElement();
                }else{
                    System.out.printf("You don't own any boards.\n\n");
                }
            }
        } catch (IOException e) {
            System.out.printf("Your connection to the server has been lost.\n\n");
        }
        return true;
    }
    @Override
    public String headline() {
        return "Share Board";
    }
}
