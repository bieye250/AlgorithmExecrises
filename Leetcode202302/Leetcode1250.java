package Leetcode202302;

public class Leetcode1250 {
    public boolean isGoodArray(int[] nums) {
        var t = nums[0];
        for(int i : nums){
            t = gcd(t, i);
            if(t == 1) return true;
        }
        return false;
    }
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
