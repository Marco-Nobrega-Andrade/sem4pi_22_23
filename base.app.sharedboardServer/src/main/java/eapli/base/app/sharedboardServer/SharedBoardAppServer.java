import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SharedBoardAppServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket socket = server.accept();
            System.out.println("Connected");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            String message;
            do {
                message = inputStream.readUTF();
                System.out.println(message);
            }while (!message.equalsIgnoreCase("bye"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
