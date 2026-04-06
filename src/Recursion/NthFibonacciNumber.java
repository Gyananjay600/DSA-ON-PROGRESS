package Recursion;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.println("Fibonacci number is : "+fibo(n));
    }

    private static int fibo(int n) {
        if (n == 0 || n == 1) return n;
        return fibo(n-1) + fibo(n-2);
    }

}
