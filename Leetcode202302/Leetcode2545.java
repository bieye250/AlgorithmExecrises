package Leetcode202302;

public class Leetcode2545 {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a,b)->b[k]-a[k]);
        return score;
    }
}
