package practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballScores {

    public static void main(String[] args) {
        List<Integer> teamA = Arrays.asList(1, 4, 2, 4);
        List<Integer> teamB = Arrays.asList(3, 5);
        List<Integer> counts = counts(teamA, teamB);
        System.out.println(counts);
    }

    public static List<Integer> counts(List<Integer> teamA, List<Integer> teamB) {

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < teamB.size(); i++) {
            Integer value = teamB.get(i);
            int count = 0;
            for (int j = 0; j < teamA.size(); j++) {
                Integer value2 = teamA.get(j);
                if (value2 <= value) {
                    count++;
                }
            }
            output.add(count);
        }
        return output;

    }
}
