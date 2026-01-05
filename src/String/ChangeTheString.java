package String;

import java.util.Scanner;

public class ChangeTheString {
    String modify(String s){
        char ch = s.charAt(0);
        if (ch >= 97){ // ch >= 97 && ch <= 122 no need to write
            return s.toLowerCase();
        }
        else return s.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        ChangeTheString obj = new ChangeTheString();
        String result = obj.modify(s);

        System.out.println("Modified String : " + result);
    }
}
