//PROGRAM 3_8 :  WAP to calculate sum of n even numbers (functions with no argument and return type.)
import java.io.*;
public class P3_8_sum_of_evenum {
     //Functions With No argument and with Return type.
     public static int sumOfeven(){
        DataInputStream din;
        din = new DataInputStream(System.in);
        int i,n,sum=0;
        try{
            System.out.println("\nEnter the limit(n) : ");
            n = Integer.parseInt(din.readLine());
            for(i=1;i<=n;i++){
                if(i%2==0){
                    sum=sum+i;
                }
            }
            return sum;
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }    
        return 0;
    }
    public static void main(String[] args){
        System.out.println("Muhammad Anshad P A");
        System.out.println("Sum = "+sumOfeven());
        
    }
}
