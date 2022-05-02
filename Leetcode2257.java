public class Leetcode2257{
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        var ans = 0;
        var net = new int[m][n];
        for(int i[] : walls) net[i[0]][i[1]] = 3;
        for(int i[] : guards) net[i[0]][i[1]] = 2;
        for(int i[] : guards){
            for(int j=i[1]-1;j>=0;j--){
                if(net[i[0]][j] >= 2) break;
                net[i[0]][j] = 1;
            }
            for(int j=i[1]+1;j<n;j++){
                if(net[i[0]][j] >= 2) break;
                net[i[0]][j] = 1;
            }
            for(int j=i[0]-1;j>=0;j--){
                if(net[j][i[1]] >= 2) break;
                net[j][i[1]] = 1;
            }
            for(int j=i[0]+1;j<m;j++){
                if(net[j][i[1]] >= 2) break;
                net[j][i[1]] = 1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(net[i][j] == 1) ans++;
                //System.out.print(net[i][j]+" ");
            }
            //System.out.println();
        }
        //System.out.println(ans);
        return m*n-walls.length-ans-guards.length;
    }
}