package Leetcode202207;
import java.util.Scanner;

public class iFLYTEK0715 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] d = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++)
                d[i][j] = in.nextInt();
        }
        int sum = 1 << n;
        long ans = 1 << 30L;
        for (int i = 0; i < sum; i++) {
            long cur = k * 1L, t = 0L;
            boolean f = false;
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    cur += d[j][1];
                    t += d[j][0];
                    if (cur <= d[j][2]) {
                        f = true;
                        break;
                    }
                }
                cur -= d[j][2];
                if (cur <= 0) {
                    f = true;
                    break;
                }
            }
            if (!f)
                ans = Math.min(ans, t);
        }
        if (ans == 1 << 30)
            System.out.println(-1);
        else
            System.out.println(ans);
    }
    // dp[i]
}