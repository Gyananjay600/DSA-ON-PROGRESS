package Methods;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Sum of two number is : "+sum(num1,num2));
    }

    private static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
