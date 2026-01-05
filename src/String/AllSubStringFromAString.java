package String;

import java.util.Scanner;

public class AllSubStringFromAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" "); // i to j
            }
        }
    }
}
