package practice.algorithm;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 0, 0};
        mergeSort(arr);
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr.length / 2;


        int leftArr[] = mergeSort(Arrays.copyOfRange(arr, 0, pivot));
        int rightArr[] = mergeSort(Arrays.copyOfRange(arr, pivot, arr.length));

        return merge(leftArr, rightArr);
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {
        int[] retArr = new int[leftArr.length + rightArr.length];
        int leftCur = 0, rightCur = 0, retCur = 0;

        while (leftCur < leftArr.length && rightCur < rightArr.length) {
            if (leftArr[leftCur] < rightArr[rightCur]) {
                retArr[retCur++] = leftArr[leftCur++];
            } else {
                retArr[retCur++] = rightArr[rightCur++];
            }
        }
        while (leftCur < leftArr.length) {
            retArr[retCur++] = leftArr[leftCur++];
        }

        while (rightCur < rightArr.length) {
            retArr[retCur++] = rightArr[rightCur++];
        }
        return retArr;
    }
}
