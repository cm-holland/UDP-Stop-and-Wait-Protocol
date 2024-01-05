
import java.io.*;
import java.net.*;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SAWSender {
    public static int RECEIVER_PORT = 6789;
    public static int SENDER_PORT = 5678;
    public static int HEADER_SIZE = 10;
    public static int WINDOW_SIZE = 1; //Window size of 1 for stop-and-wait protocol
    private DatagramSocket senderSocket;
    public SAWSender(int port) throws SocketException{
        this.senderSocket = new DatagramSocket(port);
    }


}
