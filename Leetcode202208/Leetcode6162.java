package Leetcode202208;

public class Leetcode6162 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int len = garbage.length;
        int t1 = 0, t2 = 0, t3 = 0;
        boolean f1 = false, f2 = false, f3 = false;
        var sum = new int[len];
        for(int i=0; i<len-1;i++) sum[i+1] = sum[i]+travel[i];
        for(int i=len-1;i>=0;i--){
            if(garbage[i].contains("M")){
                int cnt = count(garbage[i], 'M');
                t1 += cnt;
                if(i > 0 && !f1) {t1+=sum[i]; f1= true;}
            }
            if(garbage[i].contains("P")){
                int cnt = count(garbage[i], 'P');
                t2 += cnt;
                if(i > 0 && !f2) {t2+=sum[i]; f2= true;}
            }
            if(garbage[i].contains("G")){
                int cnt = count(garbage[i], 'G');
                t3 += cnt;
                if(i > 0 && !f3) {t3+=sum[i]; f3= true;}
            }
        }
        System.out.println(t1+" "+t2+" "+t3);
        return t1+t2+t3;
    }
    public int count(String s, Character c){
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) cnt++;
        }
        return cnt;
    }
}
