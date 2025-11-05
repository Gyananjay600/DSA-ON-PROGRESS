package Basics;

import java.util.Scanner;

public class Volume_Total_Sf_area_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the base:");
        double r = sc.nextDouble();
        System.out.print("Enter the height of the cylinder:");
        double h = sc.nextDouble();
        double TSA = 2 * 3.141592 * r * (h+r);
        System.out.println("Total Surface area of cylinder is :"+TSA);
    }
}
