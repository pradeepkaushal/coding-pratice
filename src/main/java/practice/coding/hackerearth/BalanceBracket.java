package practice.coding.hackerearth;

import java.util.Stack;

public class BalanceBracket {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        String outPut = "YES";

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (isBeginningBracket(c)) {
                stack.add(c);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                Character openBracket = stack.pop();
                if (!isClosingBracket(openBracket, c)) {
                    return "NO";
                }

            }
        }

        if(!stack.isEmpty()){
            outPut="NO";
        }
        return outPut;

    }

    static boolean isBeginningBracket(char input) {
        char[] chars = {'{', '(', '['};
        for (char c : chars) {
            if (c == input) {
                return true;
            }
        }
        return false;
    }

    static boolean isClosingBracket(char open, char close) {
        if (open == '{' && close == '}') {
            return true;
        } else if (open == '(' && close == ')') {
            return true;
        } else if (open == '[' && close == ']') {
            return true;
        }

        return false;
    }


}
