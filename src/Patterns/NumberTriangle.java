package Patterns;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number:");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){ // rows
            for(int j = 1;j<=i;j++){ // cols
                System.out.print(j + " ");
//                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
