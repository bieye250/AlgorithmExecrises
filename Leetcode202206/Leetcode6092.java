package Leetcode202206;

import java.util.HashMap;

public class Leetcode6092 {
    public int[] arrayChange(int[] nums, int[][] operations) {
        var map = new HashMap<Integer,Integer>();
        int len = nums.length;
        for(int i=0; i<len; i++) map.put(nums[i],i);
        for(int i=0; i<operations.length; i++){
            int left = operations[i][0], index = map.get(left);
            nums[index] = operations[i][1];
            map.put(operations[i][1],index);
            map.remove(left);
        }
        return nums;
    }
}
