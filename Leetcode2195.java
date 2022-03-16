import java.util.Arrays;

public class Leetcode2195 {
    public static void main(String[] args) {

    }

    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0, temp = 1, len = nums.length, count;
        for (int num : nums) {
            if (temp < num) {
                count = num - temp <= k ? num - temp : k;
                sum += (2 * temp + count - 1) * count / 2;
                k -= count;
                if (k == 0) return sum;
            }
            temp = num + 1;
        }
        sum += (long) (nums[(int) (len - 1)] + 1 + nums[(int) (len - 1)] + k) * k / 2;
        return sum;
    }
}