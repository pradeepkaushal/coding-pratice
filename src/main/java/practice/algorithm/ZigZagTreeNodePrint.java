package practice.algorithm;

/**
 * For example, given the following tree:
 * <p>
 * 1
 * /     \
 * 2         3
 * / \       / \
 * 4   5     6   7
 * You should return [1, 3, 2, 4, 5, 6, 7].
 */
public class ZigZagTreeNodePrint {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);

        node.left.left = new Node(4);
        node.left.right = new Node(5);

        node.right.left = new Node(6);
        node.right.right = new Node(7);


        zigZagNode(node, false);

    }

    public static void zigZagNode(Node node, boolean flag) {
        if(node==null){
            return;
        }
        System.out.println(node.data);
        if (!flag) {
            zigZagNode(node.left, true);
            zigZagNode(node.right, false);
        } else {
            zigZagNode(node.right, false);
            zigZagNode(node.left, true);
        }
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
