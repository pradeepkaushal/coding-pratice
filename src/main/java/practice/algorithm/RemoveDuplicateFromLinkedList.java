package practice.algorithm;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedLinkedList.Node node1 = new RemoveDuplicateFromSortedLinkedList.Node(11);
        RemoveDuplicateFromSortedLinkedList.Node node2 = new RemoveDuplicateFromSortedLinkedList.Node(11);
        RemoveDuplicateFromSortedLinkedList.Node node3 = new RemoveDuplicateFromSortedLinkedList.Node(11);
        RemoveDuplicateFromSortedLinkedList.Node node4 = new RemoveDuplicateFromSortedLinkedList.Node(21);
        RemoveDuplicateFromSortedLinkedList.Node node5 = new RemoveDuplicateFromSortedLinkedList.Node(43);
        RemoveDuplicateFromSortedLinkedList.Node node6 = new RemoveDuplicateFromSortedLinkedList.Node(43);
        RemoveDuplicateFromSortedLinkedList.Node node7 = new RemoveDuplicateFromSortedLinkedList.Node(60);
        node1.next=node2;
        node1.next.next=node3;
        node1.next.next.next=node4;
        node1.next.next.next.next=node5;
        node1.next.next.next.next.next=node6;
        node1.next.next.next.next.next.next=node7;

        System.out.println(node1);
    }


    public static class Node {
        int data;
        RemoveDuplicateFromSortedLinkedList.Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data+"->"+next;
        }
    }

    public static void removeDuplicate(Node head){

    }
}
