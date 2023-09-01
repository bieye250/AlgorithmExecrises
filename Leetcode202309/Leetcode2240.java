package Leetcode202309;

public class Leetcode2240 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        var ans = 0L;
        int l1 = total / cost1;

        for(int i=0; i<=l1; i++){
            int l2 = total / cost2;
            ans += l2+1;
            total -= cost1;
        }
        return ans;
    }
}
