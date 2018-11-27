package practice.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTravelsal {

    public static void main(String[] args) {


        Node node = new Node(20);
        node.left = new Node(8);
        node.left.left = new Node(4);
        node.left.right = new Node(12);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(14);
        node.right = new Node(22);
        node.right.right = new Node(25);

        List<Integer> integers = boundaryTravelsal(node);
        System.out.println(integers);

    }

    public static List<Integer> boundaryTravelsal(Node node) {


        List<Integer> integers = new ArrayList<>();
        integers.addAll(leftTree(node, integers));


        List<Integer> leaf = new ArrayList<>();
         leafTravel(node.left, node.right, leaf);
        integers.addAll(leaf);

        List<Integer> rightList = new ArrayList<>();
        rightTree(node, rightList);
        integers.addAll(rightList);

        return integers;
    }


    public static List<Integer> leftTree(Node node, List<Integer> nodes) {

        if (node != null) {
            if (node.left == null) {
                return new ArrayList<>();
            }
            nodes.add(node.data);
            return leftTree(node.left, nodes);
        }
        return nodes;
    }

    public static List<Integer> rightTree(Node node, List<Integer> nodes) {
        if (node != null) {
            rightTree(node.right, nodes);
            if(node.right!=null){
                nodes.add(node.data);
            }
            return nodes;
        }
        return nodes;
    }

    public static List<Integer> leafTravel(Node left, Node right, List<Integer> nodes) {
        if (left != null && left.left == null && left.right == null) {
            nodes.add(left.data);
        }
        if (right != null && right.left == null && right.right == null) {
            nodes.add(right.data);
        }
        if (left == null && right == null) {
            return nodes;
        }
        Node leftTree = left == null ? null : left.left;
        Node rightTree = left == null ? null : left.right;
        leafTravel(leftTree, rightTree, nodes);
        leftTree = right == null ? null : right.left;
        rightTree = right == null ? null : right.right;
        leafTravel(leftTree, rightTree, nodes);
        return nodes;

    }

    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
