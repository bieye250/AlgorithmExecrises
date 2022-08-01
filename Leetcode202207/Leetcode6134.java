package Leetcode202207;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode6134 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        var list1 = new HashMap<Integer,Integer>();
        var list2 = new HashMap<Integer,Integer>();
        int idx = node1, cnt = 1;
        while(idx>=0&&(edges[idx]!=node1 || edges[idx]!=-1)&&!list1.containsKey(edges[idx])){
            list1.put(edges[idx],cnt++);
            idx = edges[idx];
        }
        idx = node2; cnt = 1;
        while(idx>=0&&(edges[idx]!=node2 || edges[idx]!=-1)&&!list2.containsValue(edges[idx])){
            list2.put(edges[idx],cnt++);
            idx = edges[idx];
        }
        int min = 1<<30; idx = 0;
        if(list1.containsKey(node2)) {min=list1.get(node2);idx=node2;}
        if(list2.containsKey(node1)) {min=list2.get(node1);idx=node1;}
        for(int i : list1.keySet()){
            if(list2.containsKey(i)) {
                int t = list1.get(i)+list2.get(i);
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
        return min;
    }
}
