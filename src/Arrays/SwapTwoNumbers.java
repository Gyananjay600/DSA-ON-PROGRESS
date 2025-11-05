package Arrays;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two value :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a+" "+b);

        a = a+b;
        b = a-b;
        a = a-b;
//        int temp = a;
//        a = b;
//        b = temp;
        System.out.println();
        System.out.print(a+" "+b);
    }
}
