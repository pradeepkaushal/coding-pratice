package practice.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class TreeFromPreOrderArray {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
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
        }*/

        int[] arr = {10, 5, 1, 7, 40, 50};
        TreeFromPreOrderArray treeFromPreOrderArray = new TreeFromPreOrderArray();
        //Node node = treeFromPreOrderArray.constructTree(arr, arr.length);
        Node node=treeFromPreOrderArray.constructTreeStack(arr,arr.length);
        treeFromPreOrderArray.postOrderTraversal(node);

    }

    Index index = new Index();


    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    class Index {
        int index = 0;
    }

    public Node constructTreeUtil(int[] arr, Index preIndex, int low, int high, int size) {
        if (preIndex.index >= size || low > high)
            return null;
        Node root = new Node(arr[preIndex.index]);
        preIndex.index = preIndex.index + 1;
        if (low == high)
            return root;
        int i;
        for (i = low; i < high; i++) {
            if (arr[i] > root.data)
                break;
        }

        root.left = constructTreeUtil(arr, preIndex, preIndex.index, i - 1, size);
        root.right = constructTreeUtil(arr, preIndex, i, size - 1, size);
        return root;
    }


    public void postOrderTraversal(Node node) {
        if (node != null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data + " ");

    }


    public Node constructTreeStack(int pre[], int size) {

        // The first element of pre[] is always root
        Node root = new Node(pre[0]);

        Stack<Node> s = new Stack<Node>();

        // Push root
        s.push(root);

        // Iterate through rest of the size-1 items of given preorder array
        for (int i = 1; i < size; ++i) {
            Node temp = null;

            /* Keep on popping while the next value is greater than
             stack's top value. */
            while (!s.isEmpty() && pre[i] > s.peek().data) {
                temp = s.pop();
            }

            // Make this greater value as the right child and push it to the stack
            if (temp != null) {
                temp.right = new Node(pre[i]);
                s.push(temp.right);
            }

            // If the next value is less than the stack's top value, make this value
            // as the left child of the stack's top node. Push the new node to stack
            else {
                temp = s.peek();
                temp.left = new Node(pre[i]);
                s.push(temp.left);
            }
        }

        return root;
    }



    public Node constructTree(int arr[], int size) {
        return constructTreeUtil(arr, index, 0, arr.length - 1, arr.length);
    }

}
