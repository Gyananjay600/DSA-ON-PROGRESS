package LOOP;

import java.util.Scanner;

public class FactorsOfNumber {
    // whole numbers that divide a given number(1 and the number itself are always factors)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
