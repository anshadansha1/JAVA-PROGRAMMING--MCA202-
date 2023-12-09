//PROGRAM 1_4: WAP to accept two numbers from the keyboard and swap them.
import java.io.*;

public class P1_4_swap{
    public static void main(String args[]){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        int a,b,temp;
        String s;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter the first number : ");
            s=din.readLine();
            a=Integer.parseInt(s);
            System.out.println("\nEnter second number : ");
            s=din.readLine();
            b=Integer.parseInt(s);
            System.out.println("\nValues Before swapping:\na = "+a+"\nb = "+b);
            temp=a;
            a=b;
            b=temp;
            System.out.println("\nValues After swapping:\na = "+a+"\nb = "+b);
            
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        
    }
}