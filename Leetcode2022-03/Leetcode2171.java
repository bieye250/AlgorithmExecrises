import java.util.*;

public class Leetcode2171 {
    public static void main(String[] args) {

    }

    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum=0;
        for(int i=0;i<beans.length;i++){sum+=beans[i];}
        long ans=sum;
        for(int i=0;i<beans.length;i++){ans=Math.min(ans,sum-(long)beans[i]*(beans.length-i));}
        return ans;
    }
}
