package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.println(hcf(a,b));
    }

    private static int hcf(int a, int b) {
        if (a == 0)
            return b;
        return hcf(b%a,a);
    }
}
