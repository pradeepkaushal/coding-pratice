package practice.hackerrank.sorting;

import java.util.Arrays;

public class FraudulentActivityNotifications {


    public static void main(String[] args) {
        //int[] expenditure = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int[] expenditure = {10, 20, 30, 40, 50};
        int notification = activityNotifications(expenditure, 3);
        System.out.println(notification);
    }

    static int activityNotifications(int arr[], int d) {
        int notification = 0;
        for (int i = arr.length - 1; i - d >= 0; i--) {
            int value = arr[i];

            int high = i;
            int low = high - d;
            if (low < 0) {
                return notification;
            }

            int[] rangeArray = Arrays.copyOfRange(arr, low, high);

            if (isFraudelent(rangeArray, value)) {
                notification++;
            }
        }
        return notification;
    }

    static boolean isFraudelent(int[] arr, double transaction) {

        countSort(arr, arr.length);

        double median = getMedian(arr);

        return transaction >= median * 2;
    }


    static double getMedian(int arr[]) {
        int d = arr.length;
        if (d % 2 != 0) {
            return arr[d / 2];
        }

        double midPoint = (double) d / 2;

        int lowIndex = (int) Math.floor(midPoint);
        int highIndex = (int) Math.ceil(midPoint);
        return (arr[lowIndex] + arr[highIndex]) / 2;

    }

    static void countSort(int array[], int size) {
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }
}
