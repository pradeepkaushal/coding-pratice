package practice.algorithm;

import java.util.Stack;

public class CheckPreorderTreeOfArray {
    public static void main(String[] args) {

    }

    class Node {
        Node left, right;
        int data;

    }

    public boolean checkPreorder(int[] arr) {

        Stack<Node> stack = new Stack<>();

        Node node = new Node();
        node.data = arr[0];
        stack.push(node);
        for (int i = 1; i < arr.length; i++) {
            Node temp = null;
            while (!stack.isEmpty() && arr[i] > stack.peek().data) {
                temp = stack.pop();
            }
            if (temp != null) {
                Node n = new Node();
                n.data = arr[i];
                temp.right = n;
                stack.push(n);
            } else {
                Node n = new Node();
                n.data = arr[i];
                temp = stack.peek();
                temp.left = n;
                stack.push(n);
            }
        }
        return false;
    }


}
