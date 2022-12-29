package Leetcode202211;

public class Leetcode2442 {
    public int countDistinctIntegers(int[] nums) {
        var cnt = 0;
        var set = new HashSet<Integer>();
        for(int i : nums) set.add(i);

        for(int i : nums){
            set.add(reverse(i));
        }
        return set.size();
    }

    public int reverse(int i){
        var t = 0;
        while(i > 0){
            t = t*10 + i%10;
            i /= 10;
        }
        return t;
    }
}
