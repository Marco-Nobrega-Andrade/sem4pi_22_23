package presentation.viewInRealTime;

import eapli.base.sharedBoard.SBPMessageFormat;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import presentation.shareBoard.StringPrinter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ViewInRealTimeUI extends AbstractUI {

    private final Socket socketServer;

    static private final String BASE_FOLDER="www";

    private ServerSocket sock;

    public ViewInRealTimeUI(Socket socket){
        this.socketServer = socket;
    }
    @Override
    protected boolean doShow() {
        DataOutputStream dosServer;
        DataInputStream disServer;
        try {
            dosServer= new DataOutputStream(socketServer.getOutputStream());
            dosServer.writeUTF(new String(SBPMessageFormat.createListAllBoardsIParticipateAndCanRead()));
            disServer = new DataInputStream(socketServer.getInputStream());
            String message = disServer.readUTF();
            if(SBPMessageFormat.decodeFormat(message.getBytes())[SBPMessageFormat.CODE_OFFSET] == SBPMessageFormat.LIST_BOARD) {
                List<String> boardList = SBPMessageFormat.decodeParam(message.getBytes());
                if (!boardList.isEmpty()) {
                    SelectWidget<String> selected = new SelectWidget<>("Select the board.", boardList, new StringPrinter());
                    selected.show();
                    if (selected.selectedOption() != 0) {
                        String board = selected.selectedElement();
                        int port;
                        Socket cliSock;
                        while (true) {
                            port = Console.readInteger("Insert the port:");
                            if (port == socketServer.getPort()){
                                System.out.println("This port is not valid!!!\n\n");
                            }else{
                                break;
                            }
                        }
                        try {
                            sock = new ServerSocket(port);
                            System.out.println("Connecting to http://" + InetAddress.getLocalHost().getHostAddress() + ":" + sock.getLocalPort());
                        } catch (IOException ex) {
                            System.out.println("Server failed to open local port " + port);
                            return false;
                        }

                        while (true) {
                            try {
                                cliSock = sock.accept();

                            } catch (IOException e) {

                                System.out.println("Server error - " + e.getMessage());

                                return false;
                            }
                            dosServer.writeUTF(new String(SBPMessageFormat.createViewInRealTimeRequest(board)));
                            String boardInfo = disServer.readUTF();
                            int[] format = SBPMessageFormat.decodeFormat(boardInfo.getBytes());
                            if (format[1] == SBPMessageFormat.BOARD_INFO_CODE) {
                                List<List <String>> boardCellsInfo = SBPMessageFormat.decodeDTO(boardInfo.getBytes());
                                ViewInRealTimeRequest request = new ViewInRealTimeRequest(cliSock, BASE_FOLDER, boardCellsInfo);
                                request.start();
                            }else if (format[1] == SBPMessageFormat.ERR_CODE){
                                System.out.println(SBPMessageFormat.decodeParam(boardInfo.getBytes()));
                            }
                        }
                    }
                }else{
                    System.out.println("Currently you are not participating in any board");
                }
            }
        } catch (IOException e) {
            System.out.printf("Your connection to the server has been lost.\n\n");
        }
        return false;
    }

    @Override
    public String headline() {
        return "View Board in Real Time";
    }
}
