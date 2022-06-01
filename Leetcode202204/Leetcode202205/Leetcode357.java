package Leetcode202204.Leetcode202205;
public class Leetcode357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] a = {1,10,91};
        if (n <= 2) return a[n];
        int ans = 91;
        while (n > 2){
            int t = 9;
            for (int i=9;i>10-n;i--){
                t *= i;
            }
            ans += t;
            n--;
        }
        return ans;
    }
}
