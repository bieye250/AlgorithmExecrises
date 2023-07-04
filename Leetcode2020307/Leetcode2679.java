package Leetcode2020307;

public class Leetcode2679 {
    public int matrixSum(int[][] nums) {
        for(var i : nums) Arrays.sort(i);

        var ans = 0;

        for(int j=0; j<nums[0].length; j++){
            var t = 0;
            for(int i=0; i<nums.length; i++){
                t = Math.max(t, nums[i][j]);
            }
            ans += t;
        }
        return ans;
    }
}
