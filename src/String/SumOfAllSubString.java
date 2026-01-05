package String;

import java.util.Scanner;

// Print all substrings first, then sum of all substrings
public class SumOfAllSubString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string number : ");
        String s = sc.next();   // input as String

        int sum = 0;

        System.out.println("\nAll substrings:");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);
                System.out.print(sub + "  ");

                sum += Integer.parseInt(sub);
            }
            System.out.println();
        }
        System.out.println("\nSum of all substrings = " + sum);
    }
}
