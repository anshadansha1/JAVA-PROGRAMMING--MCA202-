//PROGRAM : Write a program to accept two file names and copy the content from the first file to second file. 
import java.io.*;
import java.util.*;

public class P32_filehandling5 {
    public static void main(String args[]){
        FileInputStream fin;
        FileOutputStream fout;
        Scanner s = new Scanner(System.in);
        String file1,file2;
        try{
            System.out.println("\nEnter source file name : ");
            file1 = s.nextLine();
            System.out.println("\nEnter destination file name : ");
            file2 = s.nextLine();
            fin = new FileInputStream(file1);
            fout = new FileOutputStream(file2);
            byte b[];
            b = new byte[5];
            int n = fin.read(b,0,5);
            while(n != -1){
                fout.write(b,0,n);
                n = fin.read(b,0,5);
            }
            fin.close();
            fout.close();
            s.close();

        }
        catch(Exception e){
            System.out.println("\nError : "+ e);
        }
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P32_filehandling5

Enter source file name :
P28_filehandling.txt

Enter destination file name :
a.txt

 */