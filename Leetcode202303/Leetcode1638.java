public class Leetcode1638 {
    public int countSubstrings(String s, String t) {
        var c = new int[26];
        var sum = 0;
        for(char ch : t.toCharArray()) {c[ch-'a']++; sum++;}

        var ans = 0;
        for(char ch : s.toCharArray()){
            ans += sum - c[ch-'a'];
        }
        int l1 = s.length(), l2 = t.length();
        var l = Math.min(l1, l2);
        for(int i=2; i<=l; i++){
            for(int j=0; j<l-i+1; j++){
                for(int m=0; m<l-i+1; m++){
                    var f = s.charAt(j)==t.charAt(m);
                    int k=1;
                    for(; k<i; k++){
                        if(s.charAt(j+k)!=t.charAt(m+k)){
                            if(f) f = false;
                            else break;
                        }
                    }
                    if(!f && k==i) ans++;
                }
            }
        }
        return ans;
    }
}
