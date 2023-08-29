package Leetcode202308;

public class Leetcode2834 {
    public long minimumPossibleSum(int n, int target) {
        if(n == 1) return 1L;

        var t = target/2;
        var ans = 0L;
        if(t >= n){
            ans += (1+n)*n>>1;
            return ans;
        }else ans += (1L+t)*t>>1;

        n -= t;
        ans += (1L*target+target+n-1)*n>>1;
        return ans;
    }
}
