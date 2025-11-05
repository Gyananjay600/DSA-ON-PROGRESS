package Conditionals;

import java.util.Scanner;

public class IntegerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double n = sc.nextDouble();
        int x = (int)n;
        if (n == (double)x) System.out.println("Integer");
        else System.out.println("Not an Integer");
    }
}
