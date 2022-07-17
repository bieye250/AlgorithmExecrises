package Leetcode202207;
public class Leetcode6109 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        var mod = (int)1e9+7;
        dfs(1,forget,n,delay);
        return ans;
    }
    public int dfs(int start, int forget, int n, int delay){
        int ans = 0;
        if(start > n||start+forget >= n) return 0;
        int cnt = forget - delay;
        for(int i=0;i<cnt;i++){
            ans = ans+dfs(start+delay+i, forget, n, delay)+1;
        }
        return ans;
    }
}
