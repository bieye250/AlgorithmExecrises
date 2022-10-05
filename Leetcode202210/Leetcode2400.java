package Leetcode202210;

public class Leetcode2400 {
    public int numberOfWays(int startPos, int endPos, int k) {
        var mod = 1_000_000_007;
        var dis = Math.abs(startPos-endPos);
        if(dis > k || (k-dis)%2!=0) return 0;
        
        var dp = new int[2002+startPos][k*2+2];
        dp[1000+startPos+1][1] = 1;
        dp[1000+startPos-1][1] = 1;
        for(int i=2;i<=k;i++){
            for(int j=1000+startPos-i;j<=1000+startPos+i;j++){
                dp[j][i] = (dp[j-1][i-1]+dp[j+1][i-1]) % mod;
            }
        }

        return dp[1000+endPos][k];
    }
}
