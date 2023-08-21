package Leetcode202303;

public class Leetcode2592 {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, ans = 0;
        var f = new boolean[len];
        for(int i=0; i<len; i++){
            int l = i, r = len-1;
            while(l <= r){
                int mid = (l+r)>>1;
                if(nums[mid]<=nums[i] || f[mid]) l = mid+1;
                else if(nums[mid] > nums[i]) r = mid-1;
            }
            if(l<len && !f[l] && nums[l] > nums[i]){
                ans++;
                f[l] = true;
                System.out.println(i+"??"+nums[l]);
            }
        }
        return ans;
    }
}
