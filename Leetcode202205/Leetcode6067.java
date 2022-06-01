package Leetcode202205;
public class Leetcode6067 {
    public int waysToSplitArray(int[] nums) {
        long sum = 0L, pre = 0L;
        for(int i=0; i<nums.length;i++) sum += nums[i];
        int count = 0;
        for(int i=0; i<nums.length-1;i++){
            sum -= nums[i];
            pre += nums[i];
            if(pre >= sum) count++;
        }
        return count;
    }
}
