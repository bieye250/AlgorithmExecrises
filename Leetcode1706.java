public class Leetcode1706 {
    public static void main(String[] args) {
        
    }

    int[][] dir = new int[][]{{0,-1},{0,1},{1,0}};
    public int[] findBall(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        if(col == 1) return new int[]{-1};
        var ans = new int[col];
        for(int i=0;i<col;i++){
            int x = 0, y = i+grid[0][i];
            if(y<0 || y>=col || grid[0][y] != grid[0][i]) ans[i] = -1;
            else while(x < row){
                x += grid[x][i];
                if(x<0 || x>=row || grid[x][y] != grid[x][y+grid[x][y]]){
                    ans[i] = -1;break;
                }
                y += grid[x][y];
            }
        }
        return ans;
    }
}
