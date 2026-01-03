package TwoD_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    // Method to return nth row of Pascal's Triangle
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        n--;  // convert to 0-based index
        ArrayList<Integer> ans = new ArrayList<>();
        int x = 1;

        for (int r = 0; r <= n; r++) {
            ans.add(x);
            x = x * (n - r) / (r + 1);
        }
        return ans;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int n = sc.nextInt();

        PascalTriangle pt = new PascalTriangle();
        ArrayList<Integer> result = pt.nthRowOfPascalTriangle(n);

        System.out.println("Pascal Triangle Row " + n + ":");
        System.out.println(result);

        sc.close();
    }
}


//    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
//        n--;
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for(int i=0;i<=n;i++){
//            ArrayList<Integer> a = new ArrayList<>();
//            list.add(a);
//            for(int j=0;j<=i;j++){
//                a.add(0);
//                if(j==0 || j==i) list.get(i).set(j,1);
//                else list.get(i).set(j,list.get(i-1).get(j)+list.get(i-1).get(j-1)); // list[i][j] =  list[i-1][j] +  list[i-1][j-1]
//            }
//        }
//        return list.get(n);
//    }
