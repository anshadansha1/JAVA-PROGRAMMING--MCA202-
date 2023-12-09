//PROGRAM 1_2: WAP to display two numbers received as command line argument, and print its product.
import java.io.*;

public class P1_2_product_of_two_no{
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
            System.out.println("\nEntered two numbers are : "+a+" and "+b);
            System.out.println("\nThe product of given two numbers  = "+(a*b));
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        
    }
}