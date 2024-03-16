//PROGRAM : Client Program 

import java.io.*;
import java.net.*;

public class P50_networking_client {
    public static void main(String args[]){
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        try{
            cs = new Socket("localhost",1234); //instead of ip using localhost
            sin = new DataInputStream(cs.getInputStream());
            sout = new DataOutputStream(cs.getOutputStream());

            String str = sin.readUTF(); //It blocks until data is available, and once available, it reads the UTF-encoded string from the input stream.
            System.out.println("\nServer says : "+str);
            sout.writeUTF("Bye"); //used to write a UTF-encoded string to the output stream.
            System.in.read();
            cs.close();
        }   
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}


/*OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P50_networking_client

Server says : Welcome client
 */