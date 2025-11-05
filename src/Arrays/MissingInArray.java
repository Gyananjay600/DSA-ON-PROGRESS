package Arrays;

public class MissingInArray {
    public static int missingNum(int[] arr) {
        long n = arr.length + 1;
        long sum1toN = (n * (n + 1) / 2);
        long arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;

        }
        long missing = sum1toN - arraySum;
        return (int) missing;

    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNum(arr));
    }
}

