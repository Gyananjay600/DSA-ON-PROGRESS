package Basics;

public class ASCIIValues {
    public static void main(String[] args) {
        char ch = 'A';
        int a = ch;//implicit type casting
        System.out.println(a);
        char ch2 = '*';
        System.out.println((int)ch2);
        char ch3 = 'k';
        System.out.println(ch3+0);

        System.out.println('a'+'z'); // char + char gives int

        int x = 81;
        System.out.println((char)x);

        // if the ascii value out of range
        int y = 13442;
        char c = (char)y;
        System.out.println(c);

        char r = ' ';
        System.out.println(r+0);

    }
}
