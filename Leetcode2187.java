import java.util.Arrays;

public class Leetcode2187{
    public static void main(String[] args) {
        var l = new Leetcode2187();
        l.minimumTime(new int[]{5,10,10}, 9);
    }

    public long minimumTime(int[] time, int totalTrips) {
        if(time.length == 1) return time[0]*totalTrips;
        int max = Arrays.stream(time).max().getAsInt();
        long left = 1L;
        long right = (long) totalTrips / max;
        while(left <= right){
            long mid = left + (right - left) >> 1;
            if(check(time, totalTrips,mid)){
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return left;
    }
    public boolean check(int[] time, int totalTrips, long result){
        long sum = 0;
        for(int i = 0; i < time.length; i++){
            sum += result / time[i];
        }
        if(sum >= totalTrips) return true;
        else return false;
    }
}