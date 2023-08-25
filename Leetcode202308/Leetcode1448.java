package Leetcode202308;

public class Leetcode1448{
    public int goodNodes(TreeNode root) {
        var ans = 1;
        ans += dfs(root.left,  root.val);
        ans += dfs(root.right, root.val);
        return ans;
    }

    public int dfs(TreeNode node, int max){
        if(node == null) return 0;

        var ans = 0;
        if(node.val >= max){
            ans++;
            max = node.val;
        }

        ans += dfs(node.left, max);
        ans += dfs(node.right, max);
        return ans;
    }
}