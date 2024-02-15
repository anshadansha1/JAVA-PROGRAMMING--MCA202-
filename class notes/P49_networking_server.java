//PROGRAM : Server Program 

import java.io.*;
import java.net.*;

public class P49_networking_server {
    public static void main(String args[]){
        ServerSocket ss; //it is a class that implements server sockets. A server socket waits for requests to come in over the network.
        Socket as; // it is a class that implements client sockets. A socket represents one endpoint of a connection between two machines.
        DataInputStream sin; 
        DataOutputStream sout;
        try{
            ss = new ServerSocket(1234); //creates a new object ss and binds it to port 1234.And listens for incoming connections from clients on this port.
            as = ss.accept(); //wait for request from client
            sin = new DataInputStream(as.getInputStream()); //This allows reading data sent by the client through the socket.
            sout = new DataOutputStream(as.getOutputStream());//This allows writing data to be sent back to the client through the socket.

            sout.writeUTF("Welcome client"); 

            String str = sin.readUTF();
            System.out.println("\nClient says : "+str);
            System.in.read(); //waits for the user to press the Enter key before proceeding further.
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }    
}

/*OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P49_networking_server

Client says : Bye
 */