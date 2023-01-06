package Leetcode202301;

public class Leetcode2492 {
    int cnt[];
    public int minScore(int n, int[][] roads) {
        cnt = new int[n+1];
        for(int i=1; i<=n; i++) cnt[i] = i;
        for(int[] r : roads)    union(r[0], r[1]);

        int min = 100005;
        for(int[] r : roads){
            if(find(1) ==  find(r[0])) min = Math.min(min, r[2]);
        }
        return min;
    }

    public void union(int a, int b){
        cnt[find(a)] = find(b);
    }

    public int find(int a){
        if(cnt[a] == a) return a;
        return cnt[a] = find(cnt[a]);
    }    
}
