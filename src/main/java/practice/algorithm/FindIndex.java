package practice.algorithm;

public class FindIndex {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        System.out.println(findFirstIndex(arr, 0, arr.length - 1));
    }


    static int findIndex(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }

        if (arr[start] == 0 && arr[end] == 0) {
            return -1;
        }

        if (arr[start] == 1) {
            return start;
        }

        int mid = (start + end) / 2;

        int firstHalf = findIndex(arr, start, mid);
        int secondHalf = findIndex(arr, mid + 1, end);

        return firstHalf >= secondHalf ? firstHalf : secondHalf;

    }

    static int findFirstIndex(int arr[], int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return mid;
            }
            if (arr[mid] == 1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
