package Leetcode202210;

public class Leetcode2406 {
    public int minGroups(int[][] intervals) {
        var len = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        var cnt = 0;
        var pq = new PriorityQueue<Integer>();
        pq.offer(intervals[0][1]);
        for(int i=1; i<len; i++){
            if(intervals[i][0] > pq.peek()){
                pq.poll();
                pq.offer(intervals[i][1]);
            }
            else pq.offer(intervals[i][1]);
        }
        return pq.size();
    }
}
