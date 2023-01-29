package Leetcode202301;

public class Leetcode2526 {
    int[] record;
    int val;
    int size;
    int left;
    int right;
    int cnt;
    public DataStream(int value, int k) {
        record = new int[100005];
        val = value;
        size = k;
        left = 0;
        right = 0;
        cnt = 0;
    }
    
    public boolean consec(int num) {
        record[right++] = num;
        if(num == val) cnt++;
        if(right > size) {
            if(record[left] == val) cnt--;
            left++;
        }
        if(right < size || cnt != size) return false;
        return true;
    }
}
