package Conditionals;

import java.util.Scanner;

public class AbsoluteInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        if (n < 0) n = -n;
        System.out.println("Absolute Value:"+n);


//        if(n >= 0) System.out.println("Absolute value of number is:" +n);
//        else System.out.println("Absolute value of number is :"+ (-n));
    }
}
