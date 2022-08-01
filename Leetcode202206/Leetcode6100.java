package Leetcode202206;

public class Leetcode6100{
    public int countHousePlacements(int n) {
        var mod = 1_000_000_007;
        int l = 2, r = 3;
        int cnt = 0;
        for(int i=3;i<=n;i++){
            cnt += (l + r)%mod;
            l = r;
            r = cnt;
        }
        if(n <= 2) return (n+1)*(n+1);
        else return (int)(1L*cnt*cnt%mod);
    }
}
