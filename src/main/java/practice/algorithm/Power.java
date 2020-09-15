package practice.algorithm;

import java.util.HashMap;
import java.util.Map;

public class Power {

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.myPow(2, 9));
    }

    public double myPow(double x, int n) {
        Map<Integer, Double> map = new HashMap<>();
        if (n < 0) {
            int absn = Math.abs(n);
            return 1 / pow(x, absn,map);
        } else {
            return pow(x, n,map);
        }
    }

    public double pow(double x, int n, Map<Integer, Double> map) {
        if (n == 1) {
            return x;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n % 2 == 1) {
            double value = x * pow(x, n / 2, map) * pow(x, n / 2, map);

            map.put(n, value);
            return value;
        }

        double value = x * pow(x, n - 1, map);
        map.put(n, value);
        return value;
    }
}
