package eapli.base.app.sharedboardServer;

import eapli.base.sharedBoard.SBPMessageFormat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class AttendClient implements Runnable{
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
                            //TODO: check if the user is registered
                        break;
                    case SBPMessageFormat.COMMTEST_CODE:
                            outputStream.writeUTF(new String(SBPMessageFormat.createAcknowledgeRequest()));
                        break;
                }
            }while (arrayFormat[SBPMessageFormat.CODE_OFFSET] != SBPMessageFormat.DISCONN_CODE) ;
        } catch (Exception e) {
            System.out.println("Client disconnected.");
        }
    }
}
