import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class sharedBoardAppClient {
    public static void main(String[] args) {
        try {
            final var clientIP = InetAddress.getLocalHost().getHostAddress();
            Socket socket = new Socket(clientIP, 5000);
            System.out.println("Connected");
            System.out.println("To exit the program please insert bye");
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            Scanner read = new Scanner(System.in);
            String input;
            do{
                input = read.nextLine();
                dos.writeUTF(input);
            }while(!input.equals("bye"));
        } catch (IOException e) {
            System.out.println("Could not connect to server. Please make sure it you running the server app.");;
        }
    }
}
