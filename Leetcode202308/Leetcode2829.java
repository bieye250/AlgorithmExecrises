package Leetcode202308;

public class Leetcode2829 {
    public int minimumSum(int n, int k) {
        var mid = k / 2;
        var ans = 0;
        if(mid < n) ans += (1+mid)*mid >> 1;
        else return (1+n)*n >> 1;

        n -= mid;

        ans += (k+k+n-1)*n >> 1;
        return ans;
    }
}
