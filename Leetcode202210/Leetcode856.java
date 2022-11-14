package Leetcode202210;

public class Leetcode856 {
    public int scoreOfParentheses(String s) {
        var deque = new ArrayDeque<Integer>();
        var len = s.length();
        var res = 0;

        for(int i=0;i<len;i++){
            if(s.charAt(i) == '(') deque.offer(-1);
            else {
                var t = deque.pollLast();
                if(t == -1) deque.offer(1);
                else{
                    
                    // //for(int j : deque) System.out.println(j);
                    // //System.out.println("??"+t);
                    // //deque.offer(t*2);
                    // t *= 2;
                    while(!deque.isEmpty()&&deque.peekLast()>0) 
                        t+=deque.pollLast();
                    deque.pollLast();
                    deque.offer(t*2);
                    // System.out.println("??"+t);
                }
            }
        }
        for(int i : deque) res+=i;
        return res;
    }    
}
