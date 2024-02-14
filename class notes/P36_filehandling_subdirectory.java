//PROGRAM : Write a program to display the sub directories of a given directory.
import java.io.*;
import java.util.*;
public class P36_filehandling_subdirectory {
    public static void main(String args[]){
        File f;
        String s[];
        int i;
        try{
            f = new File("c:\\xampp\\"); //To print whole location
            s=f.list();
            for(i=0;i<s.length;i++){
                File ff=new File("c:\\xampp\\"+s[i]);
                if(ff.isDirectory()){ 
                    System.out.println("c:\\xampp\\"+s[i]); //Prints only when it is a directory.
                }
            }
        }
        catch(Exception e){
            System.out.println("\nError :"+e);
        }
    }
}

/*
 OUTPUT :
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P36_filehandling_subdirectory
c:\xampp\anonymous
c:\xampp\apache
c:\xampp\cgi-bin
c:\xampp\contrib
c:\xampp\FileZillaFTP
c:\xampp\htdocs
c:\xampp\img
c:\xampp\install
c:\xampp\licenses
c:\xampp\locale
c:\xampp\mailoutput
c:\xampp\mailtodisk
c:\xampp\MercuryMail
c:\xampp\mysql
c:\xampp\perl
c:\xampp\php
c:\xampp\phpMyAdmin
c:\xampp\sendmail
c:\xampp\src
c:\xampp\tmp
c:\xampp\tomcat
c:\xampp\webalizer
c:\xampp\webdav

E:\MUHAMMAD ANSHAD P A\JAVA\class notes>
 */