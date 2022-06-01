package Leetcode202205;
import java.util.Arrays;

public class Leetcode6075 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans = 0, len = rocks.length, cur = 0;
        for(int i=0; i<len; i++) rocks[i] = capacity[i]-rocks[i];
        Arrays.sort(rocks);
        while(additionalRocks > 0){
            if(cur >= len) break;
            if(rocks[cur] != 0){
                additionalRocks -= rocks[cur];
                if(additionalRocks >= 0) ans++;
            }
            else ans++;
            cur++;
        }
        return ans;
    }
    
}
