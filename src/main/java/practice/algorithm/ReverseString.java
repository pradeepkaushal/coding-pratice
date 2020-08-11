package practice.algorithm;

public class ReverseString {

    public static void main(String[] args) {

        String input = "HELLO";
        char[] chars = input.toCharArray();
        reverseString(chars);
    }

    public static void reverseString(char[] s) {
        reverse(s, 0);
    }

    public static void reverse(char[] s, int index) {
        if (s == null || index >= s.length) {
            return;
        }
        reverse(s, index + 1);
        System.out.println(s[index]);
    }
}
