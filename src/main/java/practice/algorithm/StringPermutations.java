package practice.algorithm;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {


    public static void main(String[] args) {
        String input = "cats";

        recSubsets("", input);
    }

    public static Set<String> getPermutations(String inputString) {

        // base case
        if (inputString.length() <= 1) {
            return new HashSet<>(Collections.singletonList(inputString));
        }

        String allCharsExceptLast = inputString.substring(0, inputString.length() - 1);
        char lastChar = inputString.charAt(inputString.length() - 1);

        // recursive call: get all possible permutations for all chars except last
        Set<String> permutationsOfAllCharsExceptLast = getPermutations(allCharsExceptLast);

        // put the last char in all possible positions for each of the above permutations
        Set<String> permutations = new HashSet<>();
        for (String permutationOfAllCharsExceptLast : permutationsOfAllCharsExceptLast) {
            for (int position = 0; position <= allCharsExceptLast.length(); position++) {
                String permutation = permutationOfAllCharsExceptLast.substring(0, position) + lastChar
                        + permutationOfAllCharsExceptLast.substring(position);
                permutations.add(permutation);
            }
        }

        return permutations;
    }


    public static void permute(String soFar, String rest) {
        if (rest.isEmpty()) {
            System.out.println(soFar);
        } else {
            for (int i = 0; i < rest.length(); i++) {
                String remaining = rest.substring(0, i) + rest.substring(i + 1);
                permute(soFar + rest.charAt(i), remaining);
            }
        }
    }


    public static void recSubsets(String soFar, String rest) {
        if (rest.isEmpty()) {
            System.out.println(soFar);
        } else {

            recSubsets(soFar + rest.charAt(0), rest.substring(1));
            recSubsets(soFar, rest.substring(1));

        }
    }

    public static String foundWord(String sofar, String rest, String word) {
        if (rest.isEmpty()) {
            return word.contains(sofar) ? sofar : "";
        } else {
            for (int i = 0; i < rest.length(); i++) {
                String subStr = rest.substring(0, i) + rest.substring(i + 1);
                String found = foundWord(sofar + rest.charAt(i), subStr, word);
                if (!found.isEmpty()) {
                    return found;
                }
            }
        }
        return "";
    }
}
