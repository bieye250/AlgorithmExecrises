package Leetcode202207;

public class Leetcode919 {
    TreeNode head;
    Deque<TreeNode> deque;
    public CBTInserter(TreeNode root) {
        head = root;
        deque = new ArrayDeque();
        deque.offer(root);
    }
    
    public int insert(int val) {
        return levelT(head,val);
    }
    public int levelT(TreeNode head, int val){
        int len = deque.size();
        var node = new TreeNode(val,null,null);
        while(len > 0){
        for(TreeNode t : deque){
            if(t.left == null){
                t.left = node;
                return t.val;
            }
            else if(t.right == null){
                t.right = node;
                return t.val;
            }
        }
        while(len-- > 0){
            var n = deque.poll();
            deque.offer(n.left);
            deque.offer(n.right);
        }
        for(TreeNode t : deque){
            //System.out.println("???");
            if(t.left == null){
                t.left = node;
                return t.val;
            }
            else if(t.right == null){
                t.right = node;
                return t.val;
            }
        }
        len = deque.size();
        }
        return -1;
    }
    public TreeNode get_root() {
        return head;
    }
}
