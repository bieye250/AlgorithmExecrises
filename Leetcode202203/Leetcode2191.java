import java.util.*;

public class Leetcode2191 {
    public static void main(String[] args) {
        var l = new Leetcode2191();
        l.sortJumbled(new int[]{9,8,7,6,5,4,3,2,1,0}, new int[]{0,1,2,3,4,5,6,7,8,9});
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        var t = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = mapping(mapping,nums[i]);
            if(map.containsKey(num)) map.get(num).add(nums[i]);
            else {
                var list = new ArrayList<Integer>();list.add(nums[i]);
                map.put(num,list);
            }
        }
        var ans = new int[nums.length];t=0;
        for(int i : map.keySet()){
            for(int j : map.get(i))
                ans[t++]=j;
        }
        return ans;
    }
    public int mapping(int[] map, int i){
        if(i == 0) return map[0];
        var deque = new ArrayDeque<Integer>();
        while (i > 0){
            deque.offer(map[i%10]);
            i /= 10;
        }
        var t = 0;
        while (!deque.isEmpty() && deque.peekLast() == 0) deque.pollLast();
        while (!deque.isEmpty()){
            t = t * 10 + deque.pollLast();
        }
        return t;
    }
}