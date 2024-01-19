//PROGRAM : 1)Reading from a file character by character. 

import java.io.*;
import java.util.*;

public class P29_filehandling2 {
    public static void main(String args[]){
        FileInputStream fin; //To read from a file.
        Scanner s = new Scanner(System.in);
        String fname;
        try{
            System.out.println("\nEnter the file name : ");
            fname = s.nextLine();
            fin = new FileInputStream(fname);//used to create new instance of the "FileInputStream" class  based on given file name.
            int ch;
            ch = fin.read(); //read() method returns ASCII value.
            //To read character by character
            while(ch!=-1){
                System.out.print((char)ch);
                ch = fin.read();
            }
            fin.close();
            s.close();
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P29_filehandling2

Enter the file name :
P28_filehandling.txt
Hello world
Second line
third

 */