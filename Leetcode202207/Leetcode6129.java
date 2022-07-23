package Leetcode202207;

public class Leetcode6129 {
    public long zeroFilledSubarray(int[] nums) {
        int cnt = 0, left=-1, right=-1, len=nums.length;
        var ans = 0L;
        for(int i=0;i<len;i++){
            if(nums[i] == 0){
                ++cnt;
                ans += cnt;
            }
            else cnt = 0;
        }
        return ans;
    }
}
