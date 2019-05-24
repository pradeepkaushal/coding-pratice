package practice.algorithm;

import java.util.HashMap;
import java.util.Map;

//https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
public class IceCreamParlor {

    public static void main(String[] args) {
        int cost[] = {4, 3, 2, 5, 7};
        int money = 8;
        whatFlavourHash(cost, money);
    }

    static void whatFlavors(int[] cost, int money) {

        int firstFlavour = 0;
        int secondFlavour = 0;
        for (int i = 0; i < cost.length - 1; i++) {
            for (int j = i + 1; j < cost.length; j++) {
                if (cost[i] + cost[j] == money) {
                    firstFlavour = i;
                    secondFlavour = j;
                }
            }
        }
        firstFlavour++;
        secondFlavour++;
        System.out.println(firstFlavour + " " + secondFlavour);
    }

    static void whatFlavourHash(int[] cost,int money){
        Map<Integer,Integer> costMap=new HashMap<>();

        for(int i=0;i<cost.length;i++){
            if(costMap.containsKey(money-cost[i])){
                costMap.put(cost[i],i+1);
                Integer index1 = costMap.get(money - cost[i]);
                Integer index2=costMap.get(cost[i]);
                if(index1<index2){
                    System.out.println(index1 + " " + index2);
                }else{
                    System.out.println(index2 + " " + index2);
                }
                break;
            }else{
                costMap.put(cost[i],i+1);
            }
        }

    }

}
