package Arrays;

import java.util.Arrays;

public class BuiltInArrayMethods {
    public static void main(String[] args) {
//        int[] arr = {3,5,76,34,44,7,2,1};
//        Arrays.sort(arr);
//        for (int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        int[] b = new int[5];
        Arrays.fill(b,18);
        for (int i =0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
