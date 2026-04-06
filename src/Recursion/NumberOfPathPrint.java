package Recursion;

import java.util.Scanner;

public class NumberOfPathPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int n = sc.nextInt();
        System.out.print("Enter column : ");
        int m = sc.nextInt();
        System.out.println(paths(1, 1, m, n, ""));
    }

    private static int paths(int row, int col, int m, int n, String s) {

        if (row == n && col == m) {
            System.out.println(s);
            return 1;
        }

        if (row > n || col > m) return 0;

        return paths(row, col + 1, m, n, s + "R") + paths(row + 1, col, m, n, s + "D");

    }
}




