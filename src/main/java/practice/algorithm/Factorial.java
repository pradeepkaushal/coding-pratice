package practice.algorithm;

public class Factorial {
    public static void main(String[] args) {
        int factorial = new Factorial().factorial(1000);
        System.out.println(factorial);
    }

    public int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        System.out.println(n + " ");
        return n * factorial(n - 1);
    }
}
