package Leetcode202209;

public class Leetcode788 {
    public static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    static{
        map.put(0,0);
        map.put(1,1);
        map.put(2,5);
        map.put(5,2);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);
    }
    public int rotatedDigits(int n) {
        var cnt = 0;
        for(int i=2;i<=n;i++){
            var t = 0;
            var t1 = i;
            var j = 10000;
            while(t1/j==0) j/=10;
            for( ; j>=1; j/=10){
                var n1 = t1 / j;
                if(!map.containsKey(n1)) break;
                t += map.get(n1)*j;
                t1 %= j;
            }
            if(j == 0 && t != i) {cnt++;System.out.println(i+" ");}
        }
        return cnt;
    }    
}
