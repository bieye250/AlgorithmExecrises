package Leetcode202204.Leetcode202205;
import java.util.*;
public class Leetcode6035{
    public long numberOfWays(String s) {
        int[] f = new int[100010]; // 0
        int[] v = new int[100010]; // 1
        int len = s.length();
        for (int i=0; i<len; i++){
            if (s.charAt(i) == '0'){
                f[i+1] = f[i] + 1;
                v[i+1] = v[i]; 
            }
            else{
                f[i+1] = f[i];
                v[i+1] = v[i] + 1;
            }
        }
        long ans = 0L;
        for (int i=0; i<len; i++){
            if (s.charAt(i) == '0') ans += v[i]*(v[len]-v[i]);
            else ans += f[i]*(f[len]-f[i]);
        }
        return ans;
    }
}