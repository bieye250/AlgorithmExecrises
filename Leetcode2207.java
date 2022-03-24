import java.util.*;
public class Leetcode2207 {
    
    public long maximumSubsequenceCount(String text, String pattern) {
        var alist = new ArrayList<Integer>();
        var blist = new ArrayList<Integer>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) alist.add(i);
            else if (text.charAt(i) == pattern.charAt(1)) blist.add(i);
        }

        long sum = 0L;
        int j = 0;
        if (alist.isEmpty() || blist.isEmpty()) return alist.size()==0?blist.size():alist.size();
        for (int i = 0; i < alist.size(); i++){
            while (j < blist.size() && blist.get(j) < alist.get(i)) j++;
            sum += blist.size() - j;
        }
        if (blist.size() > alist.size()) return sum + blist.size();
        else return sum + alist.size();
    }
}
