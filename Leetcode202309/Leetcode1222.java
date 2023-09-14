package Leetcode202309;

public class Leetcode1222{
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        var dir = new int[][]{{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1}};

        var map = new int[8][8];

        for(var i : queens) map[i[0]][i[1]] = 2;
        map[king[0]][king[1]] = 1;

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0; i<8; i++){
            int row = king[0]+dir[i][0];
            int col = king[1]+dir[i][1];
            while(row>=0 && row<8&&col>=0&&col<8){
                if(map[row][col] == 2){
                    var l = List.of(row,col);
                    ans.add(l);
                    break;
                }
                row += dir[i][0];
                col += dir[i][1];
            }
        }
        return ans;
    }
}