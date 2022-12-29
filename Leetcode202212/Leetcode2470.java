package Leetcode202212;

public class Leetcode2470 {
    public int subarrayLCM(int[] nums, int k) {
        int ans = 0, len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] == k) ans++;
            int t = nums[i];
            for(int j=i+1; j<len; j++){
                int gcd = gcd(t,nums[j]);
                int min = t*nums[j] / gcd;
                if(min == k) {
                    ans++;
                    t = k;
                }
                else if(k % min == 0){
                    t = min;
                }
                else break;
            }
        }
        return ans;
    }

    public int gcd(int a, int b){
        return a%b == 0? b : gcd(b,a%b);
    }
}
