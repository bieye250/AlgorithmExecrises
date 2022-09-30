package Leetcode202208;

import java.util.Collections;

public class Leetcode658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        int left = 0, right = len-1;
        var ans = new ArrayList<Integer>();
        while(left <= right){
            int mid = (left+right) >>1;
            if(arr[mid] >= x) right = mid-1;
            else if(arr[mid] < x) left = mid + 1;
        }
        int l = left - 1;
        while(k > 0){
            if(l >= 0 && left < len){
                int ldiff = x - arr[l];
                int rdiff = arr[left] - x;
                if(ldiff <= rdiff) {ans.add(arr[l]);l--;}
                else {ans.add(arr[left]);left++;}
            }
            else if(l >= 0){
                while(k>0&&l>=0){
                    ans.add(arr[l]);
                    k--;l--;
                }
                break;
            }
            else if(left < len){
                while(k>0&&left<len){
                    ans.add(arr[left]);
                    left++;k--;
                }
                break;
            }
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}
