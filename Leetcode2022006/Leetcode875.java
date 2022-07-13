package Leetcode2022006;

import java.util.Arrays;

public class Leetcode875 {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int left = min, right = max;
        while(left <= right){
            int cnt = 0;
            int mid = left + ((right-left)>>1);
            for(int i : piles){
                if(i % mid != 0) cnt += i/mid+1;
                else cnt += i / mid;
            }
            if(cnt > h) left = mid+1;
            else right = mid-1;
        }
        return left;
    }
}
