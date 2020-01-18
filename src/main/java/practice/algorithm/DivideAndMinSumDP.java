package practice.algorithm;

import javafx.scene.control.ListCell;

import java.util.Arrays;
import java.util.List;

public class DivideAndMinSumDP {


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        int threshold = 2;
        System.out.println( minNum(threshold, Arrays.asList(arr)));
    }

    public static int minNum(int threshold, List<Integer> points) {
        // Write your code here

        int minPoint = points.get(0);
        return Math.min(minNum(threshold, points, 1, minPoint, 1),minNum(threshold, points, 1, minPoint, 2));

    }


    public static int minNum(int thresholds, List<Integer> points, int steps, int minPoint, int index) {
        if (index >= points.size()) {
            return points.size();
        }
        int maxPoint = points.get(index);

        if (maxPoint - minPoint== thresholds) {
            return steps + 1;
        }

        int leftSteps = steps + minNum(thresholds, points, steps + 1, minPoint, index + 1);
        int rightSteps = steps + minNum(thresholds, points, steps + 1, minPoint, index + 2);
        return Math.min(leftSteps, rightSteps);

    }


}


