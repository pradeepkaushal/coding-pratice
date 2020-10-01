package practice.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class InorderTraversalIteration {

  public static void main(String[] args) {
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(2);
    InorderTraversalIteration travelsal = new InorderTraversalIteration();
    travelsal.inorderTraversal(node);
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    if (root == null) {
      return list;
    }
    Stack<TreeNode> stack = new Stack<>();
    Set<TreeNode> visited = new HashSet<>();
    visited.add(root);
    stack.add(root);

    while (!stack.isEmpty()) {
      TreeNode tempNode = stack.peek();
      if (tempNode.left != null && visited.add(tempNode.left)) {
        stack.add(tempNode.left);
      } else {
        list.add(tempNode.val);
        stack.pop();
        if (tempNode.right != null) {
          stack.add(tempNode.right);
        }
      }
    }

    return list;
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return "TreeNode{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
    }
  }
}
