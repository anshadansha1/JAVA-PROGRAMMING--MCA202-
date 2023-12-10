//PROGRAM 3_2 : WAP to display numbers from m to n using single while loop.
import java.io.*;

public class P3_2_disp_m_to_n{
    public static void disp(int m,int n){
        int i=m;
        System.out.println("\nDisplaying numbers from "+m+" To "+n+" : \n");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        din = new DataInputStream(System.in);
        int m,n;
        try{
            System.out.println("\nEnter value for m : ");
            m = Integer.parseInt(din.readLine());
            System.out.println("\nEnter value for n : ");
            n= Integer.parseInt(din.readLine());
            disp(m,n);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }

}