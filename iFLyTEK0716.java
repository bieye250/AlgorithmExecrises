import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iFLyTEK0716 {
    public static void main(String[] args) {    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int k = in.nextInt();
        int[] p = new int[20_0001];
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            p[x] = in.nextInt();
        }
        int[] lpre = new int[k+1];
        int[] rpre = new int[k+1];
        // lpre[0] = p[s];
        // rpre[0] = p[s];
        for(int i=s-1;i>=s-k&&i>=0;i--){
            lpre[s-i] = lpre[s-i-1]+p[i];
        }
        for(int i=s+1;i<=s+k&&i<p.length;i++){
            rpre[i-s] = rpre[i-s-1]+p[i];
        }
        int ans = Math.max(lpre[k],rpre[k])+p[s];
        //for(int i=0;i<=k;i++){System.out.println(lpre[i]+" "+rpre[i]);}
        //System.out.println(ans);
        for(int i=1;i<=k/2;i++){
            int t=Math.max(lpre[i]+rpre[k-2*i],lpre[k-2*i]+rpre[i])+p[s];
            //System.out.println(t);
            ans = Math.max(ans, t);
        }
        System.out.println(ans);
    }
}
