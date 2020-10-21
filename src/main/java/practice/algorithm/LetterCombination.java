package practice.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombination {

  Map<String, String> phone =
      new HashMap<String, String>() {
        {
          put("2", "abc");
          put("3", "def");
          put("4", "ghi");
          put("5", "jkl");
          put("6", "mno");
          put("7", "pqrs");
          put("8", "tuv");
          put("9", "wxyz");
        }
      };

  List<String> output = new ArrayList<String>();

  public void backtrack(String combination, String next_digits) {
    // if there is no more digits to check
    if (next_digits.length() == 0) {
      // the combination is done
      output.add(combination);
    }
    // if there are still digits to check
    else {
      // iterate over all letters which map
      // the next available digit
      String digit = next_digits.substring(0, 1);
      String letters = phone.get(digit);
      for (int i = 0; i < letters.length(); i++) {
        String letter = phone.get(digit).substring(i, i + 1);
        // append the current letter to the combination
        // and proceed to the next digits
        backtrack(combination + letter, next_digits.substring(1));
      }
    }
  }

  public List<String> letterCombinationsIterative(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    if (digits.isEmpty()) return ans;
    String[] mapping =
        new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for (int i = 0; i < digits.length(); i++) {
      int x = Character.getNumericValue(digits.charAt(i));

      while (ans.peek().length() == i) {
        String t = ans.remove();
        for (char s : mapping[x].toCharArray()) {
          ans.add(t + s);
        }
      }
    }
    return ans;
  }

  public List<String> letterCombinations(String digits) {
    if (digits.length() != 0) backtrack("", digits);
    return output;
  }

  public static void main(String[] args) {
    //
    LetterCombination main = new LetterCombination();
    main.letterCombinationsIterative("23");
    System.out.println(main.output);
  }
}
