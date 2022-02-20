public class Leetcode5997{
    public static void main(String[] args) {
        
    }

    public long[] sumOfThree(long num) {
        if(num % 3 != 0) return new long[]{};
        long t = num / 3;
        return new long[]{t-1,t,t+1};
    }
}