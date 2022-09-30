package Leetcode202209;

public class Leetcode670 {
    public int maximumSwap(int num) {
        var cnt = new int[10];
        var s = String.valueOf(num);
        var len = s.length();
        var ch = s.toCharArray();
        for(char c : ch){
            cnt[c-48]++;
        }
        for(int i=0;i<10;i++) System.out.println(cnt[i]);
        for(int i=0;i<len;i++){
            var t = 9;
            while(t>=0 && cnt[t] == 0) t--;
            if(s.charAt(i)==t+'0') cnt[t]--;
            else {
                var temp = ch[i];
                ch[i] = (char)(t+'0');
                for(int j=len-1;j>=0;j--){
                    if(s.charAt(j)==t+'0'){
                        ch[j] = temp;break;
                    }
                }
                return Integer.valueOf(String.valueOf(ch));
            }
        }
        return num;
    }
}
