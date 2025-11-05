package Conditionals;

import java.util.Scanner;

public class CheckPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Integer:");
        int n = sc.nextInt();
        if (n <= 0) System.out.println("please enter a positive number!");
        else if (n % 5 == 0) System.out.println(n +  " is divisible by 5.");
        else System.out.println(n + "Not divisible by 5.");
    }
}
