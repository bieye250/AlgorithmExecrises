package Leetcode202211;

public class Leetcode2428 {
    public int maxSum(int[][] grid) {
        int m = grid.length, n = grid[0].length, max = 0;

        for(int i=0; i<=n-3; i++){
            for(int j=0; j<=m-3; j++){
                int t = grid[j][i]+grid[j][i+1]+grid[j][i+2]+grid[j+1][i+1]+grid[j+2][i]+grid[j+2][i+1]+grid[j+2][i+2];
                max = Math.max(max,t);
            }
        }
        return max;
    }    
}
