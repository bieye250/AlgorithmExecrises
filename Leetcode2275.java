public class Leetcode2275 {
    public int largestCombination(int[] candidates) {
        var cnt = new int[30];
        for(int i : candidates){
            for(int t=29; t>=0; t--){
                if(((i>>t)&1) > 0) cnt[t]++;
            }
        }
        var maxlen = 0;
        for(int i=0; i<=29; i++){
            maxlen = Math.max(maxlen,cnt[i]);
        }
        return maxlen;
        /**
         *         
        int n = candidates.length;
        int length= 0;
        int target = 1;  //最大位数
        int max = 0;
        for (int cur:candidates) {
            target = Math.max(cur,target);
        }
        while (target > 0) {
            for (int i = 0 ; i < n ; i++) {
                length += candidates[i] & 1; //当前位数下为1的个数
                candidates[i] >>= 1;
            }
            max = Math.max(length, max);
            length = 0;
            target >>= 1;
        }
        return max;
         */
    }
}
