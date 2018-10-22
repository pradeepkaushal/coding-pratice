package practice.algorithm;

import java.util.Stack;

public class CheckPreorderTreeOfArray {
    public static void main(String[] args) {
        int[] arr = {40, 30, 35,20, 80, 100};
        CheckPreorderTreeOfArray checkPreorderTreeOfArray = new CheckPreorderTreeOfArray();
       // boolean b = checkPreorderTreeOfArray.checkBstFromPreOrderArray(arr, 0, arr.length - 1);
        boolean flag = checkPreorderTreeOfArray.checkBstFromPreOrderArray(arr);
        System.out.println(flag);

    }

    class Node {
        Node left, right;
        int data;

    }


    public boolean checkBstFromPreOrderArray(int[] arr, int low, int high) {
        if (low >= high) {
            return true;
        }
        int temp = arr[low];
        int j = low;
        for (int i = low + 1; i < high; i++) {
            if (temp < arr[i]) {
                j = i;
                break;
            }
        }
        for (int i = j; i < high; i++) {
            if (arr[j] > arr[i]) {
                return false;
            }
        }
        checkBstFromPreOrderArray(arr, low + 1, j - 1);
        checkBstFromPreOrderArray(arr, j + 1, arr.length - 1);
        return true;

    }

    public boolean checkBstFromPreOrderArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < root)
                return false;
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                root = stack.pop();
            }
            stack.push(arr[i]);

        }
        return true;
    }


}
