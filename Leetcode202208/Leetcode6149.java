package Leetcode202208;

import java.util.Arrays;

public class Leetcode6149 {
    public int edgeScore(int[] edges) {
        var len = edges.length;
        var cnt = new int[len];
        Arrays.fill(cnt, -1);
        int max = 0, ans = 0;
        for(int i=0;i<len;i++){
            if(cnt[edges[i]] < 0) cnt[edges[i]] = i;
            else cnt[edges[i]] += i;
            if(cnt[edges[i]] > max){
                max = cnt[edges[i]];
                ans = i;
            }
            else if(cnt[edges[i]]==max && edges[0] < ans) ans = edges[i];
        }
        return ans;
    }
}
