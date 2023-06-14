package eapli.base.app.sharedboardServer;

import eapli.base.app.sharedboardServer.Requests.*;
import eapli.base.board.application.*;
import eapli.base.board.application.services.BoardInformationController;
import eapli.base.board.dto.BoardDTOWithTitle;
import eapli.base.board.dto.CellDTOWithColumnRowContent;
import eapli.base.exceptions.AlreadyDeactivatedException;
import eapli.base.exceptions.DuplicateCreationException;
import eapli.base.exceptions.ParameterNullBlankException;
import eapli.base.infrastructure.authz.AuthenticationCredentialHandler;
import eapli.base.infrastructure.authz.CredentialHandler;
import eapli.base.postitmanager.application.CreatePostItController;
import eapli.base.postitmanager.application.UndoLastChangePostItController;
import eapli.base.sharedBoard.SBPMessageFormat;

import javax.persistence.NoResultException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class AttendClient implements Runnable{

    private final CredentialHandler credentialHandler = new AuthenticationCredentialHandler();
    private Socket socket;

    protected AttendClient(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            String message;
            int[] arrayFormat;
            do {
                message = inputStream.readUTF();
                arrayFormat = SBPMessageFormat.decodeFormat(message.getBytes());
                switch (arrayFormat[SBPMessageFormat.CODE_OFFSET]) {
                    case SBPMessageFormat.AUTH_CODE:
                        AuthRequest.authenticate(message, outputStream, credentialHandler);
                        break;
                    case SBPMessageFormat.COMMTEST_CODE:
                        CommtestRequest.test(outputStream);
                        break;
                    case SBPMessageFormat.LIST_BOARD_I_OWN_SEND:
                        ListBoardsIOwnRequest.listBoardsIOwn(message, outputStream);
                        break;
                    case SBPMessageFormat.LIST_BOARD_I_PARTICIPATE_SEND:
                        List<BoardDTOWithTitle> boardDTOList2 = new ListBoardIParticipateController().
                                listBoardsIParticipate();
                        byte[] boardIParticipateListRequest = SBPMessageFormat.
                                createListBoardIParticipateRequestReceive(boardDTOList2);
                        outputStream.writeUTF(new String(boardIParticipateListRequest));
                        break;
                    case SBPMessageFormat.NUMBER_OF_CELLS_REQUEST_SEND:
                        String board = SBPMessageFormat.decodeParam(message.getBytes()).get(0);
                        if (!board.isEmpty()){

                            int maxColumn = new ShowCellInformationController().getMaxColumn(board);
                            int maxRow = new ShowCellInformationController().getMaxRow(board);
                            byte[] numberOfCellsRequest = SBPMessageFormat.
                                    createShowNumberOfCellsRequestRCV(maxColumn, maxRow);
                            outputStream.writeUTF(new String(numberOfCellsRequest));
                        }
                        else {
                            outputStream.writeUTF(
                                    new String(SBPMessageFormat.
                                            creteErrorRequest("ERROR: Board title is empty")));
                        }
                        break;

                    case SBPMessageFormat.POST_IT_REQUEST_SEND:
                        synchronized (this) {
                            List<String> postItParams = SBPMessageFormat.decodeParam(message.getBytes());
                            try {
                                if (new CreatePostItController().createPostIt(postItParams.get(0), postItParams.get(1),
                                        Integer.parseInt(postItParams.get(2)), Integer.parseInt(postItParams.get(3)))) {
                                    outputStream.writeUTF(new String(SBPMessageFormat.createAcknowledgeRequest()));
                                } else {
                                    outputStream.writeUTF(new String(SBPMessageFormat.
                                            creteErrorRequest("ERROR: Post-it cannot be created")));
                                }
                            } catch (Exception e) {
                                outputStream.writeUTF(new String(SBPMessageFormat.creteErrorRequest(e.getMessage())));
                            }
                        }
                        break;

                    case SBPMessageFormat.SHARE_BOARD_CODE:
                        ShareBoardRequest.shareBoard(message, outputStream);
                        break;
                    case SBPMessageFormat.ARCHIVE_BOARD_CODE:
                        ArchiveBoardRequest.archiveBoard(message,outputStream);
                        break;
                    case SBPMessageFormat.VIEW_IN_REAL_TIME_CODE:
                        List<String> param = SBPMessageFormat.decodeParam(message.getBytes());
                        try{
                            List<CellDTOWithColumnRowContent>  listCellDTOWithColumnRowContent =
                                    new BoardInformationController().getBoardInformation(param.get(0));
                            outputStream.writeUTF(
                                    new String(SBPMessageFormat.createBoardInfoRequest(listCellDTOWithColumnRowContent)));
                        }catch (Exception e){
                            outputStream.writeUTF(
                                    new String(SBPMessageFormat.creteErrorRequest(e.getMessage())));
                        }
                        break;
                    case SBPMessageFormat.LIST_ALL_BOARDS_I_PARTICIPATE_AND_CAN_READ:
                        List<BoardDTOWithTitle> listBoardDTO = new ListAllBoardsIParticipateAndCanReadController().listAllBoardsIParticipateAndCanRead();
                        outputStream.writeUTF(new String(SBPMessageFormat.createListBoardReceive(listBoardDTO)));
                        break;
                    case SBPMessageFormat.HISTORY_OF_UPDATES_CODE:
                        List<String> boardParam = SBPMessageFormat.decodeParam(message.getBytes());
                        try {
                            List<String> taskList = new HistoryOfUpdatesController().historyOfUpdates(boardParam.get(0));
                            byte[] taskListRequest = SBPMessageFormat.createTaskListRequest(taskList);
                            outputStream.writeUTF(new String(taskListRequest));
                        }catch (Exception e){
                            outputStream.writeUTF(new String(SBPMessageFormat.creteErrorRequest(e.getMessage())));
                        }
                        break;
                    case SBPMessageFormat.UNDO_LAST_CHANGE_POST_IT_REQUEST:
                        List<String> postItParams = SBPMessageFormat.decodeParam(message.getBytes());
                        try {
                            new UndoLastChangePostItController().undoLastChangePostIt(postItParams.get(0),
                                    Integer.parseInt(postItParams.get(1)), Integer.parseInt(postItParams.get(2)));
                            outputStream.writeUTF(new String(SBPMessageFormat.createAcknowledgeRequest()));
                        }catch (Exception e){
                            outputStream.writeUTF(new String(SBPMessageFormat.creteErrorRequest(e.getMessage())));
                        }
                }
            }while (arrayFormat[SBPMessageFormat.CODE_OFFSET] != SBPMessageFormat.DISCONN_CODE) ;
        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }
}
