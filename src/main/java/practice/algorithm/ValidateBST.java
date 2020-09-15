package practice.algorithm;

// INITIAL CODE

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Integer;
import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/check-for-bst/1
// A Binary Search Tree node
class ValidateBST {

    public static class Node {
        Node left;
        Node right;
        int data;

        public Node(int item) {
            this.data = item;
        }
    }

    public static boolean checkBst(Node node) {
        if (node != null) {
            if (node.left != null && node.left.data > node.data && node.data < maxValue(node)) {
                return false;
            }
            if (node.right != null && node.right.data < node.data && node.data > minimumValue(node)) {
                return false;
            }
            return checkBst(node.left) && checkBst(node.right);
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


    public static int isBst(Node root) {
        if (root == null) {
            return 1;
        }

        if (root.left != null && root.left.data > root.data && root.data < maxValue(root)) {
            return 0;
        }

        if (root.right != null && root.right.data < root.data && root.data > minimumValue(root)) {
            return 0;
        }
        if (isBst(root.left) == 0 || isBst(root.right) == 0) {
            return 0;
        }
        return 1;
    }

}


class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class Check_BST {
    // driver function to test the above functions
    public static void main(String args[]) {
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Check_BST ob = new Check_BST();
        while (t > 0) {
            HashMap<Integer, Node> m = new HashMap<Integer, Node>();
            int n = sc.nextInt();

            Node root = null;
            while (n > 0) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null) {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }

            GfG g = new GfG();
            System.out.println(g.isBST(root));
            //ob.printInorder(root);
            t--;

        }
    }
}


class GfG {
    int isBST(Node root) {
        if (root == null) {
            return 1;
        }

        if (root.left != null && root.left.data > root.data && root.data < maxValue(root)) {
            return 0;
        }

        if (root.right != null && root.right.data < root.data && root.data > minimumValue(root)) {
            return 0;
        }
        return isBST(root.left) * isBST(root.right);
    }

    int minimumValue(Node node) {
        if (node.left == null) {
            return node.data;
        }

        return minimumValue(node.left);
    }

    int maxValue(Node node) {
        if (node.right == null) {
            return node.data;
        }
        return maxValue(node.right);
    }


    int findMin(Node node) {
        int[] value = new int[0];
        value[0] = Integer.MAX_VALUE;
        findMin(node, value);
        return value[0];
    }

    void findMin(Node node, int[] val) {
        if (node == null) {
            return;
        }
        findMin(node.left);
        if (val[0] > node.data) {
            val[0] = node.data;
        }
        findMin(node.right);
    }

    int findMax(Node node) {
        int[] value = new int[0];
        value[0] = Integer.MIN_VALUE;
        findMax(node, value);
        return value[0];
    }

    void findMax(Node node, int[] val) {
        if (node == null) {
            return;
        }
        findMax(node.left, val);
        if (val[0] < node.data) {
            val[0] = node.data;
        }
        findMax(node.right);
    }
}


class Bst {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(15);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(20);
        System.out.println(new Bst().helper(node, null, null));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    boolean isBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if ((root.left != null && root.left.val >= root.val) || root.val < findMax(root)) {
            return false;
        }

        if ((root.right != null && root.right.val <= root.val) || root.val > findMin(root)) {
            return false;
        }
        return isBST(root.left) && isBST(root.right);
    }


    int findMin(TreeNode node) {
        int[] value = new int[1];
        value[0] = Integer.MAX_VALUE;
        findMin(node, value);
        return value[0];
    }

    void findMin(TreeNode node, int[] value) {
        if (node == null) {
            return;
        }
        findMin(node.left, value);
        if (value[0] > node.val) {
            value[0] = node.val;
        }
        findMin(node.right, value);
    }

    int findMax(TreeNode node) {
        int[] value = new int[1];
        value[0] = Integer.MIN_VALUE;
        findMax(node, value);
        return value[0];
    }

    void findMax(TreeNode node, int[] value) {
        if (node == null) {
            return;
        }
        findMax(node.left, value);
        if (value[0] < node.val) {
            value[0] = node.val;
        }
        findMax(node.right, value);
    }


    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!helper(node.right, val, upper)) return false;
        if (!helper(node.left, lower, val)) return false;
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
}
