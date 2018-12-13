package practice.algorithm;

import java.util.LinkedList;

public class InsertionInBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Inorder traversal before insertion:");
        inOrderTravelsal(root);
        System.out.println();
        System.out.println(sizeOfATree(root,0));

        int key = 12;
        Node node = new Node(key);
        insertNode(root, node);

        System.out.println();
        System.out.println("Inorder traversal before insertion:");

        inOrderTravelsal(root);
        System.out.println();
        System.out.println(sizeOfATree(root,0));
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void insertNode(Node tree, Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(tree);
        LinkedList<Node> tempQueue = new LinkedList<>();
        while (true) {
            while (!queue.isEmpty()) {
                Node tempNode = queue.poll();
                if (tempNode.left == null) {
                    tempNode.left = node;
                    return;
                } else if (tempNode.right == null) {
                    tempNode.right = node;
                    return;
                }
                tempQueue.add(tempNode.left);
                tempQueue.add(tempNode.right);
            }
            queue.addAll(tempQueue);
            tempQueue.clear();
        }
    }

    public static void inOrderTravelsal(Node node) {
        if (node != null) {
            inOrderTravelsal(node.left);

            System.out.print(node.data + " ");

            inOrderTravelsal(node.right);
        }
    }

    public static int sizeOfATree(Node node, int sum) {
        if (node == null) {
            return 0;
        }
        sum += sizeOfATree(node.left, sum)+1+sizeOfATree(node.right, sum);
        return sum;
    }
}
