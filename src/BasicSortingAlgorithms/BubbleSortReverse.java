package BasicSortingAlgorithms;

public class BubbleSortReverse {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);

        // Bubble Sort: Putting i-th smallest element at correct place
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            // Inner loop runs from end to the i-th position
            for (int j = n - 1; j > i; j--) {
                // If the current element is smaller than the previous one, swap
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swaps++;
                }
            }
            // If no swaps, array is already sorted
            if (swaps == 0) break;
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}