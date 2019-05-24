package practice.algorithm;

import java.util.*;

public class PossibleNoOfDraws {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < T; i++) {
            int player = Integer.parseInt(sc.nextLine().trim());
            String player1 = sc.nextLine();
            String player2 = sc.nextLine();
            System.out.println(possibleDraw(player1, player2, player));
        }

    }

    public static int possibleDraw(String input1, String input2, int player) {
        char[] input1Chars = input1.toCharArray();
        char[] input2Chars = input2.toCharArray();
        LinkedList<Character> charList = new LinkedList<>();

        for (int i = 0; i < player; i++) {
            charList.add(input1Chars[i]);
        }
        int count = 0;
        for (int i = 0; i < player; i++) {
            if (charList.removeFirstOccurrence(input2Chars[i])) {
                count++;
            }
        }
        return count;

    }
}
