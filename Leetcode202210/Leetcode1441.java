package Leetcode202210;

public class Leetcode1441 {
    public List<String> buildArray(int[] target, int n) {
        var ans = new ArrayList<String>();
        int len = target.length, idx = 0;
        for(int i=1; i<=n && idx<len; i++){
            ans.add("Push");
            if(i != target[idx]) ans.add("Pop");
            else idx++;
        }
        return ans;
    }
}
