package practice.algorithm;

import java.util.ArrayList;
import java.util.List;

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
        buildTree(node,nodes);
        System.out.println(inOrderTraversal(node,new ArrayList<>()));
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
            return data+"";
        }
    }

    static List<Node > inOrderTraversal(Node node, List<Node> nodes){
        if(node!=null){
            inOrderTraversal(node.left,nodes);
            nodes.add(node);
            inOrderTraversal(node.right,nodes);

        }
        return nodes;
    }

    public static void buildTree(Node node, List<Node> nodes){
        if(node==null){
            return;
        }
        buildTree(node.left,nodes);
        node.data=nodes.get(0).data;
        nodes.remove(0);
        buildTree(node.right,nodes);
    }


}
