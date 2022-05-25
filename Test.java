import java.util.ArrayList;
import java.util.Arrays;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。


示例 1：
输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
输出：[[1,6],[8,10],[15,18]]
解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
示例 2：

输入：intervals = [[1,4],[4,5]]
输出：[[1,5]]
解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。

提示：
1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104

class Solution {
    public int[][] merge(int[][] intervals) {

    }
}
 */
public class Test {
    public static void main(String[] args) {
        var test = new Test();
        var ans = test.merge(new int[][]{{1,4},{4,10}});
        for(int[] i : ans) System.out.println(i[0]+" "+i[1]);
    }
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int start = intervals[0][0], end = intervals[0][1], len = intervals.length;
        var list = new ArrayList<int[]>();
        for(int i=1; i<len; i++){
            if(intervals[i][0] <= intervals[i-1][1]) end = intervals[i][1];
            else {
                list.add(new int[]{start,end});
                //if(i < len-1) {start = intervals[i+1][0]; end = intervals[i+1][1];}
                start = intervals[i][0]; end = intervals[i][1];
            }
        }
        if(len>=2 && start > intervals[len-2][1]) list.add(new int[]{start,end});
        if(list.size()==0 || list.get(list.size()-1)[1] != end) list.add(new int[]{start,end});
        
        return list.toArray(new int[0][0]);
    }    
}
