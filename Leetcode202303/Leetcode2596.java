package Leetcode202303;

public class Leetcode2596 {
    public boolean checkValidGrid(int[][] grid) {
        var way = new int[][]{{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2}};
        var len = grid.length;
        int row = 0, col = 0, cnt = 0;
        while(cnt != len*len-1){
            var f = false;
            for(int i=0; i<8; i++){
                if(row+way[i][0]>=0 && row+way[i][0]<len&&col+way[i][1]>=0 && col+way[i][1]<len){
                    if(grid[row+way[i][0]][col+way[i][1]]==grid[row][col]+1){
                        cnt++;
                        f = true;
                        row += way[i][0];
                        col += way[i][1];
                        break;
                    }
                }
            }
            if(!f) break;
        }
        if(cnt != len*len-1) return false;
        return true;
    }
}
