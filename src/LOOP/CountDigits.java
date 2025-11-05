package LOOP;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        if(n==0) count = 1; // this line if the number is only 0 it counts as 1
        while(n!=0){
            n /= 10;
            count++;
        }
        System.out.println(count);

    }
}
