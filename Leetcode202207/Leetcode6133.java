package Leetcode202207;

public class Leetcode6133 {
    public int maximumGroups(int[] grades) {
        int len = grades.length;
        int max = (int)Math.sqrt(len*2);
        if(max*(max+1) > len*2) max--;
        return max;
    }
    // 3 5 6 7 10 12
}
