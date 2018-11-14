package practice.algorithm;

/**
 * https://www.geeksforgeeks.org/?p=5075
 */
public class RemoveDuplicateFromSortedLinkedList {

    public static void main(String[] args) {
        Node node1 = new Node(11);
        Node node2 = new Node(11);
        Node node3 = new Node(11);
        Node node4 = new Node(21);
        Node node5 = new Node(43);
        Node node6 = new Node(43);
        Node node7 = new Node(60);
        node1.next=node2;
        node1.next.next=node3;
        node1.next.next.next=node4;
        node1.next.next.next.next=node5;
        node1.next.next.next.next.next=node6;
        node1.next.next.next.next.next.next=node7;

        recursive(node1);
        System.out.println(node1);


    }


    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data+"->"+next;
        }
    }

    public static void removeDuplicate(Node head){
        Node temp=head.next;
        while(temp!=null){
            if(head.data==temp.data){
               temp= temp.next;
               head.next=temp;
            }else{
                head=head.next;
            }
        }

    }


    public static void recursive(Node head){
        if(head.next==null){
            return;
        }
        if(head.data==head.next.data){
            head.next=head.next.next;
        }else{
            head=head.next;
        }
        recursive(head);
    }
}
