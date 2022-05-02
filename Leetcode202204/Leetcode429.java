package Leetcode202204;
import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList();
        if (root == null) return ans;
        Deque<Node> deque = new ArrayDeque();
        deque.offer(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            List list = new ArrayList<Integer>();
            for (int i=0; i<size; i++){
                Node node = deque.pollFirst();
                System.out.println(node.val);
                list.add(node.val);
                if(node.children != null){
                    for (Node n : node.children)
                        deque.offer(n);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}