package practice.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 5, 6, 1, 2, 3, 4};

        int index = findPivot(arr, 0, arr.length - 1);

        int target = 2;
        BinarySearch bs = new BinarySearch();

        if (index == 0) {
            System.out.println(binarySearch(arr, target, 0, arr.length - 1));
        }

        if (target > arr[arr.length - 1]) {
            System.out.println(binarySearch(arr, target, 0, index - 1));
        } else {
            System.out.println(binarySearch(arr, target, index, arr.length - 1));
        }


    }


    public static int binarySearch(int arr[], int target, int startIndex, int endIndex) {

        if (startIndex > endIndex) {
            return -1;
        }

        int mid = (startIndex + endIndex) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return binarySearch(arr, target, startIndex, mid);
        }
        return binarySearch(arr, target, mid + 1, endIndex);

    }

    public static int findPivot(int[] arr, int start, int end) {

        if (start > end) {
            return -1;
        }

        if (start == end) {
            return start;
        }
        int mid = (start + end) / 2;

        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid + 1;
        }
        if (mid > start && arr[mid - 1] > arr[mid]) {
            return mid;
        }
        if (arr[mid] > arr[end]) {
            return findPivot(arr, mid + 1, end);
        }

        return findPivot(arr, start, mid);
    }


}


