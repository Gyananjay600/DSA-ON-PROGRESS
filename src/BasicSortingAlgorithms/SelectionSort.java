package BasicSortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 7, 8, 1, 9};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n - 1; i++) {
            int mindx = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[mindx]) mindx = j;
            }
            // swap the i and mindx elements
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
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
