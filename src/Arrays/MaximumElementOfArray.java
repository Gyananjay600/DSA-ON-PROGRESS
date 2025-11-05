package Arrays;

import java.util.Scanner;

public class MaximumElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n]; // 7 size ka array ban geya
        System.out.print("Enter array elements:");
        //input
        for (int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //output
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
           if(arr[i]>max){
               max = arr[i];
           }

        }
        System.out.print(max);
    }
}
