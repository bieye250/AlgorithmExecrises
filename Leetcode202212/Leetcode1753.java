package Leetcode202212;

public class Leetcode1753 {
    public int maximumScore(int a, int b, int c) {
        int c1 = Math.max(a,Math.max(b,c));
        int a1 = Math.min(a,Math.min(b,c));
        int b1 = (a+b+c) - a1 - c1;
        if(a1 + b1 <= c1) return a1+b1;
        return (a+b+c)/2;
    }
}
