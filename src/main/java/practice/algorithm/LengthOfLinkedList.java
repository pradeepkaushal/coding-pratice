package practice.algorithm;

public class LengthOfLinkedList {
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

        System.out.println(findLenght(list1));
    }

    public static int findLenght(CustomList list) {
        if (list == null) {
            return 0;
        }
        int count = 1 + findLenght(list.next);
        return count;

    }


    static class CustomList {
        int data;
        CustomList next;

        public CustomList(int data) {
            this.data = data;
        }
    }

}
