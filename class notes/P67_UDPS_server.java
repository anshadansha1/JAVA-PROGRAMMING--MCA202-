//PROGRAM : USER DATAGRAM PROTOCOL Server program:  UDP is a connectionless protocol

//This program listens on port 1234, receives a packet from the client,
// prints the data received along with the client's port, and then sends a reply back to the client.
import java.net.*;
import java.io.*;

public class P67_UDPS_server {
    public static void main(String args[]){
        DatagramSocket ds = null; // used to create a socket for sending and receiving UDP 
        DatagramPacket dp = null,reply; //used to represent a packet of data in the  UDP communication
        try{
            ds = new DatagramSocket(1234);
            byte[] buffer = new byte[1000];//declares a byte array
            dp = new DatagramPacket(buffer,buffer.length);//creating a object with the specified buffer and its length.
            ds.receive(dp); //wait until a UDP packet is received on the socket

            System.out.println("\nFrom client : "+(new String(dp.getData())).trim());
            System.out.println("\nClient PORT : "+dp.getPort());
            reply =new DatagramPacket("From Server OK".getBytes(),"From Server OK".length(),dp.getAddress(),dp.getPort());
            
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

