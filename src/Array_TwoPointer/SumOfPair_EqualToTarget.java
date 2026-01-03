package Array_TwoPointer;

import java.util.Scanner;

public class SumOfPair_EqualToTarget {

    static boolean twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target)
                return true;
            else if (sum < target)
                left++;
            else
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int target = sc.nextInt();

        if (twoSum(arr, target)) {
            System.out.println("Pair found matching the target value.");
        } else {
            System.out.println("No pair found matching the target value.");
        }
    }
}
