package presentation.viewInRealTime;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class ViewInRealTimeRequest extends Thread {


    private String baseFolder;
    private Socket sock;

    private List<List<String>> boardCellsInfo;

    private DataInputStream inS;
    private DataOutputStream outS;

    public ViewInRealTimeRequest (Socket s, String f, List<List<String>> boardCellsInfo){
        baseFolder=f;
        sock=s;
        this.boardCellsInfo = boardCellsInfo;
    }
    public void run() {
        try {
            outS = new DataOutputStream(sock.getOutputStream());
            inS = new DataInputStream(sock.getInputStream());
        }
        catch(IOException ex) { System.out.println("Thread error on data streams creation"); }
        try {
            HTTPmessage request = new HTTPmessage(inS);
            HTTPmessage response = new HTTPmessage();

            if(request.getMethod().equals("GET")) {
                if (request.getURI().equals("/table")) {
                    String content = ViewInRealTimeUI.getTableInHTML(boardCellsInfo);
                    if (content != null) {
                        response.setContentFromString(content, "text/html");
                        response.setResponseStatus("200 Ok");
                    } else {
                        response.setContentFromString(
                                "<span id=\"loading\">Error loading content, trying again...</span>", "text/html");
                        response.setResponseStatus("404 Not Found");
                    }
                } else {
                    String fullname = baseFolder/* + "/"*/;
                    if (request.getURI().equals("/")) fullname += "/index.html";
                    else fullname += request.getURI();

                    if (response.setContentFromFile(fullname)) {
                        response.setResponseStatus("200 Ok");
                    } else {
                        response.setContentFromString(
                                "<html><body><h1>404 File not found</h1></body></html>", "text/html");
                        response.setResponseStatus("404 Not Found");
                    }
                }
                response.send(outS);
            }
        }catch(IOException ex) {
            System.out.println("Thread error when reading request");
        }
        try {
            sock.close();
        }
        catch(IOException ex) {
            System.out.println("CLOSE IOException");
        }
    }




}
