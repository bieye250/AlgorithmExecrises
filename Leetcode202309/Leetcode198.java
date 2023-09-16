package Leetcode202309;

public class Leetcode198 {
    public int rob(int[] nums) {
        var len = nums.length;
        if(len == 1) return nums[0];
        else if(len == 2) return Math.max(nums[0], nums[1]);

        var dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<len; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[len-1];
    }
}
