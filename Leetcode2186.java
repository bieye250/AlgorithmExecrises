public class Leetcode2186 {
    public static void main(String[] args) {
        
    }

    public int minSteps(String s, String t) {
        var a = new int[26];
        var b = new int[26];

        s.chars().forEach(i->a[i-'a']++);
        t.chars().forEach(i->b[i-'a']++);

        int ans = 0;
        for (int j = 0; j < 26; j++) {
            ans += Math.abs(a[j]-b[j]);
        }
        return ans; //执行时间：25ms
        /**  执行时间：12ms
        int[] a = new int[128];
        int[] b = new int[128];
        for(char c : s.toCharArray()){
            a[c]++;
        }
        for(char c : t.toCharArray()){
            b[c]++;
        }
        int ans = 0;
        for(int i=0; i<128; i++){
            ans += Math.abs(a[i]-b[i]);
        }
        return ans;*/
    }
}
