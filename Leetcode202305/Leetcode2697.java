package Leetcode202305;

public class Leetcode2697 {
    public String makeSmallestPalindrome(String s) {
        var len = s.length();
        int l = 0, r = len-1;
        char[] c = s.toCharArray();
        while (l < r){
            if(c[l] != c[r]){
                if(c[l] > c[r]) c[l] = c[r];
                else c[r] = c[l];
            }
            l++;  r--;
        }
        return new String(c);
    }
}
