package Leetcode202212;

public class Leetcode2486 {
    public int appendCharacters(String s, String t) {
        int l1 = s.length(), l2 = t.length();
        int l = 0, r = 0;
        while(l < l1 && r < l2){
            if(s.charAt(l) == t.charAt(r)) r++;
            l++;
        }
        return l2-r;
    }
}
