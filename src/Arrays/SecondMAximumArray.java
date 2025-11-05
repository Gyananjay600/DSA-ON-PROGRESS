package Arrays;

import java.util.Scanner;

public class SecondMAximumArray {

    // ---------- Method 1: Mayank Method ----------
    public int getSecondLargest1(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) arr[i] = -1;
        }
        int smax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax) smax = arr[i];
        }
        return smax;
    }

    // ---------- Method 2 ----------
    public int getSecondLargest2(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int smax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        return smax;
    }

    // ---------- Method 3 ----------
    public int getSecondLargest3(int[] arr) {
        int max = -1, smax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        return smax;
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecondMAximumArray obj = new SecondMAximumArray();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest (Method 1): " + obj.getSecondLargest1(arr.clone()));
        System.out.println("Second Largest (Method 2): " + obj.getSecondLargest2(arr.clone()));
        System.out.println("Second Largest (Method 3): " + obj.getSecondLargest3(arr.clone()));


    }
}
