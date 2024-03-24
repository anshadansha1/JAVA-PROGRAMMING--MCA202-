
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P11_3_realnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            double sum = 0;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            while (fileScanner.hasNextDouble()) {
                double num = fileScanner.nextDouble();
                sum += num;
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
            fileScanner.close();

            int count = 0;
            double range = max - min;

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Average: " + (sum / count));
            System.out.println("Range: " + range);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
