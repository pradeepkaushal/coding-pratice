package practice.algorithm;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs prog = new ClimbStairs();
        System.out.println(prog.climbStairs(60));

    }

    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        return climbStairs(n, map);
    }

    public int climbStairs(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n <= 2) {
            map.put(n, n);
            return n;
        }

        int sum = climbStairs(n - 2,map) + climbStairs(n - 1,map);
        map.put(n, sum);
        return sum;

    }
}
