package Recursion;

public class MethodCallingItSelf {
    static int n = 0;
    public static void main(String[] args) {
        gyana();
    }

    private static void gyana() {
        if (n == 5) {
            return; // base case
        }
        System.out.println("Gyananjay");
        n++;
        gyana(); // call
    }
}
