import java.net.*;
import java.io.*;
import java.util.Scanner;

public class  P12_3_udpclient {
    public static void main(String args[]) {
        DatagramSocket ds = null;
        DatagramPacket dp = null, reply = null;
        InetAddress shost = null;
        Scanner scanner = new Scanner(System.in);
        try {
            ds = new DatagramSocket();
            byte[] m = "Bye".getBytes();
            shost = InetAddress.getByName("localhost");
            dp = new DatagramPacket(m, 3, shost, 1234);
            ds.send(dp);

            // Receiving reply from server
            byte[] buffer = new byte[1000];
            reply = new DatagramPacket(buffer, buffer.length);
            ds.receive(reply);
            System.out.println("\nReply : " + new String(reply.getData()).trim());

            // Sending response back to server
            System.out.print("\nEnter your message: ");
            String clientMessage = scanner.nextLine();
            m = clientMessage.getBytes();
            dp = new DatagramPacket(m, m.length, shost, reply.getPort());
            ds.send(dp);

        } catch (SocketException e) {
            System.out.println("\nSocket : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("\nIO : " + e.getMessage());
        } finally {
            if (ds != null) {
                ds.close();
            }
            scanner.close();
        }
    }
}

