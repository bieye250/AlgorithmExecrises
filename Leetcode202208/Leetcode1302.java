package Leetcode202208;

public class Leetcode1302 {
    public int deepestLeavesSum(TreeNode root) {
        var deque = new ArrayDeque<TreeNode>();
        deque.offer(root);
        var ans = 0;
        var cnt = 1;
        while(!deque.isEmpty()){
            var f = false;
            while(cnt-->0){
                var t = deque.poll();
                ans += t.val;
                if(t.left != null) {deque.offer(t.left);f=true;}
                if(t.right != null) {deque.offer(t.right);f=true;}
            }
            cnt = deque.size();
            if(f) ans = 0;
            else return ans;
        }
        return ans;
    }
}
