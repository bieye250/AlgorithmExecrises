package Leetcode202212;

public class Leetcode1764 {
    public boolean canChoose(int[][] groups, int[] nums) {
        int n = groups.length, len = nums.length;
        int l1 = 0, l2 = 0;
        for(int i=0; i<len; i++){
            if(nums[i] == groups[l1][l2]){
                int t = i;
                while(l2 < groups[l1].length){
                    if(l2 == groups[l1].length -1){
                        l1++; l2 = 0;
                        if(l1 >= n) return true;
                        break;
                    }
                    i++; l2++;
                    if(i>=len || nums[i] != groups[l1][l2]) {
                        i = t++; l2 = 0; break;
                    }
                }
            }
        }
        return false;
    }
}
