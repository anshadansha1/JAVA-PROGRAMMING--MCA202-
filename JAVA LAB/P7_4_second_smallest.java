//PROGRAM P7_4: Write a Java program to find the second smallest element in an array. 
import java.util.Scanner;

public class  P7_4_second_smallest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int secondSmallest = findSecondSmallest(array);

        System.out.println("The second smallest element in the array is: " + secondSmallest);

        scanner.close();
    }

    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array size must be at least 2.");
            return Integer.MIN_VALUE;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
            return Integer.MIN_VALUE;
        }

        return secondSmallest;
    }
}
