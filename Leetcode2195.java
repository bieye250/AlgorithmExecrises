import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode2195 {
    public static void main(String[] args) {

    }

    public long minimalKSum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(i->set.add(i));
        long sum = 0l;
        return sum;
    }
}