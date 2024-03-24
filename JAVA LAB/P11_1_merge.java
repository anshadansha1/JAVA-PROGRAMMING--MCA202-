/*PROGRAM 11_1 :  */

import java.io.*;

public class P11_1_merge {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the first input file name: ");
            String inputFile1 = reader.readLine();

            System.out.print("Enter the second input file name: ");
            String inputFile2 = reader.readLine();

            System.out.print("Enter the output file name: ");
            String outputFile = reader.readLine();

            mergeFiles(inputFile1, inputFile2, outputFile);
        } catch (IOException e) {
            System.err.println("An error occurred while reading user input: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void mergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(new File(inputFile1)));
             BufferedReader reader2 = new BufferedReader(new FileReader(new File(inputFile2)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outputFile)))) {

            String line;
            
            // Merge data from the first input file
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Merge data from the second input file
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while merging files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}