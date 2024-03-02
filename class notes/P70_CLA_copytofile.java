//PROGRAM : Command Lines Arguments(CLA) To Copy the content of a file.

import java.io.*;
public class P70_CLA_copytofile {
    public static void main(String args[])throws Exception{
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length == 2){
            try{
                fin = new FileInputStream(args[0]);
                fout = new FileOutputStream(args[1]);
                byte[] b = new byte[fin.available()];
                fin.read(b);
                fout.write(b);
            }
            catch(Exception e){
                System.out.println("\nError : "+e);
            }
            finally{
                if(fin != null){
                    fin.close();
                }
                if(fout != null){
                    fout.close();
                }
            }
        }
        else{
            System.out.println("\nUsage of CLAC SFname DFname ");
        }
        
    }
}


/*
 OUTPUT :

 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>javac P70_CLA_copytofile.java

E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P70_CLA_copytofile sample_source.txt sample_destination.txt

-------------------------------------------------------------------------------------------------------------------
sample_source.txt
-------------------------------------------------------------------------------------------------------------------
HEllo 
This is a sample sourse file To show Use of 
CommandLineArguments(CLA) to Copy content of a file.
-------------------------------------------------------------------------------------------------------------------
 */