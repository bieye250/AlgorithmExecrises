import java.util.List;

public class Leetcode120{
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1) return triangle.get(0).get(0);
        int len = triangle.size(), ans = 1<<30;
        var dp = new int[len+1][len+1];
        for(int i=0; i<len; i++){
            var l = triangle.get(i);
            for(int j=0; j<l.size(); j++){
                if(j == 0) dp[i+1][j+1]=dp[i][j+1]+l.get(j);
                else if(j==l.size()-1)dp[i+1][j+1]=dp[i][j]+l.get(j);
                else dp[i+1][j+1]=Math.min(dp[i][j],dp[i][j+1])+l.get(j);
            }
        }
        for(int i=1; i<=len; i++){
            System.out.println(dp[len][i]);
            ans = Math.min(ans,dp[len][i]);
        }
        return ans;
    }
}