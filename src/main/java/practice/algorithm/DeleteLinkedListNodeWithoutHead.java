package practice.algorithm;

public class DeleteLinkedListNodeWithoutHead {




    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    void deleteNode(Node del)
    {
        del.data=del.next.data;
        del.next=del.next.next;
    }
}
