package Methods;

import java.util.Scanner;

public class MaxOf3Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Nested ternary
        int max = (a > b) ? (a > c ? a : c ) : (b > c ? b : c);
        System.out.println(max);
    }
}
