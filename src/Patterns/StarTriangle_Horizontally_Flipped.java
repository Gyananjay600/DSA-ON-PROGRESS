package Patterns;

import java.util.Scanner;

public class StarTriangle_Horizontally_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= n + 1 - i; j++) { // cols
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
