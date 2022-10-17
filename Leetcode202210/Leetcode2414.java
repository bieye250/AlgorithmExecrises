package Leetcode202210;

public class Leetcode2414 {
    public int longestContinuousSubstring(String s) {
        int ans = 1, left = 0, len = s.length(), right = 1;
        while(right < len){
            if(s.charAt(right) != s.charAt(right-1)+1){
                ans = Math.max(ans,right-left);
                left = right;
            }
            right++;
        }
        return Math.max(ans,right-left);
    }
}
