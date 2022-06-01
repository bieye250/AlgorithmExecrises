package Leetcode202205;
import java.util.ArrayList;

public class Leetcode300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length, ans = 0;
        if(len == 1) return 1;
        var dp = new int[len+1];
        dp[0] = 1;
        for(int i=1; i<len; i++){
            dp[i] = 1;
            for(int t=i-1; t>=0; t--){
                if(nums[t] < nums[i]) dp[i]=Math.max(dp[i],dp[t]+1);
                
            }
            ans = Math.max(dp[i],ans);
        }
        return ans;
    }
}
