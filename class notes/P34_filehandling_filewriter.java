//PROGRAM :FileWriter

import java.io.*;
import java.util.*;

public class P34_filehandling_filewriter {
    public static void main(String args[]) {
        FileWriter fw;
        BufferedWriter bw;//Whenever you use "FileWriter" use :"BufferedWriter".
        try{
            fw = new FileWriter(new File("b.txt"));
            bw = new BufferedWriter(fw);
            Scanner s= new Scanner(System.in);
            System.out.println("\nEnter the data (enter 'quit' to terminate):");
            String data = s.nextLine();
            while(!data.equals("quit")){
                bw.write(data + "\n");
                data = s.nextLine();
            }
            bw.close();
            s.close();
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}
/*
 OUTPUT :
  
  E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P34_filehandling_filewriter

Enter the data (enter 'quit' to terminate):
Hi All
This is system check
looks great
Thank you!
quit
 */
