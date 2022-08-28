package Leetcode202208;

import java.util.ArrayDeque;

public class Leetcode6161 {
    public String removeStars(String s) {
        var len = s.length();
        var deque = new ArrayDeque<Character>();
        for(int i=0;i<len;i++){
            if(s.charAt(i) != '*') deque.offerLast(s.charAt(i));
            else deque.pollLast();
        }
        var sb = new StringBuffer();
        deque.forEach(i->sb.append(i));
        return sb.toString();
    }
}