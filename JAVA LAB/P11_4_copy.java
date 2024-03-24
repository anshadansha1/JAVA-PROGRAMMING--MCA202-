
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11_4_copy {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the input file name: ");
            String inputFileName = reader.readLine();

            System.out.print("Enter the output file name: ");
            String outputFileName = reader.readLine();

            createNumberedCopy(inputFileName, outputFileName);
        } catch (IOException e) {
            System.err.println("An error occurred while reading user input: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void createNumberedCopy(String inputFileName, String outputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + ": " + line);
                writer.newLine();
                lineNumber++;
            }

            System.out.println("Numbered copy created successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while creating numbered copy: " + e.getMessage());
            e.printStackTrace();
        }
    }
}