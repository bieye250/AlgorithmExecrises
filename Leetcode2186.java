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
        return ans;
    }
}
