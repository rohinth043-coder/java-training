
public class StringCompare {
    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        String str1 = "";
        String str2 = "";

        // Process first string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '#') {
                str1 += ch;
            } else if (str1.length() > 0) {
                str1 = str1.substring(0, str1.length() - 1);
            }
        }

        // Process second string
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch != '#') {
                str2 += ch;
            } else if (str2.length() > 0) {
                str2 = str2.substring(0, str2.length() - 1);
            }
        }

        if (str1.equals(str2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}