package practice.algorithm;

public class FindMiniumInBST {
    public static Node findMinimum(Node node){
       if(node.left==null){
           return node;
       }
       return findMinimum(node.left);
    }
    public static class Node{
        Node left;
        Node right;
        int data;
    }
}
