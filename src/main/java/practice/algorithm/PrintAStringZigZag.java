package practice.algorithm;

import java.util.Arrays;

public class PrintAStringZigZag {


    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        int k = 3;
        printZigZag(str, k);

    }

    public static void printZigZag(String str, int k) {
        String[] zigZag = new String[k];
        Arrays.fill(zigZag, "");
        String distance = "";
        String space = " ";
        int row = 0;
        char[] arr = str.toCharArray();
        boolean down = true;

        for (int i = 0; i < str.length(); i++) {

            zigZag[row] = zigZag[row] + distance + arr[i];

            distance = distance + space;

            if (down) {
                row++;
            } else {
                row--;
            }

            if (row == k - 1) {
                down = false;
            } else if (row == 0) {
                down = true;
            }


        }
        for (String out : zigZag) {
            System.out.println(out);
        }
    }
}
