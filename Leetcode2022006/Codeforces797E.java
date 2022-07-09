import java.io.*;
import java.util.*;
import java.math.*;

public class Codeforces797E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0) {
            int t = in.nextInt();
            int k = in.nextInt();

            int[] rem = new int[t];
            long ans = 0;
            int val;
            for (int i = 0; i < t; i++) {
                val = in.nextInt();
                ans += (long) (val / k);
                rem[i] = (int) (val % k);
            }

            Arrays.sort(rem);

            int wl = 0, wr = t - 1;

            while (wr > wl) {
                boolean found = false;
                for (int i = wl; i < wr; i++) {
                    if (rem[i] + rem[wr] >= k) {
                        found = true;
                        wl = i + 1;
                        ans++;
                        break;
                    }
                }
                if (!found)
                    break;
                wr--;

            }

            System.out.println(ans);
            n--;
        }

    }
}