package Leetcode202211;

public class Leetcode2433 {
    public int[] findArray(int[] pref) {
        var t = pref[0];
        for(int i=1; i<pref.length; i++){
            pref[i] ^=  t;
            t ^= pref[i];
        }
        return pref;
    }    
}
