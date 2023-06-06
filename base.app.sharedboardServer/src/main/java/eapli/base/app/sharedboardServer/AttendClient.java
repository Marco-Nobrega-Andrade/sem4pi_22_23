package eapli.base.app.sharedboardServer;

import eapli.base.board.application.ListBoardsIOwnController;
import eapli.base.board.dto.BoardDTOWithTitle;
import eapli.base.infrastructure.authz.AuthenticationCredentialHandler;
import eapli.base.infrastructure.authz.CredentialHandler;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.sharedBoard.SBPMessageFormat;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import eapli.framework.infrastructure.authz.domain.model.Role;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
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
                        if(credentialHandler.authenticated(params.get(0), params.get(1),null)){
                            byte[] authRequest = SBPMessageFormat.createAcknowledgeRequest();
                            outputStream.writeUTF(new String(authRequest));
                        }else {
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
                }
            }while (arrayFormat[SBPMessageFormat.CODE_OFFSET] != SBPMessageFormat.DISCONN_CODE) ;
        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }
}
