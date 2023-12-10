//PROGRAM 3_5 : WAP to find the sum of 1+(2/2!)+(3/3!)+(4/4!)+....+(n/n!) using a single for loop.
import java.io.*;
public class P3_4_second_sum_of {

    public static void sumOfseries2(int n){
        int i;
        double sum=0,fact=1;
        for(i=1;i<=n;i++){
                fact = fact*i; //finding factorial
                sum = sum + (i/fact); //dividing by factorial
            }
            System.out.println("\nSum of series is = "+sum);
    }
    public static void main(String[] args) {
        System.out.println("\nMuhammad Anshad P A");
        System.out.println("\nPROGRAM 3_5 :WAP to find the sum of 1+(2/2!)+(3/3!)+(4/4!)+....+(n/n!) using a single for loop.");
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter the value of n : ");
            int n = Integer.parseInt(din.readLine());
            sumOfseries2(n);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}


