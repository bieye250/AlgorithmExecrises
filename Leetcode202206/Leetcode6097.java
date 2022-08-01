package Leetcode202206;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode6097 {
    public boolean matchReplacement(String s, String sub, char[][] mappings) {
        if(s.contains(sub)) return true;
        var map = new HashMap<Character,ArrayList<Character>>();
        int len = s.length(), mlen = mappings.length, slen = sub.length();
        for(int i=0; i<mlen; i++){
            if(!map.containsKey(mappings[i][0])){
                var l = new ArrayList<Character>();
                l.add(mappings[i][1]);
                map.put(mappings[i][0],l);
            }
            else map.get(mappings[i][0]).add(mappings[i][1]);
        }
        
    }
}
