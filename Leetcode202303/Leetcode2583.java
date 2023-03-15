package Leetcode202303;

public class Leetcode2583 {
    public long kthLargestLevelSum(TreeNode root, int k) {
        var deque = new ArrayDeque<TreeNode>();
        var list = new ArrayList<Long>();
        deque.offer(root);
        while(deque.size() > 0){
            var len = deque.size();
            var l = 0L;
            while(len-- > 0){
                var node = deque.poll();
                l += node.val;
                if(node.left != null) deque.offer(node.left);
                if(node.right != null) deque.offer(node.right);
            }
            list.add(l);
        }

        var cnt = list.toArray(new Long[0]);
        var len = cnt.length;
        if(k > len) return -1L;
        // Arrays.sort(cnt);
        // return cnt[len-k];
            int l = len-1, r = 0;
            while(true){
                while(cnt[r] >= cnt[k-1] && r < k-1) {if(r == k-1) break;r++;}
                while(cnt[l] <= cnt[k-1] && l > k-1) {if(l == k-1) break;l--;}
                if(l > r){
                    cnt[r] ^= cnt[l];
                    cnt[l] ^= cnt[r];
                    cnt[r] ^= cnt[l];
                    l = len-1; r = 0;
                }
                if(l == r) return cnt[l];
            }
        // return cnt[k-1];
    }
}
