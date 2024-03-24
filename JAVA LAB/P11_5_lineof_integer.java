
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11_5_lineof_integer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a line of integers
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = scanner.nextLine();

        // StringTokenizer to tokenize the input line
        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        int sum = 0;

        // Iterate through tokens and calculate sum
        while (tokenizer.hasMoreTokens()) {
            // Convert token to integer and add to sum
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println("Integer: " + number);
            sum += number;
        }

        // Display the sum of all integers
        System.out.println("Sum of all integers: " + sum);

        scanner.close();
    }
}