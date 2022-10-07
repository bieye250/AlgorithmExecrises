package Leetcode202210;

public class Leetcode2405 {
    public int partitionString(String s) {
        var cnt = 0;
        var set = new HashSet<Integer>();
        for(int i=0; i<s.length(); i++){
            int t = (int)s.charAt(i);
            if(set.isEmpty() || !set.contains(t))
                set.add(t);
            else if(set.contains(t)){
                cnt++;
                set.clear();
                i--;
            }
        }
        return cnt+1;
    }
}
