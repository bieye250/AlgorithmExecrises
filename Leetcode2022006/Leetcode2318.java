package Leetcode2022006;

public class Leetcode2318 {
    static int mod = (int)1e9+7;
    static int[][][] f = new int[10001][7][7];
    static{
        for(int i=1;i<=6;i++)
            for(int j=1;j<=6;j++)
                if(i!=j && gcd(i,j)==1)
                    f[2][i][j] = 1;
        for(int i=3; i<10001; i++){
            for(int j=1;j<=6;j++){
                for(int last=1;last<=6;last++){
                    if(j!=last&&gcd(j,last)==1){
                        for(int last2=1;last2<=6;last2++){
                            if(j!=last2){
                                f[i][j][last]=(f[i][j][last]+f[i-1][last][last2])%mod;
                            }
                        }
                    }
                }
            }
        }
    }
    public int distinctSequences(int n) {
        if (n == 1) return 6;
        int ans = 0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                ans = (ans+f[n][i][j])%mod;
            }
        }
        return ans;
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}
