//PROGRAM 4_2 : WAP to find the factorial of n, using recursion.
  import java.io.*;
  public class P4_2_factorial_recc {
    //factorial calculation using recursive method
    public static int calcFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * calcFact(n-1); //Recursive call
        }
    }
    public static void main(String[] args){
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Muhammad Anshad P A");
            System.out.println("\nEnter the limit(n): ");
            int n=Integer.parseInt(din.readLine());
            int fact=calcFact(n);
            System.out.println("\nFactorial of "+n+" is : "+fact);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
  }