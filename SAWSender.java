
import java.io.*;
import java.net.*;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SAWSender {
   public  static int BUFFER_SIZE = 1024;
    public static int RECEIVER_PORT = 6789;
    public static int SENDER_PORT = 5678;
    public static int HEADER_SIZE = 10;
    public static int WINDOW_SIZE = 1; //Window size of 1 for stop-and-wait protocol

    public static void main(String[] args) {
        //Creating datagram socket
        try {
            DatagramSocket senderSocket = new DatagramSocket();
            InetAddress receiverAddress = InetAddress.getLocalHost();

            //Input stream to read bytes from file
            File file = new File("COSC635_P2_DataSent.txt");
            FileInputStream fileInput = new FileInputStream(file);
            byte [] data = new byte [BUFFER_SIZE];
            FileInputStream.read(data);
            FileInputStream.close();

            //
            int packetLossPercentage = getPacketLossPercentage();

            int sequenceNumber = 0;
            int totalPacketsSent = 0;
            int totalPacketsLost = 0;








        }

    }


}
