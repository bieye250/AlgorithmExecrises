package Leetcode202301;

public class Leetcode2501 {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int max = nums[len-1], ans = -1;
        var dp = new int[max+1];
        for(int i : nums)   dp[i] = 1;
        for(int i : nums){
            var t = (int)Math.sqrt(i);
            if(t*t != i) continue;
            dp[i] = dp[t] + 1;
        }

        for(int i=0; i<=max; i++) ans = Math.max(ans,dp[i]);
        return ans==1?-1:ans;
    }
}