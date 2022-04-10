public class Leetcode2201 {

    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        boolean[][] flag = new boolean[n][n];
        for(int i = 0; i < dig.length; i++) 
            flag[dig[i][0]][dig[i][1]] = true;
        int ans = 0;
        for (int i = 0; i < artifacts.length; i++){
            int r1 = artifacts[i][0], l1 = artifacts[i][1];
            int r2 = artifacts[i][2], l2 = artifacts[i][3];
            boolean f = false;
            for (int m = r1; m <= r2; m++){
                for (int l = l1; l <= l2; l++){
                    if(!flag[m][l]) {f = true;break;}
                }
            }
            if(!f) ans++;
        }
        return ans;
    }
}
