package practice.algorithm;

public class HieghtOfABinaryTree {
    public static void main(String[] args) {

    }

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    //Verified working
    public static int height(Node node) {
        if (node == null) {
            return 0;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
