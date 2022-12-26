package Leetcode202212;

public class Leetcode1759 {
    public int countHomogenous(String s) {
        int len = s.length(), ans = 0, mod = 1_000_000_007;
        for(int i=0; i<len;){
            var t = i+1;
            while(t < len && s.charAt(t) == s.charAt(i)) t++;
            var c = t - i;
            ans = (ans + (int)(1L*(1+t-i)*(t-i)/2 % mod)) % mod ;
            i = t;
            System.out.println(ans+"?"+i);
        }
        return ans;
    }
}
