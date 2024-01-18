//PROGRAM : Exception handling ->1)try,2)catch,3)finally.
//finally : The statements written inside "finally" block run irrespective of whether an exception is there or not.

import java.io.DataInputStream;
import java.io.IOException;

public class P22_exception_finally {
    public static void main(String args[]){
         int a,b,c;
        DataInputStream din = new DataInputStream(System.in);
        String s;
        try{
            System.out.println("\nEnter the first no : ");
            s = din.readLine();
            a = Integer.parseInt(s);
            System.out.println("\nEnter the Second no : ");
            s = din.readLine();
            b = Integer.parseInt(s);
            c = a/b;
            System.out.println("\nC = "+c);
        }
        catch(IOException e1){ //If you are using Scanner this wont work.
            System.out.println("\nUnable to read from io device. "+e1);
        }
        catch(NumberFormatException e2){
            System.out.println("\nInput string not a number "+e2);
        }
        catch(ArithmeticException e3){
            System.out.println("\n. "+e3);
        }
        catch(Exception e4){
            System.out.println("\nUnknown Error "+e4);
        }
        //Finally block
        finally{
            System.out.println("\n I am always here.");
        }
        //System.out.println("\n This is also there "). //If there is a return statement inside "try{}" block this line will not execute.

        //NOTE:[Even if there is a return statement inside "try{}" block, the statement inside the "finally{}" block is executed"].
        //[But if there is a statement "system.exit(0)" inside "try{}" block then,"finally{}" block will not be executed.]

    }
    
}
