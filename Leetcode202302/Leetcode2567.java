package Leetcode202302;

public class Leetcode2567 {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        var len = nums.length;
        return Math.min(nums[len-3]-nums[0], Math.min(nums[len-2]-nums[1], nums[len-1]-nums[2]));
    }
}
