package Leetcode202208;

public class Leetcode623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            var node = new TreeNode(val);
            node.left = root;
            return node;
        }
        int high = 1;
        var head = root;
        var deque = new ArrayDeque<TreeNode>();
        deque.offer(root);
        while(!deque.isEmpty()){
            var size = deque.size();
            if(high != depth -1){
                while(size-->0){
                    var node = deque.poll();
                    if(node.left!=null) deque.offer(node.left);
                    if(node.right!=null) deque.offer(node.right);    
                }
                high++;
            }
            else{
                while(size-->0){
                    var node = deque.poll();
                    var l = new TreeNode(val,node.left,null);
                    var r = new TreeNode(val,null,node.right);
                    node.left = l;
                    node.right = r;
                }
                return root;
            }
        }
        return root;
    }
}
