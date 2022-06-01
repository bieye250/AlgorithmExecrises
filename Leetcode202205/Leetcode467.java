package Leetcode202205;
public class Leetcode467 {
    public int findSubstringInWraproundString(String p) {
        var dp = new int[26];
        dp[p.charAt(0)-'a'] = 1;
        var cnt = 1;
        for(int i=1; i<p.length(); i++){
            if((p.charAt(i)-p.charAt(i-1)+26)%26==1) cnt++;
            else cnt = 1;
            dp[p.charAt(i)-'a']=Math.max(dp[p.charAt(i)-'a'],cnt);
        }
        return Arrays.stream(dp).sum();
    }
}
