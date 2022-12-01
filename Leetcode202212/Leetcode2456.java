package Leetcode202212;

public class Leetcode2456 {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String, String> mapId = new HashMap();
        Map<String, Long> mapVi = new HashMap();
        Map<String, Long> mapMax = new HashMap();

        int len = ids.length;
        var max=0L;

        var ans = new ArrayList<List<String>>();
        for(int i=0; i<len; i++){
            mapVi.put(creators[i],mapVi.getOrDefault(creators[i],0L)+views[i]);
            max = Math.max(max, mapVi.get(creators[i]));
            if(!mapMax.containsKey(creators[i])){
                mapMax.put(creators[i],0L+views[i]);
                mapId.put(creators[i], ids[i]);
            }
            else {
                if(views[i] > mapMax.get(creators[i])){
                    mapMax.put(creators[i],0L+views[i]);
                    mapId.put(creators[i],ids[i]);
                }
                else if(views[i] == mapMax.get(creators[i])&&!dir(mapId.get(creators[i]),ids[i])){
                    mapId.put(creators[i],ids[i]);
                }
            }
        }
        System.out.println(max+"??");
        for(String s : mapVi.keySet()){
            if(mapVi.get(s) == max){
                var list = new ArrayList<String>();
                list.add(s);
                list.add(mapId.get(s));
                ans.add(list);
            }
        }
        return ans;
    }

    public boolean dir(String a, String b){
        var len = Math.min(a.length(), b.length());
        for(int i=0; i<len; i++){
            if(a.charAt(i) < b.charAt(i)) return true;
            else if(a.charAt(i) > b.charAt(i)) return false;
        }
        return a.length()<b.length()?true:false;
    }    
}
