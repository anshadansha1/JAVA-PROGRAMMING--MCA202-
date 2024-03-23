//PROGRAM P7_3: Write a Java program to find the transpose of a matrix. 
import java.util.Scanner;

public class P7_3_transpose_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transposeMatrix = findTranspose(matrix);

        System.out.println("Transpose of the Matrix:");
        printMatrix(transposeMatrix);

        scanner.close();
    }

    // Function to find the transpose of a matrix
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
