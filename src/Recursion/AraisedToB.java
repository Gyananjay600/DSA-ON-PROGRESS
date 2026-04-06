package Recursion;

import java.util.Scanner;

public class AraisedToB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base : ");
        int a = input.nextInt();
        System.out.println("Enter power : ");
        int b = input.nextInt();
        System.out.println( power(a,b));
    }

        private static int power(int a, int b) { // TC = O(log b)
        if (b == 0) return 1;
        int call = power(a,b/2);
        if (b%2 == 0) return call*call;
        else return call*call*a;
    }

//    private static int power(int a, int b) { // TC = O(b)
//        if (b == 0)
//            return 1;
//        return  a * power(a, b - 1);
//
//    }
}
