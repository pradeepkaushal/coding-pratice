package practice.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BinaryTreeToBST {
    public static void main(String[] args) {
        Node node = new Node(20);
        node.left = new Node(78);
        node.left.left = new Node(4);
        node.left.right = new Node(12);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(14);
        node.right = new Node(22);
        node.right.right = new Node(25);
        List<Node> nodes = inOrderTraversal(node, new ArrayList<>());
        System.out.println(nodes);
        buildTree(node, nodes);
        System.out.println(inOrderTraversal(node, new ArrayList<>()));
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data + "";
        }
    }

    static List<Node> inOrderTraversal(Node node, List<Node> nodes) {
        if (node != null) {
            inOrderTraversal(node.left, nodes);
            nodes.add(node);
            inOrderTraversal(node.right, nodes);

        }
        return nodes;
    }

    public static void buildTree(Node node, List<Node> nodes) {
        if (node == null) {
            return;
        }
        buildTree(node.left, nodes);
        node.data = nodes.get(0).data;
        nodes.remove(0);
        buildTree(node.right, nodes);
    }

    /**
     * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees
     */
    public static boolean checkBST(Node node, Set<Integer> visitedNode) {
        if (node == null) {
            return true;
        }
        if (visitedNode.contains(node.data)) {
            return false;
        }
        if (node.left != null && node.left.data > node.data && node.data < findMax(node.left)) {
            return false;
        }

        if (node.right != null && node.right.data < node.data && node.data > findMin(node.right)) {
            return false;
        }
        visitedNode.add(node.data);
        return checkBST(node.left, visitedNode) && checkBST(node.right, visitedNode);
    }

    private static int findMin(Node node) {
        int min = Integer.MAX_VALUE;
        List<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            if (node.data < min) {
                min = node.data;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return min;
    }

    private static int findMax(Node node) {
        int max = Integer.MIN_VALUE;
        List<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            if (node.data > max) {
                max = node.data;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return max;
    }


    boolean checkBST(Node root) {
        int lastVisited = Integer.MIN_VALUE;
        int[] arr = {lastVisited};
        return inOrderTraversal(root, arr);
    }

    boolean inOrderTraversal(Node root, int[] arr) {
        if (root == null) {
            return true;
        }

        inOrderTraversal(root.left, arr);

        if (arr[0] > root.data) {
            return false;
        }
        arr[0] = root.data;
        return inOrderTraversal(root, arr);
    }
}

