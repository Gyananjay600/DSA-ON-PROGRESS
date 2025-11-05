package Arrays;

import java.util.Scanner;

public class RotateArray {

    // Function to reverse a portion of the array
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Function to rotate array by d positions
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // handle if d > n
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Main method to take input and show output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations (d): ");
        int d = sc.nextInt();

        rotateArr(arr, d);

        System.out.println("Array after rotation:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
