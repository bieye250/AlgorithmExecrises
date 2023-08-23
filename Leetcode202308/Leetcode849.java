package Leetcode202308;

public class Leetcode849 {
    public int maxDistToClosest(int[] seats) {
        var len = seats.length;
        int ans = 0, l = -1, t = 0;
        for(int i = 0; i<len; i++){
            if(seats[i] == 1){
                if(l < 0) {
                    ans = Math.max(ans, i);
                    l = i;
                }
                else ans = Math.max(ans, (i-t)/2);
                t = i;
            }
        }
        ans = Math.max(ans, len-t-1);
        return ans;
    }
}
