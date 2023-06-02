package eapli.base.sharedBoard;

import java.util.ArrayList;
import java.util.List;

public class SBPMessageFormat {
    public static final int DEFAULT_VERSION = 1;
    public static final int COMMTEST_CODE = 0;
    public static final int DISCONN_CODE = 1;
    public static final int ACK_CODE = 2;
    public static final int ERR_CODE = 3;
    public static final int AUTH_CODE = 4;

    public static byte[] createAuthRequest(String username, String password){
        return encodeRequest(AUTH_CODE, username + "," + password);
    }

    public static byte[] createCommRequest(){
        return encodeRequest(COMMTEST_CODE, "");
    }

    public static byte[] creteErrorRequest(String errorMessage){
        return encodeRequest(ERR_CODE, errorMessage);
    }

    public static byte[] createAcknowledgeRequest(){
        return encodeRequest(ACK_CODE, "");
    }

    public static byte[] createDisconnRequest(){
        return encodeRequest(DISCONN_CODE, "");
    }

    public static byte[] encodeRequest(int code, String data){
        //Data values
        byte[] dataBytes = data.getBytes();

        byte[] request = new byte[4+dataBytes.length];

        int length1 = data.length()%256;
        int length2=data.length()/256;

        request[0] = (byte) DEFAULT_VERSION;
        request[1] = (byte) code;
        request[2] = (byte) length1;
        request[3] = (byte) length2;

        for(int i = 0; i<data.getBytes().length; i++){
            request[4+i] = dataBytes[i];
        }

        return request;
    }

    public static List<String> decodeParam(byte[] request){
        StringBuilder stringBuilder = new StringBuilder();
        List<String> paramList = new ArrayList<>();
        byte comma = (byte) ',';
        for(int i=4; i<request.length; i++){
            if(request[i] == comma){
                paramList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }else{
                stringBuilder.append(request[i]);
            }
        }
        return paramList;
    }

    public static int[] decodeFormat(byte[] request){
        int [] format = new int[4];
        for(int i = 0; i < 4; i++){
            format[i] = request[i];
        }
        return format;
    }
}
