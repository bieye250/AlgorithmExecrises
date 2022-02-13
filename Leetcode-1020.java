import java.util.*;

class test {
    public static void main(String[] args) {
        test t = new test();
        t.numEnclaves(new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}});
    }
    int[][] b = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    int row=0, col=0, t = 0; 
    boolean touch = false;
    public int numEnclaves(int[][] grid) {
        row = grid.length; col = grid[0].length;
        boolean[][] visit = new boolean[row][col];
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1 && !visit[i][j]) {
                    visit[i][j] = true;
                    if(i==0||i==row-1||j==0||j==col-1) dfs(grid, visit, i, j);
                    else ans += dfs(grid,visit,i,j) + 1;
                    t = 0;touch=false;
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, boolean[][] visit, int m, int n) {
        for(int k=0; k < 4; k++){
            int i = m + b[k][0]; int j = n + b[k][1];
            if(i<0 || i>=row || j<0||j>=col) continue;
            if(grid[i][j]==1&&!visit[i][j]){
                visit[i][j]=true;
                t++;
                if(!touch && (i==0||i==row-1||j==0||j==col-1)) touch = true;
                dfs(grid, visit, i, j);
            }
        }
        return touch?-1:t;
    }
}