package Basics;

import java.util.Scanner;

public class CalculateAreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius here :");
        double r = sc.nextDouble();
        double area = 3.141592 * r * r;
        System.out.println("The area of circle is :" + area);
    }
}
