package Leetcode202208;

public class Leetcode2380 {
    public int secondsToRemoveOccurrences(String s) {
        int cnt = 0, len = s.length();
        var c = s.toCharArray();
        var f = false;
        while(!f){
            f = true;
            for(int i=0; i<len-1; i++){
                if(c[i]=='0' && c[i+1]=='1'){
                    c[i] = '1'; c[i+1] = '0'; f = false;i++;
                }
            }
            //System.out.println(String.valueOf(c));
            if(!f) cnt++;
        }
        return cnt;
    }
}
