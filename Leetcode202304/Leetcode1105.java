package Leetcode202304;

public class Leetcode1105 {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int ans = 0, len = books.length;
        var dp = new int[len+1];
        for(int i=0; i<len; i++){
                int l = shelfWidth - books[i][0], max = books[i][1];
                dp[i+1] = dp[i]+books[i][1];
                for(int t=i-1; t>=0; t--){
                    l -= books[t][0];
                    max = Math.max(max, books[t][1]);
                    if(l >= 0)dp[i+1]=Math.min(dp[t]+max,dp[i+1]);
                    else break;
                }
        }
        return dp[len];
    }
}
