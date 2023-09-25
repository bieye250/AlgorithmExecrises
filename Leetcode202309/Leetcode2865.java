package Leetcode202309;

public class Leetcode2865 {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        var ans = 0L;

        int len = maxHeights.size();
        for(int i=0; i<len; i++){
            var t = maxHeights.get(i)+0L;
            var pre = maxHeights.get(i);
            for(int j=i-1; j>=0; j--) {
                pre = Math.min(pre, maxHeights.get(j));
                t += pre;
            }
            
            pre = maxHeights.get(i);
            for(int j=i+1; j<len; j++) {
                pre = Math.min(pre, maxHeights.get(j));
                // System.out.println(pre);
                t += pre;
            }
            ans = Math.max(ans, t);
        }
        return ans;
    }
}
