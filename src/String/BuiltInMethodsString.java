package String;

public class BuiltInMethodsString {
    public static void main(String[] args) {
//        String s = "GyananjaySahoo";
//       s.toLowerCase(); // useless
//        System.out.println(s.toLowerCase());
//     s.toUpperCase(); // useless
//        System.out.println(s.toUpperCase());
        // concatenate
        String s1 = "Radha";
        String s2 = "Kanha";
//        String s = s1 + s2;
//        System.out.println(s);
        System.out.println(s1.concat(s2));

        System.out.println(s1.startsWith("Radha")); // it gives boolean value true / false
        System.out.println(s2.endsWith("Ha")); // also it is case-sensitive
        System.out.println(s1.contains("a"));
        System.out.println(s1.indexOf("a")); // it gives first index
        System.out.println(s2.indexOf("z")); //not in the string it gives -1
        System.out.println(s1.lastIndexOf("a")); // it gives the particular letter last index number where it ends

        String s3 = "Pabitra";
        String s4 = "Gyananjay";
        System.out.println(s3.compareTo(s4)); // this gives ascii value difference of 1st letter of strings
        System.out.println('P' - 'G');

        String b1 = "Himani";
        String b2 = "Himanshu";
        System.out.println(b1.compareTo(b2)); // i - s

        String c1 = "Gyana";
        String c2 = "Gyananjay";
        System.out.println(c1.compareTo(c2)); // here gives the value using length Gyana = 5 and Gyananjay = 9 so it gives -4

    }
}
