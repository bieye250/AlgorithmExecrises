package Leetcode2022006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode508 {
    Map<TreeNode,Integer> map = new HashMap();
    Map<Integer,Integer> cnt = new HashMap();
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        int ans = 0;
        var list = new ArrayList<Integer>();
        for(Integer i : cnt.keySet()){
            int t = cnt.get(i);
            if(t > ans) {
                ans = t;
                list.clear();
                list.add(i);
            }
            else if(t == ans) list.add(i);
        }
        for(int i: list)  System.out.println(i);
        var res = new int[list.size()];
        ans=0;
        for(int i : list) res[ans++]=i;
        return res;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int t = dfs(root.left)+dfs(root.right)+root.val;
        map.put(root,t);
        cnt.put(t,cnt.getOrDefault(t,0)+1);
        return t;
    }
    class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
}
