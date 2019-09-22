package practice.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        System.out.println(findIndex(arr, 0, arr.length - 1));
    }

    public static int findIndex(int[] arr, int startIndex, int endIndex) {

        if (startIndex <= endIndex) {
            if (arr[startIndex] == 1) {
                return startIndex;
            }

            int midIndex = (endIndex + startIndex) / 2;
            if (arr[startIndex] == 0 && arr[midIndex] == 1) {
                return findIndex(arr, startIndex, midIndex);
            }
            return findIndex(arr, midIndex + 1, endIndex);
        }
        return -1;
    }


}
