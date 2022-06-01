package Leetcode202205;
import java.util.TreeMap;

public class Leetcode436 {
    public int[] findRightInterval(int[][] intervals) {
        var len = intervals.length;
        var ans = new int[len];
        if(len == 1) {ans[0]=-1;return ans;}
        var map = new TreeMap<Integer,Integer>();
        for(int i=0; i<len; i++) map.put(intervals[i][0],i);
        for(int i=0; i<len; i++){
            var r = intervals[i][1]-1;
            Integer t = map.higherKey(r);
            if(t!=null) ans[i]=map.get(t);
            else ans[i]=-1;
        }
        return ans;
    }
}
