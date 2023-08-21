package Leetcode202304;

public class Leetcode2640 {
    public long[] findPrefixScore(int[] nums) {
        var len = nums.length;
        var con = new long[len];
        var max = nums[0];
        con[0] = (long)nums[0]+nums[0];
        for(int i=1; i<len; i++){
            max = Math.max(max, nums[i]);
            con[i] = con[i-1] + nums[i] + max;
        }
        return con;
    }
}
