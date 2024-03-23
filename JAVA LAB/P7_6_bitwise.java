
//PROGRAM 7_6 : Write a java program to demonstrate Bitwise logical operators, left shift and right shift operators. 
import java.util.*;

public class P7_6_bitwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("\nEnter the first integer : ");//Eg:12 -> Binary: 1100
            int num1 = s.nextInt();
            System.out.println("\nEnter the second integer : ");//Eg:7 -> Binary: 0111
            int num2 = s.nextInt();
            // Bitwise AND operator (&)
            int resultAnd = num1 & num2; // Result: 4 (Binary: 0100)
            System.out.println("Bitwise AND of " + num1 + " and " + num2 + " is: " + resultAnd);

            // Bitwise OR operator (|)
            int resultOr = num1 | num2; // Result: 15 (Binary: 1111)
            System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is: " + resultOr);

            // Bitwise XOR operator (^)
            int resultXor = num1 ^ num2; // Result: 11 (Binary: 1011)
            System.out.println("Bitwise XOR of " + num1 + " and " + num2 + " is: " + resultXor);

            // Bitwise NOT operator (~)
            int resultNotNum1 = ~num1; // Result: -13 (Binary: 11111111 11111111 11111111 11110011)
            System.out.println("Bitwise NOT of " + num1 + " is: " + resultNotNum1);

            // Left shift operator (<<)
            int resultLeftShift = num1 << 2; // Result: 48 (Binary: 110000)
            System.out.println("Left shift of " + num1 + " by 2 is: " + resultLeftShift);

            // Right shift operator (>>)
            int resultRightShift = num2 >> 2; // Result: 1 (Binary: 0001)
            System.out.println("Right shift of " + num2 + " by 2 is: " + resultRightShift);

        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }
        s.close();
    }
}
