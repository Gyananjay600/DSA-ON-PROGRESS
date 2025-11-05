package Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of volume :");
        double r = sc.nextDouble();
        double volume = 4.0 / 3.0 * 3.141592 * r * r * r;
        System.out.println("Volume of sphere is :"+ volume);
    }
}
