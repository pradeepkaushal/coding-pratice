package practice.algorithm;

public class MinDepth {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);

    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);

    root.right.right = new TreeNode(7);

    MinDepth main = new MinDepth();

    main.minDepth(root);
  }

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int leftDepth = minDepth(root.left);
    int rightDepth = minDepth(root.right);

    if (leftDepth == 0 || rightDepth == 0) {
      return Math.max(leftDepth, rightDepth) + 1;
    } else {
      return Math.min(leftDepth, leftDepth) + 1;
    }
  }

  // Definition for a binary tree node.
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
  }
}
