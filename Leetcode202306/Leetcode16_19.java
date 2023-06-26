package Leetcode202306;

public class Leetcode16_19 {
    int[][] dir = {{1,1}, {1,-1}, {0,1},{0,-1},{-1,1},{-1,-1},{1,0},{-1,0}};
    public int[] pondSizes(int[][] land) {
        int row = land.length, col = land[0].length;
        var f = new boolean[row][col];

        var ans = new ArrayList<Integer>();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(land[i][j] == 0 && !f[i][j]){
                    f[i][j] = true;
                    ans.add(dfs(land, f, i, j));
                }
            }
        }
        var t = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) t[i] = ans.get(i);
        Arrays.sort(t);
        return t;
    }

    public int dfs(int[][] land, boolean[][] f, int row, int col){
        int cnt = 1;
            // System.out.printf("%d%s%d%n", row,"?", col);
        for(int[] i : dir){
            if(row+i[0]>=land.length||row+i[0]<0||col+i[1]>=land[0].length||col+i[1]<0){
                continue;
            }
            else if(!f[row+i[0]][col+i[1]] && land[row+i[0]][col+i[1]] == 0){
            System.out.printf("%d%s%d%n", row+i[0]," ", col+i[1]);
                f[row+i[0]][col+i[1]] = true;
                cnt += dfs(land, f, row+i[0], col+i[1]);
            System.out.println(cnt);
            }
        }
        return cnt;
    }
}
