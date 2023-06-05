import eapli.base.sharedBoard.SBPMessageFormat;
import eapli.framework.io.util.Console;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class sharedBoardAppClient {
    public static void main(String[] args) {
        try {
            final var clientIP = InetAddress.getLocalHost().getHostAddress();
            Socket socket = new Socket(clientIP, 5000);
            System.out.println("Connected");
            System.out.println("To exit the program please insert bye");
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            boolean error;
            do{
                String username = Console.readLine("Username");
                String password = Console.readLine("Password");
                byte[] authRequest = SBPMessageFormat.createAuthRequest(username, password);
                dos.writeUTF(new String(authRequest));
                int[] arrayFormat = SBPMessageFormat.decodeFormat(dis.readUTF().getBytes());

                if(arrayFormat[1] == SBPMessageFormat.ACK_CODE){
                    error = false;
                    final MainMenu menu = new MainMenu();
                    menu.mainLoop();
                }else{
                    error = true;
                    System.out.println("ERROR: Please insert the correct credentials!");
                }
            }while (error);
        } catch (IOException e) {
            System.out.println("Could not connect to server. Please make sure it you running the server app.");
        }
    }
}
