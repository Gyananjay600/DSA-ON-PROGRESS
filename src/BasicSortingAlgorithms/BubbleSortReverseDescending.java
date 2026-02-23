package BasicSortingAlgorithms;

public class BubbleSortReverseDescending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 8, 1, 9, 3};
        int n = arr.length;
        System.out.print("Before Sorting: ");
        print(arr);

        // Outer loop: n-1 passes
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            // Reverse Inner Loop: j starts from last element
            for (int j = n - 1; j > i; j--) {
                // For Descending: If current element is GREATER than previous, swap it forward
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swaps++;
                }
            }
            // Optimization: If no swapping happened, array is already sorted
            if (swaps == 0) break;
        }

        System.out.print("After Sorting (Descending): ");
        print(arr);
    }

    private static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}