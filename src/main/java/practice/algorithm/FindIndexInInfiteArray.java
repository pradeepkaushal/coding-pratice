package practice.algorithm;

public class FindIndexInInfiteArray {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        System.out.println(findPosition(arr,1));
    }


    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = low + (high - 1) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            }
            return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    static int findPosition(int[] arr, int key) {
        int low = 0, high = 1;
        int val = arr[0];
        while (val < key) {
            low = high;
            high = 2 * high;
            val = arr[high];
        }
        return binarySearch(arr, low, high, key);
    }


}
