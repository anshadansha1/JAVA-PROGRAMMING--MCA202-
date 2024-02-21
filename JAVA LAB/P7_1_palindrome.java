// PROGRAM P7_1: Write a Java program to check whether a string is palindrome or not.

import java.util.*;

public class P7_1_palindrome {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i;
        boolean flag = true;
        try {
            System.out.println("\nEnter a string to check for palindrome : ");
            String str = s.nextLine();
            str = str.toLowerCase(); // coverts entered string to lowercase

            // Comparing one character at a time till middle of the string is reached
            for (i = 0; i < (str.length() / 2); i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("\nstring " + str + " is Palindrome.");
            } else {
                System.out.println("\nstring " + str + " is Not Palindrome.");
            }

        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }
    }
}

/*OUTPUT :
 E:\MUHAMMAD ANSHAD P A\JAVA\JAVA LAB>java P7_1_palindrome

Enter a string to check for palindrome :
anshad

string anshad is Not Palindrome.

E:\MUHAMMAD ANSHAD P A\JAVA\JAVA LAB>java P7_1_palindrome

Enter a string to check for palindrome :
malayalam

string malayalam is Palindrome.
 */