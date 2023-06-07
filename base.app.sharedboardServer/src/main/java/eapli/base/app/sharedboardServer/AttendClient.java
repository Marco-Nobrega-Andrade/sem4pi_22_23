package eapli.base.app.sharedboardServer;

import com.sun.jdi.request.DuplicateRequestException;
import eapli.base.board.application.ListBoardsIOwnController;
import eapli.base.board.application.ShareBoardController;
import eapli.base.board.dto.BoardDTOWithTitle;
import eapli.base.infrastructure.authz.AuthenticationCredentialHandler;
import eapli.base.infrastructure.authz.CredentialHandler;
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

                        List<String> params = SBPMessageFormat.decodeParam(message.getBytes());
                        if (credentialHandler.authenticated(params.get(0), params.get(1), null)) {
                            byte[] authRequest = SBPMessageFormat.createAcknowledgeRequest();
                            outputStream.writeUTF(new String(authRequest));
                        } else {
                            byte[] authRequest = SBPMessageFormat.creteErrorRequest("Wrong username or password.");
                            outputStream.writeUTF(new String(authRequest));
                        }
                        break;
                    case SBPMessageFormat.COMMTEST_CODE:
                        outputStream.writeUTF(new String(SBPMessageFormat.createAcknowledgeRequest()));
                        break;
                    case SBPMessageFormat.LIST_BOARD_I_OWN_SEND:
                        List<BoardDTOWithTitle> boardDTOList = new ListBoardsIOwnController().listBoardsIOwn();
                        byte[] boardIOwnListRequest = SBPMessageFormat.createListBoardIOwnRequestReceive(boardDTOList);
                        outputStream.writeUTF(new String(boardIOwnListRequest));
                        break;
                    case SBPMessageFormat.SHARE_BOARD_CODE:
                        List<String> shareBoardParams = SBPMessageFormat.decodeParam(message.getBytes());
                        boolean permission;
                        if (shareBoardParams.get(2).equals("t")) {
                            permission = true;
                        } else {
                            permission = false;
                        }
                        try {
                            new ShareBoardController().shareBoard(shareBoardParams.get(0), shareBoardParams.get(1), permission);
                            outputStream.writeUTF(new String(SBPMessageFormat.createAcknowledgeRequest()));
                        }catch (DuplicateRequestException e){
                            outputStream.writeUTF(new String(SBPMessageFormat.creteErrorRequest(e.getMessage())));
                        }catch (NoResultException e){
                            outputStream.writeUTF(new String(SBPMessageFormat.creteErrorRequest("ERROR: There are no people in the system with that e-mail")));
                        }
                }
            }while (arrayFormat[SBPMessageFormat.CODE_OFFSET] != SBPMessageFormat.DISCONN_CODE) ;
        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }
}
