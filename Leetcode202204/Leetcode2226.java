package Leetcode202204;
public class Leetcode2226{
    public int maximumCandies(int[] candies, long k) {
        int min = 1<<30;
        long sum = 0L;
        for (int i : candies){
            if (i < min) min = i;
            sum += i;
        }
        if (sum < k) return 0;
        int left = 0, right = (int)(sum/k)+1;
        while (left <= right){
            int mid = left + ((right-left)>>1);
            long count = 0L;
            for (int i : candies){
                count += i/mid;
                if (count >= k){left=mid+1;break;}
            }
            if (count < k) right = mid-1;
        }
        return right;
    }
}