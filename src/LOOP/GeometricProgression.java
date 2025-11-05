package LOOP;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        // 1 2 4 8 16 ...
        int a = 1 , r = 2;
        // where a is the first term and r is the common ratio.
        for(int i = 1; i <= n;i++){
            System.out.println(a+" ");
            a *= r;
        }
    }
}
