package practice.algorithm;

import java.util.Scanner;

/**
 * https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/practice-problems/algorithm/remove-friends-5/
 */
public class RemoveFriendsSingleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        String[] split = sc.nextLine().split(" ");
        Integer noOfFriend=Integer.parseInt(split[0]);
        Integer deleteFriend=Integer.parseInt(split[1]);

        int[] friend=new int[noOfFriend];
        for(int i=0;i<noOfFriend;i++){
            friend[i]=sc.nextInt();
        }
        FriendList friendList=new FriendList(friend[0]);
        FriendList temp;
        FriendList currentPointer;
        for(int i=1;i<noOfFriend;i++){
            currentPointer=new FriendList(friend[i]);
            friendList.next=currentPointer;

        }

    }

    private static class FriendList{
        int popularity;
        FriendList next;

        public FriendList(int popularity) {
            this.popularity = popularity;
        }
    }
}
