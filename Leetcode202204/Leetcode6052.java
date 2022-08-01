package Leetcode202204;
public class Leetcode6052 {
    public int minimumAverageDifference(int[] nums) {
        int len = nums.length, index = -1;
        long min = 1<<30L;
        var pre = new long[len];
        pre[0] = nums[0];
        for (int i=1; i<len; i++) pre[i] = pre[i-1]+nums[i];
        for (int i=0; i<len; i++){
            long lavg = pre[i] / (i+1);
            long ravg = 0L;
            if(i != len-1) ravg = (pre[len-1]-pre[i]) / (len-1-i);
            //System.out.printf("%d %d\n",lavg,ravg);
            lavg = Math.abs(lavg - ravg);
            if(lavg < min) {index = i; min = lavg;}
            if(min == 0) return i;
        }
        return index;
    }
}
