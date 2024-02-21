//PROGRAM P7_2: 	Write a Java program to multiply two matrices  

import java.util.*;

public class P7_2_matrix_multiply {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int row1, col1, row2, col2;
        int i, j;
        try {
            // MATRIX 1
            System.out.println("\nEnter the number of rows of First  matrix :");
            row1 = s.nextInt();
            System.out.println("\nEnter the number of columns of First  matrix :");
            col1 = s.nextInt();

            System.out.println("\nEnter the Elements of First  matrix : ");
            int[][] matrix1 = new int[row1][col1];
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    matrix1[i][j] = s.nextInt();
                }
            }

            // MATRIX 2
            System.out.println("\nEnter the number of rows of Second  matrix :");
            row2 = s.nextInt();
            System.out.println("\nEnter the number of columns of Second  matrix :");
            col2 = s.nextInt();

            System.out.println("\nEnter the Elements of Second  matrix : ");
            int[][] matrix2 = new int[row2][col2];
            for (i = 0; i < row2; i++) {
                for (j = 0; j < col2; j++) {
                    matrix2[i][j] = s.nextInt();
                }
            }

            // no.of columns of First matrix and no.of rows of Second matrix should be same
            // for matrix multiplication posssible.
            if (col1 != row2) {
                System.out.println("\nMatrix multiplication is not possible !");
            } else {
                // RESULT MATRIX
                int[][] result_matrix = multiply_matrix(matrix1, matrix2);

                System.out.println("\nResult Matrix is --->");

                for (i = 0; i < row1; i++) {
                    for (j = 0; j < col2; j++) {
                        System.out.print(result_matrix[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
            }

        } catch (Exception e) {
            System.out.println("\nError : " + e);
        } finally {
            s.close();
        }
    }

    public static int[][] multiply_matrix(int[][] matrix1, int[][] matrix2) {
        int row1, col1, col2;
        int i, j, k;
        row1 = matrix1.length;
        col2 = matrix2[0].length;
        col1 = matrix1[0].length;

        int[][] result = new int[row1][col2];

        // multiplying
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < col1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;

    }
}

/*
 * OUTPUT :
 E:\MUHAMMAD ANSHAD P A\JAVA\JAVA LAB>java P7_2_matrix_multiply

Enter the number of rows of First  matrix :
2

Enter the number of columns of First  matrix :
2

Enter the Elements of First  matrix :
1
2
3
4

Enter the number of rows of Second  matrix :
2

Enter the number of columns of Second  matrix :
2

Enter the Elements of Second  matrix :
4
5
6
7

Result Matrix is --->
16      19

36      43


 */