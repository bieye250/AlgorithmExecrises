package Leetcode202207;

import java.util.HashMap;

public class Leetcode6134 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if(node1 == node2) return node1;
        var list1 = new HashMap<Integer,Integer>();
        var list2 = new HashMap<Integer,Integer>();
        int idx = node1, cnt = 1;
        while(idx>=0&&(edges[idx]!=node1 && edges[idx]!=-1)&&!list1.containsKey(edges[idx])){
            list1.put(edges[idx],cnt++);
            idx = edges[idx];
        }
        idx = node2; cnt = 1;
        while(idx>=0&&edges[idx]!=node2 && edges[idx]!=-1&&!list2.containsKey(edges[idx])){
            list2.put(edges[idx],cnt++);
            idx = edges[idx];
            System.out.println(idx+" "+edges[idx]);
        }
        int min = 1<<30; idx = 1<<30;
        if(list1.containsKey(node2)) {min=list1.get(node2);idx=node2;}
        if(list2.containsKey(node1)) {
            var t = list2.get(node1);
            if(t < min){
                min = t;
                idx = node1;
            }
            else if(t == min){
                idx = Math.min(idx,node1);
            }
        }
        // for(int i : list2.keySet()) System.out.println(i);
        for(int i : list1.keySet()){
            if(list2.containsKey(i)) {
                int t = Math.max(list1.get(i),list2.get(i));
                // System.out.println(t);
                if(t<min){
                    min = t;
                    idx = i;
                }
                else if(t == min){
                    if(i<idx) idx = i;
                }
            }
        }
        if(min == (1<<30)) return -1;
        return idx;
     }
}
