package Leetcode202210;

public class Leetcode921 {
    public int minAddToMakeValid(String s) {
        int left = 0, right = 0, len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i) == '(') left++;
            else {
                if(left>0) left--;
                else right++;
            }
        }
        return left+right;
    }    
}
