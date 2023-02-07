package Leetcode202302;

public class Leetcode1798 {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);

        var ans = 0;
        for(int i : coins){
            if(i <= ans+1) ans += i;
            else break;
        }
        return ans+1;
    }
}
