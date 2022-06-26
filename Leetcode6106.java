public class Leetcode6106 {
    int[] f;
    int[] size;
    int gf(int x){
        if(x == f[x]) return x;
        return f[x]=gf(f[x]);
    }
    public long countPairs(int n, int[][] edges) {
        f = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            f[i] = i;
            size[i] = 1;
        }
        for(int[] i : edges){
            int x = gf(i[0]), y = gf(i[1]);
            if(gf(x) != gf(y)){
                f[y] = gf(x);
                size[x] += size[y];
            }
        }
        long ans = 1L*n*(n-1)/2;
        for(int i=0;i<n;i++){
            if(gf(i)==i) ans-=1L*size[i]*(size[i]-1)/2;
        }
        return ans;
    }
}
