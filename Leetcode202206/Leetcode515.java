package Leetcode202206;

public class Leetcode515 {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        var list = new ArrayList<Integer>();
        var queue = new ArrayDeque<TreeNode>();
        var size = 1;
        queue.offer(root);
        while(!queue.isEmpty()){
            int max = 1<<31, next = 0;
            while(size-- > 0){
                var node = queue.poll();
                max = max>node.val?max:node.val;
                if(node.left!=null){queue.offer(node.left);next++;}
                if(node.right!=null){queue.offer(node.right);next++;}
            }
            size = next;
            list.add(max);
        }
        return list;
    }
}
