package Leetcode202206;

import java.util.Arrays;

public class Leetcode6091{
    public int partitionArray(int[] nums, int k) {
        int min = 1<<30, max = -1, ans = 0, len = nums.length;
        Arrays.sort(nums);
        min = nums[0]; max = nums[0];
        for(int i=0; i<len; i++){
            if(nums[i] > max) max = nums[i];
            if(max - min > k){
                ans++;
                max = nums[i];
                min = nums[i];
            }
        }
        return ans+1;
    }
}