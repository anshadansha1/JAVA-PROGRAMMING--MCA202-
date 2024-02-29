//PROGRAM : USER DATAGRAM PROTOCOL Server program

import java.net.*;
import java.io.*;

public class P67_UDPS_server {
    public static void main(String args[]){
        DatagramSocket ds = null; //
        DatagramPacket dp = null,reply;
        try{
            ds = new DatagramSocket(1234);
            byte[] buffer = new byte[1000];//array
            dp = new DatagramPacket(buffer,buffer.length);
            ds.receive(dp);
            System.out.println("\nFrom client : "+(new String(dp.getDate())).trim());
            System.out.println("\nClient PORT : "+dp.getPort());
            reply =new DatagramPacket("From Server OK".getBytes(),"From Server OK".Length(),dp.getAddress(),dp.getPort());
            ds.send(reply);
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
