package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //ptr/100
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount which you invested :");
        int p = sc.nextInt();
        System.out.print("Enter the rate of interest per year(in percentage) :");
        double r = sc.nextDouble();
        System.out.print("Time period(in years):");
        double t = sc.nextDouble();
        double SI = p * t * r / 100;
        double Total_amount = p + SI;
        System.out.println("Simple Interest:"+SI);
        System.out.println("Total amount:"+Total_amount);
    }
}
