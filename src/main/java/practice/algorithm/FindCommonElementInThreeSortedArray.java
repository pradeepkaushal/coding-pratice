package practice.algorithm;

public class FindCommonElementInThreeSortedArray {
    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        commonElement(ar1,ar2,ar3);

    }

    static void commonElement(int arr1[], int arr2[], int arr3[]) {

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if ((arr1[i] == arr2[j]) && (arr2[j] == arr3[k])) {
                System.out.println(arr1[i] + " location " + i + " " + j + " " + k);
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
