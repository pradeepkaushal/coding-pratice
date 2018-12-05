package practice.algorithm;

public class ValidateBST {

    public static class Node {
        Node left;
        Node right;
        int data;
    }

    public static boolean checkBst(Node node) {
        if (node != null) {
            if (node.left != null && node.left.data > node.data) {
                return false;
            }
            if (node.right != null && node.right.data < node.data) {
                return false;
            }
            return checkBst(node.left);
        }

        return true;
    }

    public static int minimumValue(Node node) {
        if (node.left == null) {
            return node.data;
        }
        return minimumValue(node.left);
    }

    public static int maxValue(Node node) {
        if (node.right == null) {
            return node.data;
        }
        return maxValue(node.right);
    }


}
