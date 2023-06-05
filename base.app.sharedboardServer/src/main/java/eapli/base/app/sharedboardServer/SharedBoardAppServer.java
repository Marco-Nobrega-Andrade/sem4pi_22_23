package eapli.base.app.sharedboardServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SharedBoardAppServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            while (true) {
                Socket socket = server.accept();
                Thread clienConn = new Thread(new AttendClient(socket));
                clienConn.start();
            }
        } catch (IOException e) {
            System.out.println("Could not start server.");
        }
    }
}
