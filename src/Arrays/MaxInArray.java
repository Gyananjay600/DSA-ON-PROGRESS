package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {143,11,23,34,5,6,45,67,-89,-76,123,3,4,5,43,0};
        int max = Integer.MIN_VALUE;
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max)  max = arr[i];
        }
        System.out.println(max);

    }
}
