package Leetcode202207;

public class Leetcode814 {
    public TreeNode dfs(TreeNode root){
        if(root == null) return null;
        if (root.left == null && root.right == null && root.val == 0)  return null;
        root.left = dfs(root.left);
        root.right = dfs(root.right);
        if (root.left == null && root.right == null && root.val == 0)  return null;
        return root;
    }
}
