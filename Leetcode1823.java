public class Leetcode1823 {
    public int findTheWinner(int n, int k) {
        if(n == 1) return 1;
        if(k == 1) return n;
        var flag = new boolean[n+1];
        int start = 1, cnt = 1;
        while(cnt <= n-1){
            int count = k-1;
            while(count-- > 0){
                start++;
                if(start > n) start %= n;
                while(flag[start]){
                    start++;
                    if(start > n) start %= n;
                }    
            }
            flag[start] = true;start++;
            if(start > n) start %= n;
            while(flag[start]){
                start++;
                if(start > n) start %= n;
            }
            cnt++;
        }
        return start;
    }
}
