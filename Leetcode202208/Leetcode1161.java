package Leetcode202208;

public class Leetcode1161 {
    public int maxLevelSum(TreeNode root) {
        int cnt = 1, res = 1, floor = 2;
        long sum = 1L*root.val;
        var deque = new ArrayDeque<TreeNode>();
        deque.offer(root);
        while(!deque.isEmpty()){
            var p = 0L;
            while(cnt-- > 0){
                var t = deque.poll();
                if(t.left==null&&t.right==null) continue;
                else if(t.left==null) {
                    deque.offer(t.right);
                    p += t.right.val;
                }
                else if(t.right==null) {
                    deque.offer(t.left);
                    p += t.left.val;
                }
                else {
                    deque.offer(t.left);deque.offer(t.right);
                    p += 1L*t.left.val+t.right.val;
                }
            }
            cnt = deque.size();
            if(p > sum && deque.size()>0){
                System.out.println(p);
                sum = p;
                res = floor;
            }
            floor++;
        }
        return res;
    }
}
