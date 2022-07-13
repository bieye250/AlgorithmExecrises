package Leetcode2022006;

public class Leetcode450{
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        TreeNode pre = root, cur = root;
        while(cur!=null && cur.val != key){
            pre = cur;
            if(cur.val < key){
                cur = cur.right;
            }
            else cur = cur.left;
        } 
        if(cur != null){
            if(cur.right!=null&&cur.left!=null){
            TreeNode node = cur.right;
            while(node.left!= null){
                node = node.left;
            }
            node.left = cur.left;
            if(pre.right!=null&&pre.right.val==key){
                pre.right = cur.right;
            }
            else if(pre.left!=null&&pre.left.val==key){
                pre.left = cur.right;
            }
        }
        else if(cur.left == null){
            if(pre.right!=null&&pre.right.val==key){
                pre.right = cur.right;
            }
            else if(pre.left!=null&&pre.left.val==key){
                pre.left = cur.right;
            }
        }
        else{
            if(pre.right!=null&&pre.right.val==key){
                pre.right = cur.left;
            }
            else if(pre.left!=null&&pre.left.val==key){
                pre.left = cur.left;
            }
        }
        }
        if(root.val == key){
            if(root.right!=null) return root.right;
            else  return root.left;
        }
        return root;
    }
}