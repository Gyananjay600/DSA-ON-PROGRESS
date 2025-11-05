package LOOP;

import java.util.Scanner;

public class A_raise_to_power_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base:");
        int a = sc.nextInt();
        System.out.println("Enter power of the base:");
        int b = sc.nextInt();
        int ans = 1;
        for(int i =1;i<=b;i++){
            if(a==1) break;
            ans *= a;
            if(a==0) break;

        }
        if(a==0 && b==0) System.out.println("Invalid");
        System.out.println(a+ "raised to the power" + b + "is" + ans);
    }
}
