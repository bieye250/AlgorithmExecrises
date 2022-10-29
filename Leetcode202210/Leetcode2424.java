package Leetcode202210;

public class Leetcode2424 {
    boolean[] cnt;
    int min;
    public LUPrefix(int n) {
        cnt = new boolean[n+1];
        min = 0;
    }
    
    public void upload(int video) {
        cnt[video] = true;
        if(video == 1) {
            min = 1;
        }
    }
    
    public int longest() {
        if(min > 0){
            var t = min+1;
            while(t < cnt.length && cnt[t++]) min++;
        }
        return min;
    }
}
