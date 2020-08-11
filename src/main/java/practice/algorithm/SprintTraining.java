package practice.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * Prudential
 */
public class SprintTraining {

    public static void main(String[] args) {
        int n = 9;
        List<Integer> sprints = Arrays.asList(9, 7, 3, 1);
        int mostVisited = getMostVisited(n, sprints);
        System.out.println(mostVisited);
    }

    public static int getMostVisited(int n, List<Integer> sprints) {

        int mileStone = n + 1;

        int sprint = sprints.size() - 1;

        int[][] sprintMatrix = new int[sprint][mileStone];


        for (int i = 0; i < sprints.size() - 1; i++) {

            int pointA = sprints.get(i);
            int pointB = sprints.get(i + 1);

            int start = pointA < pointB ? pointA : pointB;
            int end = pointB < pointA ? pointA : pointB;

            for (int j = start; j <= end; j++) {
                sprintMatrix[i][j] = 1;
            }
        }

        int mostVisited = 1;
        int visitedCount = 0;
        for (int i = 1; i < mileStone; i++) {
            int count = 0;
            for (int j = 0; j < sprint; j++) {
                if (sprintMatrix[j][i] == 1) {
                    count++;
                }
            }
            if (visitedCount < count) {
                visitedCount = count;
                mostVisited = i;
            }
        }
        return mostVisited;

    }


}
