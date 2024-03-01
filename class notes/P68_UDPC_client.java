//PROGRAM : USER DATAGRAM PROTOCOL Client program.

import java.net.*;
import java.io.*;

public class P68_UDPC_client {
    public static void main(String args[]){
        DatagramSocket ds=null;
        DatagramPacket dp=null,reply=null;
        InetAddress shost=null;
        try{
            ds = new DatagramSocket();
            byte[] m = "Bye".getBytes();
            shost = InetAddress.getByName("localhost");
            dp = new DatagramPacket(m,3,shost,1234);
            ds.send(dp);
            byte[] buffer = new byte[1000];
            reply = new DatagramPacket(buffer, buffer.length);
            ds.receive(reply);
            System.out.println("\nReply : "+new String(reply.getData()).trim());

            
        }
        catch(SocketException e){
            System.out.println("\nSocket : "+e.getMessage());
        }
        
        catch(IOException e){
            System.out.println("\nIO : "+e.getMessage());
        }
        finally{
            if(ds != null){
                ds.close();
            }
        }
    }    
}
