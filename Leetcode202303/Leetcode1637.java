public class Leetcode1637{
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b)->a[0]-b[0]);

        var ans = 0;
        for(int i=0; i<points.length-1; i++){
            ans = Math.max(ans, points[i+1][0]-points[i][0]);
        }
        return ans;
    }
}