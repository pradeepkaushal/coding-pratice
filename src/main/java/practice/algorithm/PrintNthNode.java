package practice.algorithm;

public class PrintNthNode {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node nextNode = head;
        for (int i = 1; i < 10; i++) {
            Node temp = new Node(i);
            nextNode.next=temp;
            nextNode=temp;
        }
        System.out.println(head);
        Node node = printNthNode(head, 2);
        System.out.println(node);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data + "->" + next;
        }
    }

    public static Node printNthNode(Node head,int n){
        Node first=head;
        Node second=head;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        while (first!=null){
            first=first.next;
            second=second.next;
        }


        return second;
    }
}
