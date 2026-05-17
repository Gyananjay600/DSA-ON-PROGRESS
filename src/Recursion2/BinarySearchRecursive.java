package Recursion2;

public class BinarySearchRecursive {
    public static void main(String[] args) {
//        public int search(int[] arr, int target){
//            return bs(0,arr.length-1,target,arr);
//        }
    }

    private static int bs(int low, int high, int target, int[] arr) {
        int mid = (low+high)/2;
        if (arr[mid]<target) return bs(low, mid-1, target, arr);
        return bs(mid+1, high, target, arr);
    }
}
