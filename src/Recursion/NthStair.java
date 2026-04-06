package Recursion;

import java.util.Scanner;

public class NthStair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Ways of reaching destination stair : "+countWays(n));
    }

    private static int countWays(int n) {
        if (n <= 2) return n;
        return countWays(n-1) + countWays(n-2);
    }
}
