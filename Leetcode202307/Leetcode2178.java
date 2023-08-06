package Leetcode202307;
public class Leetcode2178 {
    public List<Long> maximumEvenSplit(long finalSum) {
        var ans = new ArrayList<Long>();
        if(finalSum % 2 != 0) return ans;

        for(long i=2; i<=finalSum; i+=2){
            ans.add(i);
            finalSum -= i;
        }

        ans.set(ans.size()-1, ans.get(ans.size()-1)+finalSum);
        return ans;
    }
}
