package Leetcode202306;

public class Leetcode2611 {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int len = reward1.length;
        var sort = new int[len];
        var sum = 0;
        for(int i=0; i<len; i++) {
            sum += reward2[i];
            sort[i] = reward1[i] - reward2[i];
        }

        Arrays.sort(sort);
        for(int i=len-1; i>=len-k; i--) sum += sort[i];

        return sum;
    }
}
