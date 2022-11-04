package Leetcode202210;

import java.util.*;

public class Leetcode784 {
    int diff = 'a' - 'A';
    public List<String> letterCasePermutation(String s) {
        var list = new ArrayList<String>();
        list.add(s);

        int len = s.length();
        int cnt = 1 << len;
        for(int i=1; i<cnt; i++){
            var sb = new StringBuffer();
            for(int j=0;j<len;j++){
                if(s.charAt(j) <= '9') sb.append(s.charAt(j));
                else if(((i >> j) & 1) == 1) sb.append(swt(s.charAt(j)));
                else sb.append(s.charAt(j));
            }
            list.add(sb.toString());
        }
        return list;
    }
    public char swt(char c){
        if(c <= 'Z') return (char)(c+diff);
        else return (char)(c - diff);
    }    
}
