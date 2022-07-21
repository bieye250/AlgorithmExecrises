package Leetcode202207;

import java.util.Scanner;

public class iFLYTEK0718 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long m = in.nextLong();
        long ans = 0L;
        // dfs(0,n/2,list);
        // dfs(n/2+1,n,0,list);
        // 左边list遍历i，右边list二分查找m-i
    }
    /**
     * dfs(start,end,,sum,list){
        if(sum > n) return 
        if(start > end) list.add(sum)
        dfs(start+1,end,sum,list)
        dfs(start+1,end,sum+nums[start],list);
    }
    **/
}
