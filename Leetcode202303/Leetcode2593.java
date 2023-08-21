package Leetcode202303;

public class Leetcode2593 {
    public long findScore(int[] nums) {
        var len = nums.length;
        var cnt = new int[len][2];
        for(int i=0; i<len; i++){
            cnt[i][0] = i;
            cnt[i][1] = nums[i];
        }
        Arrays.sort(cnt,(a,b)->{
            if(a[1] == b[1]) return a[0]-b[0];
            return a[1] - b[1];
        });
        var score = 0L;
        var f = new boolean[len];
        for(int i=0; i<len;){
            while(i<len && f[cnt[i][0]]) i++;
            if(i >= len) break;
            score += cnt[i][1];
            f[cnt[i][0]] = true;
            if(cnt[i][0]+1 < len) f[cnt[i][0]+1] = true;
            if(cnt[i][0]-1 >= 0) f[cnt[i][0]-1] = true;
            System.out.println(cnt[i][1]+"??"+cnt[i][0]);
        }
        return score;
    }
}
