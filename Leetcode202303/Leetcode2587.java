package Leetcode202303;

public class Leetcode2587 {
    public int maxScore(int[] nums) {
        var len = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        var pre = 0L;
        for(int i=len-1; i>=0; i--){
            pre += nums[i];
            if(pre > 0) ans++;
        }
        return ans;
    }
}
