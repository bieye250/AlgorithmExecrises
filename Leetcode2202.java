public class Leetcode2202 {
    
    public int maximumTop(int[] nums, int k) {
        int len = nums.length;
        if (len == 1 && (k&1)==1) return -1;

        int max = 0;
        for (int i = 0; i < len && i < k-1; i++) {
            max = Math.max(max,nums[i]);
        }
        if (k < len) max = Math.max(max,nums[k]);
        return max;
    }
}
