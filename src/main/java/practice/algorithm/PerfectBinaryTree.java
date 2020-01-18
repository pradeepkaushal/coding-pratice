package practice.algorithm;

/**
 * Daily Coding Problem: Problem #254 [Medium]
 * For example, given the following tree:
 *
 *          0
 *       /     \
 *     1         2
 *   /            \
 * 3                 4
 *   \             /   \
 *     5          6     7
 * You should convert it to:
 *
 *      0
 *   /     \
 * 5         4
 *         /   \
 *        6     7
 */
public class PerfectBinaryTree {


    public static void main(String[] args) {

        Node node = new Node(0);
        node.left = new Node(1);
        node.right = new Node(2);

        node.left.left = new Node(3);
        node.left.left.right = new Node(5);


        node.right.right = new Node(4);
        node.right.right.left = new Node(6);
        node.right.right.right = new Node(7);

        Node temp = perfectTree(node);
        System.out.println(temp);
    }


    public static Node perfectTree(Node node) {
        if (node.left == null && node.right == null) {
            return node;
        }
        if (node.left == null && node.right != null) {
            return perfectTree(node.right);
        }
        if (node.right == null && node.left != null) {
            return perfectTree(node.left);
        }
        node.left = perfectTree(node.left);
        node.right = perfectTree(node.right);
        return node;

    }

    static class Node {

        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data+"";
        }
    }
}
