/*PROGRAM 3_1 : WAP with two functions to check for an integer palindrome.
(Function1 should reverse the integer. Function2 should return 1,if it is a palindrome or else 0.)*/

import java.io.*;

public class P3_1_integer_palindrome{
    
    //function to reverse the number: 
    public static int reverseNum(int num){
        int digit,rev=0;
        while(num!=0){
            digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        return rev; //returning reversed number .
    }

    //function to check given number is palindrome or not:
    public static int palindromeChecker(int num){
        int rev=reverseNum(num);
        if(num == rev){ 
            return 1; 
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter an integer to check for palindrome:");
            int num=Integer.parseInt(din.readLine());
            
            if(palindromeChecker(num)==1){
                System.out.println(num+" is a Palindrome.");
            }
            else{
                System.out.println(num+" is NOT a Palindrome.");
            }

        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
}