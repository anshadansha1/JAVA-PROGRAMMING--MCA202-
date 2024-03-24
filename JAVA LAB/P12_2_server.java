
    import java.io.*;
    import java.net.*;
    import java.util.*;
    
    public class P12_2_server {
        public static void main(String args[]){
            ServerSocket ss;
            Socket as;
            DataInputStream sin;
            DataOutputStream sout;
            try {
                ss = new ServerSocket(1234);//listens for incoming connections from clients on this port
                System.out.println("\nServer started waiting for client....");
                as = ss.accept(); //wait for request from client
                System.out.println("\nClient Connected");
                sin = new DataInputStream(as.getInputStream());
                sout = new DataOutputStream(as.getOutputStream());
                Scanner s = new Scanner(System.in);
    
                String received;
                String toSend;
    
                while(true){
                    received = sin.readUTF();
                    System.out.println("\nClient Says : "+received);
    
                    if(received.equals("quit")){
                        System.out.println("\nClient is Closing.....");
                        break;
                    }
                    System.out.print("\nServer : ");
                    toSend = s.nextLine();
                    sout.writeUTF(toSend);
    
                    if(toSend.equals("quit")){
                        System.out.println("\nServer is closing....");
                        break;
                    }
                    
                }
                ss.close();
                as.close();
                s.close();
                
            } catch (Exception e) {
                System.out.println("\nError : "+e);
            }
    
        }
    }
    