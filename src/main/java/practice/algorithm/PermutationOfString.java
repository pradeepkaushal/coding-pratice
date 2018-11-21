package practice.algorithm;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();
            permute(input, 0, input.length());
        }

    }


    public static void perm1(String s) {
        perm1("", s);
    }

    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));
        }

    }

    public static void permute(String input, int l, int r) {
        if (l == r) {
            if (isPalinDrome(input))
                System.out.println(input);
        }
        for (int i = l; i < r; i++) {
            input = swap(input, l, i);
            permute(input, l + 1, r);
            input = swap(input, l, i);
        }
    }

    public static String swap(String input, int l, int r) {
        char[] chars = input.toCharArray();
        char temp = chars[l];
        chars[l] = chars[r];
        chars[r] = temp;
        return new String(chars);
    }

    public static boolean isPalinDrome(String input) {
        boolean flag = true;
        int l = 0;
        int r = input.length() - 1;
        while (l < r) {
            if (input.charAt(l) != input.charAt(r)) {
                flag = false;
                break;
            }

            l++;
            r--;
        }
        return flag;
    }
}
