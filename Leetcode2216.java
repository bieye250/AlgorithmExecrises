public class Leetcode2216{
    public int minDeletion(int[] nums) {
        int len = nums.length, ans=0, index=0;
        while (index < len){
            if(index == len - 1) break;
            int jump = 0;
            while (nums[index] == nums[index+jump+1]){
                jump ++;
                if (index+jump+1 >= len) break;
            }
            if(jump > 0) {index += 2+jump;ans+=jump;}
            else index += 2;
        }
        if ((len -ans)%2 == 0) return ans;
        else return ans+1;
    }
}