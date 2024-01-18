//PROGRAM : Exception handling ->1)try,2)catch

import java.io.*;



public class P21_exception_handling {
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

    }
}

/*
 OUTPUT : 
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P21_exception_handling

Enter the first no :
6

Enter the Second no :
3

C = 2
--------------------------------------
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P21_exception_handling

Enter the first no :
asd

Input string not a number java.lang.NumberFormatException: For input string: "asd"
 */