import java.util.ArrayList;
import java.util.List;

public class Leetcode5998 {
    public static void main(String[] args) {
        var l = new Leetcode5998();
        l.maximumEvenSplit(10);
    }

    public List<Long> maximumEvenSplit(long finalSum) {
        if ((finalSum & 1) == 1)
            return new ArrayList<Long>();

        List<Long> list = new ArrayList<>();
        long count = finalSum >> 1;
        long n = (long) Math.sqrt(2 * count);
        long sum = 0;
        if ((n & 1) == 1)
            sum = ((n + 1) >> 1) * n;
        else
            sum = (n + 1) * (n >> 1);
        if (sum > count) {
            n--;
            if ((n & 1) == 1)
                sum = ((n + 1) >> 1) * n;
            else
                sum = (n + 1) * (n >> 1);
        }
        if (sum == count) {
            for (long i = 1; i <= n; i++)
                list.add((long) 2 * i);
            return list;
        } else {
            sum -= count - sum;
            for (long i = n; i >= 1; i--) {
                if (sum-- > 0)
                    list.add((long) 2 * (i + 1));
                else
                    list.add((long) 2 * i);
            }
            return list;
        }
    }// 10110
     // 2 + 4 + 6 + 8 8
     // 2 4 12
}