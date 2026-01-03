package TwoD_Array;

import java.util.Scanner;

public class MultiplyMatrices {

    // Method to multiply two matrices
    public static void multiply(int a[][], int b[][], int c[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (n x n): ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        multiply(a, b, c, n);

        // Display result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
