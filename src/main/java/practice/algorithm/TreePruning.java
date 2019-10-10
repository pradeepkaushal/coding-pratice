package practice.algorithm;

public class TreePruning {

    class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node treePruning(Node root) {

        if (root == null) {
            return null;
        }
        root.left = containsOne(root.left) ? treePruning(root.left) : null;
        root.right = containsOne(root.right) ? treePruning(root.right) : null;
        return root;
    }

    private static boolean containsOne(Node node) {
        if (node == null) {
            return false;
        }

        if (node.data == 1) {
            return true;
        }

        return containsOne(node.left) || containsOne(node.right);
    }
}
