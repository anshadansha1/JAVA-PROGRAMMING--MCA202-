//PROGRAM : 2)Reading the entire content.
import java.io.*;
import java.util.*;

public class P30_filehandling3 {
    public static void main(String args[]){
        FileInputStream fin;
        Scanner s = new Scanner(System.in);
        String fname;
        try{
            System.out.println("\nEnter the file name : ");
            fname = s.nextLine();
            fin = new FileInputStream(fname);
            
            byte b[];
            b = new byte[fin.available()]; //instance "b" : An array of length is creted based on the available size of file.
            fin.read(b); // used to read data from a file input stream(fin), and store the read bytes into a byte array "b".
            String data = new String(b,0,b.length); //used to convert a portion of a byte array "b" into a string
            System.out.print(data);
            fin.close();
            s.close();
        }
        catch(Exception e){
            System.out.println("Error "+e );
        }
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P30_filehandling3

Enter the file name :
E:\\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\JAVA LAB\p4_4_queue_constructors.java

 */