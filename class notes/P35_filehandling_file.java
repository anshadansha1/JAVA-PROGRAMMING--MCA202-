//length as a property: Gives the no.of valid locations
//length() as a function: Gives the no.of characters from a string.

//PROGRAM : 1)File : To read the content of a directory.
import java.io.*;
import java.util.*;

public class P35_filehandling_file {
    public static void main(String args[]) {
        File f;
        String s[];
        int i;
        try{
            f= new File("d:\\"); //creates a new File object named f representing the directory specified by the path "d:\". 
            s = f.list();// to obtain an array of strings representing the names of files and directories in the specified directory ("d:\").
            for(i=0;i<s.length;i++){
                System.out.println(s[i]);
            }
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}

/*
 OUTPUT:
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P35_filehandling_file
$RECYCLE.BIN
cleanup.exe
jdk-8u131-windows-x64.exe
kali-linux-2022.3-vmware-amd64.vmwarevm
netbeans-8.2-windows.exe
New folder
Orange3-3.35.0-Miniconda-x86_64.exe
SUPERAntiSpyware.exe
System Volume Information
VS2015
Wamp Server
xampp-windows-x64-8.1.6-0-VS16-installer.exe

 */
