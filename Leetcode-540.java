class Leetcode {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int i : nums) ans ^= i;
        return ans;
    }
}
