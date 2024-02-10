//PROGRAM 6_3 : WAP to implement a function using call by value to swap two float numbers.
import java.util.*;

public class P6_3_callbyvalue_swap {
    public static void swap(float num1,float num2){
        System.out.println("\nBefore swapping -->>");
        System.out.println("\nFirst number = "+num1);
        System.out.println("\nSecond number = "+num2);

        //swapping
        float temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("\nAfter Swapping -->>");
        System.out.println("\nFirst number = "+num1);
        System.out.println("\nSecond number = "+num2);
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the first float number : ");
            float num1 = s.nextFloat();
            System.out.println("\nEnter the second float number : ");
            float num2 = s.nextFloat();

            swap(num1,num2);
            s.close();
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}
