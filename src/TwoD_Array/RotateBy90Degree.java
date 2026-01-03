package TwoD_Array;

import java.util.Scanner;

public class RotateBy90Degree {

    // Method to rotate matrix by 90 degrees anti-clockwise
    public void rotateMatrix(int[][] arr) {

        // 1️⃣ Transpose the matrix
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // 2️⃣ Reverse each column
        for (int col = 0; col < arr[0].length; col++) {
            int i = 0, j = arr.length - 1;
            while (i < j) {
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }
        }
    }

    // Method to print matrix
    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main method (User Input)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns (n): ");
        int m = sc.nextInt();

        // Works for square matrix only
        if (n != m) {
            System.out.println("Rotation by 90° is possible only for square matrices.");
            return;
        }

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        RotateBy90Degree obj = new RotateBy90Degree();

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        obj.rotateMatrix(matrix);

        System.out.println("\nMatrix after 90° Anti-Clockwise Rotation:");
        printMatrix(matrix);
    }
}
