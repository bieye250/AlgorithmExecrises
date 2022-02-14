public class Leetcode540 {
    public static void main(String[] args) {
        
    }

    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int i : nums) ans ^= i;
        return ans;
    }
}
