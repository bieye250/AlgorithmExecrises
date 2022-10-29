package Leetcode202210;

public class Leetcode2425 {
    
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int cnt1 = 0, cnt2 = 0;
        for(int i : nums1) cnt1 ^= i;
        for(int i : nums2) cnt2 ^= i;
        if(len1%2==0 && len2%2==0) return 0;
        if(len1%2==0 || len2%2==0) return len1%2==0?cnt1:cnt2;
        return cnt1^cnt2;
    }    
}
