package Arrays;

import java.util.Scanner;

public class ForEachLoopArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements:");

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for (int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
