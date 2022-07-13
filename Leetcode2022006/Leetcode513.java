package Leetcode2022006;

public class Leetcode513 {
    int h = 0, ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,1);
        return ans;
    }
    public int dfs(TreeNode root, int high){
        System.out.println(root.val+" "+high);
        if(high > h) {ans = root.val;h = high;}
        if(root.left != null) dfs(root.left, high+1);
        if(root.right != null) dfs(root.right, high+1);
        return 0;
    }
}
