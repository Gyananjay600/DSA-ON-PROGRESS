package String_2;

public class EqualsAndNew {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 10;
//        System.out.println(x == y); // true

//        String x = "Gyana";
//        String y = "Gyana";
//        System.out.println(x == y); // true

        String x = "Gyana";
        String y = new String("Gyana");
        System.out.println(x == y); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.compareTo(y)); // 0

    }
}
