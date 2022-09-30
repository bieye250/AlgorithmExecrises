package Leetcode202209;

public class Leetcode2396 {
    public boolean isStrictlyPalindromic(int n) {
        for(int t=2;t<=n-2;t++){
            var s = scale(t,n);
            if(!palind(s)) return false;
        }
        return true;
    }

    public String scale(int num, int n){
        var sb = new StringBuffer();
        while(n != 0){
            sb.append(n % num);
            n /= num;
        }
        return sb.reverse().toString();
    }
    public boolean palind(String s){
        int len = s.length();
        int l = 0, r = len -1;
        while(l<r && s.charAt(l) == s.charAt(r)){l++;r--;}
        return l>=r?true:false;
    }    
}
