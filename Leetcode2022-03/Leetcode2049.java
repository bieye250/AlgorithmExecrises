import java.util.ArrayList;
import java.util.List;

public class Leetcode2049{

    long ans = 0l;
    int len;
    int count = 0;
    List<Integer>[] arr;
    public int countHighestScoreNodes(int[] parents) {
        len = parents.length;
        arr = new List[len];
        for (int i = 0; i < len; i++) arr[i] = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            if(parents[i] != -1)
                arr[parents[i]].add(i);
        }

        dfs(0);
        return count;
    }
    public int dfs(int n) {
        long s = 1;
        int size = len - 1;
        for(int i : arr[n]){
            int t = dfs(i);
            s *= t;
            size -= t;
        }
        if(n != 0) s *= size;
        if(s == ans) count++;
        else if(s > ans){
            ans = s;
            count = 1;
        }
        return len -size;
    }
}