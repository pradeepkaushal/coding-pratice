package practice.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        //System.out.println(findIndex(arr, 0, arr.length - 1));


        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr2, 0, arr2.length - 1, 0));
    }

    /**
     * Code for when array contains only 0 and 1
     *
     * @param arr
     * @param startIndex
     * @param endIndex
     * @return
     */
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


    public static int binarySearch(int[] arr, int startIndex, int endIndex, int target) {
        if (startIndex > endIndex) {
            return -1;
        }

        if (arr[startIndex] == target) {
            return startIndex;
        }

        int mid = (startIndex + endIndex) / 2;

        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, endIndex, target);
        }
        return binarySearch(arr, startIndex, mid, target);
    }


}
