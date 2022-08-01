package Leetcode202206;

public class Leetcode2302 {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0L, sum = 0L;
        for (int left = 0, right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum * (right - left + 1) >= k)
                sum -= nums[left++];
            ans += right - left + 1;
        }
        return ans;
    }
}
