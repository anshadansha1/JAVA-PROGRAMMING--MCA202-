//PROGRAM : 3)reading block by block 
import java.io.*;
import java.util.*;

public class P31_filehandling4 {
    public static void main(String args[]){
        FileInputStream fin;
        Scanner s = new Scanner(System.in);
        String fname;
        try{
            System.out.println("\nEnter the file name : ");
            fname = s.nextLine();
            fin = new FileInputStream(fname);
            byte b[];
            b = new byte[5]; //instance "b" : An array of block size "5" is creted.
            int n = fin.read(b,0,5);//used to read up to 5 bytes from an input stream (fin) into a byte array (b).
            while(n != -1){
                String data = new String(b,0,n);//used to create a new String object from a portion of a byte array b.
                System.out.print(data);
                n = fin.read(b,0,5);
            }
            fin.close();
            s.close();
        }
        catch(Exception e){
            System.out.println("\nError : "+ e);
        }
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P31_filehandling4

Enter the file name :
P28_filehandling.txt
Hello world
Second line
third

 */