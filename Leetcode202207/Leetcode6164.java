package Leetcode202207;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Leetcode6164 {
    public int maximumSum(int[] nums) {
        var map = new HashMap<Integer,List<Integer>>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            int t = sum(nums[i]);
            if(!map.containsKey(t)){
                var l = new ArrayList<Integer>();
                l.add(nums[i]);
                map.put(t,l);
            }
            else map.get(t).add(nums[i]);
        }
        int ans = -1;
        for(int i : map.keySet()){
            var l = map.get(i);
            Collections.sort(l,(a,b)->b-a);
            int a = map.get(i).get(0);
            int b = 0;
            if(map.get(i).isEmpty()) continue;
            else b = map.get(i).get(1);
            ans = Math.max(ans,a+b);
        }
        return ans;
    }

    public int sum(int target){
        int sum = 0;
        while(target!= 0){
            sum += target%10;
            target /= 10;
        }
        return sum;
    }
}
