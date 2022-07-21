package Leetcode202207;

import java.util.Arrays;
import java.util.TreeSet;

public class Leetcode6121 {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int len = nums[0].length(),slen = nums.length, qlen = queries.length;
        for(int i=0;i<qlen;i++){
            int k = queries[i][0];
            int trim = queries[i][1];
            var num = new String[slen][2];
            for(int j=0;j<slen;j++){
                num[j][0] = nums[j].substring(len-trim);
                num[j][1] = String.valueOf(j);
                Arrays.sort(num,(a,b)->{
                    if(a[0].equals(b[0])) return Integer.valueOf(a[1])-Integer.valueOf(b[1]); 
                    return a[0].compareTo(b[0]);
                });
                var set = new TreeSet<Integer>();
            }
        }
        return new int[]{};
    }
}
