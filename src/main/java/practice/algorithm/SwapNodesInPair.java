package practice.algorithm;

public class SwapNodesInPair {


    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);
        list.next.next.next.next.next.next = new ListNode(7);


        ListNode listNode = swapPairs(list);

        System.out.println(listNode);


        ListNode linkedList = reverseLinkedList(list, null);
        System.out.println(linkedList);

    }

    public static ListNode swapPairs(ListNode head) {


        if (head == null) {
            return head;
        }

        ListNode temp = head.next;
        if (temp == null) {
            return head;
        }
        ListNode fastNode = temp.next;

        //Swap the nodes
        temp.next = head;
        head = temp;


        head.next.next = swapPairs(fastNode);
        return head;

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + "->" + next;
        }
    }

    public static ListNode reverseLinkedList(ListNode node, ListNode prev) {
        if (node == null) {
            return prev;
        }

        ListNode next = node.next;
        node.next = prev;
        prev = node;


        return reverseLinkedList(next, prev);
    }
}
