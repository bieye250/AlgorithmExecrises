package Leetcode202204.Leetcode202205;
public class Leetcode6061{
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0L;
        int a1 = total/cost1, a2 = total/cost2;
        for (int i=0; i<=a1; i++){
            ans += (total-i*cost1)/cost2+1;
        }
        return ans;
    }
}