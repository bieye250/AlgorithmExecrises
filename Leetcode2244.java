import java.util.HashMap;
import java.util.Map;
public class Leetcode2244 {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map = new HashMap();
        for (int i : tasks) map.put(i,map.getOrDefault(i,0)+1);
        int ans = 0;
        for (int i : map.keySet()){
            int t = map.get(i);
            if (t < 2) return -1;
            else{
                if (t % 3 == 0) ans += t/3;
                else ans += t/3+1;
            }
        }
        return ans;
    }
}
