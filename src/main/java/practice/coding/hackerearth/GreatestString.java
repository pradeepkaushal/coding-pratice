package practice.coding.hackerearth;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.hackerearth.com/challenge/hiring/hotstar-java-hiring-challenge/problems/727bf156cea64df0bcc2fd663f5964f2/
 */
public class GreatestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        for (int i = 0; i < testCount; i++) {
            String input = sc.next();
            int n = sc.nextInt();
            System.out.println(threePartsEquals(input, n));
        }
        sc.close();
    }

    public static String threePartsEquals(String input, int n) {
        if (n == 0) {
            return input;
        }

        Set<Character> characterSet = Stream.of('a', 'e', 'i', 'o', 'u').collect(Collectors.toSet());
        char[] chars = input.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            if (characterSet.contains(chars[i])) {
                chars[i] = (char) (chars[i] + 1);
                n--;
                if(n==0){
                    break;
                }
            }
        }


        return new String(chars);
    }
}
