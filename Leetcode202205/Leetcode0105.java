package Leetcode202205;
public class Leetcode0105 {
    public boolean oneEditAway(String first, String second) {
        int p1=0, p2=0, len1=first.length(), len2=second.length();
        boolean flag = false;
        while(p1<len1&&p2<len2){
            if(first.charAt(p1)!=second.charAt(p2)){
                if(len1==len2){
                    if(!flag) {flag = true;p1++;p2++;}
                    else return false;
                }
                else if(!flag){
                    flag = true;
                    if(len1>len2) p1++;
                    else p2++;
                }
                else return false;
            }
            else {p1++;p2++;}
        }
        if(Math.abs(len1-len2)<=1) return true;
        return false;
    }
}
