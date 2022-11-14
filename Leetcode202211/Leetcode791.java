package Leetcode202211;

public class Leetcode791 {
    public String customSortString(String order, String s) {
        var ch = new int[26];
        int or = 1, len = s.length();
        var sb = new StringBuffer();
        sb.append(s.charAt(0));
        for(int i=0; i<order.length(); i++){
            ch[order.charAt(i)-'a'] = or++;
        }
        //System.out.println(sb.length());
        for(int i=1; i<len; i++){
            var l = sb.length();
            if(ch[s.charAt(i)-'a'] == 0) sb.insert(0,s.charAt(i));
            else if(ch[s.charAt(i)-'a'] >= ch[sb.charAt(l-1)-'a'])
                sb.append(s.charAt(i));
            else {
                for(int j=0; j<sb.length(); j++){
                    if(ch[sb.charAt(j)-'a']>=ch[s.charAt(i)-'a']){
                        sb.insert(j,s.charAt(i));
                        break;
                    }
                }
            }
        }

        return sb.toString();
    }
}
