package Leetcode202301;

public class Leetcode2491 {
    public long dividePlayers(int[] skill) {
        int len = skill.length;
        var ans = 0L;
        Arrays.sort(skill);
        int l = 0, r = len - 1;
        var sum = skill[l] + skill[r];
        while(l < r){
            if(sum == skill[l]+skill[r]){
                ans += skill[l++]*skill[r--];
            }
            else{
                ans = -1L;break;
            }
        }
        return ans;
    }
}
