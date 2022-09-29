package Leetcode202209;
public class LeetcodeM1709 {
    public int getKthMagicNumber(int k) {
        var dp = new int[k+1];
        dp[1] = 1;
        int p3 = 1, p5 = 1, p7 = 1;
        for(int i=2;i<=k;i++){
            int t3 = dp[p3]*3;
            int t5 = dp[p5]*5;
            int t7 = dp[p7]*7;
            dp[i] = Math.min(Math.min(t3,t5),t7);
            if(dp[i] == t3) p3++;
            if(dp[i] == t5) p5++;
            if(dp[i] == t7) p7++;
        }
        return dp[k];
    }
}
