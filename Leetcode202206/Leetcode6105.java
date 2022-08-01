package Leetcode202206;

public class Leetcode6105 {
    public int maximumXOR(int[] nums) {
        int ans = 0;
        for(int i=30;i>=0;i--){
            int cnt = 0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1) == 1) cnt++; 
            }
            if(cnt > 0){
                ans += 1<<i;
            }
        }
        return ans;
    }
}
