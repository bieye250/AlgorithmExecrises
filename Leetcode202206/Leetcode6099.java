package Leetcode202206;

public class Leetcode6099 {
    public int longestSubsequence(String s, int k) {
        long cur = 0L;
        int len = s.length();
        var cnt = new int[len];
        if(s.charAt(0)=='0') cnt[0]=1;
        else cnt[0] = 0;
        for(int i=1;i<len;i++){
            if(s.charAt(i)=='0') cnt[i]=cnt[i-1]+1;
            else cnt[i] = cnt[i-1];
        }
        for(int i=len-1;i>=0;i--){
            cur=cur+((long)(s.charAt(i)-'0')<<(len-i-1));
            System.out.println(cur);
            if(cur > k) return cnt[i]+(len-i-1);
        }
        
        if(cur < k) return len;
        return cnt[0];
    }
}
