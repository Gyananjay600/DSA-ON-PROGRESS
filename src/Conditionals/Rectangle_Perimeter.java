package Conditionals;

import java.util.Scanner;

public class Rectangle_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("Area of rectangle is: " + area);

        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is: " + perimeter);

        if (area > perimeter) {
            System.out.println("Area of rectangle is greater than its perimeter.");
        } else {
            System.out.println("Area of rectangle is not greater than its perimeter.");
        }

        sc.close(); // good practice
    }
}
