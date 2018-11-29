package practice.algorithm;

import java.util.Date;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Date start = new Date();
//        System.out.println(primeFactor(10000000000001L));
        System.out.println(primeFactor(1917777777777L));
        Date end = new Date();
        long l = end.getTime() - start.getTime();
        System.out.println(l);
    }

    public static long primeFactor(long input) {
        long val = input / 2;
        while (val > 1) {
            if (input % val == 0) {
                if (!isPrime(val))
                    return val;
            }
            --val;
        }
        return input;
    }

    public static boolean isPrime(long input) {
        if (input == 2) {
            return true;
        }
        long val = input / 2;
        while (val > 2) {
            if (input % val == 0) {
                return true;
            }
            val--;

        }
        return false;
    }
}
