package Leetcode202208;

public class Leetcode946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        var len = pushed.length;
        int idx = 0, p = 1;
        var deque = new ArrayDeque<Integer>();
        for(;idx<len;idx++){
            deque.offerFirst(pushed[idx]);
            if(pushed[idx]==popped[0]) break;
        }
        //for(int i : deque) System.out.println(i);
        if(deque.peek() == popped[0]){
            deque.poll();
            idx++;
            while(p<len){
                if(deque.isEmpty()||deque.peek()!=popped[p]){
                    while(idx<len&&pushed[idx]!=popped[p]){
                        deque.offerFirst(pushed[idx++]);
                    }
                    if(idx==len) return false;
                    idx++;
                }
                else deque.poll();
                p++;
            }
            if(p == len) return true;
        }
        return false;
    }    
}
