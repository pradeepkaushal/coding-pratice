package practice.coding.hackerearth;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
 */
public class IceCreamParlour {

    public static void main(String[] args) {
        int cost[] = {2, 2, 4, 3};
        int money = 4;

        whatFlavors(cost, money);
    }

    static void whatFlavors(int[] costs, int money) {
        Map<Integer, Integer> costMap = new LinkedHashMap<>();

        for (int i = 0; i < costs.length; i++) {
            int iceCreamId = i + 1;
            int cost = costs[i];
            int otherCost = money - cost;
            if(costMap.containsKey(otherCost)){
                System.out.println(costMap.get(otherCost)+" "+iceCreamId);

            }
            costMap.putIfAbsent(cost,iceCreamId);
        }


    }

}
