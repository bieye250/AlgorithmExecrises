package Leetcode2022006;

public class Leetcode5270{
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int row = grid.length, col = grid[0].length;
        var dp = new int[col][2];
        for(int i=0; i<col; i++) {dp[i][0] = grid[0][i];dp[i][1] = grid[0][i];}
        for(int i=0; i<row-1; i++){
            for(int j=0; j<col; j++){
                int min = 1<<30;
                for(int k=0; k<col; k++){
                    int val = grid[i][k];
                    min = Math.min(dp[k][1]+moveCost[val][j], min);
                }
                dp[j][0] = min + grid[i][j]; 
                System.out.println(dp[j]+" ");
            }
            for(int k=0; k<col; k++)dp[k][1]=dp[k][0];
        }
        int ans = 1<<30;
        for(int i=0; i<col; i++) ans = Math.min(dp[i][0],ans);
        return ans;
    }
}