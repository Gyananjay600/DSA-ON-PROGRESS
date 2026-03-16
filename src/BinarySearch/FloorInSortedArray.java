package BinarySearch;

public class FloorInSortedArray {
    public int findFloor(int[] arr, int x) {
        int ans = -1, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;

        }
        return ans;

    }
}
