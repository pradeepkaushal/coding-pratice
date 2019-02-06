package practice.algorithm;

import java.util.*;

public class DiagonalTravelsalOfTree {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        diagonalUtil(root);
        Map<Integer,Integer> map=new HashMap<>();

    }


    public static void diagonalUtil(Node node) {
        Map<Integer, List<Node>> map = new LinkedHashMap<>();
        Map<Integer, List<Node>> integerListMap = printDiagonal(node, 0, map);
        for (Map.Entry<Integer, List<Node>> entry : integerListMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static Map<Integer, List<Node>> printDiagonal(Node node, int d, Map<Integer, List<Node>> map) {

        if (node == null) {
            return map;
        }
        List<Node> nodes = map.get(d);
        if (nodes == null) {
            nodes = new ArrayList<>();
            nodes.add(node);
        } else {
            nodes.add(node);
        }
        map.put(d, nodes);

        printDiagonal(node.left, d + 1, map);
        printDiagonal(node.right, d, map);

        return map;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data+" ";
        }
    }
}
