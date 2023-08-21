package Leetcode202303;

public class Leetcode2580 {
    public int countWays(int[][] ranges) {
        var mod  = 1000_000_007;
        var x = 10;
        while((1<<x) < mod) x++;
        var pq = new PriorityQueue<int[]>((a,b)->b[1]-a[1]);
        Arrays.sort(ranges, (a,b)->{
            if(a[1] == b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });
        pq.offer(ranges[0]);
        for(int i=1; i<ranges.length; i++){
            int l = pq.peek()[0], r = pq.peek()[1];
            if(ranges[i][0] <= r && ranges[i][0] >= l){
                pq.peek()[1] = Math.max(r, ranges[i][1]);
                // pq.peek()[0] = Math.min(l, ranges[i][0]);
            }else if(ranges[i][0] < l){
                var t = 0;
                while(pq.size()>0){
                    if(pq.peek()[1] >= ranges[i][0]) t = pq.poll()[0];
                    else break;
                }
                pq.offer(new int[]{Math.min(t,ranges[i][0]),ranges[i][1]});
            }
            else pq.offer(ranges[i]);
        }
        if(pq.size() == 1) return 2;
        System.out.println(pq.size());
        var ans = 1L;
        int m = pq.size()/x, n = pq.size()%x;
        while(m-->0){
            ans = (1<<x) * ans % mod;
        }
        System.out.println(ans);
        return (int)((1<<n) % mod * ans) % mod;
    }
}
