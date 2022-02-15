import java.util.Arrays;

public class Leetcode2165{
    public static void main(String[] args) {
        Leetcode2165 l = new Leetcode2165();
        l.smallestNumber(-7605);
    }

    public long smallestNumber(long num) {
        if (num == 0)
        return 0;
    if (num > 0) {
        char[] c = String.valueOf(num).toCharArray();
        Arrays.sort(c);
        int t = 0;
        while (c[t] == '0')
            t++;
        if (c[0] == '0') {
            c[0] = c[t];
            c[t] = '0';
        }
        return Long.parseLong(String.valueOf(c));
    } else {
        char[] c = String.valueOf(-num).toCharArray();
        Arrays.sort(c);
        for(int i=0;i<(c.length%2==0?c.length/2:c.length/2+1);i++){
            char t = c[i];
            c[i] = c[c.length- 1 -i];
            c[c.length-1-i]=t;
        }
        return -1*Long.parseLong(String.valueOf(c));
    }//0567
        }
    
    }
}