package Leetcode202208;

public class Leetcode6137 {
    int len;
    public boolean validPartition(int[] nums) {
        len = nums.length;
        return dfs(nums, 0);
    }
    public boolean dfs(int[] nums, int idx){
        if(idx == len) return true;
        else if(idx == len-1) return false;
        else if(idx == len-2) return nums[idx]==nums[idx+1];
        else if(idx == len-3) {
            if((nums[idx]==nums[idx+1]&&nums[idx]==nums[idx+2])
                ||(nums[idx]+1==nums[idx]&&nums[idx+1]+1==nums[idx+2]))
                return true;
            return false;
        }
        if(nums[idx]==nums[idx+1]){
            if(dfs(nums, idx+2)) return true;
            else if(nums[idx+1]==nums[idx+2]){
                if(dfs(nums, idx+3)) return true;
                else return false;
            }
        }
        else if(nums[idx]+1==nums[idx+1]&&nums[idx+1]+1==nums[idx+2]){
            return dfs(nums, idx+3);
        }
        return false;
    }
}
