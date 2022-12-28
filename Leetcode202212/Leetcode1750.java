package Leetcode202212;

public class Leetcode1750 {
    public int minimumLength(String s) {
        int len = s.length();
        int l = 0, r = len -1, ans = len;
        char t = 0;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                t = s.charAt(l);
                // ans -= 2;
                // l++; r--;
                while(l<=r && s.charAt(l) == t){l++; ans--;}
                while(l<=r && s.charAt(r) == t){r--; ans--;}
            }
            else break;
            System.out.println(l+"?"+r+"?"+t);
        }
        return ans;
    }
}
