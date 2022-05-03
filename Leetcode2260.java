import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode2260{
    public int minimumCardPickup(int[] cards) {
		int ans=Integer.MAX_VALUE;
		Map<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < cards.length; i++) {
			if(!map.containsKey(cards[i])) {
				map.put(cards[i], i);
			}else {
				int dist=i-map.get(cards[i])+1;//两个重复元素的最短距离
				ans=Math.min(dist, ans);//更新最短距离
				map.put(cards[i], i);//更新map的value
			}
			
		}
		
		return ans==Integer.MAX_VALUE?-1:ans;
    }
}