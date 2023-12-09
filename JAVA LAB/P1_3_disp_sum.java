//PROGRAM 1_3: WAP to read two numbers and display the output in the form of ‘Sum of 2 and 3 is 5
import java.io.*;

public class P1_3_disp_sum{
    public static void main(String args[]){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        int a,b;
        String s;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter the first number : ");
            s=din.readLine();
            a=Integer.parseInt(s);
            System.out.println("\nEnter second number : ");
            s=din.readLine();
            b=Integer.parseInt(s);
            System.out.println("\nSum of "+a+" and "+b+ " is "+(a+b));
            
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        
    }
}