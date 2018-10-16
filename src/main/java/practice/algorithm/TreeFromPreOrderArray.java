package practice.algorithm;

import java.util.Scanner;

public class TreeFromPreOrderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < T; i++) {
            int element = Integer.parseInt(sc.nextLine().trim());
            int[] arr = new int[element];
            for (int j = 0; j < element; j++) {
                arr[j] = sc.nextInt();
            }
            TreeFromPreOrderArray treeFromPreOrderArray = new TreeFromPreOrderArray();
            Node node= treeFromPreOrderArray.constructTree(arr,arr.length);
            treeFromPreOrderArray.postOrderTraversal(node);
        }

    }

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public Node constructTreeUtil(int[] arr, int index, int low, int high, int size) {
        if (index > size || low < high)
            return null;
        Node root = new Node(arr[index]);
        index = index + 1;
        if (low == high)
            return root;
        int i = low;
        for (; i < high; i++) {
            if (arr[i] > root.data)
                break;
        }

        root.left = constructTreeUtil(arr, index, index, i - 1, size);
        root.right = constructTreeUtil(arr, index, i, size - 1, size);
        return root;
    }


    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data + " ");
        }
    }

    public Node constructTree(int arr[], int size) {
        return constructTreeUtil(arr, 0, 0, arr.length - 1, arr.length);
    }

}
