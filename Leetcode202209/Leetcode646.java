package Leetcode202209;

public class Leetcode646 {
    public int findLongestChain(int[][] pairs) {
        //Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        Qsort(pairs,0,pairs.length-1);
        int cnt = 0, t = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>t) {cnt++;t = pairs[i][1];}
        }
        //for(var i : pairs) System.out.println(i[0]+" "+i[1]);
        return cnt>0?cnt+1:1;
    }
    public void Qsort(int[][] pairs,int left,int right){
        if(left>=right){
            return;//返回
        }
        int i=left;
        int j=right;
        while(left <right){
            while(pairs[left][1]<=pairs[i][1] && left<j){ //最右边最小
                left++;
            }
            while(pairs[right][1]>pairs[i][1] && right>i){ //最左边最大
                right--;
            }
            if(left>=right){
                break;//跳出循环
            }
            Swap(pairs,left,right);//交换

        }
        Swap(pairs,i,right);
        Qsort(pairs,i,right-1);
        Qsort(pairs,left,j);//递归
    }
    public void Swap(int[][] pairs,int i,int j){

        int temp=pairs[i][1];
        pairs[i][1]=pairs[j][1];
        pairs[j][1]=temp;


        temp=pairs[i][0];
        pairs[i][0]=pairs[j][0];
        pairs[j][0]=temp;
    }
}
