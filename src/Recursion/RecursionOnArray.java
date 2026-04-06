package Recursion;

public class RecursionOnArray {
    public static void main(String[] args) {
        int[] arr = {12, 13, 23, 45, 65, 76, 2, 90};
        print(0, arr);
    }

    public static void print(int i, int[] arr) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        print(i + 1, arr);

    }
}
