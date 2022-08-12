package Leetcode202208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Leetcode6142 {
    public long countBadPairs(int[] nums) {
        var len = nums.length;
        var map = new HashMap<Integer,Integer>();
        var ans = 0L;
        for(int i=0;i<len;i++){
            nums[i] = i - nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.values()){
            var cnt = 1L*(i-1)*i/2;
            ans += cnt;
        }
        return 1L*(len-1)*len/2-ans;
    }
}
