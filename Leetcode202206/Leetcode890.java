package Leetcode202206;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode890{
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int len = pattern.length();
        var l = new ArrayList<String>();
        for(int i=0; i<words.length; i++){
            if(words[i].length() != len) continue;
            var cnt = new char[len];
            var map = new HashMap<Character,Character>();
            var remap = new HashMap<Character,Character>();
            var f = false;
            for(int j=0; j<len; j++){
                if(!map.containsKey(words[i].charAt(j))){
                    if(remap.containsKey(pattern.charAt(j))){
                        if(remap.get(pattern.charAt(j))!=words[i].charAt(j)){f = true;break;}
                    }
                    else remap.put(pattern.charAt(j),words[i].charAt(j));
                    map.put(words[i].charAt(j),pattern.charAt(j));
                }
                else{
                    if(map.get(words[i].charAt(j))!=pattern.charAt(j)){f=true;break;}
                }
            }
            if(!f) l.add(words[i]);
        }
        return l;
    }
}