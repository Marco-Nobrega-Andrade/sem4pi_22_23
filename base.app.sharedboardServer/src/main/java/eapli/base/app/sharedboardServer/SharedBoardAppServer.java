package eapli.base.app.sharedboardServer;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SharedBoardAppServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            AuthzRegistry.configure(PersistenceContext.repositories().users(),
                    new BasePasswordPolicy(), new PlainTextEncoder());
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
