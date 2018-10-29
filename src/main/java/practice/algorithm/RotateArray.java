package practice.algorithm;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        arr = juggleRotate(arr, 3);
        for (int a : arr) {
            System.out.printf(a + " ");
        }
    }

    public static int[] rotate(int[] arr, int d) {
        while (d > 0) {
            int temp = arr[0];
            int i = 0;
            for (; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[i] = temp;
            d--;
        }
        return arr;
    }


    public static int[] juggleRotate(int[] arr, int d) {
        int jump = d;
        int index = 0;
        while (d > 0) {
            int temp = arr[index];
            int spinCount = 0;
            int tempIndex = index;
            while (spinCount < jump) {
                arr[tempIndex] = arr[tempIndex + jump];
                tempIndex = tempIndex + jump;
                spinCount++;
            }
            arr[tempIndex] = temp;
            index++;
            d--;
        }
        return arr;
    }

    public static int findIndexInRotateArray(int[] arr,int start,int end, int key){

        return -1;
    }


}
