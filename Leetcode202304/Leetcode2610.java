package Leetcode202304;

public class Leetcode2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        var ans = new ArrayList<List<Integer>>();
        
        var max = 0;
        for(int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
            max = Math.max(max, map.get(i));
        }
        for(int i=0; i<max; i++) ans.add(new ArrayList());

        for(int i : map.keySet()){
            var size = map.get(i);
            for(int j=0; j<size; j++) ans.get(j).add(i);
        }
        return ans;
    }
}
