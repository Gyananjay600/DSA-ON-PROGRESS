package String_2;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        System.out.println("Initial string :"+sb);
        // append() - add something at the end without creating an object

//        sb.append(" is awesome");
//        System.out.println("After apend of string : "+sb);
//        sb.append(" good boy");
//        System.out.println("next append : "+ sb);
        for (int i=1;i<=13;i++){
            sb.append(i);
            System.out.println(sb + " " + sb.length() + " "+ sb.capacity());
        }
        System.out.println();

        //insert() - Put something at a specific position (index) inside the string
        // let putting index number 0
        sb.insert(0," Java ");
        System.out.println("After insert : "+sb);
        // length() - How many characters are present
        System.out.println("Length of the string is : " + sb.length());
        //capacity() - returns the total allocated space for characters in a StringBuilder, not the number of characters stored.
        // Java internally allocates 16 characters by default
        StringBuilder s = new StringBuilder("");
        System.out.println("By default capacity is : " + s.capacity()); // by default capacity of string
        System.out.println("capacity for sb object : "+ sb.capacity()); // ans - 52 bcz by defaultt 16 and character are 36 = 36+16 = 52
        // setCharAt() - modify single character
        StringBuilder a = new StringBuilder("Harsh");
        a.setCharAt(0,'M');
        System.out.println(a);
        a.reverse();
        System.out.println(a);
    }
}
