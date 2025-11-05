package PatternPractice;

import java.util.Scanner;

public class MixedPattern_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){

            // line number 1 : number
            if(i % 3 == 1){
                for(int j=1;j<=i;j++) {
                    System.out.print(i);
                }
            }
            // line number 2 : lowercase
            else if (i%3==2) {
                char ch = (char)('a'+(i-1));
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                }
            }

            //line number 3 : Uppercase
            else {
                char ch = (char)('A'+(i-1));
                        for(int j=1;j<=i;j++){
                            System.out.print(ch);
                        }
            }
            System.out.println();

        }
    }
}
