package practice.algorithm;

public class LinkedListSwapTwoNodes {


    public static Node swapTwoNodes(Node node) {
        Node head = node.next;

        Node fastPointer = node.next.next;

        while (fastPointer != null) {
            Node temp = node.next;
            temp.next = node;
            node.next = fastPointer;
            if (fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
            }
        }

        return head;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
