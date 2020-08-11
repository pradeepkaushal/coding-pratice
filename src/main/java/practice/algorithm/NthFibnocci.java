package practice.algorithm;

public class NthFibnocci {


    public static void main(String[] args) {
        int n = 60;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {

        int[] nth = new int[n + 1];
        nth[0] = 0;
        nth[1] = 1;

        return fib(n, 1, nth);

    }

    public static int fib(int n, int i, int nth[]) {
        if (n == i) {
            return nth[i];
        }


        nth[i + 1] = nth[i - 1] + nth[i];
        return fib(n, i + 1, nth);
    }
}
