public class Leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left <= right){
            int mid = left + ((right - left) >> 1);
            if(nums[mid] >= target) right = mid -1;
            else if(nums[mid] < target) left = mid + 1;
        }
        System.out.println(left);
        int l = left;
        right = len - 1;
        while (left <= right){
            int mid = left + ((right - left) >> 1);
            if(nums[mid] > target) right = mid -1;
            else if(nums[mid] <= target) left = mid + 1;
        }
        System.out.println(right);
        if(nums[left] != target) return new int[]{-1,-1};
        return new int[]{left,right};
    }
}
