package Leetcode202210;

public class Leetcode2419 {
    public int longestSubarray(int[] nums) {
        int len = nums.length;
        int res = 0, max = 0, cnt = 0;
        for(int i=0; i<len; i++){
            if(nums[i] > max){
                cnt = 1;
                res = 1;
                max = nums[i];
            }
            else if(nums[i] == max) {
                cnt++;
                res = Math.max(res,cnt);
            }
            else cnt = 0;
        }
        return res;
    }
}
