package Leetcode202212;

public class Leetcode2483 {
    public int bestClosingTime(String customers) {
        int len = customers.length(), y = 0, n = 0, cost = 100005;
        for(int i=0; i<len; i++){
            if(customers.charAt(i) == 'Y') y++;
            else n++;
        }
        cost = Math.min(cost, y);
        n = 0;
        var ans = 0;
        for(int i=1; i<=len; i++){
            if(customers.charAt(i-1) == 'Y') y--;
            else n++;
            var t = y + n;
            if(t < cost){
                cost = t;
                ans = i;
            }
        }
        return ans;
    }    
}
