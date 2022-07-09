import java.util.Arrays;

public class Leetcode532 {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length, cnt = 0,left = 0;
        while(left < len && nums[left]+k <= nums[len-1]){
            if(binarySearch(nums,left,nums[left]+k)) cnt++;
            left++;
            while(left<len&&nums[left]==nums[left-1]) left++;
        }
        return cnt;
    }
    public boolean binarySearch(int[] nums, int start, int goal){
        int left=start, right = nums.length-1;
        while(left <= right){
            int mid = left + ((right-left)>>1);
            if(nums[mid] > goal) right = mid-1;
            else if(nums[mid] < goal) left = mid+1;
            else {
                if(left == start) left++;
                else return true;
            }
        }
        return false;
    }
}
