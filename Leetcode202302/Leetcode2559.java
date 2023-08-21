package Leetcode202302;

public class Leetcode2559 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        var len = words.length;
        var pre = new int[len+1];
        var list = Arrays.asList('a', 'e', 'i', 'o', 'u');
        if(((String) list).contains(words[0].charAt(0)) && list.contains(words[0].charAt(words[0].length()-1)))
            pre[1] = 1;
        for(int i=1; i<len; i++){
            if(list.contains(words[i].charAt(0)) && list.contains(words[i].charAt(words[i].length()-1)))
                pre[i+1] = pre[i]+1;
            else pre[i+1] = pre[i];
        }
        
        var l1 = queries.length;
        var ans = new int[l1];
        for(int i=0; i<l1; i++){
            ans[i] = pre[queries[i][1]+1] - pre[queries[i][0]];
        }
        return ans;
    }
}
