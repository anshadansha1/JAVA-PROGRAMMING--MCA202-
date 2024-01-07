//PROGRAM 4_3 : WAP to display numbers from n to 1 and vice versa, using recursion.
import java.io.*;
public class P4_3_disp_nto1_rec {

    //function to display from n to 1
    public static void disp_N_to_1(int n){
        if(n>=1){
            System.out.println(n + " ");
            disp_N_to_1(n-1);
        }
    }
    //function to display from 1 to n
    public static void disp_1_to_N(int n){
        if(n>=1){
            disp_1_to_N(n-1);
            System.out.println(n +" ");
        }
    }
    public static void main(String[] args){
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Muhammad Anshad P A");
            System.out.println("\nEnter the limit(n): ");
            int n=Integer.parseInt(din.readLine());

            //Disaplaying numbers from n to 1:
            System.out.println("\nNumbers from "+ n +" to 1 : ");
            disp_N_to_1(n);

            //Displaying numbers from 1 to n:
            System.out.println("\nNumbers from 1 to "+ n + ":");
            disp_1_to_N(n);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}
