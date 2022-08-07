package Leetcode202208;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Leetcode6139 {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        int len = edges.length, rlen = restricted.length, ans = 0;
        var visited = new boolean[len];
        ArrayList<Integer>[] tree = new ArrayList[len];
        for(int[] i : edges){
            if(tree[i[0]] == null) tree[i[0]] = new ArrayList<Integer>();
            if(tree[i[1]] == null) tree[i[1]] = new ArrayList<Integer>();
            tree[i[0]].add(i[1]);
            tree[i[1]].add(i[0]);
        }
        var set = new HashSet<Integer>();
        Arrays.stream(restricted).forEach(i->set.add(i));
        visited[0] = true;
        var deque = new ArrayDeque<Integer>();
        deque.offer(0);
        while(!deque.isEmpty()){
            int t = deque.poll();
            int size = tree[t].size();
            for(int i=0;i<size;i++){
                int m = tree[t].get(i);
                if(!visited[m] && !set.contains(m)){
                    ans++;
                    visited[m] = true;
                    deque.offer(m);
                }
            }
        }
        return ans;
    }
}
