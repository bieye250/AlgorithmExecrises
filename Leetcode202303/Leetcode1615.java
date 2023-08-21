package Leetcode202303;

public class Leetcode1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        var un = new ArrayDeque[n];
        for(int[] i : roads){
            if(un[i[0]] == null) un[i[0]] = new ArrayDeque<Integer>();
            un[i[0]].offer(i[1]);
            if(un[i[1]] == null) un[i[1]] = new ArrayDeque<Integer>();
            un[i[1]].offer(i[0]);
        }
        var ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n&&j!=i; j++){
                if(un[i] != null &&un[j]!=null){
                if(un[i].contains(j))
                    ans = Math.max(ans, un[i].size()+un[j].size()-1);
                else 
                    ans = Math.max(ans, un[i].size()+un[j].size());
                    }
            }
        }
        return ans;
}
