package Recursion;
// checking possible unique paths (right & Down)
import java.util.Scanner;

public class NumberOfPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int m = sc.nextInt();
        System.out.println("Enter second number :");
        int n = sc.nextInt();
        System.out.println(paths(m,n));
    }

    private static int paths(int m, int n) {
        return helper(1,1,m,n);
    }

    private static int helper(int row, int col, int m, int n) {
        if (row == m && col == n) { // one correct answer
            return 1;
        }
        if (row > m || col > n) { // wrong path
            return 0;
        }
        int rightWays = helper(row,col+1, m, n);
        int downWays = helper(row+1, col, m, n);
        return rightWays + downWays;
    }
}
