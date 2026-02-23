package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows number:");
        int n = sc.nextInt();
        System.out.print("Enter cols number:");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) { // rows
            for (int j = 1; j <= n; j++) { // cols
                if (i == 1 || i == m || j == 1 || j == n) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
