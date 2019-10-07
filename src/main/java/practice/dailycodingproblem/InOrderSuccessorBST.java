package practice.dailycodingproblem;

public class InOrderSuccessorBST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node inorderSuccessor(Node root, Node k) {
        if (root == null) {
            return null;
        }

        if (root.data < k.data) {
            return inorderSuccessor(root.right, k);
        }

        if (root.data == k.data) {
            return root.right;
        }

        if (root.data > k.data && root.left.data == k.data) {
            return root;
        }
        return inorderSuccessor(root.left, k);

    }


    public static Node findInorderSuccessor(Node root, Node n) {
        if (root.right != null) {
            return findMin(root.right);
        }

        Node succ = null;
        while (root != null) {
            if (n.data < root.data) {
                succ = root;
                root = root.left;
            } else if (root.data < n.data) {
                root = root.right;
            } else {
                break;
            }
        }
        return succ;
    }

    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
