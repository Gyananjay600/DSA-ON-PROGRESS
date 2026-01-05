package String;

import java.util.Scanner;

public class StringDatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Gyananjay Sahoo";
        System.out.println(s);
        String s2 = "Pabitra Sahoo";
        System.out.println(s2);
//        String Concatenation
        System.out.println(s+s2);
//        System.out.println("Enter name : ");
//        String str = sc.next(); // it takes input without spaces
//        System.out.println(str);
        System.out.println("Enter name again : ");
        String s3 = sc.nextLine(); // it takes input with spaces and without spaces
        System.out.println(s3);
    }
}
