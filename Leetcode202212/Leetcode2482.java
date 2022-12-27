package Leetcode202212;

public class Leetcode2482 {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        var r = new int[row][2];
        var c = new int[col][2];
        for(int i=0; i<row; i++){
            int one = 0, zero = 0;
            for(int j=0; j<col; j++){
                if(grid[i][j] == 0) zero++;
                else one++;
            }
            r[i][0] = zero;
            r[i][1] = one;
        }
        for(int i=0; i<col; i++){
            int one = 0, zero = 0;
            for(int j=0; j<row; j++){
                if(grid[j][i] == 0) zero++;
                else one++;
            }
            c[i][0] = zero;
            c[i][1] = one;
        }
        var ans = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[i][j] = r[i][1]+c[j][1] - r[i][0] - c[j][0];
            }
        }
        return ans;
    }
}
