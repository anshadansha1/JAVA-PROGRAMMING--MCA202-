/*PROGRAM 4_1 :  WAP with nested functions to find the maximum of three numbers.
 Function1 should take in two arguments and find the maximum.
  Function2 should take in the third number and the maximum from function1 to find the maximum.)*/
import java.io.*;
public class P4_1_nested_function {

    public static int findMax(int num1,int num2){
        return (num1>num2)?num1:num2;
    }
    //NESTED FUNCTION
    public static int findMax(int num1,int num2,int num3){
        return findMax(findMax(num1, num2),num3);

    }
    public static void main(String[] args){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        din = new DataInputStream(System.in);
        int num1,num2,num3;
        try {
            System.out.println("\nEnter the first number : ");
            num1 = Integer.parseInt(din.readLine());
            System.out.println("\nEnter the second number : ");
            num2 = Integer.parseInt(din.readLine());
            System.out.println("\nEnter the third number : ");
            num3 = Integer.parseInt(din.readLine());

            System.out.println("\nMaximum amoung three is : "+findMax(num1, num2,num3));
        } 
        catch (Exception e) {
            System.out.println("\nError : "+e);
        }
        
    }
}
