package Leetcode202211;
public class Leetcode2438 {
    public int[] productQueries(int n, int[][] queries) {
        var mod = 1_000_000_007;
        var pow = new ArrayDeque<Integer>();
        var len = queries.length;
        var ans = new int[len];

        for(int i=30; i>=0; i--){
            if(n >= (1<<i)){
                pow.offerFirst(1<<i);
                n -= 1<<i;
                if(n == 0) break;
            }
        }
        //pow.stream().forEach(i->System.out.println(i));
        var p = pow.toArray(new Integer[0]);
        //for(int i=0;i<p.length;i++)System.out.println(p[i]);
        for(int i=0; i<len; i++){
            var t = 1L;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                t = (t % mod * (int)p[j]) %mod;
            }
            ans[i] = (int)t;
        }
        return ans;
    }
}
