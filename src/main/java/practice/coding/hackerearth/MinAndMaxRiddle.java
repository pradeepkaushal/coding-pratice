package practice.coding.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/min-max-riddle/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
 */
public class MinAndMaxRiddle {

    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 5, 1, 13, 3};
        riddle(arr);
    }

    static long[] riddle(long[] arr) {
        // complete this function

        List<Long> outPut = new ArrayList<>();
        int n = 1;
        while (n <= arr.length) {
            Stack<Long> maxValue = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                Long value = subArray(arr, i, i + n);

                if (value == null) {
                    continue;
                }

                if (maxValue.isEmpty()) {
                    maxValue.push(value);
                    continue;
                }
                if (value > maxValue.peek()) {
                    maxValue.pop();
                    maxValue.push(value);
                }


            }
            outPut.add(maxValue.pop());

            n++;
        }


        long[] out = new long[outPut.size()];
        for (int i = 0; i < outPut.size(); i++) {
            out[i] = outPut.get(i);
        }
        return out;
    }

    /**
     * Find min value within subarray
     *
     * @param arr
     * @param startInclusive
     * @param endExclusive
     * @return
     */
    static Long subArray(long[] arr, int startInclusive, int endExclusive) {
        if (endExclusive > arr.length) {
            return null;
        }
        Stack<Long> stack = new Stack<>();
        for (int i = startInclusive; i < endExclusive; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (arr[i] < stack.peek()) {
                    stack.pop();
                    stack.push(arr[i]);
                }
            }

        }

        return stack.pop();
    }
}
