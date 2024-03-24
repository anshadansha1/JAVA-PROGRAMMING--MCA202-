import java.net.*;
import java.io.*;
import java.util.Scanner;

public class P12_3_udpserver {
    public static void main(String args[]) {
        DatagramSocket ds = null;
        DatagramPacket dp = null, reply = null;
        Scanner scanner = new Scanner(System.in);
        try {
            ds = new DatagramSocket(1234);
            byte[] buffer = new byte[1000];
            dp = new DatagramPacket(buffer, buffer.length);

            System.out.println("\nWaiting for client.......");
            ds.receive(dp);

            System.out.println("\nFrom client : " + (new String(dp.getData())).trim());
            System.out.println("\nClient PORT : " + dp.getPort());
            reply = new DatagramPacket("From Server OK".getBytes(), "From Server OK".length(), dp.getAddress(),
                    dp.getPort());

            ds.send(reply);

            // Receiving response from client
            buffer = new byte[1000];
            reply = new DatagramPacket(buffer, buffer.length);
            ds.receive(reply);
            System.out.println("\nFrom client : " + (new String(reply.getData())).trim());

            // Sending reply to client
            System.out.print("\nEnter your reply: ");
            String serverMessage = scanner.nextLine();
            reply = new DatagramPacket(serverMessage.getBytes(), serverMessage.length(), dp.getAddress(),
                    dp.getPort());
            ds.send(reply);
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
