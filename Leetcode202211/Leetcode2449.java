package Leetcode202211;

public class Leetcode2449 {
    public long makeSimilar(int[] nums, int[] target) {
        re(nums);
        re(target);
        long ans = 0L;
        int len = nums.length;
        for(int i=0; i<len; i++){
            ans += Math.abs(nums[i]-target[i])/2;
        }
        return ans/2;
    }

    public void re(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 != 0) nums[i] = -nums[i];
        }
        Arrays.sort(nums);
    }
}