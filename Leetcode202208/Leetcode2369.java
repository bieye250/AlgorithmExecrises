package Leetcode202208;

public class Leetcode2369 {
    public boolean validPartition(int[] nums) {
        var len = nums.length;
        var f = new boolean[len+1];
        f[0] = true;
        for(int i=1;i<len;i++){
            if(f[i-1]&&nums[i-1]==nums[i]||
            i>1&&f[i-2]&&((nums[i]==nums[i-1]&&nums[i-1]==nums[i-2])||(nums[i]==nums[i-1]+1&&nums[i-1]==nums[i-2]+1)))
                f[i+1] = true;
        }
        return f[len];
    }
}
