package Leetcode202309;

public class Leetcode2860 {
    public int countWays(List<Integer> nums) {
        var map = new TreeMap<Integer, Integer>((i, j) -> j-i);
        int len = nums.size();

        var min = false;
        for(int i : nums){
            if(i == 0)  min = true;
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int ans = 0, t = 1<<30;
        // for(int i : map.keySet()) System.out.println(i+" "+map.get(i));
        for(int i : map.keySet()){
            if(len > i && len < t) ans++;
            len -= map.get(i);
            t = i;
        }
        if(!min) ans++;
        return ans;
    }
}
