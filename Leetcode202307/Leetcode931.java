package Leetcode202307;

public class Leetcode931 {
    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length;
        var dp = new int[len][len];

        for(int i=0; i<len; i++) dp[0][i] = matrix[0][i];

        for(int i=1; i<len; i++){
            for(int j=0; j<len; j++){
                var t = 1<<30;
                for(int k=-1; k<=1; k++){
                    var p = j+k;
                    if(p < 0 || p >= len) continue;
                    t = Math.min(t, dp[i-1][p]);
                }
                System.out.println(t);
                dp[i][j] = matrix[i][j]+t;
            }
        }
        var min = 1<<30;
        for(int i=0; i<len; i++) min = Math.min(min, dp[len-1][i]);
        return min;
    }    
}
