import java.util.TreeMap;

public class Leetcode954 {
    
    public static void main(String[] args) {
        var l = new Leetcode954();
        l.canReorderDoubled(new int[]{2,4,0,0,8,1});
    }
    public boolean canReorderDoubled(int[] arr) {
        var map = new TreeMap<Integer,Integer>();
        for (int i : arr) map.put(i,map.getOrDefault(i,0)+1);

        int cnt = 0, half = arr.length >> 1;
        for (Integer i : map.keySet()){
            //int size = map.get(i);
            if (map.get(i)==0) continue;
            int ii = i << 1;
            if (!map.containsKey(ii)) continue;
            else{
                System.out.println(i);
                if (i==0){
                    if(map.get(i)%2!=0) return false;
                    else cnt += map.get(i)/2;
                }
                else{
                    int min = Math.min(map.get(i),map.get(ii));
                    if(map.get(ii)<map.get(i)){
                        
                        map.put(i,map.get(i)-map.get(ii));
                        cnt += map.get(ii);
                        map.put(ii,0);
                    }
                    else {
                        map.put(ii,map.get(ii)-map.get(i));
                        
                        cnt += map.get(i);
                        map.put(i,0);
                    }
                }
            }
            if(cnt == half) return true;
        }
        System.out.println(cnt);
        return false;
    }
}
