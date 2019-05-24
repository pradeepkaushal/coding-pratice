package practice.algorithm;

public class SortedArrayToBst {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        Node node = bst(arr, 0, arr.length - 1);
        System.out.println(node);

    }

    static class Node {
        int data;
        Node left, right;
    }


    public static Node bst(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;

        Node left = bst(arr, 0, mid - 1);

        Node root = new Node();
        root.data = arr[mid];

        root.left = left;

        root.right = bst(arr, mid + 1, end);

        return root;
    }
}
