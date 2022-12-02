package Leetcode202212;

public class Leetcode1769 {
    public int[] minOperations(String boxes) {
        int n = boxes.length(), t = 0;
        var ans = new int[n];

        for(int i=0; i<n; i++){
            t = 0;
            for(int j=0; j<n; j++){
                    t += Math.abs(i-j)*(boxes.charAt(j)-'0');
            }
            ans[i] = t;
        }
        return ans;
    }
}
