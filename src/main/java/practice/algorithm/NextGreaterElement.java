package practice.algorithm;

/**
 * https://www.geeksforgeeks.org/?p=8405
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {13, 7, 6, 12};
        NextGreaterElement obj = new NextGreaterElement();
        for (int in : arr) {
            System.out.println(obj.nextGreaterElement(in, arr));
        }
    }

    public int nextGreaterElement(int in, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == in && i < arr.length - 1) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > in) {
                        return arr[j];
                    }
                }
            }
        }
        return -1;
    }
}
