package Leetcode2022006;

import java.util.HashMap;

public class Leetcode5218 {
    public int minimumNumbers(int num, int k) {
        if(num == 0) return 0;
        if(num < k) return -1;
        int last = num % 10;
        var map = new HashMap<Integer,Integer>();
        int t = (k+k)%10, cnt = 2;
        map.put(k,1);
        while(t!=k){map.put(t,cnt);cnt++;t=(t+k)%10;}
        if(map.containsKey(last)){
            int ans = map.get(last);
            if((num - k*ans)%10==0) return ans;
            else return -1;
        }
        else return -1;
    }
}
