package Recursion;

import java.util.Scanner;

public class Print1ToN {

    // Best method 3 (tail recursion)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        if (n == 0) return; // base case
        print(n-1); // call
        System.out.print( n +" "); // work
    }


// method 1

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int n = input.nextInt();
//        print(1,n);
//    }
//
//    private static void print(int x,int n) {
//        if (x > n) {
//            return;
//        }
//        System.out.print(x+" ");
//        print(x+1,n);
//    }
}

// method 2

//   static int n;
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        n = input.nextInt();
//        print(1);
//    }
//
//    private static void print(int x) {
//        if (x > n) {
//            return;
//        }
//        System.out.print(x+" ");
//        print(x+1);
//    }
//}
