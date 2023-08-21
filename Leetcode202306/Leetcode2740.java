package Leetcode202306;

public class Leetcode2740 {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        var min = 1<<30;
        for(int i=0; i<nums.length-1; i++){
            min = Math.min(min,nums[i+1] - nums[i]);
        }
        return min;
    }
}
