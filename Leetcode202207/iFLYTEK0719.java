package Leetcode202207;
import java.util.Arrays;
import java.util.Scanner;

public class iFLYTEK0719 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int mod = (int)1e9+7;
        int[] p = new int[n];
        for(int i=0;i<n;i++) p[i] = in.nextInt();
        Arrays.sort(p);
        for(int i=0;i<n;i++){
            int diff = ();
        }
        long ans = 0L;
        for(int i=0;i<n;i++){
            ans = (ans*p[i])%mod;
        }
        System.out.println(ans);
    }
}
