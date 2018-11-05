package practice.algorithm;

/**
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
public class SearchElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        System.out.println(index(arr, 0, arr.length - 1, 5));
    }

    static int index(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key < arr[mid]) {
            return index(arr, low, mid, key);
        }
        return index(arr, mid + 1, high, key);
    }

    static int findPivot(int[] arr, int low, int high) {
        if (low > high)
            return -1;
        if (low == high) {
            return low;
        }
        int mid = low + (high - low) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] > arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[low] > arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
}
