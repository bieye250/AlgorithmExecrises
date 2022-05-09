public class Leetcode6057 {
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
class Solution {
    int ans;
    int[] dfs(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int[] ret = {node.val + left[0] + right[0], 1 + left[1] + right[1]};
        if (node.val == ret[0] / ret[1]) ans++;
        return ret;
    }

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }
}
}
