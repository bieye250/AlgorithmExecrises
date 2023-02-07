package Leetcode202301;

public class Leetcode1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        var map = new HashMap<Integer, Set<Integer>>();
        for(var i : logs){
            if(map.containsKey(i[0])) map.get(i[0]).add(i[1]);
            else map.put(i[0],new HashSet<Integer>(){{add(i[1]);}});
        }
        var ans = new int[k];
        for(int i : map.keySet()){
            ans[map.get(i).size()-1]++;
        }
        return ans;
    }
}
