import java.util.ArrayList;
import java.util.List;

public class Leetcode1711 {
    public int findClosest(String[] words, String word1, String word2) {
        List<Integer> l1 = new ArrayList<Integer>(), l2 = new ArrayList<Integer>();
        for(int i=0; i<words.length; i++){
            if(words[i].equals(word1)) l1.add(i);
            else if(words[i].equals(word2)) l2.add(i);
        }
        var ans = 1<<30;
        for(int i=0; i<l1.size(); i++){
            int t = l1.get(i), left = 0, right = l2.size()-1;
            while(left <= right){
                int mid = left + ((right-left)>>1);
                if(l2.get(mid) > t) right = mid-1;
                else left = mid+1;
            }
            if(left < l2.size())
                left = l2.get(left);
            else left = 1<<30; 
            if(right >= 0)
                right = l2.get(right);
            else right= 1<<30;
            ans = Math.min(ans,Math.min(Math.abs(left-t),Math.abs(right-t)));    
        }
        for(int i : l1) System.out.println(i);
        System.out.println("-----");
        for(int i : l2) System.out.println(i);
        return ans;
    }
}
