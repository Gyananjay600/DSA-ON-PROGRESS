package Patterns;

import java.util.Scanner;

public class NumberTriangle_Vertically_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        //Method:2 (Two loops inside main loops)

        for(int i = 1; i<=n; i++){ // lines

//            for(int j=n ;j>i;j--){ // spaces : another method
//                System.out.print("  ");
//            }
            for(int j=1 ;j<=n-i;j++){ // spaces
                System.out.print("  ");
            }

            for(int j=1 ;j<=i;j++){ // stars
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
