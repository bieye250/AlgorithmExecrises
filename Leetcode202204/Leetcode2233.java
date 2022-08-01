package Leetcode202204;
import java.util.PriorityQueue;

public class Leetcode2233 {
    public int maximumProduct(int[] nums, int k) {
        if (nums.length == 1) return nums[0]+k;
        PriorityQueue<Integer> pq = new PriorityQueue(nums.length);
        for (int i : nums) pq.offer(i);
        while (k > 0){
            //System.out.println(pq.peek());
            int t = pq.poll();
            int t1 = pq.peek();
            if (t1 - t >= k){
                pq.offer(t+k);
                k = 0;
            }else if(t1 > t){
                pq.offer(t1);
                k -= t1-t;
            }else {
                pq.offer(t+1);
                k--;
            }
        }
        long ans = 1L;
        for (int i : pq) {ans = (ans*i)%1000000007;}
        return (int)ans%1000000007; 
    }
}
