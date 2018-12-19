package practice.algorithm;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrintBottomViewOfBinaryTree {


    static class Node {
        int data; //data of the node
        int hd; //horizontal distance of the node
        Node left, right; //left and right references

        public Node(int key) {
            data = key;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }

    public static void bottomView(Node node) {
        Map<Integer, Node> map = new LinkedHashMap<>();
        printBottomView(node,map,0);
        map.values().forEach(n-> System.out.print(n.data+" "));
    }

    public static void printBottomView(Node node, Map<Integer, Node> map, int hieght) {
        if (node == null) {
            return;
        }
        map.put(hieght, node);
        printBottomView(node.left, map, hieght - 1);
        printBottomView(node.right, map, hieght + 1);
        return;
    }
}
