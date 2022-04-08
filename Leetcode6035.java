import java.util.*;
public class Leetcode6035{
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> loseMap = new HashMap();
        Set<Integer> deque = new TreeSet();
        Set<Integer> deque1 = new TreeSet();
        for (int[] i : matches){ 
            loseMap.put(i[1],loseMap.getOrDefault(i[1],0)+1);
            deque.add(i[0]);
        }
        for (int i : loseMap.keySet()){
            if (deque.contains(i)) deque.remove(i);
            if (loseMap.get(i) == 1) deque1.add(i);
        }
        List<List<Integer>> ans = new ArrayList();
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        for (int i : deque) l1.add(i);
        for (int i : deque1) l2.add(i);
        ans.add(l1);ans.add(l2);
        return ans;
    }
}