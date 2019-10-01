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
}

