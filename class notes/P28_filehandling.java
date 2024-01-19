/*File Handling : classes used for file operations:
1)File.
2)FileInputStream.
3)FileOutputStream.
4)FileReader.
5)FileWriter.
*/

//PROGRAM : Writing To File .

import java.io.*;
import java.util.*;

public class P28_filehandling {
    public static void main(String args[]){
        FileOutputStream fout; //For writing content to a file.
        Scanner s = new Scanner(System.in);
        String fname;
        String data,space;
        try{
            System.out.println("\nEnter the file name : ");
            fname = s.nextLine();
            fout = new FileOutputStream(fname); //used to create new instance of the "FileOutputStream" class  based on given file name. 
            System.out.println("\nEnter data (Enter 'quit' to terminate) : ");
            data =  s.nextLine();
            space = "\n";
         
            while(!data.equals("quit")){ //until you enter 'quit'.
                 fout.write(data.getBytes()); //used to Write content to the file.
                 fout.write(space.getBytes()); //just for '\n'.
                 data = s.nextLine();
             }
            fout.close();//
            s.close();
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}

/*
 OUTPUT:
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P28_filehandling

Enter the file name :
P28_filehandling.txt

Enter data (Enter 'quit' to terminate) :
Hello world
Second line
third
quit
 */