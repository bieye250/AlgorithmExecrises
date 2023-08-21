package Leetcode202304;

public class Leetcode1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        var len = queries.length;
        var ll = pattern.length();
        var ans = new ArrayList<Boolean>(len);
        for(String s : queries){
            var l1 = s.length();
            int l = 0, r = 0;
            for(int i=0; i<l1; i++){
                if(r == ll){
                    if(s.charAt(i) < 'a') {r = 0; break;}
                }
                else if(s.charAt(i) == pattern.charAt(r)){
                    r++;
                }
                else if(s.charAt(i) < 'a') break;
            }
            if(r < ll) ans.add(false);
            else ans.add(true);
        }
        return ans;
    }
}
