//PROGRAM 3_7 :  WAP to calculate sum of digits of a number (functions with argument and return type.)
import java.io.*;
public class P3_7_sum_of_digits {
    //Functions With argument and with Return type.
    public static int sumOfdigits(int num){
        int digit,sum=0;
        while(num!=0){
            digit = num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter the number : ");
            int num = Integer.parseInt(din.readLine());
            System.out.println("Sum of digits is : "+sumOfdigits(num));
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }    
    }
}
