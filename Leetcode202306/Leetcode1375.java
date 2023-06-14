package Leetcode202306;

public class Leetcode1375 {
    public int numTimesAllBlue(int[] flips) {
        int len = flips.length, ans = 0;
        var c = new boolean[len];

        for(int i=0; i<len; i++){
            c[flips[i]-1] = true;
            var f = false;
            for(int j=0; j<=i; j++){
                if(!c[j]) {f = true;break;}
            }
            if(!f) ans++;
        }
        return ans;
    }
}
