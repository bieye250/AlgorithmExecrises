package Leetcode202304;

public class Leetcode1017 {
    public String baseNeg2(int n) {
        if(n == 0) return "0";
        var sb = new StringBuffer();
        int cnt = 0;
        while(n > 0){
            var t = n % 2;
            if(cnt % 2 != 0 && t == 1){
                n += 2;
            }
            sb.append(n % 2);
            n /= 2;
            cnt++;
        }
        return sb.reverse().toString();
    }    
}
