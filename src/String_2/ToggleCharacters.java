package String_2;

public class ToggleCharacters {

    public String toggleCase(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            // Uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i, (char) (ch + 32));
            }
            // Lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i, (char) (ch - 32));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ToggleCharacters obj = new ToggleCharacters();

        String input = "HeLLo WoRLD";
        String result = obj.toggleCase(input);

        System.out.println("Original String : " + input);
        System.out.println("Toggled String  : " + result);
    }
}
