package practice.algorithm;

import java.util.HashMap;
import java.util.Map;

public class PrintTopViewOfBinaryTree {
    public static void main(String[] args) {

        TreeNode node = new TreeNode(20);
        node.left = new TreeNode(8);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(12);
        node.left.right.left = new TreeNode(10);
        node.left.right.right = new TreeNode(14);
        node.right = new TreeNode(22);
        node.right.right = new TreeNode(25);
        printTopView(node);

    }


    public static void printTopView(TreeNode treeNode) {
        HashMap<Integer, Integer> map = new HashMap<>();
        topView(treeNode, map, 0);
        map.values().forEach(data -> System.out.print(data + " "));
    }


    public static void topView(TreeNode node, Map<Integer, Integer> map, int height) {
        if (node != null) {

            if (!map.containsKey(height)) {
                map.put(height, node.key);
            }
            topView(node.left, map, height - 1);
            topView(node.right, map, height + 1);
        }
        return;
    }


    static class TreeNode {
        int key;
        TreeNode left, right;

        public TreeNode(int key) {
            this.key = key;
            left = right = null;
        }
    }
}
