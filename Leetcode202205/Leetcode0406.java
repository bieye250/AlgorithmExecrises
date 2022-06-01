package Leetcode202205;
public class Leetcode0406 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;
        if (root.val <= p.val)
            return inorderSuccessor(root.right, p);
        TreeNode ans = inorderSuccessor(root.left, p);
        return ans == null ? root : ans;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
