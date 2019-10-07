package practice.coding.hackerearth;

import java.util.Arrays;
import java.util.List;

public class ClosestDistance {

    public static void main(String[] args) {
        List<Integer> x = Arrays.asList(0, 10, 15);
        List<Integer> y = Arrays.asList(0, 10, 20);
        long l = closestSquaredDistance(x, y);
        System.out.println(l);
    }

    static long closestSquaredDistance(List<Integer> x, List<Integer> y) {


        long closetsDistance = Long.MAX_VALUE;

        int length = x.size();

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length; j++) {
                int x1 = x.get(i);
                int y1 = y.get(i);


                int x2 = x.get(j);
                int y2 = y.get(j);

                int distance = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
                if (distance != 0 && distance < closetsDistance) {
                    closetsDistance = distance;
                }
            }
        }

        return closetsDistance;

    }
}
