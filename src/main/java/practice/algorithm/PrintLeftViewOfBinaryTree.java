package practice.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLeftViewOfBinaryTree {
    public static void main(String[] args) {
        Node node = new Node(20);
        node.left = new Node(8);
        node.left.left = new Node(4);
        node.left.right = new Node(12);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(14);
        node.right = new Node(22);
        node.right.right = new Node(25);
        printLeftView(node);
    }

    public static void printLeftView(Node root) {
        //Do level traversal and print only first root from each level
        // it will give the left view of tree.

        List<Integer> datas = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            Node currentNode = queue.poll();
            datas.add(currentNode.data);
            Queue<Node> levelQueue = new LinkedList<>();

            if (currentNode.left != null) {
                levelQueue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                levelQueue.add(currentNode.right);
            }
            while (!queue.isEmpty()) {

                currentNode = queue.poll();

                if (currentNode.left != null) {
                    levelQueue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    levelQueue.add(currentNode.right);
                }
            }
            queue.addAll(levelQueue);
        }
        for(int data:datas){
            System.out.print(data+" ");
        }


    }



    public static void printLeftViewOfBinaryTreeRecur(Node node){

    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
