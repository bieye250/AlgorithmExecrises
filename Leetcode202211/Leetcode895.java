package Leetcode202211;

public class Leetcode895 {
    Map<Integer,Integer> map;
    Map<Integer, Deque<Integer>> group;
    int maxF;
    public FreqStack() {
        map = new HashMap();
        group = new HashMap();
        maxF = 0;
    }
    
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        int f = map.get(val);
        group.putIfAbsent(f, new ArrayDeque());
        group.get(f).push(val);
        maxF = Math.max(maxF,map.get(val));
    }
    
    public int pop() {
        int val = group.get(maxF).pop();
        map.put(val,maxF-1);
        if(group.get(maxF).size() == 0) maxF--;
        return val;
    }
}
