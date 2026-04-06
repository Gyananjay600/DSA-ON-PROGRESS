package Recursion;

import java.util.Scanner;


public class DecreasingToIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        print(num);
    }

    private static void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        print(num - 1);
        if (num != 1) System.out.print(num + " ");
    }
}
