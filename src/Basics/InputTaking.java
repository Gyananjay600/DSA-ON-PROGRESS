package Basics;

import java.util.Scanner;

public class InputTaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number please :");
        int num = sc.nextInt();
        System.out.println(num * num);
    }
}
