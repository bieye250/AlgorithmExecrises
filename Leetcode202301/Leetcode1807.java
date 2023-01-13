package Leetcode202301;

public class Leetcode1807 {
    public String evaluate(String s, List<List<String>> knowledge) {
        var map = new HashMap<String,String>();
        for(var list : knowledge){
            map.put(list.get(0), list.get(1));
        }
        var ans = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                var sb = new StringBuffer();
                while(s.charAt(++i) != ')') sb.append(s.charAt(i));
                var str = sb.toString();
                if(map.containsKey(str)) ans.append(map.get(str));
                else ans.append('?');
            }
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }    
}
