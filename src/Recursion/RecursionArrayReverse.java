package Recursion;

public class RecursionArrayReverse {
    public static void main(String[] args) {
        int[] arr = {12, 13, 23, 45, 65, 76, 2, 90};
        reverse(0,arr.length-1,arr);
        print(0, arr);
    }

    private static void reverse(int i, int j, int[] arr) {
        if (i>=j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(i+1, j-1, arr);
    }


    // reverse order print (tail recursion) call ke baad kaam.
    public static void print(int i, int[] arr) {
        if (i == arr.length) return;
        print(i + 1, arr);
        System.out.print(arr[i] + " ");

    }
}
