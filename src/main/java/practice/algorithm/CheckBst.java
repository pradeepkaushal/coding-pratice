package practice.algorithm;

public class CheckBst {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.left.right.right = new TreeNode(17);

        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(7);

        System.out.println(checkBST(root, null, null));
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        Integer data;

        public TreeNode(Integer data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data + " " + this.left + " " + this.right;
        }
    }

    public static boolean checkBST(TreeNode n, Integer min, Integer max) {
        if (n == null) {
            return true;
        }

        if ((min != null && n.data <= min) || (max != null && n.data > max)) {
            return false;
        }
        if (!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)) {
            return false;
        }

        return true;
    }
}
