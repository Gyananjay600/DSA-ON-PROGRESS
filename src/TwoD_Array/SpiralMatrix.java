package TwoD_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {

    // Method to return spiral order traversal
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int rows = arr.length;
        int cols = arr[0].length;

        int sr = 0, er = rows - 1;
        int sc = 0, ec = cols - 1;

        while (ans.size() < rows * cols) {

            // 1️⃣ Start Row
            for (int j = sc; j <= ec; j++)
                ans.add(arr[sr][j]);
            sr++;

            if (ans.size() >= rows * cols) break;

            // 2️⃣ End Column
            for (int i = sr; i <= er; i++)
                ans.add(arr[i][ec]);
            ec--;

            if (ans.size() >= rows * cols) break;

            // 3️⃣ End Row (Reverse)
            for (int j = ec; j >= sc; j--)
                ans.add(arr[er][j]);
            er--;

            if (ans.size() >= rows * cols) break;

            // 4️⃣ Start Column (Reverse)
            for (int i = er; i >= sr; i--)
                ans.add(arr[i][sc]);
            sc++;
        }

        return ans;
    }

    // Main method (User Input)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        SpiralMatrix obj = new SpiralMatrix();
        ArrayList<Integer> result = obj.spirallyTraverse(matrix);

        System.out.println("\nSpiral Traversal:");
        System.out.println(result);

        sc.close();
    }
}
