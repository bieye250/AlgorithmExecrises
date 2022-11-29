package Leetcode202211;

public class Leetcode2452 {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int len1 = queries.length, len2 = dictionary.length;
        var ans = new ArrayList<String>();
        for(int i=0; i<len1; i++){
            var s = queries[i];
            for(int j=0; j<len2; j++){
                var s1 = dictionary[j];
                var cnt = 0;
                for(int k=0; k<s.length();k++){
                    if(s.charAt(k) != s1.charAt(k)) cnt++;
                }
                if(cnt <= 2) {
                    ans.add(s); break;}
            }
        }
        return ans;
    }
}
