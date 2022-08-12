package Leetcode202208;

public class Leetcode1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        var ans = new ArrayList<List<Integer>>();
        var map = new HashMap<Integer,List<Integer>>();
        var len = groupSizes.length;
        for(int i=0;i<len;i++){
            if(!map.containsKey(groupSizes[i])){
                var list = new ArrayList<Integer>();
                list.add(i);
                map.put(groupSizes[i],list);
            }
            else {
                var list = map.get(groupSizes[i]);
                list.add(i);
            }
            var list = map.get(groupSizes[i]);
            if(list.size() == groupSizes[i]){
                    ans.add(list);
                    map.remove(groupSizes[i]);
                }
        }
        return ans;
    }
}
