//PROGRAM 3_3 : WAP to find the sum of the series 1+(1+2)+(1+2+3)+.....+(1+2+3+…+n) using a single while loop.
import java.io.*;

public class P3_3_sum_of_series {
    public static void sumOfseries(int n){
        int i=1,currsum=0,sum=0;
        while(i<=n){
            currsum=currsum+i;
            sum=sum+currsum;
            i++;
        }
        System.out.println("Sum of series is : "+sum);
    }
    public static void main(String[] args){
        System.out.println("Muhammad Anshad P A");
        System.out.println("\nPROGRAM 3_3 : WAP to find the sum of the series 1+(1+2)+(1+2+3)+.....+(1+2+3+…+n) using a single while loop.");
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter the limit(n) : ");
            int n =Integer.parseInt(din.readLine()); 
            sumOfseries(n);

        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}
