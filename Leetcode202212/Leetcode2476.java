package Leetcode202212;

public class Leetcode2476 {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        ArrayList<List<Integer>> ans = new ArrayList<>(queries.size());
        var list = new ArrayList<Integer>();
        var deque = new ArrayDeque<TreeNode>();
        deque.offer(root);
        while(deque.size() > 0){
            while(root.left != null){
                root = root.left;
                deque.offerFirst(root);
            }
            var t = deque.poll();
            list.add(t.val);
            if(t.right != null) {
                deque.offerFirst(t.right);
                root = t.right;
            }
        }
        for(int i : queries){
            var t = new ArrayList<Integer>(2);
            int left = 0, right = list.size()-1;
            int min = -1, max = -1;
            while(left <= right){
                var mid = (left + right) >>1;
                if(list.get(mid) == i){ min = max = i;break;}
                else if(list.get(mid) > i){
                    max = list.get(mid);
                    right = mid-1;
                }
                else {
                    min = list.get(mid);
                    left = mid + 1;
                }
            }
            t.add(min);t.add(max);
            ans.add(t);
        }
        return ans;
    }
}
