import java.util.Arrays;

public class Leetcode2170{
    public static void main(String[] args) {
        
    }

    public int minimumOperations(int[] nums) { 
        int max = Arrays.stream(nums).max().getAsInt();
        int[] cnt1=new int[max+1];
        int[] cnt2=new int[max+1];
        for(int i=0;i<nums.length;i+=2){
            cnt1[nums[i]]++;
        }
        for(int i=1;i<nums.length;i+=2){
            cnt2[nums[i]]++;
        }

        int cnt1_index1=0,cnt1_index2=-1; //最大值，次最大值
        int cnt2_index1=0,cnt2_index2=-1;

        for(int i=0;i<=max;i++){
            if(cnt1[i]>=cnt1[cnt1_index1]){
                cnt1_index2=cnt1_index1;
                cnt1_index1=i;
                continue;
            }
            if(cnt1_index2==-1||cnt1[i]>cnt1[cnt1_index2]){
                cnt1_index2=i;
            }
        }

        for(int i=0;i<=max;i++){
            if(cnt2[i]>=cnt2[cnt2_index1]){
                cnt2_index2=cnt2_index1;
                cnt2_index1=i;
                continue;
            }
            if(cnt2_index2==-1||cnt2[i]>cnt2[cnt2_index2]){
                cnt2_index2=i;
            }
        }
        if(cnt1_index1==cnt2_index1){
            int ret1=nums.length-cnt1[cnt1_index1]-cnt2[cnt2_index2];
            int ret2=nums.length-cnt1[cnt1_index2]-cnt2[cnt2_index1];
            return Math.min(ret1,ret2);
        }
        return nums.length-cnt1[cnt1_index1]-cnt2[cnt2_index1];

    }
}