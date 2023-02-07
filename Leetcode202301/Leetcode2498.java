package Leetcode202301;

public class Leetcode2498 {
    public int maxJump(int[] stones) {
        int ans = 0, n = stones.length;
        if(n == 2) return stones[1] - stones[0];
        for(int i = 0; i < n - 2; i++) {
            ans = Math.max(ans, stones[i + 2] - stones[i]);
        }
        for(int i = n - 1; i > 1; i--) {
            ans = Math.max(ans, stones[i] - stones[i - 2]);
        }
        return ans;
    }
}
