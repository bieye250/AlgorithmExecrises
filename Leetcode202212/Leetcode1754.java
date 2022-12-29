package Leetcode202212;

public class Leetcode1754 {
    public String largestMerge(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length();
        var ans = new StringBuffer();
        int p1 = 0, p2 = 0;
        while(p1 < l1 && p2 < l2){
            if(word1.charAt(p1) > word2.charAt(p2)) ans.append(word1.charAt(p1++));
            else if(word1.charAt(p1) < word2.charAt(p2)) ans.append(word2.charAt(p2++));
            else {
                System.out.println(p1+"??"+p2);
                int t1 = p1, t2 = p2;
                while(t1 < l1 && t2 < l2){
                    if(word1.charAt(t1) != word2.charAt(t2)) break;
                    t1++; t2++;
                }
                if(t1 == l1){
                    while(t2 < l2 && word2.charAt(t2) == word2.charAt(p2)) t2++;
                    if(t2 == l2 || word2.charAt(t2) <= word2.charAt(p2))
                        ans.append(word1.charAt(p1++));
                    else ans.append(word2.charAt(p2++));
                }
                else if(t2 == l2){
                    while(t1 < l1 && word1.charAt(t1) == word1.charAt(p1)) t1++;
                    if(t1 == l1 || word1.charAt(t1) <= word1.charAt(p1))
                        ans.append(word2.charAt(p2++));
                    else ans.append(word1.charAt(p1++));
                }
                else {
                    if(word1.charAt(t1) > word2.charAt(t2)) ans.append(word1.charAt(p1++));
                    else ans.append(word2.charAt(p2++));
                }
                System.out.println(p1+"?"+p2);
            }
        }
        if(p1 == l1 && p2 == l2) return ans.toString();
        else if(p1 == l1) ans.append(word2.substring(p2, l2));
        else if(p2 == l2) ans.append(word1.substring(p1, l1));
        return ans.toString();
    }
}
