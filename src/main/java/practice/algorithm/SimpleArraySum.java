package practice.algorithm;

public class SimpleArraySum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4};
    }

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int a : ar) {
            sum += a;
        }
        return sum;
    }

}
