package Leetcode202211;

public class Leetcode790 {
    public int numTilings(int n) {
        var dp = new int[n+1][4];
        var mod = 1_000_000_007;

        dp[0][3] = 1;
        for(int i=1; i<=n; i++){
            dp[i][0] = dp[i-1][3];
            dp[i][1] = (dp[i-1][2] + dp[i-1][0]) % mod;
            dp[i][2] = (dp[i-1][1] + dp[i-1][0]) % mod;
            dp[i][3] = ((dp[i-1][0]+dp[i-1][3])%mod+(dp[i-1][1]+dp[i-1][2]) % mod)%mod;
        }
        return dp[n][3];
    }
}
