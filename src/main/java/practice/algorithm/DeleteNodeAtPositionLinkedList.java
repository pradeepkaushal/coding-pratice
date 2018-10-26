package practice.algorithm;

public class DeleteNodeAtPositionLinkedList {
    public static void main(String[] args) {
        CustomList list1 = new CustomList(1);
        CustomList list2 = new CustomList(2);
        CustomList list3 = new CustomList(3);
        CustomList list4 = new CustomList(4);
        CustomList list5 = new CustomList(5);
        CustomList list6 = new CustomList(6);
        list1.next = list2;
        list1.next.next = list3;
        list1.next.next.next = list4;
        list1.next.next.next.next = list5;
        list1.next.next.next.next.next = list6;

        System.out.println(deleteNodeAt(list1,2));
    }

    public static CustomList deleteNodeAt(CustomList list,int index){
        CustomList internal=list;
        CustomList prev=internal;
        for(int i=0;i<index-1;i++){
            prev=list.next;
        }
        CustomList temp=prev.next.next;
        prev.next=temp;
        return list;
    }
    static class CustomList {
        int data;
        CustomList next;

        public CustomList(int data) {
            this.data = data;
        }

        @Override
        public String toString(){
            return "["+data+"]->"+next;
        }
    }
}
