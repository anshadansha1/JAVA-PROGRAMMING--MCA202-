/* Use "FileReader" when you want to read character data from a file,
 and use "FileInputStream" when you want to read raw binary data from a file.
 */
//PROGRAM : 4)FileReader
import java.util.*;
import java.io.*;

public class P33_filehandling_filereader {
    public static void main(String args[]) {
        FileReader fr;
        BufferedReader br; // Whenever you use "FileReader" use :"BufferedReader".
        try {
            fr = new FileReader(new File("a.txt"));
            br = new BufferedReader(fr);
            // these above two lines of code create a FileReader to read from the file  "a.txt"
            // and wrap it in a BufferedReader for efficient reading of the file's contents line by line.
            String data = br.readLine();
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }
    }

}

/*
 OUTPUT :
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P33_filehandling_filereader
Hello world
Second line
third

 */