package BasicSortingAlgorithms;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 42, 0, 9};
        int n = arr.length;
        System.out.print("Original Array: ");
        print(arr);

        // Bubble Sort logic to move zeros
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                // If current is 0 and next is non-zero, swap them
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            // If no more swaps needed, exit early
            if (swaps == 0) break;
        }

        System.out.print("After Moving Zeros: ");
        print(arr);
    }

    private static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}