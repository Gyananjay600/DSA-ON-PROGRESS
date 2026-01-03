package TwoD_Array;

import java.util.Scanner;

public class SearchInRowColSortedMatrix {

    // Staircase search method
    public static boolean matSearch(int arr[][], int target) {
        int m = arr.length;
        int n = arr[0].length;

        int i = 0, j = n - 1;

        while (i < m && j >= 0) {
            if (arr[i][j] > target) {
                j--;        // move left
            } else if (arr[i][j] < target) {
                i++;        // move down
            } else {
                return true; // element found
            }
        }
        return false; // not found
    }

    // Main method (User Input)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter matrix elements (row-wise & column-wise sorted):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        boolean found = matSearch(arr, target);

        if (found) {
            System.out.println("Element FOUND in the matrix.");
        } else {
            System.out.println("Element NOT FOUND in the matrix.");
        }
    }
}
