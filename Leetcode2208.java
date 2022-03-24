import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode2208 {
    
    public int halveArray(int[] nums) {
        int len = nums.length;
        if (len == 1) return 1;

        double sum = 0d, half = 0d;
        for (int i : nums) sum += i;
        sum /= 2;
        int ans = 0;
        PriorityQueue<Double> q = new PriorityQueue<>((a,b)-> a>b?-1:1);
        for (int i : nums) q.offer((double)i);
        
        while (half < sum){
            var t = q.poll() / 2;
            half += t;
            q.offer(t);
            ans++;
        }
        return ans;
    }
}
