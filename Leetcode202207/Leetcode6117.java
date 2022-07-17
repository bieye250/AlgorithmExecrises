package Leetcode202207;
import java.util.Arrays;

public class Leetcode6117 {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int bl = buses.length, pl = passengers.length;
        int idx = 0, cnt = 0, ans = 0;
        for (int i = 0; i < pl; i++) {
            if (passengers[i] <= buses[idx]) cnt++;
            if (passengers[i] > buses[idx] || cnt == capacity) {
                int v = 0, j = i-1;
                if(cnt == capacity) v = passengers[i];
                else {v = buses[idx];i--;}
                while(v >= 2 && cnt >0 && j>=0){
                    if(v-passengers[j] <= 1){v--;j--;cnt--;}
                    else {ans=Math.max(ans, v);break;}
                }
                if(cnt == 0) ans=Math.max(ans, v);
                idx++;cnt=0;
            }
        } // 10 20 30
          // 4 11 13 19 21 25 26
        return ans;
    }
}
