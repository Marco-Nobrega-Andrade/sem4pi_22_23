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

                        Socket cliSock;
                        int port = Console.readInteger("Insert the port");
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
                    }else{
                        System.out.println("Currently you are not participating in any board");
                    }
                }
            }
        } catch (IOException e) {
            System.out.printf("Your connection to the server has been lost.\n\n");
        }
        return false;
    }

    public static synchronized String getTableInHTML(List<List<String>>  boardCellsInfo) {

        int maxRow = getMaxRowNumber(boardCellsInfo);
        int maxCol = getMaxColumnNumber(boardCellsInfo);
        StringBuilder html = new StringBuilder();
        html.append("<table>\n<tr>\n<td></td>\n");
        for (int col = 1; col <= maxCol; col++) {
            String colTitle = getColumnTitle(boardCellsInfo, col);
            html.append("<th>").append(colTitle).append("</th>\n");
        }
        html.append("</tr>\n");

        for (int row = 1; row <= maxRow; row++) {
            String rowTitle = getRowTitle(boardCellsInfo, row);
            html.append("<tr>\n");
            html.append("<th>").append(rowTitle).append("</th>\n");
            for (int col = 1; col <= maxCol; col++) {
                String cellData = getCellData(boardCellsInfo, row, col);
                html.append("<td>").append(cellData).append("</td>\n");
            }
            html.append("</tr>\n");
        }
        html.append("</table>");
        return html.toString();
    }

    private static int getMaxRowNumber(List<List<String>> boardCellsInfo) {
        int maxRow = 0;
        for (List<String> row : boardCellsInfo) {
            if (!row.isEmpty()) {
                String s = row.get(0).replaceAll("[^0-9]", "");
                int rowNumber = Integer.parseInt(s);
                if (rowNumber > maxRow) {
                    maxRow = rowNumber;
                }
            }
        }
        return maxRow;
    }

    private static int getMaxColumnNumber(List<List<String>> boardCellsInfo) {
        int maxCol = 0;
        for (List<String> row : boardCellsInfo) {
            if (!row.isEmpty()) {
                int colNumber = Integer.parseInt(row.get(2).replaceAll("[^0-9]", ""));
                if (colNumber > maxCol) {
                    maxCol = colNumber;
                }
            }
        }
        return maxCol;
    }

    private static String getColumnTitle(List<List<String>> boardCellsInfo, int col) {
        for (List<String> rowData : boardCellsInfo) {
            int colNum = Integer.parseInt(rowData.get(2).replaceAll("[^0-9]", ""));
            if (colNum == col) {
                if (rowData.get(3).isEmpty())return "" + col;
                return rowData.get(3);
            }
            }
        return ""+col;
    }

    private static String getRowTitle(List<List<String>> data, int row) {
        for (List<String> rowData : data) {
            int rowNum = Integer.parseInt(rowData.get(0).replaceAll("[^0-9]", ""));
            if (rowNum == row) {
                if (rowData.get(1).isEmpty()) return "" + row;
                return rowData.get(1);
            }
        }
        return ""+row;
    }

    public static String getCellData(List<List<String>> data, int row, int col) {
        for (List<String> rowData : data) {
            int rowNum = Integer.parseInt(rowData.get(0).replaceAll("[^0-9]", ""));
            int colNum = Integer.parseInt(rowData.get(2).replaceAll("[^0-9]", ""));
            if (rowNum == row && colNum == col) {
                return rowData.get(4);
            }
        }
        return "";
    }

    @Override
    public String headline() {
        return "View Board in Real Time";
    }
}
