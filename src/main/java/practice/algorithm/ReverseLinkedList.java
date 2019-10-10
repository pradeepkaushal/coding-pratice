package practice.algorithm;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node1.next.next = node3;
        node1.next.next.next = node4;
        System.out.println(node1);
        Node reverse1 = reverse(node1);
        System.out.println(reverse1);
        Node reverse = reverseList(node1, null);
        System.out.println(reverse);

    }

    public static Node reverse(Node node) {

        Node current = node;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;

        return node;

    }

    public static Node reverseList(Node node, Node prev) {
        if (node == null) {
            return prev;
        }
        Node next = node.next;
        node.next = prev;
        prev = node;
        return reverseList(next, prev);
    }


    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data + "->" + next;
        }
    }

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode node) {


        DoublyLinkedListNode prev = null;
        DoublyLinkedListNode current = node;
        while (current != null) {
            DoublyLinkedListNode next = current.next;
            current.next = prev;
            prev = current;
            prev.prev = current.prev;
            current = next;

        }

        return prev;

    }
}
