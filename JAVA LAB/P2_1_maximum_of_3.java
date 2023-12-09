//PROGRAM 2_1: WAP to read three numbers and the maximum.
import java.io.*;

public class P2_1_maximum_of_3{
    public static void main(String args[]){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        int a,b,c;
        String s;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter the first number : ");
            s=din.readLine();
            a=Integer.parseInt(s);
            System.out.println("\nEnter second number : ");
            s=din.readLine();
            b=Integer.parseInt(s);
            System.out.println("\nEnter third number : ");
            s=din.readLine();
            c=Integer.parseInt(s);
            if(a>b && a>c){
                System.out.println("Maximum number = "+a);
            }
            else if(b>a && b>c){
                System.out.println("Maximum number = "+b);
            }
            else{
                System.out.println("Maximum number = "+c);
            }        
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        
    }
}