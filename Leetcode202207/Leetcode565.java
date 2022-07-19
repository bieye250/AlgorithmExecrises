package Leetcode202207;

public class Leetcode565 {
    public int arrayNesting(int[] nums) {
        var set = new HashSet<Integer>();
        int len = nums.length, cnt = 0, ans = -1;
        for(int i=0;i<len;i++){
            int t = i;
            while(!set.contains(nums[t])){
                set.add(nums[t]);cnt++;
                t = nums[t];
            }
            ans = Math.max(ans,cnt);
            cnt = 0;
        }
        return ans;
    }
}
